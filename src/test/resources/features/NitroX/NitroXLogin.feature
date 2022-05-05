Feature: Create an account for new user

  @Amazon1
  Scenario Outline: 34518_Searching a product and add to cart for Valid Login Credentials
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Navigate to the url
    And Search for an item
    And Add the item into cart
    Then Verify item is added to cart
    And Navigate to home Page
    Examples:
      | SheetName   | TestCaseID                  |
      | NitroXLogin | QA_TestCase_Auto_NitroX_001 |


