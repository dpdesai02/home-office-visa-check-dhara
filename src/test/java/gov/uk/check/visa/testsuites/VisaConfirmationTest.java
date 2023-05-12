package gov.uk.check.visa.testsuites;

import gov.uk.check.visa.customelisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {

        SelectNationalityPage selectNationalityPage;
        StartPage startPage;
        ReasonForTravelPage reasonForTravelPage;
        ResultPage resultPage;

        DurationOfStayPage durationOfStayPage;

        WorkTypePage workTypePage;

        @BeforeMethod(alwaysRun = true)
        public void inIt() {
            selectNationalityPage = new SelectNationalityPage();
            startPage = new StartPage();
            reasonForTravelPage = new ReasonForTravelPage();
            resultPage = new ResultPage();
            durationOfStayPage = new DurationOfStayPage();
            workTypePage= new WorkTypePage();
        }

        @Test(groups = {"smoke","sanity","regression"})
        public void anAustralianCominToUKForTourism() {
            startPage.clickStartNow();
            selectNationalityPage.selectNationality("Australia");
            selectNationalityPage.clickNextStepButton();
            reasonForTravelPage.selectReasonForVisit("Tourism");
            reasonForTravelPage.clickNextStepButton();
            resultPage.confirmResultMessage("You will not need a visa to come to the UK");

        }

        @Test(groups = "regression")
        public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
            startPage.clickStartNow();
            selectNationalityPage.selectNationality("Chile");
            selectNationalityPage.clickNextStepButton();
            reasonForTravelPage.selectReasonForVisit("Work");
            reasonForTravelPage.clickNextStepButton();
            durationOfStayPage.selectLengthOfStay("longer than 6 months");
            durationOfStayPage.clickNextStepButton();
            workTypePage.selectJobType("Health and care professional");
            workTypePage.clickNextStepButton();
            resultPage.confirmResultMessage("You need a visa to work in health and care");
        }

        @Test(groups = {"sanity","regression"})
        public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
            startPage.clickStartNow();
            selectNationalityPage.selectNationality("Colombia");
            selectNationalityPage.clickNextStepButton();
            reasonForTravelPage.selectReasonForVisit("Join partner");
            reasonForTravelPage.clickNextStepButton();
            resultPage.confirmResultMessage("You may need a visa");
        }

    }


