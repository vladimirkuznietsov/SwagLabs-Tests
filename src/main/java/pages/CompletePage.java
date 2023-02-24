package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CompletePage {

    private final SelenideElement completeMessage = $x("//div[@class=\"complete-text\"]");

    public String getCompleteMessageText () {
        return completeMessage.getText();
    }
}
