package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;

public class TwitterPage extends PageTools {

    private final By twitterSearchField = By.xpath("//h1[@role=\"heading\"]//div[@dir='ltr']");
    private final By twitterPageHeader = By.xpath("(//span[text()='Sauce Labs'])[1]");

    public SelenideElement getTwitterLogo () {
        return getSelenideElement(twitterSearchField);
    }

    public String getPageHeaderText () {
        return getText(twitterPageHeader);
    }
}
