Feature: Test buys sell features using Future Mode

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXBuySellFuture
  Scenario Outline: <TestCaseID>_Create an Open Order When Price is Less Than Market Price
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Choose Position Mode,Leverage and Margin Type
    And Create A buy Order less than Market Price for Future Mode
    And Click Buy Order and Validate
    Then Validate order is in Open State for Future Mode
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_034 | 2      |

  @NitroXBuySellFuture
  Scenario Outline: <TestCaseID>_Cancel An Open-Buy Order-Future Mode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Go to Open Order & Cancel First Open Buy Order
    Then Verify Cancel Order Success Message
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_035 |

  @NitroXBuySellFuture
  Scenario Outline: <TestCaseID>_Create A Dealt Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Validate No previous position
    And Choose Position Mode,Leverage and Margin Type
    And Create Buy Order Equal to Ask Price for Future Mode
    And Click Buy Order and Validate
    Then Verify Order Submitted Success Message-Future Mode
    Then Validate Order Moves to Dealt Orders-Future Mode
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_036 | 2      |

  @NitroXBuySellFuture
  Scenario Outline: <TestCaseID>_Create A Dealt Order Greater than Ask Price -Future Mode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Validate No previous position
    And Choose Position Mode,Leverage and Margin Type
    And Create Buy Order Greater than Ask Price for Future Mode
    And Click Buy Order and Validate
    Then Verify Order Submitted Success Message-Future Mode
    Then Validate Order Moves to Dealt Orders-Future Mode
    Examples:
      | SheetName     | TestCaseID                     | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_036_01| 1    |

  @NitroXBuySellFuture
  Scenario Outline: <TestCaseID>_Create A Deal Order Price -Future Mode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Choose Position Mode,Leverage and Margin Type
    And Create Buy Order Equal to Ask Price for Future Mode
    And Validate previous position for buy order
    Then Validate Order Moves to Dealt Orders-Future Mode
    Examples:
      | SheetName     | TestCaseID                    | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_037   | 1      |
