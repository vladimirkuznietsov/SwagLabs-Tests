package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PageTools;
import utils.TestData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage extends PageTools {
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public void fillFirstNameField () {
        waitForElementVisibility(firstNameField);
        type(TestData.FIRST_NAME, firstNameField);
    }

    public void fillLAstNameField () {
        waitForElementVisibility(firstNameField);
        type(TestData.LAST_NAME, lastNameField);
    }

    public void fillPostalCodeField () {
        waitForElementVisibility(firstNameField);
        type(TestData.POSTAL_CODE, postalCodeField);
    }

    public void clickOnContinueButton () {
        click(continueButton);
    }
}
