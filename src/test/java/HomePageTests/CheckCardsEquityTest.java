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

public class CheckCardsEquityTest extends WebDriverConfigs {

    @Test
    public void checkNumberOfCards () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();

        Selenide.sleep(1000);
        Assert.assertEquals(Pages.homePage().getProductCardsEquity(),6);
    }

}
