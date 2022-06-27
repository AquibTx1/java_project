Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials

#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start Execution_Bot for Buy Order-Future Mode
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots Before staring the Buy execution
#    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
#    And Select Buy Order and Select the MinTime and MaxTime Break
#    And Input the Time, Quantity and Submit the Order for FutureMode
#    Then Verify Bot Count in Total Filtered
#    And Click total filtered bots and click the detail bot
#   Then Verify new Bot in detail and config for FutureMode
#    Then Verify the Order in Dealt Order for FutureMode
#    Examples:
#      | SheetName  |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_046 |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_047 |
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for FutureMode Buy Order
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots before starting the Sniper Bot execution
#    And Click Start Bot and select the Service,Method and Input Bot Quantity
#    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
#    And Enter Quantity and submit the order
#    Then Verify Bots in Total Filtered on HomePage
#    And Click Total Filtered Bots and check the Bot in Detail and Config
#    Then Verify new Bot in detail and config for Snipper Bot-FutureMode
#    Then Verify the Order in Dealt Order for Sniper Bot-FutureMode
#
#    Examples:
#      | SheetName  |  TestCaseID                |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_048 |
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for FutureMode Buy Order
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots before starting the Sniper Bot execution
#    And Click Start Bot and select the Service,Method and Input Bot Quantity
#    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
#    And Enter Quantity and submit the order
#    Then Verify Bots in Total Filtered on HomePage
#    And Click Total Filtered Bots and check the Bot in Detail and Config
#    Then Verify new Bot in detail and config for Snipper Bot-FutureMode
#    Then Verify the Order in Dealt Order for Sniper Bot Sell Order-FutureMode
#
#    Examples:
#      | SheetName   |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_049 |
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start New Twap_BOT For Buy and Sell Order-FutureMode
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots before starting the Twap_Bot execution
#    And Click start Bot and select the Service,Method and Choose Bot Quantity
#    And Choose Side,Quantity,and Duration
#    And Provide Deal Ref and submit
#    Then Verify Bots in Total Filtered on HomePage
#    And Click Total Filtered Bots tab & check the Bot in Detail and Config for Twap Bot
#    Then Verify new Bot in detail and config for Twap_Bot
#    Examples:
#      | SheetName  |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_050 |
#     | NitroXBots  | QA_TestCase_Auto_NitroX_051 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Pause Existing Running Execution_Bot for Buy Order-FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and pause the Bot
  Then Verify current running Bot is paused

  Examples:
  | SheetName   |  TestCaseID                 |
  | NitroXBots  | QA_TestCase_Auto_NitroX_073 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Resume Existing Execution_Bot for Buy Order--FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and pause the Bot
  Then Verify Bot is Paused
  And Resume the Bot again
  Then Verify Bot has started again

  Examples:
  | SheetName   |  TestCaseID                 |
  | NitroXBots  | QA_TestCase_Auto_NitroX_074 |
  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order--FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and restart the Bot
  And Click on Persist Yes
  Then Verify current running Bot is restarted
  Examples:
  | SheetName  |  TestCaseID                  |
  | NitroXBots  | QA_TestCase_Auto_NitroX_075 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order--FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and restart the Bot
  And Click Persist Status No
  Then Verify current running Bot is restarted
  Examples:
  | SheetName  |  TestCaseID                  |
  | NitroXBots  | QA_TestCase_Auto_NitroX_077 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Stop Existing Running Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click Total Filtered Bots and stop current running Bot
    Then Verify current running Bot is stopped
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_079 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_080 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for Sniper Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_082 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_084 |
  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And Input the Time, Quantity and Submit the Order
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_086 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Sniper_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Sniper Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_087 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate PairTrading BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_088 |
  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate TWAP BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Duration
    And Provide Deal Ref and submit
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Twap Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in Twap Bot
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_089 |