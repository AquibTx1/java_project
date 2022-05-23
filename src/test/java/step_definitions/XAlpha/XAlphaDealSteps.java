package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.XAlphaActions.XAlphaDealActions;
import modules.XAlphaActions.XAlphaLoginActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.KeywordUtil;

import java.util.HashMap;

public class XAlphaDealSteps {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public static String quoteAssetAmount, referencePrice, feeAmount, unitPrice;

    public XAlphaDealSteps() {
        //constructor of the class to load datamap from BaseStepDefinitions
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("Move to X-Alpha page")
    public void movetoXAlphaPage() {
        XAlphaDealActions.clickXAlphaHeader();
        XAlphaDealActions.waitForDealInputTab();
    }

    @And("Navigate to deal input tab")
    public void navigateToDealInputForm() {
        XAlphaDealActions.clickDealInputTab();
        XAlphaDealActions.waitFordealInput_navbar();
    }

    @And("Choose FX Spot")
    public void chooseFXSpot() {
        XAlphaDealActions.clickFXSpotTab();
    }

    @And("Provide deal input details")
    public void provideDealInputDetails() throws InterruptedException {
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
        XAlphaDealActions.dealInput_ProcessingStatus(dataMap);

        quoteAssetAmount = XAlphaDealActions.get_dealInput_QuoteAssetAmount(); //to be used later
        unitPrice = XAlphaDealActions.get_dealInput_UnitPrice(); //to be used later
        feeAmount = XAlphaDealActions.get_dealInput_FeeAmount(); //to be used later
        referencePrice = XAlphaDealActions.get_dealInput_ReferencePrice(); //to be used later
    }

    @And("Click create deal button")
    public void clickCreateDealButton() {
        XAlphaDealActions.dealInput_CreateBtn();
    }

    @Then("Verify the deal success message")
    public void verifyTheDealSuccessMessage() {
        Assert.assertEquals(XAlphaDealActions.dealInput_SubmitMessage(), "Deal has created");
    }

}
