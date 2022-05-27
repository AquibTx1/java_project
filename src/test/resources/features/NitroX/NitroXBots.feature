Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials


  @NitroXBot
  Scenario Outline: <TestCaseID>_Start Execution_Bot for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency for execution_bot
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the detail bot
    Then Verify new Bot in detail and config
    Then Verify the Buy Order in Dealt Order

    Examples:
       | SheetName  |  TestCaseID                  |
       | NitroXBots  | QA_TestCase_Auto_NitroX_024 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Start Execution_Bot for Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Verify total Bots Before starting Sell execution
    And Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Sell Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the detail bot
    Then Verify new Bot in detail and config
    Then Verify the Sell Order in Dealt Order

    Examples:
      | SheetName   |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_025 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Verify total Bots before starting the Sniper Bot execution
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And Enter Quantity and submit the order
    Then Verify Bots in Total Filtered on HomePage
    And Click Total Filtered Bots and check the Bot in Detail and Config
    Then Verify new Bot in detail and config for Snipper Bot
     Then Verify the Order in Dealt Order for Sniper Bot

    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_026 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Verify total Bots before starting the Sniper Bot execution
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Sell Order ,Side and Min,Max Price and MaxSlippageThreashold
    And Enter Quantity and submit the order
    Then Verify Bots in Total Filtered on HomePage
    And Click Total Filtered Bots and check the Bot in Detail and Config
    Then Verify new Bot in detail and config for Snipper Bot
    Then Verify the Order in Dealt Order for Sniper Bot Sell Order
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_027 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Start New Twap_BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Verify total Bots before starting the Twap_Bot execution
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Duration
    And Provide Deal Ref and submit
    Then Verify Bots in Total Filtered on HomePage
    And Click Total Filtered Bots tab & check the Bot in Detail and Config for Twap Bot
    Then Verify new Bot in detail and config for Twap_Bot

    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_028 |
      | NitroXBots  | QA_TestCase_Auto_NitroX_029 |

#  @NitroXBot
#  Scenario Outline: NitroXHome-030_Start New Pair_Trading BOT For Buy Order
#    Given Read test data "<SheetName1>" and "<TestCaseID1>" from Excel file
#    When Choose Mode, Trading Account, Base and Quote Currency
#    And Read test data "<SheetName2>" and "<TestCaseID2>" from Excel file
#    And Verify total Bots before starting the Pair_Trading Bot execution
#    And Click start Bot and select the Service,Method and Choose Bot Quantity
#    And Choose Side,Quantity,and Slice_Size
#    And Choose AccountId,Base,Quote and Side in Pair leg and submit
##    And Verify Pair_Trading Bot in Total Filtered on homePage
##    Then Verify Pair_Trading new Bot in Detail and Config
##    Then Verify the Order in Dealt Order for same Bot
#
#    Examples:
#      | SheetName1  | TestCaseID1                  | SheetName2  |  TestCaseID2               |
#      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_030 |

#    @NitroXBot
#  Scenario Outline: NitroXHome-031_Start New Pair_Trading BOT For Sell Order
#    Given Read test data "<SheetName1>" and "<TestCaseID1>" from Excel file
#    When Choose Mode, Trading Account, Base and Quote Currency
#    And Read test data "<SheetName2>" and "<TestCaseID2>" from Excel file
#    And Verify total Bots before starting the Pair_Trading Bot execution
#    And Click start Bot and select the Service,Method and Choose Bot Quantity
#    And Choose Side,Quantity,and Slice_Size
#    And Choose AccountId,Base,Quote and Side in Pair leg and submit
#    And Verify Pair_Trading Bot in Total Filtered on homePage
#    Then Verify Pair_Trading new Bot in Detail and Config
#    Then Verify the Order in Dealt Order for same Bot
#
#    Examples:
#      | SheetName1  | TestCaseID1                  | SheetName2  |  TestCaseID2               |
#      | NitroXBuySell | QA_TestCase_Auto_NitroX_012| NitroXBots  | QA_TestCase_Auto_NitroX_031 |
