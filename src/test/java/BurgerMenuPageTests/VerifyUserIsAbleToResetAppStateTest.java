package BurgerMenuPageTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.WebDriverConfigs;

public class VerifyUserIsAbleToResetAppStateTest extends WebDriverConfigs {

    @Test
    public void resetAppState () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Pages.homePage().getAddToCartButtons().get(0).click();
        Pages.homePage().clickOnTheShoppingCartIcon();
        Assert.assertTrue(Pages.shoppingCartPage().getItem().isDisplayed());
        Pages.shoppingCartPage().clickOnTheContinueShoppingButton();
        Pages.burgerMenuPage().clickTheBurgerButton();
        Pages.burgerMenuPage().clickTheResetStateButton();
        Selenide.sleep(1000);
        Assert.assertTrue(Pages.homePage().getAddToCartButtons().get(0).isDisplayed());
    }
}
