package Pages;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"menu-item-73\"]/a")
    private WebElement whatWeDoLink;
    @FindBy(id = "menu-item-75")
    private WebElement conceptDesignAndPrototypingLink;
    @FindBy(id = "menu-item-77")
    private WebElement productAndSoftwareEngineeringLink;
    @FindBy(id = "menu-item-74")
    private WebElement assuranceServicesLink;
    @FindBy(id = "menu-item-76")
    private WebElement digitalSolutionsLink;
    @FindBy(id = "menu-item-335")
    private WebElement homeLink;

    public void clickOnFooterLink(String linkName) {
        WebElement headerLink = homeLink;

        switch (linkName) {
            case "conceptDesignAndPrototypingLink":
                headerLink = conceptDesignAndPrototypingLink;
                break;

            case "productAndSoftwareEngineeringLink":
                headerLink = productAndSoftwareEngineeringLink;
                break;

            case "assuranceServicesLink":
                headerLink = assuranceServicesLink;
                break;

            case "whatWeDoLink":
                headerLink = whatWeDoLink;
                break;

            case "digitalSolutionsLink":
                headerLink = digitalSolutionsLink;
                break;
        }

        headerLink.click();
    }

}
