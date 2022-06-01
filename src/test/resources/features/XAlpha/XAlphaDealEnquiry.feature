Feature: Test deal enquiry feature

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @XAlphaDealEnquiry
  Scenario Outline: "<TestCaseID>" Able to Edit Status "<FromStatus>" to "<ToStatus>" of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  | FromStatus | ToStatus  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_014 | Confirmed  | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_015 | Pending    | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_019 | Pending    | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_020 | Confirmed  | Pending   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_023 | Pending    | Settled   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_024 | Confirmed  | Settled   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_025 | Processed  | Settled   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_026 | Confirmed  | Cancelled |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_027 | Pending    | Cancelled |

  @XAlphaDealEnquiry
  Scenario Outline: "<TestCaseID>" Able to Edit Status "<FromStatus>" to "<ToStatus>" of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status
    Then Verify the deal forwarded to MO for approval
    #login with checker user and approve the deal processing status
    Given Read "XAlpha" and "XAlphaLogin" and "<loginCredentials>" from test data
    And Logout from XAlpha
    And Input XAlpha Username and Password
    And Click XAlpha Login Button
    And Verify User is Able to Login to XAlpha Successfully
    And Navigate to deal processing tab
    And Search for the deal to approve
    And Approve the deal
    #login again with system user and verify the deal processing status
    And Logout from XAlpha
    Given Login to XAlpha with valid login credentials
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  | loginCredentials  | FromStatus | ToStatus  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_016 | MO_CheckerAccount | Settled    | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_017 | MO_CheckerAccount | Processed  | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_018 | MO_CheckerAccount | Settled    | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_021 | MO_CheckerAccount | Processed  | Pending   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_022 | MO_CheckerAccount | Settled    | Pending   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_028 | MO_CheckerAccount | Processed  | Cancelled |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_029 | MO_CheckerAccount | Settled    | Cancelled |

