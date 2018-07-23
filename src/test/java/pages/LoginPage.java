package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.PageLoadHelper;

import static setup.SeleniumDriver.getDriver;


/**
 * Created by user on 7/23/18.
 */
public class LoginPage extends BasePage<LoginPage> {

    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "pass")
    private WebElement password;
    @FindBy(id = "loginbutton")
    private WebElement loginButton;
    @FindBy(id = "findFriendsNav")
    private WebElement findFriendsButton;

    public LoginPage(){
        super(getDriver());
    }
    public LoginPage open() {
        return new LoginPage().openPage(LoginPage.class);
    }

    @Override
    public String getPageUrl() {
        return "";
    }

    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    @Override
    protected void load() {

    }
    @Override
    protected void isLoaded() throws Error {
        PageLoadHelper.isLoaded().waitForPageLoaded();
    }
}
