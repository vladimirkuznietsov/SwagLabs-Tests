package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

public class WebDriverConfigs {
    @BeforeSuite (alwaysRun = true)
    public void configuration () {
        Configuration.holdBrowserOpen = false;
//        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "normal";
        Configuration.pageLoadTimeout = 20000;
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        Configuration.headless = false;
    }

    @BeforeMethod (alwaysRun = true)
    public void setUp () {
        Selenide.open("https://www.saucedemo.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void cleanWebDriver () {
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        Selenide.open("about:blank");
    }

    @AfterSuite (alwaysRun = true)
    public void tearDown () {
        Selenide.closeWebDriver();
    }
}
