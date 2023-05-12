package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customelisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectLengthOfStay(String moreOrLess) {
        Reporter.log("select Length Of Stay " + moreOrLess);
        CustomListeners.test.log(Status.PASS, "select Length Of Stay " + moreOrLess);

        switch (moreOrLess) {

            case "6 months or less":
                clickOnElement(lessThanSixMonths);
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
        }

    }

    public void clickNextStepButton(){
        Reporter.log("click Next StepButton " + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "click Next StepButton " + nextStepButton);
        clickOnElement(nextStepButton);
    }

}
