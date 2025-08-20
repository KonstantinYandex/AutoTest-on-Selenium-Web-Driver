package test.mainPage.wrapperMain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import test.BaseTest;



import static constants.Constant.ExpectedResultForWrapperMain.EXP_TEXT_AFTER_ENTER_INVALID_EMAIL;
import static constants.Constant.Urls.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNegativeWrapperMain extends BaseTest {

    @BeforeEach
    public void getMainPage(){
        basePage.open(BASE_URL);
    }

    // На этом сайте можно вводить латинские буквы в email, поэтому не стал писать на это тесты, они всё равно упадут.
    @DisplayName("Проверка ввода невалидного(без @) email и появление/исчезновение алертов")
    @Test
    public void testEnterInvalidEmail_1(){
        WebElement inputForEmail = wrapperMain.getInputForEmail();
        WebElement buttonSubmitEmail = wrapperMain.getButtonSubmitEmail();
        baseActions.sendKeys(inputForEmail, "invalidemail")
                .click(buttonSubmitEmail)
                .pause(500).perform();

        // Проверяем, что надпись появилась
        assertEquals(EXP_TEXT_AFTER_ENTER_INVALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());
        // Проверяем, что надпись пропала спустя время
        baseWait.waitAttributeToBe(wrapperMain.getResultBlockAfterEnterEmail(), "style", "display: none;");
    }

    @DisplayName("Проверка ввода невалидного(без указания доменов, но с @) email и появление/исчезновение алертов")
    @Test
    public void testEnterInvalidEmail_2(){
        WebElement inputForEmail = wrapperMain.getInputForEmail();
        WebElement buttonSubmitEmail = wrapperMain.getButtonSubmitEmail();
        baseActions.sendKeys(inputForEmail, "invalidemail@")
                .click(buttonSubmitEmail)
                .pause(500).perform();

        // Проверяем, что надпись появилась
        assertEquals(EXP_TEXT_AFTER_ENTER_INVALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());
        // Проверяем, что надпись пропала спустя время
        baseWait.waitAttributeToBe(wrapperMain.getResultBlockAfterEnterEmail(), "style", "display: none;");
    }

    @DisplayName("Проверка ввода невалидного(без указания национального домена) email и появление/исчезновение алертов")
    @Test
    public void testEnterInvalidEmail_3(){
        WebElement inputForEmail = wrapperMain.getInputForEmail();
        WebElement buttonSubmitEmail = wrapperMain.getButtonSubmitEmail();
        baseActions.sendKeys(inputForEmail, "invalidemail@com")
                .click(buttonSubmitEmail)
                .pause(500).perform();

        // Проверяем, что надпись появилась
        assertEquals(EXP_TEXT_AFTER_ENTER_INVALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());
        // Проверяем, что надпись пропала спустя время
        baseWait.waitAttributeToBe(wrapperMain.getResultBlockAfterEnterEmail(), "style", "display: none;");
    }

    @DisplayName("Проверка ввода невалидного(без указания национального домена и с точкой в конце) email и появление/исчезновение алертов")
    @Test
    public void testEnterInvalidEmail_4(){
        WebElement inputForEmail = wrapperMain.getInputForEmail();
        WebElement buttonSubmitEmail = wrapperMain.getButtonSubmitEmail();
        baseActions.sendKeys(inputForEmail, "invalidemail@com.")
                .click(buttonSubmitEmail)
                .pause(500).perform();

        // Проверяем, что надпись появилась
        assertEquals(EXP_TEXT_AFTER_ENTER_INVALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());
        // Проверяем, что надпись пропала спустя время
        baseWait.waitAttributeToBe(wrapperMain.getResultBlockAfterEnterEmail(), "style", "display: none;");
    }

    @DisplayName("Проверка ввода невалидного(пустая строка) email и появление/исчезновение алертов")
    @Test
    public void testEnterInvalidEmail_5(){
        WebElement inputForEmail = wrapperMain.getInputForEmail();
        WebElement buttonSubmitEmail = wrapperMain.getButtonSubmitEmail();
        baseActions.sendKeys(inputForEmail, "")
                .click(buttonSubmitEmail)
                .pause(500).perform();

        // Проверяем, что надпись появилась
        assertEquals(EXP_TEXT_AFTER_ENTER_INVALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());
        // Проверяем, что надпись пропала спустя время
        baseWait.waitAttributeToBe(wrapperMain.getResultBlockAfterEnterEmail(), "style", "display: none;");
    }

    @DisplayName("Проверка ввода невалидного(ввод пробела) email и появление/исчезновение алертов")
    @Test
    public void testEnterInvalidEmail_6(){
        WebElement inputForEmail = wrapperMain.getInputForEmail();
        WebElement buttonSubmitEmail = wrapperMain.getButtonSubmitEmail();
        baseActions.sendKeys(inputForEmail, " ")
                .click(buttonSubmitEmail)
                .pause(500).perform();

        // Проверяем, что надпись появилась
        assertEquals(EXP_TEXT_AFTER_ENTER_INVALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());
        // Проверяем, что надпись пропала спустя время
        baseWait.waitAttributeToBe(wrapperMain.getResultBlockAfterEnterEmail(), "style", "display: none;");
    }

    @DisplayName("Проверка ввода невалидного(спец.символы в email) email и появление/исчезновение алертов")
    @Test
    public void testEnterInvalidEmail_7(){
        WebElement inputForEmail = wrapperMain.getInputForEmail();
        WebElement buttonSubmitEmail = wrapperMain.getButtonSubmitEmail();
        baseActions.sendKeys(inputForEmail, "!!@das132dadas@mail.ru")
                .click(buttonSubmitEmail)
                .pause(500).perform();

        // Проверяем, что надпись появилась
        assertEquals(EXP_TEXT_AFTER_ENTER_INVALID_EMAIL, wrapperMain.getResultBlockAfterEnterEmail().getText());
        // Проверяем, что надпись пропала спустя время
        baseWait.waitAttributeToBe(wrapperMain.getResultBlockAfterEnterEmail(), "style", "display: none;");
    }








}
