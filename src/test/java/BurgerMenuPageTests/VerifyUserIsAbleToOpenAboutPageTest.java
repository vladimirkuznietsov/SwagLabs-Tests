package BurgerMenuPageTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.WebDriverConfigs;

public class VerifyUserIsAbleToOpenAboutPageTest extends WebDriverConfigs {

    @Test
    public void navigateToAboutPage () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Pages.burgerMenuPage().clickTheBurgerButton();
        Pages.burgerMenuPage().clickTheAboutButton();
        Selenide.sleep(2000);
        Assert.assertTrue(Pages.burgerMenuPage().getTheAboutPageIcon().isDisplayed());
    }
}
