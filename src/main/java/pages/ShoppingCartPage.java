package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage extends PageTools {
    private final By itemNames = By.xpath("//div[contains(@class, 'inventory_item_name')]");
    private final By firstItemRemoveButton = By.xpath("//div[@class=\"cart_list\"]//div[3]//button");
    private final By continueShoppingButton = By.xpath("//button[text()='Continue Shopping']");
    private final By checkoutButton = By.xpath("//button[@name=\"checkout\"]");

    public List<String> getItemNames () {
        return getTexts(itemNames);
    }

    public void clickOnTheFirstItemRemoveButton () {
        click(firstItemRemoveButton);
    }

    public void clickOnTheContinueShoppingButton () {
        click(continueShoppingButton);
    }

    public void clickOnCheckoutButton () {
        click(checkoutButton);
    }
}
