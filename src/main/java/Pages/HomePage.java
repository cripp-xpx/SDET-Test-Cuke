package Pages;

import Base.BasePage;

public class HomePage extends BasePage {

    private static String homePageURL = "https://www.xpanxion.com";

    public void startAtHomePage() {
        getPageDriver().get(homePageURL);
    }

    public void teardown() {
        getPageDriver().quit();
    }

}
