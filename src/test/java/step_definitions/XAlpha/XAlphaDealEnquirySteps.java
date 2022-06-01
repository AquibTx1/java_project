package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.XAlphaActions.XAlphaDealInputActions;
import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class XAlphaDealEnquirySteps {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public static String dealRefId;

    public XAlphaDealEnquirySteps() {
        //constructor of the class to load datamap from BaseStepDefinitions
        dataMap = BaseStepDefinitions.dataMap;
    }


    @And("Navigate to deal enquiry tab")
    public void navigateToDealEnquiryTab() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clickDealEnquiryTab();
                XAlphaDealEnquiryActions.waitFordealEnquiry_navbar();
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

    @Then("Verify the deal is created")
    public void verifyTheDealIsCreated() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.getDealRefwrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String unitPriceDealEnquiry = XAlphaDealEnquiryActions.getUnitPricewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String feeDealEnquiry = XAlphaDealEnquiryActions.getFeewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String referencePriceDealEnquiry = XAlphaDealEnquiryActions.getReferencePricewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String dealTypeDealEnquiry = XAlphaDealEnquiryActions.getDealTypewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount).toLowerCase();
                String processingStatusDealEnquiry = XAlphaDealEnquiryActions.getProcessingStatuswrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount).toLowerCase();
                String directionDealEnquiry = XAlphaDealEnquiryActions.getDirectionwrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount).toLowerCase();

                //convert deal input field values to be matched
                XAlphaDealInputSteps.unitPrice = KeywordUtil.formatDecimalToStr(XAlphaDealInputSteps.unitPrice);
                XAlphaDealInputSteps.feeAmount = KeywordUtil.formatDecimalToStr(XAlphaDealInputSteps.feeAmount);
                XAlphaDealInputSteps.referencePrice = KeywordUtil.formatDecimalToStr(XAlphaDealInputSteps.referencePrice);

                //assert the values
                Assert.assertEquals(unitPriceDealEnquiry, XAlphaDealInputSteps.unitPrice);
                Assert.assertEquals(feeDealEnquiry, XAlphaDealInputSteps.feeAmount);
                Assert.assertEquals(referencePriceDealEnquiry, XAlphaDealInputSteps.referencePrice);
                Assert.assertEquals(dealTypeDealEnquiry, dataMap.get("DealType").toLowerCase());
                Assert.assertEquals(processingStatusDealEnquiry, dataMap.get("ProcessingStatus").toLowerCase());
                Assert.assertEquals(directionDealEnquiry, dataMap.get("Direction").toLowerCase());
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

    @And("Load a deal wrt processing type and deal type")
    public void loadADealWrtProcessingTypeAndDealType() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //clear existing processing statuses from the filter and input the new one
                XAlphaDealEnquiryActions.clearProcessingStatuses();
                XAlphaDealEnquiryActions.inputProcessingStatus(dataMap.get("ProcessingStatus"));

                //clear existing deal types from the filter and input the new one
                XAlphaDealEnquiryActions.clearDealTypes();
                XAlphaDealEnquiryActions.inputDealType(dataMap.get("DealType"));

                //click load deal button
                XAlphaDealEnquiryActions.clickLoadDealBtn();

                //wait for success message to appear and disappear
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();

                //make sure the first deal have the correct processing status
                Assert.assertEquals(XAlphaDealEnquiryActions.getFirstDealProcessingStatus(), dataMap.get("ProcessingStatus"));
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

    @And("Change processing status")
    public void changeProcessingStatus() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //update processing status
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_new"));
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_new")); //intentional due to existing bug
                XAlphaDealEnquiryActions.clickUpdateDealBtn();
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

    @Then("Verify the deal updated success message")
    public void verifyTheDealUpdatedSuccessMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                Assert.assertEquals(XAlphaDealEnquiryActions.getSuccessMsgDescription(), "Deal has updated");
                XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
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

    @Then("Verify the deal forwarded to MO for approval")
    public void verifyTheDealForwardedToMOForApproval() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                Assert.assertEquals(XAlphaDealEnquiryActions.getSuccessMsgDescription(), "Deal update has to be approved by MO. A task has created.");
                XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
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

    @And("Load a deal wrt deal reference id")
    public void loadADealWrtDealReferenceId() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //verify processing status is updated
                XAlphaDealEnquiryActions.clearProcessingStatuses();
                XAlphaDealEnquiryActions.inputDealRef(dealRefId);
                XAlphaDealEnquiryActions.clickLoadDealBtn();
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
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

    @Then("Verify the processing type")
    public void verifyTheProcessingType() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(XAlphaDealEnquiryActions.getFirstDealProcessingStatus().toLowerCase(), dataMap.get("ProcessingStatus_new").toLowerCase());
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

    @And("Open first deal in the row")
    public void openFirstDealInTheRow() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //open first deal
                dealRefId = XAlphaDealEnquiryActions.getFirstDealReferenceId(); //to be used later
                XAlphaDealEnquiryActions.openFirstDeal();
                XAlphaDealEnquiryActions.waitForDealDetailsPage();
                Assert.assertEquals(XAlphaDealEnquiryActions.getDealReferenceFromDealDetails(), dealRefId);
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

    @And("Get deal input details")
    public void getDealInputDetails() throws InterruptedException {
        XAlphaDealInputActions.get_dealInput_direction();
        XAlphaDealInputActions.get_dealInput_BaseAssetAmount();
        XAlphaDealInputActions.get_dealInput_BaseAsset();
        XAlphaDealInputActions.get_dealInput_QuoteAsset();
        XAlphaDealInputActions.get_dealInput_UnitPrice();
        XAlphaDealInputActions.get_dealInput_QuoteAssetAmount();
        XAlphaDealInputActions.get_dealInput_FeeAsset();
        XAlphaDealInputActions.get_dealInput_FeeAmount();
        XAlphaDealInputActions.get_dealInput_ReferencePrice();
        XAlphaDealInputActions.get_dealInput_CounterpartyName();
        XAlphaDealInputActions.get_dealInput_PortfolioNumber();
    }

    @And("Update deal details\\(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)")
    public void updateDealDetailsDirectionBaseAssetAmountBaseAssetQuoteAssetUnitPriceQuoteAssetAmountFeeAssetFeeAmountReferencePrice() {
        
    }

    @And("Update deal details\\(CounterpartyName, PortfolioNumber)")
    public void updateDealDetailsCounterpartyNamePortfolioNumber() {
        
    }

    @And("Click update deal button")
    public void clickUpdateDealButton() {

    }

    @Then("Verify Updated deal details\\(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)")
    public void verifyUpdatedDealDetailsDirectionBaseAssetAmountBaseAssetQuoteAssetUnitPriceQuoteAssetAmountFeeAssetFeeAmountReferencePrice() {
    }

    @Then("Verify Updates deal details\\(CounterpartyName, PortfolioNumber)")
    public void verifyUpdatesDealDetailsCounterpartyNamePortfolioNumber() {
    }
}
