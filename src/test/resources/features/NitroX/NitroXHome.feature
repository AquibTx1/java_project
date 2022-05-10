Feature: Test buys sell features

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXHome
  Scenario Outline: NitroXHome-004-006_Verify mode field entry using dropdown option
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose mode value using dropdown
    Then Verify mode value
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_004 |
      | NitroXHome | QA_TestCase_Auto_NitroX_006 |

  @NitroXHome
  Scenario Outline: NitroXHome-005-007_Verify mode field entry using send keys
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose mode value using input text
    Then Verify mode value
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_005 |
      | NitroXHome | QA_TestCase_Auto_NitroX_007 |

  @NitroXHome
  Scenario Outline: NitroXHome-008_Verify previous mode value is retained in case of invalid entry
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose mode value using input text
    And Verify mode value
    And Input random mode
    Then Verify mode value
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_008 |

  @NitroXHome
  Scenario Outline: NitroXHome-009_Able to Select Trading Account in using Dropdown Option
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Select the Trading Account
    Then Validate Selected Trading Account
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_009 |

  @NitroXHome
  Scenario Outline: NitroXHome-010_Able to fill Trading Account
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Enter the Trading Account
    Then Validate Selected Trading Account
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_010 |

  @NitroXHome
  Scenario Outline: NitroXHome-011_Able to Enter the Base and Quote Currency
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose mode value using dropdown
    And Select the Trading Account
    And Enter The Base and Quote Currency
    Then Validate the Base and Quote Currency
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_011 |


  @NitroXHome
  Scenario Outline: NitroXHome-012_Not Able to Create an Order
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose mode value using dropdown
    And Select the Trading Account
    And Enter The Base and Quote Currency
    And Input the Price and Quantity
    And Create A buy Order
   Then Validate User do not allowed to buy
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_012 |


