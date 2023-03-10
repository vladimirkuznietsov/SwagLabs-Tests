package FooterPageTests;

import com.codeborne.selenide.Selenide;
import org.apache.hc.core5.reactor.Command;
import org.assertj.core.internal.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.Pages;
import utils.TestData;
import utils.WebDriverConfigs;

import java.util.List;

public class VerifyUserIsAbleToOpenFaceBookPageTest extends WebDriverConfigs {

    @Test
    public void openFaceBookPage () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Pages.homePage().scrollToSocialsSection();
        Pages.homePage().getSocialsButtons().get(1).click();
        Selenide.switchTo().window(1);
        Selenide.sleep(3000);
        Assert.assertTrue(Pages.faceBookPage().getFaceBookLogo().isDisplayed());
        Assert.assertEquals(TestData.SOCIALS_HEADER, Pages.faceBookPage().getPageHeaderText());
    }

    @AfterMethod(alwaysRun = true)
    public void closeWindows () {
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }
}
