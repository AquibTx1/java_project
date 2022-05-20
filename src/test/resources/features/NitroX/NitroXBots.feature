Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials


  @NitroXBot
  Scenario Outline: NitroXHome-025_Start Execution Bot for Sell Order
    Given Read test data "<SheetName1>" and "<TestCaseID1>" from Excel file
    When Choose Mode, Trading Account, Base and Quote Currency
    And Read test data "<SheetName2>" and "<TestCaseID2>" from Excel file
    And Verify total Bots Before starting Sell execution
    And Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Sell Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the detail bot
    Then Verify new Bot in detail and config
    Then Verify the Order in Dealt Order
    Examples:
      | SheetName1  | TestCaseID1                 | SheetName2   |  TestCaseID2               |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_025 |

  @NitroXBot
  Scenario Outline: NitroXHome-024_Start Execution Bot for Buy Order
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
    Then Verify the Buy Order in Dealt Order

    Examples:
      | SheetName1  | TestCaseID1                  | SheetName2  |  TestCaseID2               |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_024 |

  @NitroXBot
  Scenario Outline: NitroXHome-026_Start New SNIPER BOT for Buy Order
    Given Read test data "<SheetName1>" and "<TestCaseID1>" from Excel file
    When Choose Mode, Trading Account, Base and Quote Currency
    And Read test data "<SheetName2>" and "<TestCaseID2>" from Excel file
    And Verify total Bots Before starting the Sniper Bot Buy execution
    And Click Start Bot and Select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And Enter Quantity and Submit the Order
    Then Verify Bots in Total Filtered on homePage
    And Click total filtered bots and Check the Bot in Detail and Config
    Then Verify new Bot in detail and config for Snipper Bot
    Then Verify the Order in Dealt Order for Sniper Bot

    Examples:
      | SheetName1  | TestCaseID1                  | SheetName2  |  TestCaseID2               |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_026 |

