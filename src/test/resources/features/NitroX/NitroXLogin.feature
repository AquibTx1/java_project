Feature: Test login feature

  @NitroX
  Scenario Outline: NitroX_001_Test login feature with valid credentials
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Navigate to the url
    And Input username and password
    And Click submit button
    Then Verify user is able to login successfully
    Examples:
      | SheetName   | TestCaseID                  |
      | NitroXLogin | QA_TestCase_Auto_NitroX_001 |

  @NitroX
  Scenario Outline: NitroX_002_Test login feature with invalid credentials
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Navigate to the url
    And Input username and password
    And Click submit button
    Then Verify validation message is displayed
    Examples:
      | SheetName   | TestCaseID                  |
      | NitroXLogin | QA_TestCase_Auto_NitroX_002 |
      | NitroXLogin | QA_TestCase_Auto_NitroX_003 |