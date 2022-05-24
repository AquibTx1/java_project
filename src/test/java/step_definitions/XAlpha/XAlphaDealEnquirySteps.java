package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.XAlphaActions.XAlphaDealActions;
import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
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
        XAlphaDealEnquiryActions.clickDealEnquiryTab();
        XAlphaDealEnquiryActions.waitFordealEnquiry_navbar();
    }

    @Then("Verify the deal is created")
    public void verifyTheDealIsCreated() {
        XAlphaDealEnquiryActions.getDealRefwrtQuoteAssetAmt(XAlphaDealSteps.quoteAssetAmount);

        String unitPriceDealEnquiry = XAlphaDealEnquiryActions.getUnitPricewrtQuoteAssetAmt(XAlphaDealSteps.quoteAssetAmount);
        String feeDealEnquiry = XAlphaDealEnquiryActions.getFeewrtQuoteAssetAmt(XAlphaDealSteps.quoteAssetAmount);
        String referencePriceDealEnquiry = XAlphaDealEnquiryActions.getReferencePricewrtQuoteAssetAmt(XAlphaDealSteps.quoteAssetAmount);
        String dealTypeDealEnquiry = XAlphaDealEnquiryActions.getDealTypewrtQuoteAssetAmt(XAlphaDealSteps.quoteAssetAmount).toLowerCase();
        String processingStatusDealEnquiry = XAlphaDealEnquiryActions.getProcessingStatuswrtQuoteAssetAmt(XAlphaDealSteps.quoteAssetAmount).toLowerCase();
        String directionDealEnquiry = XAlphaDealEnquiryActions.getDirectionwrtQuoteAssetAmt(XAlphaDealSteps.quoteAssetAmount).toLowerCase();

        //convert deal input field values to be matched
        XAlphaDealSteps.unitPrice = KeywordUtil.formatDecimalToStr(XAlphaDealSteps.unitPrice);
        XAlphaDealSteps.feeAmount = KeywordUtil.formatDecimalToStr(XAlphaDealSteps.feeAmount);
        XAlphaDealSteps.referencePrice = KeywordUtil.formatDecimalToStr(XAlphaDealSteps.referencePrice);

        //assert the values
        Assert.assertEquals(unitPriceDealEnquiry, XAlphaDealSteps.unitPrice);
        Assert.assertEquals(feeDealEnquiry, XAlphaDealSteps.feeAmount);
        Assert.assertEquals(referencePriceDealEnquiry, XAlphaDealSteps.referencePrice);
        Assert.assertEquals(dealTypeDealEnquiry, dataMap.get("DealType").toLowerCase());
        Assert.assertEquals(processingStatusDealEnquiry, dataMap.get("ProcessingStatus").toLowerCase());
        Assert.assertEquals(directionDealEnquiry, dataMap.get("Direction").toLowerCase());
    }

    @And("Load a deal wrt processing type")
    public void loadADealWrtProcessingType() {
        //clear existing processing statuses from the filter and input the new one
        XAlphaDealEnquiryActions.clearProcessingStatuses();
        XAlphaDealEnquiryActions.inputProcessingStatus(dataMap.get("ProcessingStatus"));
        XAlphaDealEnquiryActions.clickLoadDealBtn();

        //wait for success message to appear and disappear
        XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
        XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
        dealRefId = XAlphaDealEnquiryActions.getFirstDealReferenceId(); //to be used later

        //open first deal
        XAlphaDealEnquiryActions.openFirstDeal();
        XAlphaDealEnquiryActions.waitForDealDetailsPage();
    }

    @And("Change processing status")
    public void changeProcessingStatus() {
        //update processing status
        XAlphaDealActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_new"));
        XAlphaDealEnquiryActions.clickUpdateDealBtn();
    }

    @Then("Verify the deal updated success message")
    public void verifyTheDealUpdatedSuccessMessage() {
        XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
        XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
    }

    @And("Load a deal wrt deal reference id")
    public void loadADealWrtDealReferenceId() throws InterruptedException {
        //verify processing status is updated
        XAlphaDealEnquiryActions.clearProcessingStatuses();
        XAlphaDealEnquiryActions.inputDealRef(dealRefId);
        XAlphaDealEnquiryActions.clickLoadDealBtn();
        XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
        XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
    }

    @Then("Verify the processing type")
    public void verifyTheProcessingType() {
        Assert.assertEquals(XAlphaDealEnquiryActions.getFirstDealProcessingStatus().toLowerCase(), dataMap.get("ProcessingStatus_new").toLowerCase());
    }
}
