Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Occupation Reference
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
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Occupation Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
#    And Get Name from the Reference
    And Update Detail fields of Reference Type
    And Click Update Reference Type Button
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
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Occupation Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Occupation Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
    And Get Name from the Reference Details
    And Delete Reference Type From Details
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
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_3 | OptimusReferences | MO_CheckerAccount |


    ###########################################################################

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Primary Business Activity Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
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
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_2_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Primary Business Activity Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
#    And Get Name from the Reference
    And Update Detail fields of Reference Type
    And Click Update Reference Type Button
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
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                     | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_2_2 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Primary Business Activity Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_2_4 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Primary Business Activity Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
    And Get Name from the Reference Details
    And Delete Reference Type From Details
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
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_2_3 | OptimusReferences | MO_CheckerAccount |
    #################################################################################

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Client Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Client Type" Reference Type Subtab
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
    And Open "Counterparty Client Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_3_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Client Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Client Type" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
#    And Get Name from the Reference
    And Update Detail fields of Reference Type
    And Click Update Reference Type Button
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
    And Open "Counterparty Client Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_3_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Client Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Client Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_3_4 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Client Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Client Type" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
    And Get Name from the Reference Details
    And Delete Reference Type From Details
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
    And Open "Counterparty Client Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_3_3 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Entity Type" Reference Type Subtab
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
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
#    And Get Name from the Reference
    And Update Detail fields of Reference Type
    And Click Update Reference Type Button
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
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_2 | OptimusReferences | MO_CheckerAccount |



  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
    And Get Name from the Reference Details
    And Delete Reference Type From Details
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
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_3 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Identification Type" Reference Type Subtab
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
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_1 | OptimusReferencesD | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
#    And Get Name from the Reference
    And Update Detail fields of Reference Type
    And Click Update Reference Type Button
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
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_2 | OptimusReferencesD | MO_CheckerAccount |


  @OptimusCounterPartyReference @debug
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_4 | OptimusReferencesD | MO_CheckerAccount |


  @OptimusCounterPartyReference @debug1
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Search For The "Existing" Reference Results in List
    And Click on Edit Link to Load References Details
    And Get Name from the Reference Details
    And Delete Reference Type From Details
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
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                         | SheetName          | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_3 | OptimusReferencesD | MO_CheckerAccount |
