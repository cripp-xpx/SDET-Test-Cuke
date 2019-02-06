package Steps;

import Base.BasePage;
import Pages.ContactUsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ContactUsFormSteps extends BasePage {

    ContactUsPage cntctpg = new ContactUsPage();
    
    @Given("^I am on the Contact Us Page$")
    public void startOnTheContactUsPage() {
        cntctpg.startAtContactUsPage();
    }

    @When("^I press Submit on an empty form$")
    public void iPressSubmitOnAnEmptyForm() {
        cntctpg.clickOnSubmitButton();
    }

    @Then("^An error message should be shown$")
    public void anErrorMessageShouldBeShown() {
        Assert.assertTrue(cntctpg.confirmPresenceOfError());
    }

    @Then("^The form label Name should be colored Dark Red$")
    public void theFormFieldNameShouldBeColoredDarkRed() {
        Assert.assertEquals(cntctpg.getColorOfTheNameBoxLabel(), cntctpg.returnExpectedErrorColorRbgValue());
    }
}
