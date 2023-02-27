package PurchaseTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Pages;
import utils.TestData;
import utils.WebDriverConfigs;

public class VerifyUserIsAbleToPurchaseTest extends WebDriverConfigs {

    @Test
    public void verifyPurchase () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();

        String itemFromHomepage = Pages.homePage().getProductCardsNames(0);

        Pages.homePage().getAddToCartButtons().get(0).shouldBe(Condition.enabled).click();
        Pages.homePage().clickOnTheShoppingCartIcon();
        Pages.shoppingCartPage().clickOnCheckoutButton();
        Pages.checkoutPage().fillFirstNameField();
        Pages.checkoutPage().fillLAstNameField();
        Pages.checkoutPage().fillPostalCodeField();
        Pages.checkoutPage().clickOnContinueButton();
        Selenide.sleep(2000);
        Assert.assertEquals(Pages.overviewPage().getPurchasedProductName(), itemFromHomepage);
        Pages.overviewPage().clickOnFinishButton();
        Assert.assertEquals(Pages.completePage().getCompleteMessageText(), TestData.COMPLETE_MESSAGE);
    }
}
