package ShoppingCartTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Pages;
import utils.WebDriverConfigs;

public class VerifyUserCanRemoveItemFromCartTest extends WebDriverConfigs {

    @Test
    public void removeItemFromCart () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();

        Pages.homePage().addAllItemsToCart();
        Pages.homePage().clickOnTheShoppingCartIcon();
        Pages.shoppingCartPage().clickOnTheFirstItemRemoveButton();
        Pages.shoppingCartPage().clickOnTheContinueShoppingButton();
        Assert.assertEquals(Pages.homePage().getAddToCartButtons().get(0).getText(), "ADD TO CART");
    }
}
