Feature: Test buys sell features

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXBuySell
  Scenario Outline: NitroXHome-004-006_Verify mode field entry using dropdown option
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose mode value using dropdown
    Then Verify mode value
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_004 |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_006 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-005-007_Verify mode field entry using send keys
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose mode value using input text
    Then Verify mode value
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_005 |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_007 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-008_Verify previous mode value is retained in case of invalid entry
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose mode value using input text
    And Verify mode value
    And Input random mode
    Then Verify mode value
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_008 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-009_Able to Select Trading Account Using Dropdown Option
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Select the Trading Account
    Then Validate Selected Trading Account
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_009 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-010_Able to Fill Trading Account
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Enter the Trading Account
    Then Validate Selected Trading Account
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_010 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-011_Able to Enter the Base and Quote Currency
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose mode value using dropdown
    And Select the Trading Account
    And Enter The Base and Quote Currency
    Then Validate the Base and Quote Currency
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_011 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-012_Not Able to Create an Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose mode value using dropdown
    And Select the Trading Account
    And Enter The Base and Quote Currency
    And Input the Price and Quantity
    And Create A buy Order
    Then Validate User do not allowed to buy
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_012 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-013_Create an Open Order When Price is Less Than Market Price
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    Given Create "<Number>" Sell Order With Selling Price > Bid Price
    And Create A buy Order less than Market Price
    And Click Buy Button and Verify the Success Message
    Then Validate Order Moves to Open Orders
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_013 | 1      |

  @NitroXBuySell
  Scenario Outline: NitroXHome-014_Cancel An Open-Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose mode value using dropdown
    And Select the Trading Account
    And Enter The Base and Quote Currency
    And Cancel First Open Buy Order
    Then Verify Cancel Order Success Message
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_014 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-015_Create A Dealt Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    Given Create "<Number>" Sell Order With Selling Price > Bid Price
    And Create Buy Order Equal to Ask Price
    And Click Buy Button and Verify the Success Message
    Then Validate Order Moves to Dealt Orders
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_015 | 1      |

  @NitroXBuySell
  Scenario Outline: NitroXHome-015_01_Create A Dealt Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    Given Create "<Number>" Sell Order With Selling Price > Bid Price
    And Create Buy Order Greater Than Ask Price
    And Click Buy Button and Verify the Success Message
    Then Validate Order Moves to Dealt Orders
    Examples:
      | SheetName     | TestCaseID                     | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_015_01 | 1      |

  @NitroXBuySell
  Scenario Outline: NitroXHome-017_Create Sell Order When Selling Price Greater Than Market Price
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Create Sell Order With Selling Price > Bid Price
    And Click Sell Button and Verify the Success Message
    Then Validate Order Moves to Open Orders
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_017 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-018_Cancel An Open-Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose mode value using dropdown
    And Select the Trading Account
    And Enter The Base and Quote Currency
    And Create Sell Order With Selling Price > Bid Price
    And Click Sell Button and Verify the Success Message
    And Cancel First Open Sell Order
    Then Verify Cancel Order Success Message
    Then Verify First Order Removed From Orders List
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_018 |

  @NitroXBuySell
  Scenario Outline: NitroXHome-019_Sell Order is placed in Dealt when Price filled is equal to the market price.
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Create Sell Order With Selling Price Equal to Bid Price
    And Click Sell Button and Verify the Success Message
    Then Validate Order Moves to Dealt Orders
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_019 |