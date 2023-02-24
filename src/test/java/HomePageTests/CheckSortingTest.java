package HomePageTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Pages;
import utils.TestData;
import utils.WebDriverConfigs;

import static com.codeborne.selenide.Selenide.open;

public class CheckSortingTest extends WebDriverConfigs {

    @Test
    public void checkSorting () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();

        Assert.assertEquals(Pages.homePage().getProductCardsNames(0), TestData.CARD_NAME_A_Z);
        Assert.assertEquals(Pages.homePage().getProductCardsNames(5), TestData.CARD_NAME_Z_A);
        Pages.homePage().clickOnTheSortingButton();
        Assert.assertTrue(Pages.homePage().compareSortingOptions());
        Pages.homePage().clickOnSecondSortingOption();
        Assert.assertEquals(Pages.homePage().getProductCardsNames(0), TestData.CARD_NAME_Z_A);
        Assert.assertEquals(Pages.homePage().getProductCardsNames(5), TestData.CARD_NAME_A_Z);
        Pages.homePage().clickOnTheSortingButton();
        Pages.homePage().clickOnThirdSortingOption();
        Assert.assertEquals(Pages.homePage().getProductCardsPrice(0), TestData.LOW_PRICE);
        Assert.assertEquals(Pages.homePage().getProductCardsPrice(5), TestData.HIGH_PRICE);
        Pages.homePage().clickOnTheSortingButton();
        Pages.homePage().clickOnFourthSortingOption();
        Assert.assertEquals(Pages.homePage().getProductCardsPrice(0), TestData.HIGH_PRICE);
        Assert.assertEquals(Pages.homePage().getProductCardsPrice(5), TestData.LOW_PRICE);
    }
}
