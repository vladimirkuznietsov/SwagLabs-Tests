package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;
import utils.TestData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LogInPage extends PageTools {

    private final By logInField = By.xpath("//input[@id=\"user-name\"]");
    private final By passField = By.xpath("//input[@id=\"password\"]");
    private final By logInButton = By.xpath("//input[@id=\"login-button\"]");
    private final By errorMessageBox = By.xpath("//h3[@data-test=\"error\"]");

    public void sendKeysToLogInField () {
        type(TestData.NAME, logInField);
    }

    public void sendFakeKeysToLoginField () {
        type(TestData.INVALID_NAME, logInField);
    }

    public void sendKeysToPassField () {
        type(TestData.PASS, passField);
    }

    public void sendFakeKeysToPassField () {
        type(TestData.FAKE_PASS, passField);
    }

    public void clickOnTheLogInButton () {
        click(logInButton);
    }

    public String getErrorBoxText () {
        return getText(errorMessageBox);
    }

    public SelenideElement getLoginButton () {
        return getSelenideElement(logInButton);
    }


}
