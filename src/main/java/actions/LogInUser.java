package actions;

import org.openqa.selenium.WebDriver;
import pages.login.LogIn;

import static constants.Constant.AccountData.LOGIN;
import static constants.Constant.AccountData.PASSWORD;
import static constants.Constant.Urls.LOGIN_URL;

public class LogInUser extends BaseActions {


    public LogInUser(WebDriver driver) {
        super(driver);
    }

    LogIn logIn = new LogIn(driver);

    public void LogIn() {
        driver.get(LOGIN_URL);
        sendKeys(logIn.getInputForEmail(), LOGIN)
                .sendKeys(logIn.getInputForPassword(), PASSWORD)
                .click(logIn.getButtonSubmit())
                .pause(150)
                .perform();
    }


}
