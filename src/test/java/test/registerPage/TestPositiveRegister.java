package test.registerPage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.account.AccountPage;
import test.BaseTest;

import static constants.Constant.Urls.BASE_URL;
import static org.junit.jupiter.api.Assertions.*;

public class TestPositiveRegister extends BaseTest {

    AccountPage accountPage = new AccountPage(driver);

    @BeforeEach
    public void getMainPage() {
        driver.get(BASE_URL);
    }

    @DisplayName("Проверка пола клиента после регистрации_мужчина")
    @Test
    public void testRegisterUserMale() {
        registerUser.registerUser();
        header.getAccountElement().click();
        assertEquals("true", accountPage.getLabelGenderMale().getAttribute("checked"));
    }

    @DisplayName("Проверка пола клиента после регистрации_женщина")
    @Test
    public void testRegisterUserFemale() {
        registerUser.registerUserFemale();
        header.getAccountElement().click();
        assertEquals("true", accountPage.getLabelGenderFemale().getAttribute("checked"));
    }

    @DisplayName("Проверка регистрации клиента без пола...")
    @Test
    public void testRegisterUserWithoutGender() {
        registerUser.registerUserWithoutGender();
        header.getAccountElement().click();
        assertNull(accountPage.getLabelGenderFemale().getAttribute("checked"));
        assertNull(accountPage.getLabelGenderMale().getAttribute("checked"));
    }

    @DisplayName("Регистрация_имя пользователя состоит только из латинских букв")
    @Test
    public void testRegisterUserWhichNameHasOnlyEnglishWords() {
        String nameOnlyEnglishWord = registerUser.registerUserWhichNameHasOnlyEnglishWords();
        header.getAccountElement().click();
        assertEquals(nameOnlyEnglishWord, accountPage.getInputFirstName().getAttribute("value"));
    }

    @DisplayName("Регистрация_имя пользователя состоит только из цифр")
    @Test
    public void testRegisterUserWhichNameHasOnlyNumbers() {
        String nameOnlyNumbers = registerUser.registerUserWhichNameHasOnlyNumbers();
        header.getAccountElement().click();
        assertEquals(nameOnlyNumbers, accountPage.getInputFirstName().getAttribute("value"));
    }

    @DisplayName("Регистрация_имя пользователя состоит только из специальных символов")
    @Test
    public void testRegisterUserWhichNameHasOnlySpecialChars() {
        String nameOnlySpecialChars = registerUser.registerUserWhichNameHasOnlySpecialChars();
        header.getAccountElement().click();
        assertEquals(nameOnlySpecialChars, accountPage.getInputFirstName().getAttribute("value"));
    }

    @DisplayName("Регистрация_фамилия пользователя состоит только из латинских букв")
    @Test
    public void testRegisterUserWhichFamilyHasOnlyEnglishWord() {
        String familyOnlyEnglishWord = registerUser.registerUserWhichFamilyHasOnlyEnglishWords();
        header.getAccountElement().click();
        assertEquals(familyOnlyEnglishWord, accountPage.getInputLastName().getAttribute("value"));
    }

    @DisplayName("Регистрация_фамилия пользователя состоит только из цифр")
    @Test
    public void testRegisterUserWhichFamilyHasOnlyNumbers() {
        String familyOnlyNumbers = registerUser.registerUserWhichFamilyHasOnlyNumbers();
        header.getAccountElement().click();
        assertEquals(familyOnlyNumbers, accountPage.getInputLastName().getAttribute("value"));
    }

    @DisplayName("Регистрация_фамилия пользователя состоит только из специальных символов")
    @Test
    public void testRegisterUserWhichFamilyHasOnlySpecialChars() {
        String familyOnlySpecialChars = registerUser.registerUserWhichFamilyHasOnlySpecialChars();
        header.getAccountElement().click();
        assertEquals(familyOnlySpecialChars, accountPage.getInputLastName().getAttribute("value"));
    }

    @DisplayName("Регистрация_эл.почта пользователя состоит только из латинских букв")
    @Test
    public void testRegisterUserWhichEmailHasOnlyEnglishWords() {
        String emailOnlyEnglishWords = registerUser.registerUserWhichEmailHasOnlyEnglishWords();
        header.getAccountElement().click();
        assertEquals(emailOnlyEnglishWords, accountPage.getInputEmail().getAttribute("value"));
    }

    @DisplayName("Регистрация_эл.почта пользователя состоит только из цифр")
    @Test
    public void testRegisterUserWhichEmailHasOnlyNumbers() {
        String emailOnlyNumbers = registerUser.registerUserWhichEmailHasOnlyNumbers();
        header.getAccountElement().click();
        assertEquals(emailOnlyNumbers, accountPage.getInputEmail().getAttribute("value"));
    }

    @DisplayName("Регистрация_эл.почта пользователя с доменом '@mail.ru' ")
    @Test
    public void testRegisterUserWhichEmailHasDomainMailRu() {
        String emailMailRu = registerUser.registerUserWhichEmailHasDomainMailRu();
        header.getAccountElement().click();
        assertEquals(emailMailRu, accountPage.getInputEmail().getAttribute("value"));
    }

    @DisplayName("Регистрация_пароль только из цифр")
    @Test
    public void testRegisterUserWhichPasswordHasOnlyNumbers() {
        String email = registerUser.registerUserWhichPasswordHasOnlyNumbers();
        header.getAccountElement().click();
        // Пароль не отображается, поэтому проверяем по email
        assertEquals(email, accountPage.getInputEmail().getAttribute("value"));
    }


    @DisplayName("Проверка регистрации пользователя_E2E")
    @Test
    public void testRegisterUser() {
        registerUser.registerUser();
        assertEquals(BASE_URL, driver.getCurrentUrl());
    }


}
