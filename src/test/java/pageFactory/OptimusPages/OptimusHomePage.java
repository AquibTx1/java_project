package pageFactory.OptimusPages;

import org.openqa.selenium.By;

public class OptimusHomePage {

    public static By portFolioPage=By.xpath("//a[text()='Portfolio']");
    public static By adminPage=By.xpath("//a[text()='Auth Admin']");
    public static By counterPartyPage=By.xpath("//a[text()='Counterparty']");
    public static By settlementPage=By.xpath("//a[text()='Settlement']");
    public static By instrumentPage=By.xpath("//a[text()='Instrument']");
    public static By accountPage=By.xpath("//a[text()='Account']");
    public static By financePage=By.xpath("//a[text()='Finance']");
    public static By historicalPage=By.xpath("//a[text()='Historical Data']");
    public static By logoutbtn = By.xpath("//span[text()='Logout']");

    public static By yesbtn = By.xpath("//button[@type='button']/span[text()='Yes']");
    public static By Approve = By.xpath("//span[text()='Approve']");

    public static By editbtn = By.xpath("(//a[text()='Edit'])[1]");

}
