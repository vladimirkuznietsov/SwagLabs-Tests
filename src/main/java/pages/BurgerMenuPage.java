package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;

import java.util.ArrayList;
import java.util.List;

public class BurgerMenuPage extends PageTools {

    private final By burgerMenuButton = By.id("react-burger-menu-btn");
    private final By aboutButton = By.id("about_sidebar_link");
    private final By logOutButton = By.id("logout_sidebar_link");
    private final By resetStateButton = By.id("reset_sidebar_link");
    private final By aboutPageIcon = By.xpath("(//img[@alt=\"Saucelabs\"])[1]");
    private final By burgerMenuElements = By.xpath("//a[@class=\"bm-item menu-item\"]");

    public void clickTheBurgerButton () {
        waitForElementVisibilityUntil(burgerMenuButton);
        click(burgerMenuButton);
    }

    public void clickTheAboutButton () {
        click(aboutButton);
    }

    public void clickTheLogOutButton () {
        click(logOutButton);
    }

    public void clickTheResetStateButton () {
        click(resetStateButton);
    }

    public SelenideElement getTheAboutPageIcon () {
       return getSelenideElement(aboutPageIcon);
    }

    public SelenideElement getBurgerMenuButton () {
        return getSelenideElement(burgerMenuButton);
    }

    public List<String> getExpectedNamesList () {
        List<String> names = new ArrayList<>();
        names.add("ALL ITEMS");
        names.add("ABOUT");
        names.add("LOGOUT");
        names.add("RESET APP STATE");
        return names;
    }

    public List<String> getActualNamesList () {
        List<String> actualNames = getTexts(burgerMenuElements);
        return actualNames;
    }

}
