package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.XAlphaActions.XAlphaDealInputActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

public class XAlphaDealInputSteps {

    static Class thisClass = XAlphaDealInputSteps.class;

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public static String quoteAssetAmount, referencePrice, feeAmount, unitPrice;

    public XAlphaDealInputSteps() {
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
                XAlphaDealInputActions.clickXAlphaHeader();
                XAlphaDealInputActions.waitForDealInputTab();
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
                XAlphaDealInputActions.clickDealInputTab();
                XAlphaDealInputActions.waitFordealInput_navbar();
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
                XAlphaDealInputActions.clickFXSpotTab();
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
                XAlphaDealInputActions.dealInput_direction(dataMap);
                XAlphaDealInputActions.dealInput_BaseAssetAmount(dataMap);
                XAlphaDealInputActions.dealInput_BaseAsset(dataMap);
                XAlphaDealInputActions.dealInput_QuoteAsset(dataMap);
                referencePrice = XAlphaDealInputActions.get_dealInput_ReferencePrice(); //to be used later
                XAlphaDealInputActions.dealInput_UnitPrice(referencePrice);
                XAlphaDealInputActions.dealInput_FeeAsset(dataMap);
                XAlphaDealInputActions.dealInput_FeeAmount(dataMap);
                XAlphaDealInputActions.dealInput_CounterpartyName(dataMap);
                XAlphaDealInputActions.dealInput_PortfolioNumber(dataMap);
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus"));

                quoteAssetAmount = XAlphaDealInputActions.get_dealInput_QuoteAssetAmount(); //to be used later
                unitPrice = XAlphaDealInputActions.get_dealInput_UnitPrice(); //to be used later
                feeAmount = XAlphaDealInputActions.get_dealInput_FeeAmount(); //to be used later
                referencePrice = XAlphaDealInputActions.get_dealInput_ReferencePrice(); //to be used later
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
                XAlphaDealInputActions.dealInput_CreateBtn();
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
                XAlphaDealInputActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealInputActions.dealInput_SubmitMessage(), "Deal has created");
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
                XAlphaDealInputActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealInputActions.dealInput_SubmitMessage(), "processing status should be 'pending' or 'confirmed'");
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
                XAlphaDealInputActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealInputActions.dealInput_SubmitMessage(), "FX Spot deal is settled, but base is not settled");
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
