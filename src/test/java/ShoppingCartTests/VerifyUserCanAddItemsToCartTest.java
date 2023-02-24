package ShoppingCartTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.WebDriverConfigs;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class VerifyUserCanAddItemsToCartTest extends WebDriverConfigs {

    boolean verify;

    @Test
    public void addAllItemsToCart () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();

        List<String> cardsNamesFromHomePage = Pages.homePage().GetAllCardsNAmes();

        Pages.homePage().addAllItemsToCart();
        Pages.homePage().clickOnTheShoppingCartIcon();
        Selenide.sleep(1000);

        List<String> cardsNamesFromShoppingCart = Pages.shoppingCartPage().getItemNames();
        Assert.assertEquals(cardsNamesFromHomePage, cardsNamesFromShoppingCart);
    }
}