package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

public class MasterWrapperMain extends BasePage {

    public MasterWrapperMain(WebDriver driver) {
        super(driver);
    }

    public final By allItems = By.xpath("//div[@class=\"block block-category-navigation\"]/div[@class=\"listbox\"]/ul/li/a");
    public final By allSubItemInActiveItem = By.xpath("//div[@class=\"block block-category-navigation\"]//li[@class=\"active\"]/ul/li/a");
    public final By booksItem = By.xpath("//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Books\")]");
    public final By computersItem = By.xpath("//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Computers\")]");
    public final By computersSubItemDesktops = By.xpath("(//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Desktops\")])[1]");
    public final By computersSubItemNotebooks = By.xpath("(//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Notebooks\")])[1]");
    public final By computersSubItemAccessories = By.xpath("(//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Accessories\")])[1]");
    public final By electronicsItem = By.xpath("//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Electronics\")]");
    public final By electronicsSubItemCameraPhoto = By.xpath("(//div[@class=\"master-wrapper-main\"]//a[contains(text(),\"Camera, photo\")])[1]");
    public final By electronicsSubItemCellPhones = By.xpath("(//div[@class=\"master-wrapper-main\"]//a[contains(text(),\"Cell phones\")])[1]");
    public final By apparelShoesItem = By.xpath("//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Apparel & Shoes\")]");
    public final By digitalDownloadsItem = By.xpath("//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Digital downloads\")]");
    public final By JewelryItem = By.xpath("//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Jewelry\")]");
    public final By giftCardsItem = By.xpath("//div[@class=\"master-wrapper-main\"]//a[contains(text(), \"Gift Cards\")]");
    public final By tricentisItem = By.xpath("//div[@class=\"block block-manufacturer-navigation\"]/div[@class=\"listbox\"]/ul/li/a[@href=\"/tricentis\"]");
    public final By spanOfNewsletter = By.xpath("//div[@class=\"newsletter-subscribe-block\"]/span");
    public final By inputForEmail = By.xpath("//input[@id=\"newsletter-email\"]");
    public final By buttonSubmitEmail = By.xpath("//input[@value=\"Subscribe\"]");
    public final By resultBlockAfterEnterEmail = By.xpath("//div[@class=\"newsletter-result-block\"]");
    public final By subscribeBlockOfEmail = By.xpath("//div[@class=\"newsletter-subscribe-block\"]");
    public final By answerButtonOfPollOptions = By.xpath("//input[@id=\"pollanswers-1\"]");
    public final By buttonToVoteOfPollOptions = By.xpath("//input[@id=\"vote-poll-1\"]");
    public final By pollVoteErrorOfPollOptions = By.xpath("//div[@id=\"block-poll-vote-error-1\"]");
    public final By resultOfPollOptions = By.xpath("//ul[@class=\"poll-results\"]");
    public final By linksOfPopularTags = By.xpath("//div[@class=\"tags\"]/ul//a");
    public final By buttonToAllPageTags = By.xpath("//a[@href=\"/producttag/all\"]");


    public List<WebElement> getAllItems() {
        return driver.findElements(allItems);
    }

    public WebElement getBooksItem() {
        return driver.findElement(booksItem);
    }

    public WebElement getComputersItem() {
        return driver.findElement(computersItem);
    }

    public WebElement getComputersSubItemDesktops() {
        return driver.findElement(computersSubItemDesktops);
    }

    public WebElement getComputersSubItemNotebooks() {
        return driver.findElement(computersSubItemNotebooks);
    }

    public WebElement getComputersSubItemAccessories() {
        return driver.findElement(computersSubItemAccessories);
    }

    public List<WebElement> getSubItemInActiveItem() {
        return driver.findElements(allSubItemInActiveItem);
    }

    public WebElement getElectronicsItem() {
        return driver.findElement(electronicsItem);
    }

    public WebElement getElectronicsSubItemCameraPhoto() {
        return driver.findElement(electronicsSubItemCameraPhoto);
    }

    public WebElement getElectronicsSubItemCellPhones() {
        return driver.findElement(electronicsSubItemCellPhones);
    }

    public WebElement getApparelShoesItem() {
        return driver.findElement(apparelShoesItem);
    }

    public WebElement getDigitalDownloadsItem() {
        return driver.findElement(digitalDownloadsItem);
    }

    public WebElement getJewelryItem() {
        return driver.findElement(JewelryItem);
    }

    public WebElement getGiftCardsItem() {
        return driver.findElement(giftCardsItem);
    }

    public WebElement getTricentisItem() {
        return driver.findElement(tricentisItem);
    }

    public WebElement getSpanOfNewsletter() {
        return driver.findElement(spanOfNewsletter);
    }

    public WebElement getInputForEmail() {
        return driver.findElement(inputForEmail);
    }

    public WebElement getButtonSubmitEmail() {
        return driver.findElement(buttonSubmitEmail);
    }

    public WebElement getResultBlockAfterEnterEmail() {
        return driver.findElement(resultBlockAfterEnterEmail);
    }

    public WebElement getSubscribeBlockOfEmail() {
        return driver.findElement(subscribeBlockOfEmail);
    }

    public WebElement getRadioButtonOfPollOptions() {
        return driver.findElement(answerButtonOfPollOptions);
    }

    public WebElement getButtonToVoteOfPollOptions() {
        return driver.findElement(buttonToVoteOfPollOptions);
    }

    public WebElement getPollVoteError() {
        return driver.findElement(pollVoteErrorOfPollOptions);
    }

    public WebElement getPollResult() {
        return driver.findElement(resultOfPollOptions);
    }

    public List<WebElement> getLinksOfPopularTags() {
        return driver.findElements(linksOfPopularTags);
    }

    public WebElement getButtonToAllPageTags() {
        return driver.findElement(buttonToAllPageTags);
    }


}
