Feature: Test deal enquiry feature

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @XAlphaDealEnquiry
  Scenario Outline: QA-TestCase-Auto-X-Alpha-014_Able to Edit Status to Processed of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type
    And Change processing status
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_014 |

