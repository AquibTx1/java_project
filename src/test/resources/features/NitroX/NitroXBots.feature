Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials


  @NitroXBot
  Scenario Outline: NitroXHome-024_Verify Bot and start New Buy Execution Bot
    Given Read test data "<SheetName1>" and "<TestCaseID1>" from Excel file
    When Choose Mode, Trading Account, Base and Quote Currency
    And Read test data "<SheetName2>" and "<TestCaseID2>" from Excel file
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the detail bot
    Then Verify new Bot in detail and config

    Examples:
      | SheetName1  | TestCaseID1                  | SheetName2  |  TestCaseID2               |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_024 |

  @NitroXBot
  Scenario Outline: NitroXHome-025_Verify Bot and Start new Sell Execution Bot
    Given Read test data "<SheetName1>" and "<TestCaseID1>" from Excel file
    When Choose Mode, Trading Account, Base and Quote Currency
    And Read test data "<SheetName2>" and "<TestCaseID2>" from Excel file
    And Verify total Bots Before starting Sell execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Sell Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the detail bot
    Then Verify new Bot in detail and config
    Examples:
      | SheetName1  | TestCaseID1                  | SheetName2  |  TestCaseID2               |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_025|

