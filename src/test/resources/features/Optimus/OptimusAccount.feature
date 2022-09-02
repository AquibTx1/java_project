Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials

  @OptimusAccount
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
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Existing Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Search for existing Account in List
    And Click on Edit Link in Search Results to Load Account details
    And Take Account ID for Reference
    And Enter Mandatory And Text Fields in Accounts
    And Enter Dropdown Fields to Update Account
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
    And Search for Account ID in tasks to approve
    And Approve searched tasks
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for Updated Account in List
    Then Verify Account ID in search results
    Then Verify Search Results of added or updated Accounts

    Examples:
      | TestCaseID                     | SheetName | loginCredentials  |
      | QA_TestCase_Auto_Optimus_6_1_2 | Accounts  | MO_CheckerAccount |


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Existing Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Search for existing Account in List
    And Click on Edit Link in Search Results to Load Account details
    And Take Account ID for Reference
    And Take Account Name for reference
    And Click Delete Optimus Button and Confirm
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open Account main tab
    And Open CounterParty Tasks sub tab
    And Search for Account ID in tasks to approve
    And Approve searched tasks
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for Updated Account in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                     | SheetName | loginCredentials  |
      | QA_TestCase_Auto_Optimus_6_1_3 | Accounts  | MO_CheckerAccount |

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

  @OptimusAccount
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


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create New Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Open Create New Nitro Accounts Page
    And Enter details in Nitro Account
    And Click Create button to create Account
    And Take Nitro Account ID from Success Message
    Then Verify Success Message on Create and Update Page

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_1 | NitroAccount |
