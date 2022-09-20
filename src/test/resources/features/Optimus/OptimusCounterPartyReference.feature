Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Occupation  Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Create Reference Type Page
    And Enter Detail fields of Reference Type
    And Click Create Reference Type Button
    Then Verify Success Message on Create and Update Page
    #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Open Reference Tasks Sub Tab
    And Approve the Reference Task
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Reference List tab
    And Search for Reference Results in List
    Then verify Reference is Created or Updated


    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_1 | OptimusReferences | MO_CheckerAccount |












  @OptimusCounterPartyReference @debug
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Occupation  Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Reference List tab
    And Search for Reference Results in List
    Then verify Reference is Created or Updated


    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_4 | OptimusReferences | MO_CheckerAccount |