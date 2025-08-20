package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class LogIn extends BasePage {

    public LogIn(WebDriver driver) {
        super(driver);
    }

    private final By inputForEmail = By.id("Email");
    private final By inputForPassword = By.id("Password");
    private final By buttonSubmit = By.xpath("//input[@class=\"button-1 login-button\"]");

    public WebElement getInputForEmail() {
        return driver.findElement(inputForEmail);
    }

    public WebElement getInputForPassword() {
        return driver.findElement(inputForPassword);
    }

    public WebElement getButtonSubmit() {
        return driver.findElement(buttonSubmit);
    }


}



