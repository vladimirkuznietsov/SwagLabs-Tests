package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OverviewPage {

    private final SelenideElement purchasedProduct = $x("//div[@class=\"inventory_item_name\"]");
    private final SelenideElement finishButton = $("#finish");

    public String getPurchasedProductName () {
        return purchasedProduct.getText();
    }

    public void clickOnFinishButton () {
        finishButton.shouldBe(Condition.enabled).click();
    }
}
