package pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

public class Register extends BasePage {

    public Register(WebDriver driver) {
        super(driver);
    }

    public final By buttonMale = By.xpath("//div[@class=\"gender\"]/input[@id=\"gender-male\"]");
    public final By buttonFemale = By.xpath("//div[@class=\"gender\"]/input[@id=\"gender-female\"]");
    public final By inputFirstName = By.xpath("//input[@id=\"FirstName\"]");
    public final By inputLastName = By.xpath("//input[@id=\"LastName\"]");
    public final By inputEmail = By.xpath("//input[@id=\"Email\"]");
    public final By inputPassword = By.xpath("//input[@id=\"Password\"]");
    public final By inputConfirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    public final By buttonSubmit = By.xpath("//input[@id=\"register-button\"]");
    public final By buttonToContinueAfterRegister = By.xpath("//input[@class=\"button-1 register-continue-button\"]");
    public final By fieldForViewError = By.xpath("//span[@for=\"Email\"]");


    public WebElement getButtonMale() {
        return driver.findElement(buttonMale);
    }

    public WebElement getButtonFemale() {
        return driver.findElement(buttonFemale);
    }

    public WebElement getInputFirstName() {
        return driver.findElement(inputFirstName);
    }

    public WebElement getInputLastName() {
        return driver.findElement(inputLastName);
    }

    public WebElement getInputEmail() {
        return driver.findElement(inputEmail);
    }

    public WebElement getInputPassword() {
        return driver.findElement(inputPassword);
    }

    public WebElement getInputConfirmPassword() {
        return driver.findElement(inputConfirmPassword);
    }

    public WebElement getButtonSubmit() {
        return driver.findElement(buttonSubmit);
    }

    public WebElement getButtonToContinue() {
        return driver.findElement(buttonToContinueAfterRegister);
    }

    public WebElement getFieldForViewError() {
        return driver.findElement(fieldForViewError);
    }


}
