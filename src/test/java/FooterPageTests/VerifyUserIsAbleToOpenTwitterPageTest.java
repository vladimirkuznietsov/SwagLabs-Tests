package FooterPageTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.TestData;
import utils.WebDriverConfigs;

public class VerifyUserIsAbleToOpenTwitterPageTest extends WebDriverConfigs {

    @Test (priority = 2)
    public void openTwitterPage () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Pages.homePage().scrollToSocialsSection();
        Pages.homePage().getSocialsButtons().get(0).click();
        Selenide.switchTo().window(2);
        Selenide.sleep(3000);
        Assert.assertTrue(Pages.twitterPage().getTwitterLogo().isDisplayed());
        Assert.assertEquals(TestData.SOCIALS_HEADER, Pages.twitterPage().getPageHeaderText());
    }
}
