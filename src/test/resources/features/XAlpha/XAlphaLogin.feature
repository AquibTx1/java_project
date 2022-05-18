Feature: Test login feature

  @XAplhaLogin
  Scenario Outline: XAlphaX-001_Verify login feature with valid credentials
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Navigate to the url
    And Input XAlpha Username and Password
    And Click XAlpha Login Button
    Then Verify User is Able to Login to XAlpha Successfully
    Examples:
      | SheetName   | TestCaseID                  |
      | XAlphaLogin | QA_TestCase_Auto_XAlpha_001 |
