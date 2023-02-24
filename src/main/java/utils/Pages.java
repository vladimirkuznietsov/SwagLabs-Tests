package utils;

import pages.*;

public class Pages {
    private static HomePage homePage;
    private static LogInPage loginPage;
    private static ShoppingCartPage shoppingCartPage;
    private static CheckoutPage checkoutPage;
    private static OverviewPage overviewPage;
    private static CompletePage completePage;
    private static DetailsItemPage detailsItemPage = new DetailsItemPage();
    private static ItemsHomePage itemsHomePage = new ItemsHomePage();

    public static HomePage homePage () {
        if(homePage == null) homePage = new HomePage();
        return homePage;
    }

    public static LogInPage loginPage () {
        if(loginPage == null) loginPage = new LogInPage();
        return loginPage;
    }

    public static ShoppingCartPage shoppingCartPage () {
        if(shoppingCartPage == null) shoppingCartPage = new ShoppingCartPage();
        return shoppingCartPage;
    }

    public static CheckoutPage checkoutPage () {
        if(checkoutPage == null) checkoutPage = new CheckoutPage();
        return checkoutPage;
    }

    public static OverviewPage overviewPage () {
        if(overviewPage == null) overviewPage = new OverviewPage();
        return overviewPage;
    }

    public static CompletePage completePage () {
        if(completePage == null) completePage = new CompletePage();
        return completePage;
    }

    public static DetailsItemPage detailsItemPage () {
        if (detailsItemPage == null) detailsItemPage = new DetailsItemPage();
        return detailsItemPage;
    }

    public static ItemsHomePage itemsHomePage () {
        if (itemsHomePage == null) itemsHomePage = new ItemsHomePage();
        return itemsHomePage;
    }
}
