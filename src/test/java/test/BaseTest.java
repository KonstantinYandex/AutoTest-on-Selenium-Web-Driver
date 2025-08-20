package test;

import actions.ActionsOnInput;
import actions.BaseActions;
import actions.RegisterUser;
import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.Header;
import pages.main.HeaderMenu;
import pages.main.MasterWrapperMain;
import pages.main.ProductGrid;
import pages.register.Register;
import wait.BaseWait;

import static constants.Constant.TimeoutVariable.EXPLISIT_WAIT;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Header header = new Header(driver);
    protected BaseActions baseActions = new BaseActions(driver);
    protected ActionsOnInput actionsInput = new ActionsOnInput(driver);
    protected BaseWait baseWait = new BaseWait(driver, EXPLISIT_WAIT);
    protected HeaderMenu headerMenu = new HeaderMenu(driver);
    protected MasterWrapperMain wrapperMain = new MasterWrapperMain(driver);
    protected Register register = new Register(driver);
    protected RegisterUser registerUser = new RegisterUser(driver);
    protected ProductGrid productGrid = new ProductGrid(driver);

    @AfterEach
    public void close() {
        driver.quit();
    }

}


