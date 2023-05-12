package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customelisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {

    @FindBy(xpath = "(//h2)[3]")
    WebElement resultMessage;

    public String getResultMessage() {
        Reporter.log("getResultMessage " + resultMessage.toString());
        CustomListeners.test.log(Status.PASS, "get ResultMessage " + resultMessage);
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage) {
        Reporter.log("confirm ResultMessage " );
        CustomListeners.test.log(Status.PASS, "confirm ResultMessage " );
        Assert.assertTrue(getResultMessage().equals(expectedMessage));
    }
}
