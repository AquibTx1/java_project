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
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    Then Verify the Invoice Tab is Empty

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_101 | Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice for FX-Spot Deal
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
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    And Click Invoice Tab
    Then Validate TransferInstruction is same
    And Edit and generate Invoice
   And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status
    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_102| Buy       | Confirmed |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_103| Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"Able to Complete Flow of Invoice for FX-Spot Deal With Add Instruction
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
    And Add the comments
    And click Review Again
    And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Confirmation status
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    And Click Invoice Tab and Add instruction
    And Click the Added Instruction
    And Add the comments
    And click Review Again
    And Edit and generate Invoice
    And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_104| Buy       | Confirmed |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_105| Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice and Confirmation for FX-Spot Deal and Cancel the Deal
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
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
#    And Expand the Current Deal Type
#    And Click Invoice Tab
#    Then Validate TransferInstruction is same
#    And Edit and generate Invoice
#    And And Select Prepare Email and send
#    And Choose Sender name and send mail
#    Then Verify the Invoice status
#    And Navigate to deal enquiry tab
#    And Open first deal in the row
#    And Again Change processing status
#    And Click update deal button
#    And Again click the Trade Documents Tab
#    And Expand the Current Deal Type
    Then Verify the Confirmation and Invoice Status

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_106| Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice and Confirmation for FX-Spot Deal and Cancel the Deal
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
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
#    And Expand the Current Deal Type
#    And Click Invoice Tab
#    Then Validate TransferInstruction is same
#    And Edit and generate Invoice
#    And And Select Prepare Email and send
#    And Choose Sender name and send mail
#    Then Verify the Invoice status
#    And Navigate to deal enquiry tab
#    And Open first deal in the row
#    And Again Change processing status
#    And Click update deal button
#    And Again click the Trade Documents Tab
#    And Expand the Current Deal Type
    Then Verify the Confirmation and Invoice Status

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_107| Buy       | Confirmed |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_108| Buy       | Confirmed |



