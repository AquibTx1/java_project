package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyReferencesPage
{
    public static By occupation_ListTab = By.id("rc-tabs-1-tab-item_0_0");
    public static By newOccupation_ListTab = By.id("rc-tabs-1-tab-item_0_1");
    public static By name_ref = By.id("create_reference_name");
    public static By description_ref = By.id("create_reference_description");
    public static By create_referencebtn = By.xpath("//span[text()='Create Reference']");
    public static By editOccupation = By.xpath("(//a[text()='Edit'])[1]");
    public static By update_referencebtn = By.xpath("//span[text()='Update Reference']");
    public static By delete_referencebtn = By.xpath("//span[text()='Delete Reference']");

}
