Feature: Test CounterParty feature

Background: Login to Optimus
Given Login to Optimus with Valid Credentials


  @OptimusCounter
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and create CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the CounterParty link
    And Enter Mandatory fields of New Counter Party
    And Enter Optional Fields of New Counter Party
    And Click Create Counter Party Button

    Examples:
      | TestCaseID                      | SheetName          |
      | QA_TestCase_Auto_Optimus_2_1_1 | CreateCounterParty |