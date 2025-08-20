package test.registerPage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static constants.Constant.Urls.REGISTER_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNegativeRegister extends TestPositiveRegister {

    @DisplayName("Регистрация_эл.почта пользователя состоит только из специальных символов")
    @Test
    public void testRegisterUserWhichEmailHasOnlySpecialChars() {
        registerUser.registerUserWhichEmailHasOnlySpecialChars();
        assertEquals("Wrong email", register.getFieldForViewError().getText());
        assertEquals(REGISTER_URL, driver.getCurrentUrl());
    }


}
