package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLIC_WAIT;

import java.time.Duration;

public class CommonActions {

    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {
            case ("win_chrome"):
                driver = new ChromeDriver();
                break;
            default:
                throw new IllegalArgumentException("Incorrect browser name or platform:" + PLATFORM_AND_BROWSER);

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLIC_WAIT));
        return driver;
    }
}
