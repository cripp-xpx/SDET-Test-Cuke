package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static Base.BaseDriver.getBaseDriver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(getPageDriver(), this);
    }

    protected WebDriver getPageDriver() {
        return getBaseDriver();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public String getPageUrl() {
        return getPageDriver().getCurrentUrl();
    }
}
