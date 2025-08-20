package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLISIT_WAIT;

public class ActionsOnInput extends BaseActions {

    public ActionsOnInput(WebDriver driver) {
        super(driver);
    }

    public void searchInfInSearchBox(WebElement element, String word){
        actions.sendKeys(element, word).keyDown(Keys.ENTER).keyDown(Keys.ENTER).pause(Duration.ofMillis(EXPLISIT_WAIT)).build().perform();
    }






}
