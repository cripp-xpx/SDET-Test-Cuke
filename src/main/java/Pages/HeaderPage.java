package Pages;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    @FindBy(id = "menu-item-965")
    private WebElement careersLink;
    @FindBy(id = "menu-item-26")
    private WebElement contactUsLink;
    @FindBy(id = "menu-item-335")
    private WebElement homeLink;
    @FindBy(id = "menu-item-336")
    private WebElement ourWorkLink;
    @FindBy(id = "menu-item-23")
    private WebElement whatWeDoLink;
    @FindBy(id = "menu-item-337")
    private WebElement whoWeAreLink;

    public void clickOnHeaderLink(String linkName) {
        WebElement headerLink = homeLink;

        switch (linkName) {
            case "careersLink":
                headerLink = careersLink;
                break;

            case "contactUsLink":
                headerLink = contactUsLink;
                break;

            case "ourWorkLink":
                headerLink = ourWorkLink;
                break;

            case "whatWeDoLink":
                headerLink = whatWeDoLink;
                break;

            case "whoWeAreLink":
                headerLink = whoWeAreLink;
                break;
        }

        headerLink.click();
    }

}
