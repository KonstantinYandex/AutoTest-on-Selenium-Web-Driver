package test.mainPage.testFooter;

import actions.LogInUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.main.Footer;
import test.BaseTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static constants.Constant.Urls.BASE_URL;

public class TestFooter extends BaseTest {

    Footer footer = new Footer(driver);
    LogInUser logInUser = new LogInUser(driver);

    @BeforeEach
    public void getMainPage() {
        driver.get(BASE_URL);
    }

    @DisplayName("Редирект при нажатии на элементы в блоке `Information`")
    @Test
    public void testRedirectFromInformationBlock() {
        List<WebElement> itemsOfInformationBlock = footer.getItemsOfInformationBlock();
        for (int i = 0; i < itemsOfInformationBlock.size(); i++) {
            WebElement linkOfItemOfInformationBlock = driver.findElement(By.xpath("//div[@class=\"column information\"]/ul/li[" + (i + 1) + "]/a"));
            String expUrl = linkOfItemOfInformationBlock.getAttribute("href");
            linkOfItemOfInformationBlock.click();
            assertEquals(expUrl, driver.getCurrentUrl());
            driver.navigate().back();
        }
    }


    @DisplayName("Редирект при нажатии на элементы в блоке `Customer Service`")
    @Test
    public void testRedirectFromCustomerServiceBlock() {
        List<WebElement> itemsOfCustomerServiceBlock = footer.getItemsOfCustomerServiceBlock();
        for (int i = 0; i < itemsOfCustomerServiceBlock.size(); i++) {
            WebElement linkOfItemOfCustomerServiceBlock = driver.findElement(By.xpath("//div[@class=\"column customer-service\"]/ul/li[" + (i + 1) + "]/a"));
            String expUrl = linkOfItemOfCustomerServiceBlock.getAttribute("href");
            linkOfItemOfCustomerServiceBlock.click();
            assertEquals(expUrl, driver.getCurrentUrl());
            driver.navigate().back();
        }
    }

    @DisplayName("Редирект при нажатии на элементы в блоке `My account` зарегистрированным пользователем")
    @Test
    public void testRedirectFromMyAccountBlock() {
        // Зарегистрированному пользователю видны одни страницы, незарегистрированному пользователю - другие
        logInUser.LogIn();
        List<WebElement> itemsOfMyAccountBlock = footer.getItemsOfMyAccountBlock();
        for (int i = 0; i < itemsOfMyAccountBlock.size(); i++) {
            WebElement linkOfItemOfMyAccountBlock = driver.findElement(By.xpath("//div[@class=\"column my-account\"]/ul/li[" + (i + 1) + "]/a"));
            String expUrl = linkOfItemOfMyAccountBlock.getAttribute("href");
            linkOfItemOfMyAccountBlock.click();
            assertEquals(expUrl, driver.getCurrentUrl());
            driver.navigate().back();
        }
    }

    @DisplayName("Нажатие на раздел `My account` незарегистрированным пользователем")
    @Test
    public void testClickOnMyAccountUnRegisterUser() {
        WebElement myAccountItem = footer.getMyAccountItem();
        myAccountItem.click();
        assertThat(driver.getCurrentUrl(), containsString("login"));
    }

    @DisplayName("Нажатие на раздел `Orders` незарегистрированным пользователем")
    @Test
    public void testClickOnOrdersUnRegisterUser() {
        WebElement ordersItem = footer.getOrdersItem();
        ordersItem.click();
        assertThat(driver.getCurrentUrl(), containsString("login"));
    }


    @DisplayName("Нажатие на раздел `Addresses` незарегистрированным пользователем")
    @Test
    public void testClickOnAddressesUnRegisterUser() {
        WebElement addressesItem = footer.getAddressesItem();
        addressesItem.click();
        assertThat(driver.getCurrentUrl(), containsString("login"));
    }


}
