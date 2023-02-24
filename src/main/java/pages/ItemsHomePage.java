package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class ItemsHomePage extends Item{
    private final By itemsNames = By.xpath("//div[@class='inventory_item_name']");
    private final By itemsInfos = By.xpath("//div[@class='inventory_item_desc']");
    private final By itemsPrices = By.xpath("//div[@class='inventory_item_price']");

    public List<SelenideElement> getItemsFromHomePage () {
        return getSelenideElements(itemsNames);
    }

    public List<Item> getItems () {
        List<Item> itemList = new ArrayList<>();
        List<SelenideElement> elements = getSelenideElements(itemsNames);
        List<String> elementsNames = getTexts(itemsNames);
        List<String> elementsInfos = getTexts(itemsInfos);
        List<String> elementsPrices = getTexts(itemsPrices);

        for (int i = 0; i < elements.size(); i++) {
            Item item = new Item();

            item.setItemName(String.valueOf(elementsNames.get(i)));
            item.setItemInfo(String.valueOf(elementsInfos.get(i)));
            item.setItemPrice(String.valueOf(elementsPrices.get(i)));
            itemList.add(item);
        }
        return itemList;
    }

}
