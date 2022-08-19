package modules.OptimusActions;

import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import pageFactory.OptimusPages.Settlement.SettlementUpdatePage;
import utilities.KeywordUtil;

public class OptimusSettlementUpdateActions extends KeywordUtil
{

    static Class thisClass= OptimusSettlementUpdateActions.class;


    public static void newSettlement_UpdatedExternalNickName(String settlement_nickname_external_updated) throws InterruptedException {
        click(SettlementMainPage.newSettlement_updatedNicknameExternal, "Clicked the ext");
        KeywordUtil.clearInputUsingKeys(SettlementMainPage.newSettlement_updatedNicknameExternal);
        delay(2000);
        inputText(SettlementMainPage.newSettlement_updatedNicknameExternal, settlement_nickname_external_updated, "Nickname External=" + settlement_nickname_external_updated);
    }

    public static void newSettlement_UpdatedInternalNickName(String settlement_nickname_internal_updated) throws InterruptedException {
        click(SettlementMainPage.newSettlement_updatedNicknameInternal, "Clicked the ext");
        clearInputUsingKeys(SettlementMainPage.newSettlement_updatedNicknameInternal);
        delay(2000);
        inputText(SettlementMainPage.newSettlement_updatedNicknameInternal, settlement_nickname_internal_updated, "Nickname External=" + settlement_nickname_internal_updated);
    }

    public static void updateSettlement() {
        click(SettlementMainPage.newSettlement_updatebtn, "Clicked the Edit");
    }

    public static void UpdatedBankName(String banknameupdated) throws InterruptedException {
        click(SettlementUpdatePage.updatedsettlement_BankName, "Clicked the ext");
        clearInputUsingKeys(SettlementUpdatePage.updatedsettlement_BankName);
        delay(2000);
        inputText(SettlementUpdatePage.updatedsettlement_BankName, banknameupdated, "Nickname External=" + banknameupdated);
    }


}
