Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create New Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for existing Account in List
    Then Verify Search Results of Existing Accounts

    Examples:
      | TestCaseID                     | SheetName |
      | QA_TestCase_Auto_Optimus_6_1_4 | Accounts  |

