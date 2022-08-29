Feature: Test Settlement feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Login and Create New Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Tokens link
    And Open New Token
    And Enter All the field detail
    And Click Create Instrument
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open the Instrument Tab
    And Click Tasks link
    And Navigate to Instrument Task
    And Input the Asset
    And Approve the Asset created
    And Logout from MO Account
      #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open the Instrument Tab
    And Verify the Token Created

    Examples:
      | TestCaseID                     | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_1_1 | Instrument | MO_CheckerAccount|