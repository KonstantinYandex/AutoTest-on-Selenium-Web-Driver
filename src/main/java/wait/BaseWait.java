package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLISIT_WAIT;

public class BaseWait {

    protected WebDriverWait wait;

    public BaseWait(WebDriver driver, int duration) {
        this.wait = new WebDriverWait(driver, Duration.ofMillis(duration));

    }

    public void isAlertPresent() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public WebElement waitElementVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitElementInvisibility(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
        return element;
    }


    public WebElement waitElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }


    public void waitAttributeToBe(WebElement element, String attribute, String expValue) {
        wait.until(ExpectedConditions.attributeToBe(element, attribute, expValue));
    }

    public By visibilityOfAllElementsLocatedBy(By locator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return locator;
    }

}
