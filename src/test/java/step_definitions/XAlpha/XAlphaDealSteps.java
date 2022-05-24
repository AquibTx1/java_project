package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.XAlphaActions.XAlphaDealActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

public class XAlphaDealSteps {

    static Class thisClass = XAlphaDealSteps.class;

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public static String quoteAssetAmount, referencePrice, feeAmount, unitPrice;

    public XAlphaDealSteps() {
        //constructor of the class to load datamap from BaseStepDefinitions
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("Move to X-Alpha page")
    public void movetoXAlphaPage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.clickXAlphaHeader();
                XAlphaDealActions.waitForDealInputTab();
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

    @And("Navigate to deal input tab")
    public void navigateToDealInputForm() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.clickDealInputTab();
                XAlphaDealActions.waitFordealInput_navbar();
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

    @And("Choose FX Spot")
    public void chooseFXSpot() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.clickFXSpotTab();
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

    @And("Provide deal input details")
    public void provideDealInputDetails() throws InterruptedException {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.dealInput_direction(dataMap);
                XAlphaDealActions.dealInput_BaseAssetAmount(dataMap);
                XAlphaDealActions.dealInput_BaseAsset(dataMap);
                XAlphaDealActions.dealInput_QuoteAsset(dataMap);
                referencePrice = XAlphaDealActions.get_dealInput_ReferencePrice(); //to be used later
                XAlphaDealActions.dealInput_UnitPrice(referencePrice);
                XAlphaDealActions.dealInput_FeeAsset(dataMap);
                XAlphaDealActions.dealInput_FeeAmount(dataMap);
                XAlphaDealActions.dealInput_CounterpartyName(dataMap);
                XAlphaDealActions.dealInput_PortfolioNumber(dataMap);
                XAlphaDealActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus"));

                quoteAssetAmount = XAlphaDealActions.get_dealInput_QuoteAssetAmount(); //to be used later
                unitPrice = XAlphaDealActions.get_dealInput_UnitPrice(); //to be used later
                feeAmount = XAlphaDealActions.get_dealInput_FeeAmount(); //to be used later
                referencePrice = XAlphaDealActions.get_dealInput_ReferencePrice(); //to be used later
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

    @And("Click create deal button")
    public void clickCreateDealButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.dealInput_CreateBtn();
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

    @Then("Verify the deal success message")
    public void verifyTheDealSuccessMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealActions.dealInput_SubmitMessage(), "Deal has created");
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

    @Then("Verify deal is not created")
    public void verifyDealIsNotCreated() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealActions.dealInput_SubmitMessage(), "processing status should be 'pending' or 'confirmed'");
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

    @Then("Verify settled deal is not created")
    public void verifySettledDealIsNotCreated() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealActions.dealInput_SubmitMessage(), "FX Spot deal is settled, but base is not settled");
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
