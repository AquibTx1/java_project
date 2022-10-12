Feature: Test CounterParty feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


#  Create Counterparty Occupation Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Occupation Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Occupation Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Occupation Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Occupation Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Occupation" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_1_3 | OptimusReferences | MO_CheckerAccount |

#  Counterparty Primary Business Activity Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Primary Business Activity Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_2_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Primary Business Activity Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_2_2 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Primary Business Activity Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Primary Business Activity" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_2_3 | OptimusReferences | MO_CheckerAccount |

#  Counterparty Client Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Client Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_3_3 | OptimusReferences | MO_CheckerAccount |


#  Counterparty Entity Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Entity Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Entity Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_4_3 | OptimusReferences | MO_CheckerAccount |

#  Counterparty Identification Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Identification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Identification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_5_3 | OptimusReferences | MO_CheckerAccount |

    
    
#  Counterparty Country of Incorporation/Residency Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Country of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Country of Incorporation/Residency Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Country of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_6_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Country of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Country of Incorporation/Residency Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Country of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_6_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Country of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Country of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_6_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Country of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Country of Incorporation/Residency Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Country of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_6_3 | OptimusReferences | MO_CheckerAccount |


#  Counterparty STATE of Incorporation/Residency Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty State of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty State of Incorporation/Residency Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty State of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_7_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty State of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty State of Incorporation/Residency Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty State of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_7_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty State of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty State of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_7_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty State of Incorporation/Residency Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty State of Incorporation/Residency Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty State of Incorporation/Residency Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_7_3 | OptimusReferences | MO_CheckerAccount |




#  Counterparty Onboarding Mode Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Onboarding Mode Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Onboarding Mode Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Onboarding Mode Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_8_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Onboarding Mode Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Onboarding Mode Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Onboarding Mode Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_8_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Onboarding Mode Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Onboarding Mode Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"


    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_8_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Onboarding Mode Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Onboarding Mode Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Onboarding Mode Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_8_3 | OptimusReferences | MO_CheckerAccount |


    #  Counterparty Source of Funds Type Reference
  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Source of Funds Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Source of Funds Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Source of Funds Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_9_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Source of Funds Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Source of Funds Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Source of Funds Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_9_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Source of Funds Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Source of Funds Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_9_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Source of Funds Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Source of Funds Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Source of Funds Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_9_3 | OptimusReferences | MO_CheckerAccount |


    #  Counterparty Client Tier Type Reference
  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Client Tier Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Tier Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Tier Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_10_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Client Tier Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Tier Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Tier Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_10_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Client Tier Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Tier Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_10_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference 
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Client Tier Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Tier Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Client Tier Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_10_3 | OptimusReferences | MO_CheckerAccount |


       #  Counterparty Risk Scores Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Risk Scores Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Risk Scores Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Risk Scores Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_11_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Risk Scores Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Risk Scores Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Risk Scores Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_11_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Risk Scores Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Risk Scores Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_11_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Risk Scores Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Risk Scores Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Risk Scores Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_11_3 | OptimusReferences | MO_CheckerAccount |



       #  Counterparty Face2Face Vertification Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Face2Face Vertification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Face2Face Vertification Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Face2Face Vertification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_12_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Face2Face Vertification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Face2Face Vertification Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Face2Face Vertification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_12_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Face2Face Vertification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Face2Face Vertification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_12_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Face2Face Vertification Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Face2Face Vertification Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Face2Face Vertification Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_12_3 | OptimusReferences | MO_CheckerAccount |


       #  Counterparty Vouched Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Vouched Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Vouched Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Vouched Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_13_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Vouched Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Vouched Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Vouched Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_13_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Vouched Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Vouched Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_13_4 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Vouched Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Vouched Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Vouched Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_13_3 | OptimusReferences | MO_CheckerAccount |


#  Counterparty Status Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Status Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Status Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Status Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_14_1 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Status Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Status Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Status Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_14_2 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Status Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Status Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_14_4 | OptimusReferences | MO_CheckerAccount |


  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Status Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Status Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Status Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_14_3 | OptimusReferences | MO_CheckerAccount |


#  Counterparty Appointment Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Appointment Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Appointment Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Appointment Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_15_1 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Appointment Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Appointment Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Appointment Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_15_2 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Appointment Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Appointment Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_15_4 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Appointment Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Appointment Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Appointment Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_15_3 | OptimusReferences | MO_CheckerAccount |

#  Counterparty Parent Account Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Parent Account Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Parent Account Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Parent Account Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_16_1 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Parent Account Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Parent Account Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Parent Account Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_16_2 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Parent Account Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Parent Account Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_16_4 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Parent Account Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Parent Account Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Parent Account Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_16_3 | OptimusReferences | MO_CheckerAccount |


#  Counterparty Service Business Unit Type Reference
  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Counterparty Service Business Unit Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Service Business Unit Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Service Business Unit Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Created" Reference Results in List
    Then verify Reference is "Created"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_17_1 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Counterparty Service Business Unit Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Service Business Unit Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Service Business Unit Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Updated" Reference Results in List
    Then verify Reference is "Updated"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_17_2 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Counterparty Service Business Unit Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Service Business Unit Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Existing" Reference Results in List
    Then verify Reference is "Existing"

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_17_4 | OptimusReferences | MO_CheckerAccount |

  @OptimusCounterPartyReference
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Counterparty Service Business Unit Type Reference
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open CounterParty main tab
    And Open Reference side tab
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Service Business Unit Type" Reference Type Subtab
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
    And Main Reference Search for Reference Type Tab
    And Open "Counterparty Service Business Unit Type" Reference Type Subtab
    And Open Reference List tab
    And Search For The "Deleted" Reference Results in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                        | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_2_4_17_3 | OptimusReferences | MO_CheckerAccount |
