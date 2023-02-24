package utils;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageTools extends CustomLogger {

    private static String getPreviousMethodNameAsText () {
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        String replacedName = methodName.replaceAll(String.format("%s|%s|%s",
                "(?<=[A-Z])(?=[A-Z][a-z])",
                "(?<=[^A-Z])(?=[A-Z])",
                "(?<=[A-Za-z])(?=[^A-Za-z])"
        ),
                " "
        );
        return replacedName.substring(0,1).toUpperCase() + replacedName.substring(1).toLowerCase();
    }

    public By byLocator (By by, Object... args){
        return LocatorParser.parseLocator(by, args);
    }

    protected Actions getActions () {
        return Selenide.actions();
    }

    protected SelenideElement shouldBe (Condition condition, By by, Object... args) {
        return $(byLocator(by, args)).shouldBe(condition);
    }

    protected ElementsCollection shouldBe (CollectionCondition condition, By by, Object... args) {
        return $$(byLocator(by, args)).shouldBe(condition);
    }

    protected SelenideElement shouldHave (Condition condition, By by, Object... args) {
        return $(byLocator(by, args)).shouldHave(condition);
    }

    protected ElementsCollection shouldHave (CollectionCondition condition, By by, Object... args) {
        return $$(byLocator(by, args)).shouldHave(condition);
    }

// Basic actions

    protected String getText (By by, Object... args) {
        logInfo(getPreviousMethodNameAsText() + " element -> " + byLocator(by, args));
        return shouldBe(Condition.visible, by, args).getText();
    }

    protected List<String> getTexts (By by, Object... args) {
        logInfo(getPreviousMethodNameAsText() + " element -> " + byLocator(by, args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1), by, args).texts();
    }

    protected SelenideElement getSelenideElement (By by, Object... args) {
        return shouldBe(Condition.visible, by, args);
    }

    protected List<SelenideElement> getSelenideElements(By by, Object... args) {
        logInfo(getPreviousMethodNameAsText() + " element -> " + byLocator(by, args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1), by, args);
    }

    protected void click (By by, Object... args) {
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by, args));
        shouldBe(Condition.visible, by, args).click();
    }

    protected void type (String text, By by, Object... args) {
        logInfo(getPreviousMethodNameAsText() + " " + text + " ', element -> " + byLocator(by, args));
        shouldBe(Condition.visible, by, args).append(text);
    }

// Waiters

    protected void waitForElementVisibility (By by, Object... args) {
        shouldBe(Condition.visible, by, args);
    }

    protected void waitForElementVisibilityUntil (By by, Object... args) {
        logInfo(getPreviousMethodNameAsText() + " visible -> " + byLocator(by, args));
        $(byLocator(by, args)).waitUntil(Condition.visible, 15000);
    }

}
