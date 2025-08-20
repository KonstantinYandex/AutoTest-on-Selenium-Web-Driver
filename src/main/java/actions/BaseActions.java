package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BaseActions {

    protected WebDriver driver;
    protected Actions actions;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }


    public BaseActions clickAndHold(WebElement element){
        actions.clickAndHold(element);
        return this;
    }

    public BaseActions click(WebElement element){
        actions.click(element);
        return this;
    }


    public BaseActions sendKeys(WebElement element, String strForInput){
        actions.sendKeys(element, strForInput);
        return this;
    }

    public BaseActions pause(int timePause){
        actions.pause(Duration.ofMillis(timePause));
        return this;
    }

    public void perform(){
        actions.perform();

    }








}
