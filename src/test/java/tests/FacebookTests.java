package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import setup.BaseTest;
import steps.LoginSteps;

/**
 * Created by user on 7/23/18.
 */
public class FacebookTests extends BaseTest {
    HomePage homePage;
    @BeforeMethod
    public void init(){
        LoginSteps loginSteps = new LoginSteps();
        homePage = new HomePage();
        loginSteps.login();
    }
    @Test
    public void facebookTest(){
        homePage = homePage.init();
        homePage.clickFacebookButton();
        homePage.clickPostArea();
        homePage.setPostText("Hello World");
        homePage.clickPost();
        Assert.assertTrue(homePage.checkPost("Hello World"),"Post is not match");
    }
}
