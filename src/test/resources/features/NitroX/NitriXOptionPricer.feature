
Feature: Test Option Pricer features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXOptionPrice
  Scenario Outline: <TestCaseID>_Calculate Option Pricer for <Type>
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Option Pricer
    And Input Type ,Symbol and Spot Ref.
    And Input Strike,Notional and Spread Bid and Offer
    And Input Manual Vol,Expiry date and hour
    And Click calculate Option Price
    Then Verify the External and Internal Result
    And Select Book Deals
    Given Read "XAlpha" and "<SheetName2>" and "<TestCaseID>" from test data
    And Input Exchange ,Expiry Price
    And Input Deal Ref ,CounterParty and Portfolio Number
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify Option deal is created with correct details
    And Switch to XAlpha again
    And Input Exchange ,Expiry Price
    And Input Deal Ref ,CounterParty and Portfolio Number
    And Input Unit price
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify Option deal is created with correct details

    Examples:
      | SheetName  |  TestCaseID                    |SheetName2        | Type|
     | OptionPricer  | QA_TestCase_Auto_NitroX_148 |XAlphaOptionPricer| CALL_RR
      | OptionPricer  | QA_TestCase_Auto_NitroX_150 |XAlphaOptionPricer|CALL_SPREAD|
      | OptionPricer  | QA_TestCase_Auto_NitroX_152 |XAlphaOptionPricer|PUT_RR     |
#      | OptionPricer  | QA_TestCase_Auto_NitroX_154 |XAlphaOptionPricer|
#      | OptionPricer  | QA_TestCase_Auto_NitroX_156 |XAlphaOptionPricer|
#      | OptionPricer  | QA_TestCase_Auto_NitroX_158 |XAlphaOptionPricer|