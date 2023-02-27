package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PageTools {

    private final By siteLogo = By.xpath("//div[@class=\"app_logo\"]");
    private final By productCards = By.xpath("//div[@class=\"inventory_item\"]");
    private final By productCardsNames = By.xpath("//div[@class=\"inventory_item_name\"]");
    private final By sortingDropdownOptions = By.xpath("//select[@class='product_sort_container']//option");
    private final By productCardsPrice = By.xpath("//div[@class=\"inventory_item_price\"]");
    private final By addToCartButtons = By.xpath("//div[@class='inventory_item']//button");
    private final By sortingButton = By.xpath("//select[@class=\"product_sort_container\"]");
    private final By shoppingCartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");
    private final By socialsButtons = By.xpath("//ul[@class=\"social\"]//li//a");

    public ArrayList<String> dropdownOptions () {
        ArrayList<String> options = new ArrayList<>();
        options.add("Name (A to Z)");
        options.add("Name (Z to A)");
        options.add("Price (low to high)");
        options.add("Price (high to low)");
        return options;
    }

    public List<SelenideElement> getProductCards () {
        return getSelenideElements(productCards);
    }

    public void clickOnTheSortingButton () {
        click(sortingButton);
    }

    public void clickOnSecondSortingOption () {
        getSelenideElements(sortingDropdownOptions).get(1).click();
    }

    public void clickOnThirdSortingOption () {
        getSelenideElements(sortingDropdownOptions).get(2).click();
    }

    public void clickOnFourthSortingOption () {
        getSelenideElements(sortingDropdownOptions).get(3).click();
    }

    public boolean compareSortingOptions () {
        for(int i = 0; i < dropdownOptions().size(); i++) {
            if(!dropdownOptions().get(i).equals(getSelenideElements(sortingDropdownOptions).get(i).getText())) return false;
        }
        return true;
    }

    public int getProductCardsEquity () {
        return getSelenideElements(productCards).size();
    }

    public SelenideElement getSiteLogo () {
        return getSelenideElement(siteLogo);
    }

    public String getProductCardsNames (int index) {
        List<String> cardsNames = getTexts(productCardsNames);
        return cardsNames.get(index);
    }

    public String getProductCardsPrice (int index) {
        List<String> cardsPrice = getTexts(productCardsPrice);
        return cardsPrice.get(index);
    }

    public void addAllItemsToCart () {
        List<SelenideElement> addToCartList = getSelenideElements(addToCartButtons);
        for (SelenideElement element : addToCartList) {
            element.click();
        }
    }

    public void clickOnTheShoppingCartIcon () {
        click(shoppingCartButton);
    }

    public List<String> GetAllCardsNAmes () {
        return getTexts(productCardsNames);
    }

    public List<SelenideElement> getAddToCartButtons () {
        return getSelenideElements(addToCartButtons);
    }

    public void scrollToSocialsSection () {
        scrollToElement(socialsButtons);
    }

    public List<SelenideElement> getSocialsButtons () {
        return getSelenideElements(socialsButtons);
    }

}
