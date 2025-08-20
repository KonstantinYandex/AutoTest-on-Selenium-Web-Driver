package test.mainPage.testPopup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import test.BaseTest;

import static constants.Constant.ExpectedResultForPopup.EXP_COLOR_POPUP_BACKGROUND;
import static constants.Constant.ExpectedResultForPopup.EXP_TEXT_POPUP;
import static constants.Constant.Urls.BASE_URL;
import static constants.Constant.Urls.CART_URL;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPopup extends BaseTest {

    @BeforeEach
    public void getMainPage(){
        basePage.open(BASE_URL);
    }

    @DisplayName("Проверка отображения popup-а после добавления товара в корзину")
    @Test
    public void testViewPopupAfterAddItemToShoppingCart(){
        header.getAnShoppingItemButtonToCart().click();
        WebElement popup = header.getPopupAfterAddedItemToCart();
        baseWait.waitElementVisibility(popup);
    }

    @DisplayName("Проверка исчезновения popup-а после добавления товара в корзину")
    @Test
    public void testInvisibleOfPopupAfterAddItemToShoppingCart(){
        header.getAnShoppingItemButtonToCart().click();
        WebElement popup = header.getPopupAfterAddedItemToCart();
        baseWait.waitElementInvisibility(popup);
    }


    @DisplayName("Проверка текста popup-а после добавления товара в корзину")
    @Test
    public void testTextPopupAfterAddItemToShoppingCart(){
        header.getAnShoppingItemButtonToCart().click();
        String actualPopupText = header.getPopupAfterAddedItemToCart().getText();
        assertEquals(EXP_TEXT_POPUP, actualPopupText);
    }

    @DisplayName("Проверка редиректа в корзину из popup-а")
    @Test
    public void testRedirectInShoppingCartFromPopup() {
        header.getAnShoppingItemButtonToCart().click();
        header.getLinkInPopup().click();
        String actualUrl = driver.getCurrentUrl();
        assertEquals(CART_URL, actualUrl);
    }

    @DisplayName("Проверка исчезновения popup-а после нажатия на кнопку закрытия")
    @Test
    public void testPopupClosing() {
        header.getAnShoppingItemButtonToCart().click();
        header.getBtnToClsPopup().click();
        WebElement popup = header.getPopupAfterAddedItemToCart();
        baseWait.waitElementInvisibility(popup);
    }

    @DisplayName("Проверка цвета заливки у popup-а")
    @Test
    public void testBackgroundColorOfPopup() {
        header.getAnShoppingItemButtonToCart().click();
        WebElement barNotification = header.getBarNotification();
        String actualColor = header.getCssValue("background", barNotification);
        assertThat(actualColor, startsWith(EXP_COLOR_POPUP_BACKGROUND));
    }



}
