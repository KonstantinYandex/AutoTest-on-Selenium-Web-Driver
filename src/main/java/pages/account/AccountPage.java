package pages.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public final By labelGenderMale = By.id("gender-male");
    public final By labelGenderFemale = By.id("gender-female");
    public final By inputFirstName = By.id("FirstName");
    public final By inputLastName = By.id("LastName");
    public final By inputEmail = By.id("Email");


    public WebElement getLabelGenderMale() {
        return driver.findElement(labelGenderMale);
    }

    public WebElement getLabelGenderFemale() {
        return driver.findElement(labelGenderFemale);
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


}
