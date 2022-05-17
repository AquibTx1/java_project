Feature: Test buys sell features

  Background: Login to application
    Given Login to NitroX app with valid login credentials


  @CreateAskPrices
  Scenario Outline: NitroXHome-017_Create Sell Order When Selling Price Greater Than Market Price
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose Mode, Trading Account, Base and Quote Currency
    And Create "<Number>" Sell Order With Selling Price > Bid Price
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_017 | 4      |

  @CreateBidPrices
  Scenario Outline: NitroXHome-013_Create an Open Order When Price is Less Than Market Price
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose Mode, Trading Account, Base and Quote Currency
    And Create "<Number>" buy Order less than Market Price
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_013 | 2      |