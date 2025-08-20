package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class Header extends BasePage {

    public Header(WebDriver driver) {
        super(driver);
    }

    private final By headerLogoImage = By.xpath("//div[@class=\"header-logo\"]//img");
    private final By registerElementInHeader = By.xpath("//div[@class=\"header-links\"]//a[@class=\"ico-register\"]");
    // Доступен после регистрации пользователя
    private final By accountElementInHeader = By.xpath("//div[@class=\"header-links\"]//a[@class=\"account\"]");
    private final By logInElementInHeader = By.xpath("//div[@class=\"header-links\"]//a[@class=\"ico-login\"]");
    private final By shoppingElementInHeader = By.xpath("//div[@class=\"header-links\"]//a[@class=\"ico-cart\"]//span[@class=\"cart-label\"]");
    private final By wishListElementInHeader = By.xpath("//div[@class=\"header-links\"]//a[@class=\"ico-wishlist\"]//span[@class=\"cart-label\"]");
    private final By icoShoppingCartQty = By.xpath("//span[@class=\"cart-qty\"]");
    private final By icoWishListQty = By.xpath("//span[@class=\"wishlist-qty\"]");
    private final By anShoppingItemButtonToCart = By.xpath("//div[@class=\"item-box\"][2]//input");
    private final By popupAfterAddedItemToCart = By.xpath("//div[@id=\"bar-notification\"]/p[@class=\"content\"]");
    private final By linkInPopup = By.xpath("//div[@id=\"bar-notification\"]/p[@class=\"content\"]/a");
    private final By btnToClsPopup = By.xpath("//div[@id=\"bar-notification\"]/span[@class=\"close\"]");
    private final By barNotification = By.xpath("//div[@class=\"bar-notification success\"]");
    private final By inputOfSearchBox = By.xpath("//div[@class=\"search-box\"]//input[@type=\"text\"]");
    private final By btnToSubmitOfSearchBox = By.xpath("//div[@class=\"search-box\"]//input[@type=\"submit\"]");


    public WebElement getHeaderLogoImage() {
        return driver.findElement(headerLogoImage);
    }

    public WebElement getRegisterElement() {
        return driver.findElement(registerElementInHeader);
    }

    public WebElement getAccountElement() {
        return driver.findElement(accountElementInHeader);
    }

    public WebElement getLogInElement() {
        return driver.findElement(logInElementInHeader);
    }

    public WebElement getShoppingCardElement() {
        return driver.findElement(shoppingElementInHeader);
    }

    public WebElement getWishListElement() {
        return driver.findElement(wishListElementInHeader);
    }

    public WebElement getShoppingCartQty() {
        return driver.findElement(icoShoppingCartQty);
    }

    public WebElement getWishListQty() {
        return driver.findElement(icoWishListQty);
    }

    public WebElement getAnShoppingItemButtonToCart() {
        return driver.findElement(anShoppingItemButtonToCart);
    }

    public WebElement getPopupAfterAddedItemToCart() {
        return driver.findElement(popupAfterAddedItemToCart);
    }

    public WebElement getLinkInPopup() {
        return driver.findElement(linkInPopup);
    }

    public WebElement getBtnToClsPopup() {
        return driver.findElement(btnToClsPopup);
    }

    public WebElement getBarNotification() {
        return driver.findElement(barNotification);
    }

    public WebElement getSearchBox() {
        return driver.findElement(inputOfSearchBox);
    }

    public WebElement getBtnSubmitOfSearchBox() {
        return driver.findElement(btnToSubmitOfSearchBox);
    }


}
