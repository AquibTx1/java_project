package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.XAlphaActions.XAlphaDealActions;
import modules.XAlphaActions.XAlphaDealProcessingActions;
import modules.XAlphaActions.XAlphaLoginActions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

public class XAlphaDealProcessingSteps {
    @Then("Navigate to deal processing tab")
    public void navigateToDealProcessingTab() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealProcessingActions.clickDealProcessingTab();
                XAlphaDealProcessingActions.waitForXAlphaDealslabel();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Search for the deal to approve")
    public void searchForTheDealToApprove() throws InterruptedException {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //get the deal ref from XAlphaDealEnquirySteps.dealRefId static variable
                XAlphaDealProcessingActions.searchDealwrtDealRef(XAlphaDealEnquirySteps.dealRefId);
                XAlphaDealProcessingActions.clickSearchIcon();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Approve the deal")
    public void approveTheDeal() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealProcessingActions.clickSelectAllChkbox();
                XAlphaDealProcessingActions.clickFirstApproveBtn();
                XAlphaDealProcessingActions.waitForConfirmMsgV2();
                XAlphaDealProcessingActions.clickYesBtn();
                XAlphaDealProcessingActions.waitForApprovedNotif();
                //wait for all notifications to disappear for smooth logout
                XAlphaDealProcessingActions.waitForNotificationsToDisappear();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
}
