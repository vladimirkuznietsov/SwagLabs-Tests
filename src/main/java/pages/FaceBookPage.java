package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;

public class FaceBookPage extends PageTools {

    private final By faceBookLogo = By.xpath("//a[@aria-label=\"Facebook\"]");
    private final By pageHeader = By.xpath("//span[contains(@class, 'x193iq5w')]//h1");

    public SelenideElement getFaceBookLogo () {
        return getSelenideElement(faceBookLogo);
    }

    public String getPageHeaderText () {
        return getText(pageHeader);
    }
}
