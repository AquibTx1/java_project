Feature: Test buys sell features

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @CreateAskPrices
  Scenario Outline: Create Ask Prices
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Create "<Number>" Sell Order With Selling Price > Bid Price
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_017 | 2      |

  @CreateBidPrices
  Scenario Outline: Create Bid Prices
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Create "<Number>" buy Order less than Market Price
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_013 | 2      |