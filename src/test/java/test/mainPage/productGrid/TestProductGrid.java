package test.mainPage.productGrid;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.BaseTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static constants.Constant.Urls.BASE_URL;

public class TestProductGrid extends BaseTest {

    @BeforeEach
    public void getMainPage() {
        basePage.open(BASE_URL);
    }


    @DisplayName("Наличие изображения у продукта")
    @Test
    public void testViewPictureProduct() {
        baseWait.visibilityOfAllElementsLocatedBy(productGrid.getProductPicture());
    }

    @DisplayName("Наличие имени у продукта")
    @Test
    public void testViewNameProduct() {
        baseWait.visibilityOfAllElementsLocatedBy(productGrid.getProductName());
    }

    @DisplayName("Наличие цены у продукта")
    @Test
    public void testViewPriceProduct() {
        baseWait.visibilityOfAllElementsLocatedBy(productGrid.getProductPriceItem());
    }


    @DisplayName("Редирект при нажатии на изображение продукта")
    @Test
    public void testRedirectAfterClickImageOfProductItem() {
        List<WebElement> products = productGrid.getProductItem();
        for (int i = 0; i < products.size(); i++) {
            WebElement pictureOfProduct = driver.findElement(By.xpath(" //div[@class=\"item-box\"]" + "[" + (i + 1) + "]/div/div/a/img"));
            WebElement linkOfProduct = driver.findElement(By.xpath(" //div[@class=\"item-box\"]" + "[" + (i + 1) + "]/div/div/a"));
            String expUrlAfterRedirect = linkOfProduct.getAttribute("href");
            pictureOfProduct.click();
            assertEquals(expUrlAfterRedirect, driver.getCurrentUrl());
            driver.navigate().back();
        }

    }

    @DisplayName("Редирект при нажатии на название продукта")
    @Test
    public void testRedirectAfterClickNameOfProductItem() {
        List<WebElement> products = productGrid.getProductItem();
        for (int i = 0; i < products.size(); i++) {
            WebElement linkOfProduct = driver.findElement(By.xpath(" //div[@class=\"item-box\"]" + "[" + (i + 1) + "]/div/div/a"));
            String expUrlAfterRedirect = linkOfProduct.getAttribute("href");
            linkOfProduct.click();
            assertEquals(expUrlAfterRedirect, driver.getCurrentUrl());
            driver.navigate().back();
        }
    }

    @DisplayName("Отображение рейтинга у каждого продукта")
    @Test
    public void testProductHasRating() {
        baseWait.visibilityOfAllElementsLocatedBy(productGrid.getProductRatingItem());
    }

    @DisplayName("Проверка отображения количества товаров добавленных в корзину у ссылки \"Shopping cart\"")
    @Test
    public void testViewQtyOnShoppingCartNav() {
        // Добавим два товара в корзину
        baseActions.click(header.getAnShoppingItemButtonToCart())
                .pause(2000)
                .click(header.getAnShoppingItemButtonToCart())
                .pause(2000)
                .perform();

        // Должно отображаться два товара, поэтому пишем "(2)"
        assertEquals("(2)", header.getShoppingCartQty().getText());
    }
    
}
