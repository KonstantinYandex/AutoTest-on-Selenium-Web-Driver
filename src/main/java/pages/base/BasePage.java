package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLISIT_WAIT;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(String url){
        driver.get(url);
    }

    public void clickOnWebElement(WebElement element){
        element.click();
    }

    public String getCssValue(String propertyName, WebElement element){
        return element.getCssValue(propertyName);
    }









}
