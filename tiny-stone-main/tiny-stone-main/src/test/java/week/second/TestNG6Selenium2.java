package week.second;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class TestNG6Selenium2 {

    private WebDriver driver = null;

    @Parameters({"browser"})
    @BeforeMethod
    public void startBrowser(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else {
            throw new WebDriverException(String.format("%s is not supported browser", browser));
        }
    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){

        if (driver != null) {

            driver.quit();
        }
    }

    @Test(dataProvider = "credentials")
    public void test1(String username, String password){

        driver.get("https://www.saucedemo.com/");

        WebElement usernameFiled =
                driver.findElement(By.id("user-name"));

        usernameFiled.sendKeys(username);


        WebElement passwordFiled =
                driver.findElement(By.name("password"));

        passwordFiled.sendKeys(password);

        WebElement logInButton =
                driver.findElement(By.cssSelector("input[value='Login']"));

        logInButton.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@class='error-message-container error']")));

        WebElement invalidCredMsg =
                driver.findElement(By.xpath("//div[@class='error-message-container error']"));


        String invalidCredMsgText = invalidCredMsg.getText();
        String expectedValue = "Epic sadface: Username and password do not match any user in this service";


        assertEquals(invalidCredMsgText, expectedValue,
                "ERROR: Invalid credentials banner msg is wrong! /n ");


    }


    @DataProvider
    public Object[][] credentials(){

        return new Object[][]{
                {"abc","sdasd"},
                {"user", "passwor"},
                {"users", "password"},
                {" user ", " password "},
        };

    }




}
