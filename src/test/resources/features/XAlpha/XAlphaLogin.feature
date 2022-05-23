Feature: Test login feature

  @XAlphaLogin
  Scenario Outline: Verify login feature with valid credentials
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Navigate to the url
    And Input XAlpha Username and Password
    And Click XAlpha Login Button
    Then Verify User is Able to Login to XAlpha Successfully
    Examples:
      | SheetName   | TestCaseID                  |
      | XAlphaLogin | QA_TestCase_Auto_XAlpha_001 |

  @XAlphaLogin
  Scenario Outline: Verify login feature with invalid credentials
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Navigate to the url
    And Input XAlpha Username and Password
    And Click XAlpha Login Button
    Then Verify XAlpha validation message is displayed
    Examples:
      | SheetName   | TestCaseID                  |
      | XAlphaLogin | QA_TestCase_Auto_XAlpha_002 |
      | XAlphaLogin | QA_TestCase_Auto_XAlpha_003 |

