package BurgerMenuPageTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.WebDriverConfigs;

public class VerifyUserIsAbleToLogOutTest extends WebDriverConfigs {

    @Test
    public void logOut () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Pages.burgerMenuPage().clickTheBurgerButton();
        Pages.burgerMenuPage().clickTheLogOutButton();
        Selenide.sleep(1000);
        Assert.assertTrue(Pages.loginPage().getLoginButton().isDisplayed());
    }
}
