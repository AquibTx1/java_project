Feature: Test login feature

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @XAplhaDealInput
  Scenario Outline: QA-TestCase-Auto-X-Alpha-004_Able to Create FX-Spot Buy Deal via Deal Input Page with "Confirmed" Status
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Moveto X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    Then Verify the deal is created

    Examples:
      | SheetName   | TestCaseID                   |
      | XAlphaDeals | QA_TestCase_Auto_X-Alpha_004 |

