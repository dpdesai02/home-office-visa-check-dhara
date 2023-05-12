package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customelisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectNationality(String nationality){
        Reporter.log("select Nationality " + nationalityDropDownList.toString());
        CustomListeners.test.log(Status.PASS, "select Nationality " + nationalityDropDownList);
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }

    public void clickNextStepButton(){
        Reporter.log("click Next StepButton " + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "click Next StepButton " + nextStepButton);
        clickOnElement(nextStepButton);
    }
}
