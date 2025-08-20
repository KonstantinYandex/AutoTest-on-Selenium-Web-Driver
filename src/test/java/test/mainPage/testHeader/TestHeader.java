package test.mainPage.testHeader;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import test.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import static constants.Constant.ExpectedResultForHeader.*;
import static constants.Constant.Urls.*;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHeader extends BaseTest {

    @BeforeEach
    public void getMainPage() {
        basePage.open(BASE_URL);
    }

    @DisplayName("Проверка тега src у лого страницы")
    @Test
    public void testSrcHeaderLogo() {
        String actualSrcOfLogoImage = header.getHeaderLogoImage().getAttribute("src");
        assertThat(actualSrcOfLogoImage, endsWith(EXP_SRC_OF_LOGO));
    }

    @DisplayName("Проверка альтернативного отображения у лого страницы")
    @Test
    public void testAltStringHeaderLogo() {
        String actualAltStringOfLogo = header.getHeaderLogoImage().getAttribute("alt");
        assertEquals(EXP_ALT_TXT_OF_LOGO, actualAltStringOfLogo);
    }

    @DisplayName("Проверка наличия элемента \"Register\" в навигационной шапке сайта")
    @Test
    public void testNavHasRegister() {
        assertEquals("Register", header.getRegisterElement().getText());
    }


    @DisplayName("Проверка наличия элемента \"Log in\" в навигационной шапке сайта")
    @Test
    public void testNavHasLogIn() {
        assertEquals("Log in", header.getLogInElement().getText());
    }


    @DisplayName("Проверка наличия элемента \"Shopping cart\" в навигационной шапке сайта")
    @Test
    public void testNavHasShoppingCart() {
        assertEquals("Shopping cart", header.getShoppingCardElement().getText());
    }

    @DisplayName("Проверка наличия элемента \"Wish List\" в навигационной шапке сайта")
    @Test
    public void testNavHasWishlist() {
        assertEquals("Wishlist", header.getWishListElement().getText());
    }

    @DisplayName("Проверка начального количества товаров в корзине")
    @Test
    public void testEmptyQtyOfShoppingCartInNavLinks() {
        String expectedString = "(0)";
        String beginQty = header.getShoppingCartQty().getText();
        assertEquals(expectedString, beginQty);
    }


    @DisplayName("Проверка начального количества товаров в списке желаний")
    @Test
    public void testEmptyQtyOfWishlistInNavLinks() {
        String expectedString = "(0)";
        String beginQty = header.getWishListQty().getText();
        assertEquals(expectedString, beginQty);
    }


    @DisplayName("Проверка редиректа при нажатии на кнопку \"Register\" в навигационной шапке")
    @Test
    public void testRedirectToRegisterFromHeader() {
        WebElement registerElement = header.getRegisterElement();
        header.clickOnWebElement(registerElement);
        String actualUrlAfterRedirect = driver.getCurrentUrl();
        assertEquals(REGISTER_URL, actualUrlAfterRedirect);
    }

    @DisplayName("Проверка редиректа при нажатии на кнопку \"Log in\" в навигационной шапке")
    @Test
    public void testRedirectToLogInFromHeader() {
        WebElement logInElement = header.getLogInElement();
        header.clickOnWebElement(logInElement);
        String actualUrlAfterRedirect = driver.getCurrentUrl();
        assertEquals(LOGIN_URL, actualUrlAfterRedirect);
    }

    @DisplayName("Проверка редиректа при нажатии на кнопку \"Shopping cart\" в навигационной шапке")
    @Test
    public void testRedirectToCartFromHeader() {
        WebElement CartElement = header.getShoppingCardElement();
        header.clickOnWebElement(CartElement);
        String actualUrlAfterRedirect = driver.getCurrentUrl();
        assertEquals(CART_URL, actualUrlAfterRedirect);
    }


    @DisplayName("Проверка редиректа при нажатии на кнопку \"WishList\" в навигационной шапке")
    @Test
    public void testRedirectToWishListFromHeader() {
        WebElement wishListElement = header.getWishListElement();
        header.clickOnWebElement(wishListElement);
        String actualUrlAfterRedirect = driver.getCurrentUrl();
        assertEquals(WiSHLIST_URL, actualUrlAfterRedirect);
    }


    @DisplayName("Проверка видимости поисковой строки по сайту")
    @Test
    public void testViewSearchBox() {
        WebElement searchBox = header.getSearchBox();
        baseWait.waitElementVisibility(searchBox);
    }

    @DisplayName("Проверка кликабельности кнопки в поисковой строке")
    @Test
    public void testIsClickableButtonInSearchBox() {
        WebElement button = header.getBtnSubmitOfSearchBox();
        baseWait.waitElementToBeClickable(button);
    }

    @DisplayName("Проверка placeholder-а у поисковой строки")
    @Test
    public void testIsViewPlaceholderInSearchBox() {
        WebElement searchBox = header.getSearchBox();
        baseWait.waitAttributeToBe(searchBox, "value", EXP_PLACEHOLDER_OF_SEARCHBOX);
    }

    @DisplayName("Проверка поиска по сайту")
    @Test
    public void testSearchOnSite() {
        WebElement searchBox = header.getSearchBox();
        actionsInput.searchInfInSearchBox(searchBox, "hea");
        List<WebElement> searchedItems = driver.findElements(By.xpath("//div[@class=\"item-box\"]//h2/a"));
        List<String> actualTextOfSearchedItems = searchedItems.stream().map(WebElement::getText).toList();
        assertEquals(EXP_ITEMS_AFTER_SEARCH, actualTextOfSearchedItems);
    }

    @DisplayName("Проверка alert-а если не заполнить поисковую строку и нажать на кнопку \"Search\"")
    @Test
    public void testAlertAfterEmptySearch() {
        header.getBtnSubmitOfSearchBox().click();
        baseWait.isAlertPresent();
        Alert alert = driver.switchTo().alert();
        String actualTextAlert = alert.getText();
        assertEquals(EXP_TEXT_ALERT, actualTextAlert);
    }


}
