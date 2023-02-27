package FooterPageTests;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Pages;
import utils.TestData;
import utils.WebDriverConfigs;

import static com.codeborne.selenide.Selenide.$;

public class VerifyUserIsAbleToOpenLinkedInPageTest extends WebDriverConfigs {

    //@Test
    public void openLinkedInPage () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();
        Pages.homePage().scrollToSocialsSection();
        Pages.homePage().getSocialsButtons().get(2).click();
        Selenide.switchTo().window(2);
        Selenide.sleep(2000);
        Assert.assertTrue(Pages.linkedInPage().getLinkedInLogInModal().isDisplayed());
    }
}
