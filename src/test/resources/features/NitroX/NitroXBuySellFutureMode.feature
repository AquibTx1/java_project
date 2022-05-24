Feature: Test buys sell features using Future Mode

  Background: Login to application
    Given Login to NitroX app with valid login credentials


  @NitroXBuySellFuture
  Scenario Outline: NitroXHome-034_Create an Open Order When Price is Less Than Market Price
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Choose Position Mode,Leverage and Margin Type
    And Create A buy Order less than Market Price for Future Mode
     And Click Buy Order and Validate
    Then Validate order is in Open State for Future Mode
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_034 | 2      |
