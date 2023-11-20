package domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class invalidLogIn {

    @Test
    public void firstTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        String username = "locked_out_user";
        String password = "secret_sauce";

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        loginButton.click();

        driver.quit();
    }

    @Test
    public void secondTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");

        String currentURL = driver.getCurrentUrl();

        System.out.println("CURRENT URL IS -> " + currentURL);

        String username = "locked_out_users";
        String password = "secret_sauce";

        WebElement usernameFieldXPath = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement usernameFieldCSS = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement logInButtonCSS = driver.findElement(By.cssSelector("input[value='Login']"));

        usernameFieldXPath.sendKeys(username);
        usernameFieldCSS.sendKeys(password);

        logInButtonCSS.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Swag Labs"));

        currentURL = driver.getCurrentUrl();

        System.out.println("CURRENT URL IS -> " + currentURL);

        WebElement menu = driver.findElement((By.id("react-burger-menu-btn")));
        menu.click();

        WebElement logOutButton = driver.findElement(By.id("logout_sidebar_link"));
        logOutButton.click();

        currentURL = driver.getCurrentUrl();

        System.out.println("CURRENT URL IS -> " + currentURL);

        driver.close();
    }
}

