Feature: Test login feature

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @XAlphaDealInput
  Scenario Outline: QA-TestCase-Auto-X-Alpha-004_Able to Create FX-Spot Buy Deal via Deal Input Page with "Confirmed" Status
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    Then Verify the deal is created

    Examples:
      | SheetName   | TestCaseID                   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_004 |

  @XAlphaDealInput
  Scenario Outline: QA-TestCase-Auto-X-Alpha-005_Able to Create FX-Spot Buy Deal via Deal Input Page with "Pending" Status
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    Then Verify the deal is created

    Examples:
      | SheetName   | TestCaseID                   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_005 |

  @XAlphaDealInput
  Scenario Outline: QA-TestCase-Auto-X-Alpha-006_Not Able to Create FX-Spot Buy Deal via Deal Input Page with "Processed" Status
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide deal input details
    And Click create deal button
    Then Verify processed deal is not created

    Examples:
      | SheetName   | TestCaseID                   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_006 |

  @XAlphaDealInput
  Scenario Outline: QA-TestCase-Auto-X-Alpha-007_Not Able to Create FX-Spot Buy Deal via Deal Input Page with "Settled" Status
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide deal input details
    And Click create deal button
    Then Verify settled deal is not created

    Examples:
      | SheetName   | TestCaseID                   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_007 |