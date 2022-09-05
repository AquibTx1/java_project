Feature: Test Trade Documents

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"_Not Able to Complete Flow of Invoice for FX-Spot Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide FX Spot deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify the deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status
    And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Confirmation status
#    And Navigate to deal enquiry tab
#    And Click Load Deal button
#    And Change processing status
#    And Click update deal button

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_101 | Buy       | Confirmed |