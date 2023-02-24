package LogInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.TestData;
import utils.WebDriverConfigs;

import static com.codeborne.selenide.Selenide.open;

public class LoginWithInvalidPassTest extends WebDriverConfigs {


    @Test
    public void logInWithInvalidPass () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendFakeKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Assert.assertEquals(Pages.loginPage().getErrorBoxText(), TestData.WRONG_CREDS_ERROR_MESSAGE);
    }
}
