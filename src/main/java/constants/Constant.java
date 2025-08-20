package constants;

import java.util.List;

public class Constant {
    public static class TimeoutVariable {
        public static final int IMPLIC_WAIT = 4;
        public static final int EXPLISIT_WAIT = 4000;
    }

    public static class Urls {
        public static final String BASE_URL = "https://demowebshop.tricentis.com/";
        public static final String REGISTER_URL = "https://demowebshop.tricentis.com/register";
        public static final String LOGIN_URL = "https://demowebshop.tricentis.com/login";
        public static final String CART_URL = "https://demowebshop.tricentis.com/cart";
        public static final String WiSHLIST_URL = "https://demowebshop.tricentis.com/wishlist";

    }

    public static class ExpectedResultForHeader {
        public static final String EXP_SRC_OF_LOGO = "/Themes/DefaultClean/Content/images/logo.png";
        public static final String EXP_ALT_TXT_OF_LOGO = "Tricentis Demo Web Shop";
        public static final String EXP_PLACEHOLDER_OF_SEARCHBOX = "Search store";
        public static final List<String> EXP_ITEMS_AFTER_SEARCH = List.of("Black & White Diamond Heart", "Build your own cheap computer", "Health Book");
        public static final String EXP_TEXT_ALERT = "Please enter some search keyword";
    }

    public static class ExpectedResultForHeaderMenu {
        public static final List<String> EXP_LIST_ELEMENT_IN_HEADER_MENU = List.of("BOOKS", "COMPUTERS", "ELECTRONICS", "APPAREL & SHOES", "DIGITAL DOWNLOADS",
                "JEWELRY", "GIFT CARDS");

    }

    public static class ExpectedResultForPopup {
        public static final String EXP_TEXT_POPUP = "The product has been added to your shopping cart";
        public static final String EXP_COLOR_POPUP_BACKGROUND = "rgb(145, 189, 9)";

    }

    public static class ExpectedResultForWrapperMain {
        public static final String EXP_TEXT_AFTER_ENTER_VALID_EMAIL = "Thank you for signing up! A verification email has been sent. We appreciate your interest.";
        public static final String EXP_TEXT_AFTER_ENTER_INVALID_EMAIL = "Enter valid email";


    }

    public static class ExpectedResultRegisterPage {
    }

    public static class AccountData {

        public static final String LOGIN = "example67722227@mail.com";
        public static final String PASSWORD = "yAb-K99-xGe-MtS";

    }


}
