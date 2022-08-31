package modules.OptimusActions;

import pageFactory.OptimusPages.Account.OptimusAccountCreatePage;
import pageFactory.OptimusPages.Account.OptimusAccountMainPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyMainPage;
import utilities.KeywordUtil;

public class OptimusAccountActions extends KeywordUtil {

    static Class<OptimusAccountActions> thisClass = OptimusAccountActions.class;

    public static void openAccountMainTab() {
        click(OptimusAccountMainPage.account_MainTab, "Clicking Main Account Tab");
        waitForVisible(OptimusAccountMainPage.account_WelcomeText_MainTab);
    }

    public static void openAccountsSideTab() {
        click(OptimusAccountMainPage.account_SideTab, "Clicked Account Side Tab");
        waitForVisible(OptimusAccountMainPage.account_ListTab);
    }

    public static void openAccountCreateTab() {
        click(OptimusAccountMainPage.account_CreateNewTab, "Open Create Account Tab");
        waitForVisible(OptimusAccountCreatePage.account_AccountID);
    }

    public static void openAccountListTab() {
        click(OptimusAccountMainPage.account_ListTab, "Open Create Account Tab");
        waitForVisible(OptimusAccountMainPage.account_EditLink_List);
    }

    public static void editLinkinResultPresent() {
        waitForVisible(OptimusAccountMainPage.account_EditLink_List);
    }

    public static String getAccountNameFromList() {
        waitForVisible(OptimusAccountMainPage.account_AccountName_List);
        return getElementText(OptimusAccountMainPage.account_AccountName_List);
    }

    public static String getAccountLoginFromList() {
        waitForVisible(OptimusAccountMainPage.account_AccountLogin_List);
        return getElementText(OptimusAccountMainPage.account_AccountLogin_List);
    }






}
