package week.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu extends BasePage {

    public TopMenu(WebDriver driver){

        super(driver);
    }

    By logOutButton = By.id("react-burger-menu-btn");


    public void clickTopMenu(){

        driver.findElement(logOutButton).click();
    }
}
