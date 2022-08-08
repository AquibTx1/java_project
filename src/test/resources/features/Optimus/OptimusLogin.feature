Feature: Test Login Feature

  @OptimusLogin
  Scenario Outline: "<TestCaseID>" Verify Login feature with valid credentials
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    When Navigate to the "Optimus" app url
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully

    Examples:
      | TestCaseID                   | SheetName    |
      | QA_TestCase_Auto_Optimus_1_1 | OptimusLogin |

  @OptimusLogin
  Scenario Outline: "<TestCaseID>" Verify login feature with invalid credentials
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    When Navigate to the "Optimus" app url
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify Optimus validation message is displayed
    Examples:
      | SheetName    | TestCaseID                   |
      | OptimusLogin | QA_TestCase_Auto_Optimus_1_2 |
      | OptimusLogin | QA_TestCase_Auto_Optimus_1_3 |