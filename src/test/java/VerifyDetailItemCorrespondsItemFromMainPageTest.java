import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Item;
import utils.Pages;
import utils.WebDriverConfigs;

import java.util.List;

public class VerifyDetailItemCorrespondsItemFromMainPageTest extends WebDriverConfigs {

    @Test
    public void correspondTest () {
        Pages.loginPage().sendKeysToLogInField();
        Pages.loginPage().sendKeysToPassField();
        Pages.loginPage().clickOnTheLogInButton();

        Selenide.sleep(1000);

        List<Item> itemsHomePage = Pages.itemsHomePage().getItems();
        Pages.itemsHomePage().getItemsFromHomePage().get(1).click();
        Selenide.sleep(1000);
        Item itemDetailsPage = Pages.detailsItemPage().getItem();
        Assert.assertTrue(itemsHomePage.contains(itemDetailsPage));
    }
}
