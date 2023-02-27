package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;

public class LinkedInPage extends PageTools {

    private final By linkedInLogInModal = By.xpath("//div[contains(@class, 'contextual-sign-in-modal__screen')]");

    public SelenideElement getLinkedInLogInModal () {
        return getSelenideElement(linkedInLogInModal);
    }

}
