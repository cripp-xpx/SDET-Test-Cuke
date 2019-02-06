package Pages;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    UtilPage util = new UtilPage();

    @FindBy(id = "gform_submit_button_2")
    private WebElement submitButton;

    @FindBy(css = "#gform_2 > div.validation_error")
    private WebElement formSubmissionError;

    @FindBy(css = ".gfield_label_before_complex")
    private WebElement nameBoxLabel;

    private String colorDarkRed = "rgba(121, 0, 0, 1)";

    public void startAtContactUsPage() {
        getPageDriver().get(util.returnExpectedUrlFromString("contactUsPage"));
    }

    public void clickOnSubmitButton() {
        clickOnElement(submitButton);
    }

    public boolean confirmPresenceOfError() {
        return formSubmissionError.isDisplayed();
    }

    public String getColorOfTheNameBoxLabel() {
        return nameBoxLabel.getCssValue("color");
    }

//    public String getColorOfElementText(WebElement element) {
//        return element.getCssValue("color");
//    }

    public String returnExpectedErrorColorRbgValue() {
        return colorDarkRed;
    }
}
