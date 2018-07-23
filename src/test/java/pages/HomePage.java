package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.PageLoadHelper;

import static setup.SeleniumDriver.getDriver;

/**
 * Created by user on 7/23/18.
 */
public class HomePage extends BasePage<HomePage>{

    @FindBy(xpath = "//textarea")
    private WebElement postArea;
    @FindBy(id = "feedx_sprouts_container")
    private WebElement postPopup;
    @FindBy(xpath = "//div[@role='textbox']")
    private WebElement textbox;
    @FindBy(xpath = "//div[@aria-label='News Feed']")
    private WebElement newsFeed;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Post')]/..")
    private WebElement postButton;
    @FindBy(xpath = "//h1//span[contains(text(),'Facebook')]/..")
    private WebElement facebookButton;

    public HomePage() {
        super(getDriver());
    }
    public HomePage init() {
        return new HomePage().init(HomePage.class);
    }
    @Override
    public String getPageUrl() {
        return "";
    }


    public void clickPostArea(){
        PageLoadHelper.isLoaded().isElementIsVisible(postArea);
        postArea.click();
        PageLoadHelper.isLoaded().isElementIsVisible(postPopup);
    }

    public void setPostText(String text){
        PageLoadHelper.isLoaded().isElementIsVisible(textbox);
        textbox.sendKeys(text);
    }
    public void clickPost(){
        PageLoadHelper.isLoaded().isElementIsVisible(postButton);
        postButton.click();
    }
    public boolean checkPost(String post){
        PageLoadHelper.isLoaded().isElementIsClickable(facebookButton);
        return newsFeed.getText().contains(post);
    }
    public void clickFacebookButton(){

        facebookButton.click();
    }






    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
