Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusCounterParty @debug
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit existing CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Click Create CounterParty link
    And Enter Mandatory fields of New Counter Party
    And Enter Optional Fields of New Counter Party
    And Click Create Counter Party Button
    Then Verify Counter Party Success Message
    #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Approve the CounterParty Task
    Then Verify Counter Party Success Message
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for CounterParty Results in List
    Then verify CounterParty is updated


    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_1_1 | CreateCounterParty | MO_CheckerAccount |

  @OptimusCounterParty @debug
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and create CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for Existing CounterParty Results in List
    And Click on Edit Link in Search Results to Load CounterParty Details
    And Update Mandatory fields values of existing Counter Party
    And Update Optional Fields values of existing Counter Party
    And Click Update Counter Party Button
    Then Verify Counter Party Success Message
    #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Approve the CounterParty Update Task
    Then Verify Counter Party Success Message
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for CounterParty Results in List by Ref
    Then verify CounterParty is updated


    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_1_2 | CreateCounterParty | MO_CheckerAccount |


  @OptimusCounterParty @debug
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and create CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for Existing CounterParty Results in List
    And Click on Edit Link in Search Results to Load CounterParty Details
#    And Click Delete Counter Party Button and Confirm
#    Then Verify Counter Party Success Message

    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_1_2 | CreateCounterParty | MO_CheckerAccount |
