package BurgerMenuPageTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.WebDriverConfigs;

public class VerifyElementsNamesCorrespondToExpected extends WebDriverConfigs {

    @Test
    public void compareNames () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Pages.burgerMenuPage().clickTheBurgerButton();
        Selenide.sleep(1000);
        Assert.assertEquals(Pages.burgerMenuPage().getExpectedNamesList(), Pages.burgerMenuPage().getActualNamesList());
    }
}
