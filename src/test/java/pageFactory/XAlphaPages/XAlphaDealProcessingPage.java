package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaDealProcessingPage {

    //deal processing
    public static By dealProcessingTab = By.xpath("//span[text()='Deal Processing']");
    public static By XAlphaDealslabel = By.xpath("//span[text()='X-Alpha Deals']");
    public static By inputSearchBox = By.xpath("//input[@class='ant-input']");
    public static By searchIcon = By.xpath("//span[@class='ant-input-group-addon']");
    public static By selectAllCheckBox = By.xpath("//span[text()='Select All']/../span[@class='ant-checkbox']");
    public static By approveBtnFirst = By.xpath("(//button[@type='button']/span[text()='Approve'])[1]");
    public static By approveBtns = By.xpath("//button[@type='button']/span[text()='Approve']");
    public static By confirmMsg = By.xpath("//div[text()='Are you sure approve this task ?']");
    public static By confirmMsgV2 = By.xpath("//div[starts-with(text(), 'Are you sure approve')]");
    public static By yesbtn = By.xpath("//button[@type='button']/span[text()='Yes']");
    public static By notifText = By.xpath("//div[@class='ant-notification-notice-message']");
    public static By notifTextDescription = By.xpath("//div[@class='ant-notification-notice-description']");
    public static By notifTextDescriptionApproved = By.xpath("//div[@class='ant-notification-notice-description' and text()='Task has been approved.']");
}
