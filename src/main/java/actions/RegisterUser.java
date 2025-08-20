package actions;

import org.openqa.selenium.WebDriver;
import pages.register.Register;

import java.util.Random;

import static constants.Constant.Urls.REGISTER_URL;
import static helpers.GenerateRandomString.generateString;

public class RegisterUser extends BaseActions {

    public Random random = new Random();
    public Register register = new Register(driver);

    public RegisterUser(WebDriver driver) {
        super(driver);
    }

    public void registerUser() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        click(register.getButtonMale())
                .sendKeys(register.getInputFirstName(), "Kostya")
                .sendKeys(register.getInputLastName(), "Novikov")
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
    }


    public void registerUserFemale() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        click(register.getButtonFemale())
                .sendKeys(register.getInputFirstName(), "Anna")
                .sendKeys(register.getInputLastName(), "Krupenina")
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
    }

    public void registerUserWithoutGender() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
    }

    public String registerUserWhichNameHasOnlyNumbers() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        String randomNameOnlyNumbers = generateString(random, "0123456789", 10);
        sendKeys(register.getInputFirstName(), randomNameOnlyNumbers)
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomNameOnlyNumbers;
    }

    public String registerUserWhichNameHasOnlySpecialChars() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        String randomNameOnlySpecialChars = generateString(random, "!@#$%^&*()_+?><|", 10);
        sendKeys(register.getInputFirstName(), randomNameOnlySpecialChars)
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomNameOnlySpecialChars;
    }

    public String registerUserWhichNameHasOnlyEnglishWords() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        String randomNameOnlyEnglishWords = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10);
        sendKeys(register.getInputFirstName(), randomNameOnlyEnglishWords)
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomNameOnlyEnglishWords;
    }

    public String registerUserWhichFamilyHasOnlyEnglishWords() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        String randomFamilyOnlyEnglishWords = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10);
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), randomFamilyOnlyEnglishWords)
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomFamilyOnlyEnglishWords;
    }

    public String registerUserWhichFamilyHasOnlyNumbers() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        String randomFamilyOnlyNumbers = generateString(random, "0123456789", 10);
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), randomFamilyOnlyNumbers)
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomFamilyOnlyNumbers;
    }

    public String registerUserWhichFamilyHasOnlySpecialChars() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.com";
        String randomFamilyOnlySpecialChars = generateString(random, "!@#$%^&*()_+?><|", 10);
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), randomFamilyOnlySpecialChars)
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomFamilyOnlySpecialChars;
    }

    public String registerUserWhichEmailHasOnlyEnglishWords() {
        driver.get(REGISTER_URL);
        String randomEmailOnlyEnglishWords = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10) + "@gmail.com";
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmailOnlyEnglishWords)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomEmailOnlyEnglishWords;
    }

    public String registerUserWhichEmailHasOnlyNumbers() {
        driver.get(REGISTER_URL);
        String randomEmailOnlyNumbers = generateString(random, "0123456789", 10) + "@gmail.com";
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmailOnlyNumbers)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        click(register.getButtonToContinue()).perform();
        return randomEmailOnlyNumbers;
    }

    public void registerUserWhichEmailHasOnlySpecialChars() {
        driver.get(REGISTER_URL);
        String randomEmailOnlySpecialChars = generateString(random, "!@#$%^&*()_+?><|", 10) + "@gmail.com";
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmailOnlySpecialChars)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();

    }

    public String registerUserWhichEmailHasDomainMailRu() {
        driver.get(REGISTER_URL);
        String randomEmailDomainMailRu = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@mail.ru";
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmailDomainMailRu)
                .sendKeys(register.getInputPassword(), "password")
                .sendKeys(register.getInputConfirmPassword(), "password")
                .click(register.getButtonSubmit())
                .perform();
        return randomEmailDomainMailRu;
    }

    public String registerUserWhichPasswordHasOnlyNumbers() {
        driver.get(REGISTER_URL);
        String randomEmail = generateString(random, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 10) + "@gmail.ru";
        sendKeys(register.getInputFirstName(), "Grazdanin")
                .sendKeys(register.getInputLastName(), "Mira")
                .sendKeys(register.getInputEmail(), randomEmail)
                .sendKeys(register.getInputPassword(), "111111")
                .sendKeys(register.getInputConfirmPassword(), "111111")
                .click(register.getButtonSubmit())
                .perform();

//        click(register.getButtonToContinue()).perform();

        return randomEmail;
    }

}
