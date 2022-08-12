Feature: Test Settlement feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusSettlement
  Scenario Outline: "<TestCaseID>" Able to Login and Create Settlement
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Settlement Tab
    And Choose New Settlement
    And Enter the Settlement Ref detail
    And Enter the Basic Information detail
    And Enter the Bank Information detail
    And Enter Additional Information
    Then Click Create Settlement and verify the Settlement Forwarded for Approval
          #login with checker user and approve the deal processing status
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Click the Settlement Tab
    And Click Tasks link
    And Navigate to Settlement Task
    And Approve the Settlement
    And Click CounterParty Tab
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Click the Settlement Tab
    Then Verify the Settlement is approved
    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_3_1_1 | Settlement | MO_CheckerAccount|

  @OptimusSettlement
  Scenario Outline: "<TestCaseID>" Able to Update the Settlement detail for User
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Settlement Tab
    And Sort the Settlement Ref.
    And Click Edit Button
    And Update the user detail in the Settlement list
    Then Click Update Settlement and verify the Settlement Forwarded for Approval
          #login with checker user and approve the deal processing status
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Click the Settlement Tab
    And Click Tasks link
    And Input the values and click Search
    And Approve the Settlement
    And Click CounterParty Tab
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Click the Settlement Tab
    Then Verify the Settlement is updated
    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_3_1_2 | Settlement | MO_CheckerAccount|