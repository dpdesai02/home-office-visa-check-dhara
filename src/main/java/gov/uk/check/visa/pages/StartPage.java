package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customelisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {
@FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    public void clickStartNow(){
        Reporter.log("click StartNow " + startNowButton.toString());
        CustomListeners.test.log(Status.PASS, "click StartNow " + startNowButton);
        clickOnElement(startNowButton);
    }
}
