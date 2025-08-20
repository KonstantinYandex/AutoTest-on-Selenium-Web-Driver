package test.mainPage.wrapperMain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.BaseTest;


import java.util.List;
import java.util.Objects;

import static constants.Constant.ExpectedResultForWrapperMain.EXP_TEXT_AFTER_ENTER_VALID_EMAIL;
import static constants.Constant.Urls.BASE_URL;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPositiveWrapperMain extends BaseTest {

    @BeforeEach
    public void getMainPage() {
        basePage.open(BASE_URL);
    }

    @DisplayName("Проверка редиректа на страницу /books")
    @Test
    public void testRedirectToBooksPageFromWrapperMain() {
        wrapperMain.getBooksItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/books"));
    }

    @DisplayName("Проверка редиректа на страницу /computers")
    @Test
    public void testRedirectToComputersPageFromWrapperMain() {
        wrapperMain.getComputersItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/computers"));
    }

    @DisplayName("Проверка редиректа на страницу /electronics")
    @Test
    public void testRedirectToElectronicsPageFromWrapperMain() {
        wrapperMain.getElectronicsItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/electronics"));
    }

    @DisplayName("Проверка редиректа на страницу /apparel-shoes")
    @Test
    public void testRedirectToApparelShoesPageFromWrapperMain() {
        wrapperMain.getApparelShoesItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/apparel-shoes"));
    }


    @DisplayName("Проверка редиректа на страницу /digital-downloads")
    @Test
    public void testRedirectToDigitalDownloadsPageFromWrapperMain() {
        wrapperMain.getDigitalDownloadsItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/digital-downloads"));
    }

    @DisplayName("Проверка редиректа на страницу /jewelry")
    @Test
    public void testRedirectToJewelryPageFromWrapperMain() {
        wrapperMain.getJewelryItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/jewelry"));
    }

    @DisplayName("Проверка редиректа на страницу /gift-cards")
    @Test
    public void testRedirectToGiftCardsPageFromWrapperMain() {
        wrapperMain.getGiftCardsItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/gift-cards"));
    }


    @DisplayName("Проверка выпадающего списка у раздела Computers")
    @Test
    public void testViewSubItemsOfComputersInWrapperMain() {
        wrapperMain.getComputersItem().click();
        baseWait.waitElementVisibility(wrapperMain.getComputersSubItemNotebooks());
        baseWait.waitElementVisibility(wrapperMain.getComputersSubItemAccessories());
        baseWait.waitElementVisibility(wrapperMain.getComputersSubItemDesktops());
    }

    @DisplayName("Проверка выпадающего списка у раздела Categories")
    @Test
    public void testViewSubItemsOfElectronicsInWrapperMain() {
        wrapperMain.getElectronicsItem().click();
        baseWait.waitElementVisibility(wrapperMain.getElectronicsSubItemCameraPhoto());
        baseWait.waitElementVisibility(wrapperMain.getElectronicsSubItemCellPhones());
    }

    @DisplayName("Проверка выделения элементов после нажатия на них в разделе Categories")
    @Test
    public void testViewSelectionItemsInNavCategory() {
        //Записываем изначальное количество элементов, на которое надо нажать, так как страница обновляется
        int sizeOfItemsList = wrapperMain.getAllItems().size();
        //Проходимся по каждому элементу, нажимаем на него, находим его же после рендера страницы и смотрим выделение
        for (int i = 1; i <= sizeOfItemsList; i++) {
            String needItems = "//div[@class=\"block block-category-navigation\"]/div[@class=\"listbox\"]/ul/li[" + i + "]/a";
            WebElement itemOfCategoryBeforeClick = driver.findElement(By.xpath(needItems));
            itemOfCategoryBeforeClick.click();
            WebElement itemOfCategoryAfterClick = driver.findElement(By.xpath(needItems));
            assertEquals("700", itemOfCategoryAfterClick.getCssValue("font-weight"));
        }
    }

    @DisplayName("Проверка выделения вложенных элементов у блока Computers")
    @Test
    public void testViewSelectionSubItemsInComputersCategory() {
        // Находим основной раздел, нажимаем на него.
        wrapperMain.getComputersItem().click();
        //Появляются подразделы. Записываем их количество, на них мы будем нажимать, так как страница обновляется
        int sizeOfSubItemsList = wrapperMain.getSubItemInActiveItem().size();
        //Проходимся по каждому элементу, нажимаем на него, находим его же после рендера страницы и смотрим выделение
        for (int i = 1; i <= sizeOfSubItemsList; i++) {
            String needItems = "//div[@class=\"block block-category-navigation\"]/div[@class=\"listbox\"]/ul/li/a[@href=\"/computers\"]/../ul/li[" + i + "]/a";
            WebElement itemOfCategoryBeforeClick = driver.findElement(By.xpath(needItems));
            itemOfCategoryBeforeClick.click();
            WebElement itemOfCategoryAfterClick = driver.findElement(By.xpath(needItems));
            assertEquals("700", itemOfCategoryAfterClick.getCssValue("font-weight"));
        }
    }

    @DisplayName("Проверка выделения вложенных элементов у блока Electronics")
    @Test
    public void testViewSelectionSubItemsInElectronicsCategory() {
        // Находим основной раздел, нажимаем на него
        wrapperMain.getElectronicsItem().click();
        //Появляются подразделы. Записываем их количество, на них мы будем нажимать, так как страница обновляется
        int sizeOfSubItemsList = wrapperMain.getSubItemInActiveItem().size();
        //Проходимся по каждому элементу, нажимаем на него, находим его же после рендера страницы и смотрим выделение
        for (int i = 1; i <= sizeOfSubItemsList; i++) {
            String needItems = "//div[@class=\"block block-category-navigation\"]/div[@class=\"listbox\"]/ul/li/a[@href=\"/electronics\"]/../ul/li[" + i + "]/a";
            WebElement itemOfCategoryBeforeClick = driver.findElement(By.xpath(needItems));
            itemOfCategoryBeforeClick.click();
            WebElement itemOfCategoryAfterClick = driver.findElement(By.xpath(needItems));
            assertEquals("700", itemOfCategoryAfterClick.getCssValue("font-weight"));
        }
    }

    @DisplayName("Проверка редиректа после нажатия на раздел /tricentis")
    @Test
    public void testRedirectToTricentis() {
        wrapperMain.getTricentisItem().click();
        assertThat(driver.getCurrentUrl(), endsWith("/tricentis"));
    }

    @DisplayName("Проверка выделения раздела /tricentis после нажатия на него")
    @Test
    public void testViewSelectionOfTricentis() {
        wrapperMain.getTricentisItem().click();
        WebElement itemOfTricentisAfterClick = wrapperMain.getTricentisItem();
        assertEquals("700", itemOfTricentisAfterClick.getCssValue("font-weight"));
    }

    @DisplayName("Проверка надписи перед инпутом для email в разделе Newsletter")
    @Test
    public void testTextSpanOfNewsletter() {
        String textOfSpan = wrapperMain.getSpanOfNewsletter().getText();
        assertEquals("Sign up for our newsletter:", textOfSpan);
    }

    @DisplayName("Ввод валидного email и проверка уведомления после отправки формы")
    @Test
    public void testEnterValidEmail() {
        baseActions.sendKeys(wrapperMain.getInputForEmail(), "example@com.ru")
                .click(wrapperMain.getButtonSubmitEmail())
                .pause(600)
                .perform();

        // Проверяем, что после нажатия на кнопку у элемента появляется текст...
        assertEquals(EXP_TEXT_AFTER_ENTER_VALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());

        // ... И что основной блок пропадает. Тем самым на его месте появляется текст с уведомлением
        WebElement subscribeBlock = wrapperMain.getSubscribeBlockOfEmail();
        baseWait.waitAttributeToBe(subscribeBlock, "style", "display: none;");
    }

    @DisplayName("Голосование в разделе `Community poll` незарегистрированным пользователем")
    @Test
    public void testVoteUnRegisteredUser() {
        baseActions.click(wrapperMain.getRadioButtonOfPollOptions())
                .click(wrapperMain.getButtonToVoteOfPollOptions())
                .pause(1000)
                .perform();

        // Примечание: хоть убей не получилось поймать display:block с помощью стандартных решений :)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String actualStyleAfterVote = js.executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('display');", wrapperMain.getPollVoteError()).toString();
        // Ожидаем появление элемента
        assertEquals("block", actualStyleAfterVote);
        baseActions.pause(3000).perform();
        // Ожидаем исчезновения элемента
        String actualStyleAfterTime = js.executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('display');", wrapperMain.getPollVoteError()).toString();
        assertEquals("none", actualStyleAfterTime);
    }


    @DisplayName("Голосование в разделе `Community poll` зарегистрированным пользователем")
    @Test
    public void testVoteRegisteredUser() {
        registerUser.registerUser();
        baseActions.click(wrapperMain.getRadioButtonOfPollOptions())
                .click(wrapperMain.getButtonToVoteOfPollOptions())
                .pause(1000)
                .perform();
        baseWait.waitElementVisibility(wrapperMain.getPollResult());
    }


    @DisplayName("Редирект на страницы из раздела `Popular Tags`")
    @Test
    public void testRedirectFronPopularTags() {
        List<WebElement> linksOfPopularTags = wrapperMain.getLinksOfPopularTags();
        for (WebElement item : linksOfPopularTags) {
            String expEndingUrl = item.getText().toLowerCase();
            item.click();
            baseActions.pause(500);
            assertThat(Objects.requireNonNull(driver.getCurrentUrl()).toLowerCase(), endsWith(expEndingUrl));
            driver.navigate().back();
        }
    }

    @DisplayName("Переход на страницу просмотра всех тэгов из раздела `Popular Tags`")
    @Test
    public void testRedirectToAllTagsPage() {
        wrapperMain.getButtonToAllPageTags().click();
        assertThat(driver.getCurrentUrl(), endsWith("producttag/all"));
    }


}
