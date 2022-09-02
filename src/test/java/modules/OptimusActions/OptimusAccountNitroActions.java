package modules.OptimusActions;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import pageFactory.OptimusPages.Account.OptimusAccountCreatePage;
import pageFactory.OptimusPages.Account.OptimusAccountMainPage;
import pageFactory.OptimusPages.Account.OptimusNitroAccountPage;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import step_definitions.RunCukesTest;
import utilities.HTMLReportUtil;
import utilities.LogUtil;

import static utilities.KeywordUtil.*;

public class OptimusAccountNitroActions {
    static Class<OptimusAccountActions> thisClass = OptimusAccountActions.class;

    public static void clickCreateNewNitro_btn() {
        click(OptimusNitroAccountPage.nitroAccount_CreateNew_ListBtn, "Click Create New Nitro Account button");
        waitForPresent(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }

    public static void nitroAccount_AccountName(String item) throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_AccountName);
        clearInputUsingKeys(OptimusNitroAccountPage.nitroAccount_AccountName);
        inputText(OptimusNitroAccountPage.nitroAccount_AccountName, item, "Account Name value entered");
    }

    public static void nitroAccount_Exchange(String item) throws InterruptedException {
        waitForClickable(OptimusNitroAccountPage.nitroAccount_Exchange);
        clearInputUsingKeys(OptimusNitroAccountPage.nitroAccount_Exchange);
        inputText(OptimusNitroAccountPage.nitroAccount_Exchange, item, "Select nitroAccount_Exchange  = " + item);
//        pressEnter(OptimusNitroAccountPage.nitroAccount_Exchange);
        waitForPresent(By.xpath(String.format(OptimusNitroAccountPage.nitroAccount_Exchange_Options, item)));
        click(By.xpath(String.format(OptimusNitroAccountPage.nitroAccount_Exchange_Options, item)), "Choose nitroAccount_Exchange dropdown options");
    }

    public static String nitroAccount_GetExchangeValue_FromDetails(String item) throws InterruptedException {
        waitForClickable(OptimusNitroAccountPage.nitroAccount_Exchange);
        return getElementValueWithVisibility(OptimusNitroAccountPage.nitroAccount_Exchange);
    }


    public static void nitroAccount_APIAccess(String item) throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_APIAccess);
        clearInputUsingKeys(OptimusNitroAccountPage.nitroAccount_APIAccess);
        inputText(OptimusNitroAccountPage.nitroAccount_APIAccess, item, "nitroAccount APIAccess value entered");
    }

    public static void nitroAccount_APISecret(String item) throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_APISecret);
        clearInputUsingKeys(OptimusNitroAccountPage.nitroAccount_APISecret);
        inputText(OptimusNitroAccountPage.nitroAccount_APISecret, item, "nitroAccount APISecret value entered");
    }

    public static void nitroAccount_AccountType(String item) throws InterruptedException {
        waitForClickable(OptimusNitroAccountPage.nitroAccount_AccountType);
        clearInputUsingKeys(OptimusNitroAccountPage.nitroAccount_AccountType);
        inputText(OptimusNitroAccountPage.nitroAccount_AccountType, item, "Select nitroAccount_AccountType  = " + item);
        waitForPresent(By.xpath(String.format(OptimusNitroAccountPage.nitroAccount_AccountType_Options, item)));
        click(By.xpath(String.format(OptimusNitroAccountPage.nitroAccount_AccountType_Options, item)), "Choose nitroAccount_Exchange dropdown options");
    }

    public static void nitroAccount_ClickCreate_FormBtn() {
        click(OptimusNitroAccountPage.nitroAccount_Create_FormBtn, "Click Create New Nitro Account button");
        waitForInVisibile(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }

    public static String getAccountIDFromNotif() {
        String msg = getElementText(XAlphaDealInputPage.dealInput_validationMsg);
        String[] splittedMsg = msg.split(" ");
        LogUtil.infoLog(thisClass, "Account id in notification message=" + splittedMsg[3]);
        RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Account id in notification message=" + splittedMsg[3]));
        return splittedMsg[3];
    }

}
