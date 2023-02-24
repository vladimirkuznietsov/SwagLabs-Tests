package LogInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.TestData;
import utils.WebDriverConfigs;

import static com.codeborne.selenide.Selenide.open;

public class LogInWithInvalidNameTest extends WebDriverConfigs {

    @Test
    public void logInWithInvalidCreds () {
        Pages.loginPage().sendFakeKeysToLoginField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Assert.assertEquals(Pages.loginPage().getErrorBoxText(), TestData.WRONG_CREDS_ERROR_MESSAGE);
    }
}
