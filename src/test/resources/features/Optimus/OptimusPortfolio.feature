Feature: Test Settlement feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusPortfolio
  Scenario Outline: "<TestCaseID>" Able to Login and Create New Portfolio
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Portfolio Tab
    And Choose New Portfolio
    And Enter the Portfolio detail
    And Enter the Portfolio Hierarchy detail
    And Enter the Portfolio Reporting Information detail
    And Enter Portfolio Settlement Information
    And Enter Portfolio Accounting Information
    Then Click Create Portfolio and verify the Settlement Forwarded for Approval

    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_4_1_1 | Portfolio | MO_CheckerAccount|