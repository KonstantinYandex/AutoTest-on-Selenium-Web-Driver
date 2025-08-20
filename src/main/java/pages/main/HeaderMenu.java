package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

public class HeaderMenu extends BasePage {

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }


    public final By headerMenuItems = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li/a");
    public final By headerMenuBooksItem = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]");
    public final By headerMenuComputersItem = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]");
    public final By computersSubItemDesktops = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]//a[contains(text(), \"Desktops\")]");
    public final By computersSubItemNotebooks = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]//a[contains(text(), \"Notebooks\")]");
    public final By computersSubItemAccessories = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]//a[contains(text(), \"Accessories\")]");
    public final By headerMenuElectronicsItem = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[3]");
    public final By electronicsSubItemCameraPhoto = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[3]//a[contains(text(), \"Camera, photo\")]");
    public final By electronicsSubItemCellphones = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[3]//a[contains(text(), \"Cell phones\")]");
    public final By headerMenuApparelShoesItem = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[4]");
    public final By headerMenuDigitalDownloadsItem = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[5]");
    public final By headerMenuJewelryItem = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[6]");
    public final By headerMenuGiftcardsItem = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[7]");


    public List<WebElement> getHeaderMenuItems() {
        return driver.findElements(headerMenuItems);
    }

    public WebElement getComputerItem() {
        return driver.findElement(headerMenuComputersItem);
    }

    public WebElement getComputerSubItemDesktops() {
        return driver.findElement(computersSubItemDesktops);
    }

    public WebElement getComputerSubItemNotebooks() {
        return driver.findElement(computersSubItemNotebooks);
    }

    public WebElement getComputerSubItemAccessories() {
        return driver.findElement(computersSubItemAccessories);
    }

    public WebElement getElectronicsItem() {
        return driver.findElement(headerMenuElectronicsItem);
    }

    public WebElement getElectronicsSubItemCameraPhoto() {
        return driver.findElement(electronicsSubItemCameraPhoto);
    }

    public WebElement getElectronicsSubItemCellphones() {
        return driver.findElement(electronicsSubItemCellphones);
    }

    public WebElement getBooksComputerItem() {
        return driver.findElement(headerMenuBooksItem);
    }

    public WebElement getApparelShoesItem() {
        return driver.findElement(headerMenuApparelShoesItem);
    }

    public WebElement getDigitalDownloadsItem() {
        return driver.findElement(headerMenuDigitalDownloadsItem);
    }

    public WebElement getJewelryItem() {
        return driver.findElement(headerMenuJewelryItem);
    }

    public WebElement getGiftcardsItem() {
        return driver.findElement(headerMenuGiftcardsItem);
    }


}


