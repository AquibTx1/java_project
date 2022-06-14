Feature: Test deals creation feature

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
      | SheetName   | TestCaseID                  |
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
      | SheetName   | TestCaseID                  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_005 |

  @XAlphaDealInput
  Scenario Outline: "<TestCaseID>"_Not Able to Create FX-Spot "<Direction>" Deal via Deal Input Page with "<Status>" Status
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide deal input details
    And Click create deal button
    Then Verify settled deal is not created

    Examples:
      | SheetName   | TestCaseID                  | Direction | Status    |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_006 | Buy       | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_007 | Buy       | Settled   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_008 | Buy       | Cancelled |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_011 | Sell      | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_013 | Sell      | Cancelled |

  @XAlphaDealInput
  Scenario Outline: "<TestCaseID>"_Able to Create FX-Spot Sell Deal via Deal Input Page with "<Status>" Status
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
      | SheetName   | TestCaseID                  | Status    |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_009 | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_010 | Pending   |

  @XAlphaDealInput
  Scenario Outline: "<TestCaseID>" Able to Create Execution Deal via Deal Input Page with "<Status>" Status
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose Execution deal tab
    And Provide execution deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify execution deal is created

    Examples:
      | SheetName     | TestCaseID                  | Status    |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_038 | Confirmed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_039 | Pending   |