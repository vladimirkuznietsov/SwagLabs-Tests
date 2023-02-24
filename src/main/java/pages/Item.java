package pages;

import utils.PageTools;

import java.util.Objects;

public class Item extends PageTools {
    String itemName;
    String itemInfo;
    String itemPrice;

    public Item () {}

    public void setItemName (String itemName) {
        this.itemName = itemName;
    }

    public void setItemInfo (String itemInfo) {
        this.itemInfo = itemInfo;
    }

    public void setItemPrice (String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemName, item.itemName) && Objects.equals(itemInfo, item.itemInfo) && Objects.equals(itemPrice, item.itemPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, itemInfo, itemPrice);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemInfo='" + itemInfo + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                '}';
    }
}
