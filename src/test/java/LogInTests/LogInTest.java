package LogInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.WebDriverConfigs;

public class LogInTest extends WebDriverConfigs {

    @Test
    public void LogIn () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Assert.assertTrue(Pages.homePage().getSiteLogo().isDisplayed());
    }
}
