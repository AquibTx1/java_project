Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials
    #When Choose Mode, Trading Account, Base and Quote Currency

  @NitroXBot
  Scenario Outline: NitroXHome-024_Verify Bot and start Buy execution
    Given Read test data "<SheetName1>" and "<TestCaseID1>" from Excel file
    When Choose Mode, Trading Account, Base and Quote Currency
    And Read test data "<SheetName2>" and "<TestCaseID2>" from Excel file
    And Verify Bots Before Buying or Selling
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
   And Input the Time, Quantity and Submit the Order
    Then Verify Bot Count in Total Filtered
    Examples:
      | SheetName1  | TestCaseID1                  | SheetName2  |  TestCaseID2               |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_024 |

