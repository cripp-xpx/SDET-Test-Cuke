package Steps;

import Base.BasePage;
import Pages.FooterPage;
import cucumber.api.java.en.When;

public class FooterLinksSteps extends BasePage {

    FooterPage ftrpg = new FooterPage();

    @When("^I click on the footer \"([^\"]*)\"$")
    public void iClickOnTheFooterLink(String footerLink) {
        ftrpg.clickOnFooterLink(footerLink);
    }

}
