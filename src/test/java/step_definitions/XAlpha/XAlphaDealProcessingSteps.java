package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.XAlphaActions.XAlphaDealActions;
import modules.XAlphaActions.XAlphaDealProcessingActions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class XAlphaDealProcessingSteps {
    @Then("Navigate to deal processing tab")
    public void navigateToDealProcessingTab() {
        XAlphaDealProcessingActions.clickDealProcessingTab();
        XAlphaDealProcessingActions.waitForXAlphaDealslabel();
    }

    @And("Search for the deal to approve")
    public void searchForTheDealToApprove() throws InterruptedException {
        //get the deal ref from XAlphaDealEnquirySteps.dealRefId static variable
        XAlphaDealProcessingActions.searchDealwrtDealRef(XAlphaDealEnquirySteps.dealRefId);
        XAlphaDealProcessingActions.clickSearchIcon();
    }

    @And("Approve the deal")
    public void approveTheDeal() {
        XAlphaDealProcessingActions.clickSelectAllChkbox();
        XAlphaDealProcessingActions.clickFirstApproveBtn();
        XAlphaDealProcessingActions.waitForConfirmMsgV2();
        XAlphaDealProcessingActions.clickYesBtn();
        XAlphaDealProcessingActions.waitForApprovedNotif();
    }

    @And("Verify deal approved success message")
    public void verifyDealApprovedSuccessMessage() {

    }
}
