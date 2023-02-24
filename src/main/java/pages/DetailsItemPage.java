package pages;

import org.openqa.selenium.By;

public class DetailsItemPage extends Item {
    private final By itemName = By.xpath("//div[contains(@class,'inventory_details_name')]");
    private final By itemInfo = By.xpath("(//div[contains(@class,'inventory_details_desc')])[2]");
    private final By itemPrice = By.xpath("//div[@class=\"inventory_details_price\"]");

    public Item getItem () {
        Item item = new Item();
        String name = getText(itemName);
        String info = getText(itemInfo);
        String price = getText(itemPrice);
        item.setItemName(name);
        item.setItemInfo(info);
        item.setItemPrice(price);
        return item;
    }
}
