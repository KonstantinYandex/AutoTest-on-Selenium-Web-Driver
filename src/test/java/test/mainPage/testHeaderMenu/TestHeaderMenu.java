package test.mainPage.testHeaderMenu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.BaseTest;

import java.util.List;

import static constants.Constant.ExpectedResultForHeaderMenu.EXP_LIST_ELEMENT_IN_HEADER_MENU;
import static constants.Constant.Urls.BASE_URL;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHeaderMenu extends BaseTest {

    @BeforeEach
    public void getMainPage(){
        basePage.open(BASE_URL);
    }

    @DisplayName("Проверка нужных элементов в header-menu")
    @Test
    public void testElementsInHeaderMenu() {
        List<WebElement> headerMenuItems = headerMenu.getHeaderMenuItems();
        List<String> actualItems= headerMenuItems.stream().map(WebElement::getText).toList();
        assertEquals(EXP_LIST_ELEMENT_IN_HEADER_MENU, actualItems);
    }

    @DisplayName("Проверка подсветки элементов в header-menu при наведении на них")
    @Test
    public void testBacklightHeaderItems() {
        List<WebElement> headerMenuItems = headerMenu.getHeaderMenuItems();
        for (WebElement item : headerMenuItems) {
            baseActions.clickAndHold(item).pause(50).perform();
            String classTextOfLinks = item.getAttribute("class");
            assertEquals("hover", classTextOfLinks);
            assertThat(item.findElement(By.xpath("../div")).getAttribute("class"), containsString("active"));
        }
    }

    @DisplayName("Проверка элементов выпадающего списка у вкладки Computers")
    @Test
    public void testViewSubMenuOfComputers() {
        WebElement itemComputers = headerMenu.getComputerItem();
        baseActions.clickAndHold(itemComputers).pause(200).perform();
        baseWait.waitElementVisibility(headerMenu.getComputerSubItemDesktops());
        baseWait.waitElementVisibility(headerMenu.getComputerSubItemNotebooks());
        baseWait.waitElementVisibility(headerMenu.getComputerSubItemAccessories());
    }

    @DisplayName("Проверка элементов выпадающего списка у вкладки Electronics")
    @Test
    public void testViewSubMenuOfElectronics() {
        WebElement itemElectronics = headerMenu.getElectronicsItem();
        baseActions.clickAndHold(itemElectronics).pause(200).perform();
        baseWait.waitElementVisibility(headerMenu.getElectronicsSubItemCameraPhoto());
        baseWait.waitElementVisibility(headerMenu.getElectronicsSubItemCellphones());
    }

    @DisplayName("Проверка редиректа после нажатия на вкладку Books")
    @Test
    public void testRedirectToBooksPageFromHeaderMenu() {
        WebElement booksItem = headerMenu.getBooksComputerItem();
        booksItem.click();
        assertThat(driver.getCurrentUrl(), endsWith("/books"));
    }

    @DisplayName("Проверка редиректа после нажатия на вкладку Computers")
    @Test
    public void testRedirectToComputersPageFromHeaderMenu() {
        WebElement computersItem = headerMenu.getComputerItem();
        computersItem.click();
        assertThat(driver.getCurrentUrl(), endsWith("/computers"));
    }

    @DisplayName("Проверка редиректа после нажатия на вкладку Electronics")
    @Test
    public void testRedirectToElectronicsPageFromHeaderMenu() {
        WebElement electronicsItem = headerMenu.getElectronicsItem();
        electronicsItem.click();
        assertThat(driver.getCurrentUrl(), endsWith("/electronics"));
    }

    @DisplayName("Проверка редиректа после нажатия на вкладку Apparel & Shoes")
    @Test
    public void testRedirectToApparelShoesPageFromHeaderMenu() {
        WebElement apparelShoesItem = headerMenu.getApparelShoesItem();
        apparelShoesItem.click();
        assertThat(driver.getCurrentUrl(), endsWith("/apparel-shoes"));
    }

    @DisplayName("Проверка редиректа после нажатия на вкладку Digital downloads")
    @Test
    public void testRedirectToDigitalDownloadsPageFromHeaderMenu() {
        WebElement digitalDownloadsItems = headerMenu.getDigitalDownloadsItem();
        digitalDownloadsItems.click();
        assertThat(driver.getCurrentUrl(), endsWith("/digital-downloads"));
    }

    @DisplayName("Проверка редиректа после нажатия на вкладку Jewelry")
    @Test
    public void testRedirectToJewelryPageFromHeaderMenu() {
        WebElement jewelryItems = headerMenu.getJewelryItem();
        jewelryItems.click();
        assertThat(driver.getCurrentUrl(), endsWith("/jewelry"));
    }

    @DisplayName("Проверка редиректа после нажатия на вкладку Gift Cards")
    @Test
    public void testRedirectToGiftCardsPageFromHeaderMenu() {
        WebElement giftCardsItems = headerMenu.getGiftcardsItem();
        giftCardsItems.click();
        assertThat(driver.getCurrentUrl(), endsWith("/gift-cards"));
    }





}
