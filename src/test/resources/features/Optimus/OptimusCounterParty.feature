Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit existing CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Click Create CounterParty link
    And Enter Mandatory fields of New Counter Party
    And Enter Optional Fields of New Counter Party
    And Click Create Counter Party Button
    Then Verify Success Message on Create and Update Page
    #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Approve the CounterParty Task
    Then Verify Success Message on Create and Update Page
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

  @OptimusCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and create CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for Existing CounterParty Results in List
    And Click on Edit Link in Search Results to Load CounterParty Details
    And Take the CP Reference
    And Update Mandatory fields values of existing Counter Party
    And Update Optional Fields values of existing Counter Party
    And Click Update Counter Party Button
    Then Verify Success Message on Create and Update Page
    #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Search for CounterParty with Reference
    And Approve the CounterParty Update Task
    Then Verify Success Message on Create and Update Page
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


  @OptimusCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for Existing CounterParty Results in List
    And Click on Edit Link in Search Results to Load CounterParty Details
    And Take the CP Reference
    And Click Delete Counter Party Button and Confirm
    Then Verify Success Message on Create and Update Page
    #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Search for CounterParty with Reference
    And Approve the CounterParty Update Task
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for CounterParty Results in List by Ref
    Then verify CounterParty is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_1_3 | CreateCounterParty | MO_CheckerAccount |

  @OptimusCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Existing CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for Existing CounterParty Results in List
    Then Verify Counter Party in the search list

    Examples:
      | TestCaseID                     | SheetName          |
      | QA_TestCase_Auto_Optimus_2_1_4 | CreateCounterParty |

  @OptimusCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search CounterParty and Verify Download CSV is enabled
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open CounterParties side tab
    And Open CounterParty List tab
    And Search for Existing CounterParty Results in List
    Then Verify Download CSV button is clickable in the search list

    Examples:
      | TestCaseID                     | SheetName          |
      | QA_TestCase_Auto_Optimus_2_1_5 | CreateCounterParty |

  @OptimusRelatedCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Related CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Create New Related Party page
    And Enter field values for new Related Party
    And Enter Date And Dropdown Fields For New Related Party
    And Click Create button to Create New Related Party
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Approve the Related Counter Party Task
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Related Party List tab
    And Search for Related Party Results in List
    Then verify Related Party is updated

    Examples:
      | TestCaseID                     | SheetName           | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_2_1 | RelatedCounterParty | MO_CheckerAccount |

  @OptimusRelatedCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Related CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Related Party List tab
    And Search for Existing Related Party Results in List
    And Click on Edit Link in Search Results to Load Related Party details
    And Take the Related Party Reference
    And Enter field values for new Related Party
    And Enter Update Date And Dropdown Fields For New Related Party
    And Click Create button to Create New Related Party
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Approve the Updated Related Counter Party Task with Reference
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Related Party List tab
    And Search Results for Related Party Reference in List
    Then verify Updated Related Party is Approved


    Examples:
      | TestCaseID                     | SheetName           | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_2_2 | RelatedCounterParty | MO_CheckerAccount |

  @OptimusRelatedCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Related CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Related Party List tab
    And Search for Existing Related Party Results in List
    And Click on Edit Link in Search Results to Load Related Party details
    And Take the Related Party Reference
    And Click Delete Related Counter Party Button and Confirm
    Then Verify Success Message on Create and Update Page
    #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Approve the Updated Related Counter Party Task with Reference
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Related Party List tab
    And Search Results for Related Party Reference in List
    Then verify CounterParty is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                     | SheetName           | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_2_3 | RelatedCounterParty | MO_CheckerAccount |

  @OptimusRelatedCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Existing Related CounterParty
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Related Party List tab
    And Search for Existing Related Party Results in List
    And Verify Search Results of Existing Related Party

    Examples:
      | TestCaseID                     | SheetName           |
      | QA_TestCase_Auto_Optimus_2_2_4 | RelatedCounterParty |

  @OptimusRelatedCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Verify Download CSV is enabled in Related Party
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Related Party side tab
    And Open Related Party List tab
    And Search for Existing Related Party Results in List
    Then Verify Download CSV button is clickable in the search list

    Examples:
      | TestCaseID                     | SheetName           |
      | QA_TestCase_Auto_Optimus_2_2_5 | RelatedCounterParty |

  @OptimusServicesCounterParty
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Services in CounterParty Optimus
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Services side tab in Counterparty
    And Open Create New Services counterparty page
    And Enter field values for new Service in Counter Party
    And Enter Date And Dropdown Fields For New Service in Counter Party
    And Click Create button to Create New Service CounterParty
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open CounterParty main tab
    And Open CounterParty Tasks sub tab
    And Approve the Services Task in Counter Party
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open CounterParty main tab
    And Open Services side tab in Counterparty
    And Open Services CP List tab
    And Search for New Service in Result List
    Then verify Services exists in List

    Examples:
      | TestCaseID                     | SheetName           | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_3_1 | ServicesCounterParty |MO_CheckerAccount |