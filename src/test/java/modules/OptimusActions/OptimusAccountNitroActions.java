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
        waitForVisible(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }

    public static void clickEditNitro_Listbtn() {
        click(OptimusNitroAccountPage.nitroAccount_Edit_ListBtn, "Click Edit Existing Nitro Account button");
        waitForVisible(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }

    public static void click_NitroAccount_IPBindingBtn() {
        click(OptimusNitroAccountPage.nitroAccount_IPBindingBtn, "Click nitroAccount IPBindingBtn button");
        waitForVisible(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }
    public static void click_ConfigurationSettings_ListBtn() {
        click(OptimusNitroAccountPage.nitroAccount_ConfigurationSettings_List, "Click nitroAccount Configuration button in List");
        waitForVisible(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }
    public static void viewConfigurationSettings_modal() {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_Country_ConfigurationSettings_Modal);
        waitForVisible(OptimusNitroAccountPage.nitroAccount_Exchange_ConfigurationSettings_Modal);
        waitForVisible(OptimusNitroAccountPage.nitroAccount_Account_ConfigurationSettings_Modal);
        waitForVisible(OptimusNitroAccountPage.nitroAccount_PersistBtn_ConfigurationSettings_Modal);
    }

    public static void click_NitroAccount_Modal_Close() {
        click(OptimusNitroAccountPage.nitroAccount_Modalwindow_Close, "Click nitroAccount Modal Close button");
        waitForPresent(OptimusNitroAccountPage.nitroAccount_Edit_ListBtn);
    }
    public static void click_NitroAccount_Modal_Clear() {
        click(OptimusNitroAccountPage.nitroAccount_ModalWindow_IP_ClearBtn, "Click nitroAccount Modal CLEAR button");
        waitForInVisibile(OptimusNitroAccountPage.nitroAccount_IPBinding_List);
    }
    public static void click_NitroAccount_UnlockSwitch_List() throws InterruptedException {
        click(OptimusNitroAccountPage.nitroAccount_UnlockSwitch_List, "Click nitroAccount Unlock switch List button");

    }
    public static void click_NitroAccount_RunBroker_List() {
        waitForClickable(OptimusNitroAccountPage.nitroAccount_RunBroker_btn_List);
        click(OptimusNitroAccountPage.nitroAccount_RunBroker_btn_List, "Click nitroAccount Run Broker button");
        waitForClickable(OptimusNitroAccountPage.nitroAccount_RunBroker_btn_List);
        click(OptimusNitroAccountPage.nitroAccount_AccountName_List, "AC Name");
    }
    public static void click_NitroAccount_RunBalanceListener_List() {
        waitForClickable(OptimusNitroAccountPage.nitroAccount_RunBalanceListener_btn_List);
        click(OptimusNitroAccountPage.nitroAccount_RunBalanceListener_btn_List, "Click nitroAccount Run Balance listener button");
        waitForClickable(OptimusNitroAccountPage.nitroAccount_RunBalanceListener_btn_List);
        click(OptimusNitroAccountPage.nitroAccount_AccountName_List, "AC Name");
    }
    public static void click_NitroAccount_RunOrderListener_List() {
        waitForClickable(OptimusNitroAccountPage.nitroAccount_RunOrderListener_btn_List);
        click(OptimusNitroAccountPage.nitroAccount_RunOrderListener_btn_List, "Click nitroAccount Run Order listener button");
        waitForClickable(OptimusNitroAccountPage.nitroAccount_RunOrderListener_btn_List);
        click(OptimusNitroAccountPage.nitroAccount_AccountName_List, "AC Name");
    }
    public static void add_NitroAccount_IPBinding(String item) throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_AddExternal_IPBinging_Search);
        clearInputUsingKeys(OptimusNitroAccountPage.nitroAccount_AddExternal_IPBinging_Search);
        inputText(OptimusNitroAccountPage.nitroAccount_AddExternal_IPBinging_Search, item, "Nitro Account - IP Binding value entered for Search");
        pressEnter(OptimusNitroAccountPage.nitroAccount_AddExternal_IPBinging_Search);
    }

    public static String get_NitroAccount_IPBinding_List() throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_IPBinding_List);
        return getElementText(OptimusNitroAccountPage.nitroAccount_IPBinding_List);
    }

    public static String get_NitroAccount_AccountName_List() throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_AccountName_List);
        return getElementText(OptimusNitroAccountPage.nitroAccount_AccountName_List);
    }
    public static void nitroAccount_AccountName(String item) throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_AccountName);
        clearInputUsingKeys(OptimusNitroAccountPage.nitroAccount_AccountName);
        inputText(OptimusNitroAccountPage.nitroAccount_AccountName, item, "Account Name value entered");
    }

    public static String nitroAccount_Get_AccountName() throws InterruptedException {
        waitForVisible(OptimusNitroAccountPage.nitroAccount_AccountName);
        return getElementValueWithVisibility(OptimusNitroAccountPage.nitroAccount_AccountName);
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
        return splittedMsg[2];
    }

}
