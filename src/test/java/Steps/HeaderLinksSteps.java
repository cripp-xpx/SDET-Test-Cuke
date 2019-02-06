package Steps;

import Base.BasePage;
import Pages.HeaderPage;
import Pages.HomePage;
import Pages.UtilPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HeaderLinksSteps extends BasePage {

    HomePage hmpg = new HomePage();
    HeaderPage hdrpg = new HeaderPage();
    UtilPage util = new UtilPage();

    @Before
    public void startDriver() {
        hmpg.startAtHomePage();
    }

    @Given("^I start on the Xpanxion Home Page$")
    public void iStartOnTheXpanxionWebpage() {
        hmpg.startAtHomePage();
    }

    @When("^I click on the header \"([^\"]*)\"$")
    public void iClickOnTheHeaderLink(String headerLink) {
        hdrpg.clickOnHeaderLink(headerLink);
    }

    @Then("^I should be on the \"([^\"]*)\"$")
    public void iShouldBeOnTheExpectedPage(String expectedUrl) {
        Assert.assertEquals(hmpg.getPageUrl(), util.returnExpectedUrlFromString(expectedUrl));
    }

    @After
    public void closeBrowser() {
        hmpg.teardown();
    }

}
