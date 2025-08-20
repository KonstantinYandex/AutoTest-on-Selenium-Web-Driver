package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

public class Footer extends BasePage {

    public Footer(WebDriver driver) {
        super(driver);
    }

    public final By itemsOfInformationBlock = By.xpath("//div[@class=\"column information\"]/ul/li");
    public final By itemsOfCustomerServiceBlock = By.xpath("//div[@class=\"column customer-service\"]/ul/li");
    public final By itemsOfMyAccountBlock = By.xpath("//div[@class=\"column my-account\"]/ul/li");
    public final By myAccountItem = By.xpath("//div[@class=\"column my-account\"]//a[@class=\"account\"]");
    public final By ordersItem = By.xpath("//div[@class=\"column my-account\"]//a[text() = \"Orders\"]");
    public final By addressesItem = By.xpath("//div[@class=\"column my-account\"]//a[text() = \"Addresses\"]");

    public List<WebElement> getItemsOfInformationBlock() {
        return driver.findElements(itemsOfInformationBlock);
    }

    public List<WebElement> getItemsOfCustomerServiceBlock() {
        return driver.findElements(itemsOfCustomerServiceBlock);
    }

    public List<WebElement> getItemsOfMyAccountBlock() {
        return driver.findElements(itemsOfMyAccountBlock);
    }

    public WebElement getMyAccountItem() {
        return driver.findElement(myAccountItem);
    }

    public WebElement getOrdersItem() {
        return driver.findElement(ordersItem);
    }

    public WebElement getAddressesItem() {
        return driver.findElement(addressesItem);
    }


}
