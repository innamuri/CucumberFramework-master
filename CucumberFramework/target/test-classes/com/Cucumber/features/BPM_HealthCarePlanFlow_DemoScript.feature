@BPM_HealthCareInsuranceFlow
Feature: Login to BPM Application and create a new instance and verify

@LoginError @BPM_P1
Scenario: Enter Invalid credentials in the BPM App login page and verify appropriate error message is displayed.
 Given My WebApp 'IBM_BPM' is open
 When I enter 'abcdefg' in field 'BPM_Username'
 And I enter '1234567' in field 'BPM_Password'
 And I click 'LogInBtn'
 #Verify proper error message for wrong creds is displayed in the BPM login page
 Then I should see text 'Login failure. Check the username and password and try again' present on page at 'LoginFailed'
 
@LoginSuccess @BPM_P1
Scenario: Login to BPM Application and Verify successful login
 Given My WebApp 'IBM_BPM' is open
 When I enter valid BPMAdmin Credentials in 'BPM_Username' & 'BPM_Password' fields
 And I click 'LogInBtn'
 #Verify successful login to application and app lands on the Process tab 
 Then I should see text 'My Work' present on page at 'WorkTabHeader'
 
@Create_Insurance_Request @BPM_P1
Scenario: Create a new Insurance request and then search for the created request verify success
 Given I should see text 'My Work' present on page at 'WorkTabHeader'
 When I click 'HealthCareInsuranceLink'
 And I get text from BPM_App 'InstanceNameGet' and store in 'instanceValue'
 And I switch to iFrame 'InsuranceFormFrame'
 Then I should see text 'Health Care Management' present on page at 'HCInsurancePageHeader'
 And I should see text 'Select Health Care Request Type' present on page at 'sectionHeader'
 And I enter 'Enrollment New Plan' in field 'EnrollmentNewPlanDD'
 And I click 'NextBtn'
 And I enter 'Scott' in field 'HCIns_FirstName'
 And I enter 'Freeman' in field 'HCIns_LastName'
 And I pause for '2' seconds
 And I click 'HCIns_DOBCal'
 And I pause for '2' seconds
 And I select date '10'-'14'-'1986' in Calander grid
 And I click 'HCIns_Female'
 And I enter '100000' in field 'HCIns_AnnualIncome'
 And I enter '708 Sterling Avenue' in field 'HCIns_Address'
 And I enter 'Tucson' in field 'HCIns_City'
 And I pause for '1' seconds
 And I enter 'California' in field 'HCIns_State'
 And I enter 'America' in field 'HCIns_Country'
 And I enter '70807' in field 'HCIns_ZipCode'
 And I enter 'Vision' in field 'HCIns_Plan'
 And I click 'HCIns_PreExistingYes'
 And I click 'HCIns_HaveDependentsYes'
 And I scroll to 'element' - 'NextBtn'
 And I enter 'Deborah' in field 'HCIns_Dependent_FirstName'
 And I enter 'Freeman' in field 'HCIns_Dependent_LastName'
 And I click 'HCIns_Dependent_DOBCal'
 And I click 'HCIns_Dependent_DOBCal'
 And I select date '10'-'11'-'1976' in Calander grid2
 And I enter 'Spouse' in field 'HCIns_Dependent_Relationship'
 And I click 'NextBtn'
 Then I pause for '5' seconds
 #And I switch back to default content
 Then I should see text 'Select New Member Enrollment Plan' present on page at 'sectionHeader'
 And I click 'HCIns_EnrollBtn'
 And I click 'HCIns_SubmitBtn'
 And I click 'HCIns_CloseBtn'
 And I switch back to default content
 Then I should see text 'My Tasks' present on page at 'MyTasksHeader'
 And I click 'UserProfile'
 And I click 'logoutBtn'
 
 @Approve_Request @BPM_P1 
 Scenario: Login as reviewer and then find and approve the open HealthCare Insurance Plan request
 When I enter 'reviewer' in field 'BPM_Username'
 And I enter 'password-1' in field 'BPM_Password'
 And I click 'LogInBtn'
 Given I should see text 'My Tasks' present on page at 'MyTasksHeader'
 When I enter HCInstance '$$instanceValue' in field 'WorkTab_Search'
 And I hit Enter key on 'WorkTab_Search'
 And I pause for '5' seconds
 And I click 'searchResult_HCI'
 And I click 'ClaimTask'
 And I pause for '3' seconds
 And I switch to iFrame 'InsuranceFormFrame'
 And I click 'ApproveRequest'
 And I click 'Approve_Submit'
 And I switch back to default content
 Then I should see text 'My Tasks' present on page at 'MyTasksHeader'
 