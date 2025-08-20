package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.Collections;
import java.util.List;

public class ProductGrid extends BasePage {

    public ProductGrid(WebDriver driver) {
        super(driver);
    }


    public final By productPicture = By.xpath("//div[@class=\"product-item\"]/div/a/img");
    public final By productName = By.xpath("//div[@class=\"product-item\"]//h2[@class=\"product-title\"]/a");
    public final By productItem = By.xpath(" //div[@class=\"item-box\"]");
    public final By productRatingItem = By.xpath("//div[@class=\"product-rating-box\"]/div[@class=\"rating\"]");
    public final By productPriceItem = By.xpath("//div[@class=\"prices\"]/span");


    public By getProductPicture() {
        return productPicture;
    }

    public By getProductName() {
        return productName;
    }

    public List<WebElement> getProductItem() {
        return driver.findElements(productItem);
    }

    public By getProductRatingItem() {
        return productRatingItem;
    }

    public By getProductPriceItem() {
        return productPriceItem;
    }
}
