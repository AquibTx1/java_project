Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials

  @OptimusAccount @debug
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create New Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Open Create New Accounts Page
    And Enter Mandatory And Text Fields in Accounts
    And Enter Dropdown Fields for Account
    And Click Create button to create Account
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open Account main tab
    And Open CounterParty Tasks sub tab
    And Search for Account tasks to approve
    And Approve searched tasks
    Then Verify Success Message on Create and Update Page
    And Open Account main tab
    And Open CounterParty Tasks sub tab
    And Search for Account tasks to approve
    And Approve searched tasks
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for created Account in List
    Then Verify Search Results of added or updated Accounts

    Examples:
      | TestCaseID                     | SheetName | loginCredentials  |
      | QA_TestCase_Auto_Optimus_6_1_1 | Accounts  | MO_CheckerAccount |


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Existing Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for existing Account in List
    Then Verify Search Results of Existing Accounts

    Examples:
      | TestCaseID                     | SheetName |
      | QA_TestCase_Auto_Optimus_6_1_4 | Accounts  |

  @OptimusAccount @debug
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Account and check Download button
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for existing Account in List
    Then Verify Download CSV button is clickable in the search list

    Examples:
      | TestCaseID                     | SheetName |
      | QA_TestCase_Auto_Optimus_6_1_5 | Accounts  |