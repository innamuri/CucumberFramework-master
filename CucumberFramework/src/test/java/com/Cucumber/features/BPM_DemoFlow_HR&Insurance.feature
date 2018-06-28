@BPM_SanityFlow
Feature: Login to BPM Application and create a new instance and verify

@Login @BPM_P1
Scenario: Enter Invalid credentials in the BPM App login page and verify appropriate error message is displayed.
 Given My WebApp 'IBM_BPM' is open
 When I enter 'abcdefg' in field 'BPM_Username'
 And I enter '1234567' in field 'BPM_Password'
 And I click 'LogInBtn'
 #Verify proper error message for wrong creds is displayed in the BPM login page
 Then I should see text 'Login failure. Check the username and password and try again' present on page at 'LoginFailed'
 
@Login @BPM_P1
Scenario: Login to BPM Application and Verify successful login
 Given My WebApp 'IBM_BPM' is open
 When I enter valid BPMAdmin Credentials in 'BPM_Username' & 'BPM_Password' fields
 And I click 'LogInBtn'
 #Verify successful login to application and app lands on the Process tab 
 Then I should see text 'My Work' present on page at 'WorkTabHeader'
 
@Create_HR_Request @BPM_P1_ @Ignore
Scenario: Create a new Position requisition and verify successful creation of request.
 Given I should see text 'My Work' present on page at 'WorkTabHeader'
 When I click 'StandardHrOpen'
 And I switch to iFrame 'RequisitionFormFrame'
 Then I should see text 'Task: Submit requisition' present on page at 'SubjectAreaHeader'
 And I enter 'Full-time' in field 'EmploymentType'
 And I enter 'Business Strategies' in field 'EmploymentDepartment'
 And I click 'calendarbtn'
 And I select date in Calander grid with current date plus '3'
 And I enter 'Boston' in field 'EmploymentLocation'
 And I enter 'New' in field 'EmploymentPositionType'
 And I click 'NextBtn'
 Then I pause for '5' seconds
 And I click 'NextBtn'
 Then I should see text 'Confirm Position Details' present on page at 'sectionHeader'
 And I click 'SubmitBtn'
 Then I pause for '5' seconds
 And I switch back to default content
 Then I should see text 'My Tasks' present on page at 'MyTasksHeader'
  
@Create_Insurance_Request @BPM_P1
Scenario: Create a new Insurance request and then search for the created request verify success
 Given I should see text 'My Work' present on page at 'WorkTabHeader'
 When I click 'InsuranceLink'
 And I get text from BPM_App 'InstanceNameGet' and store in 'instanceValue'
 And I switch to iFrame 'InsuranceFormFrame'
 Then I should see text 'Insurer Details' present on page at 'sectionHeader'
 And I pause for '5' seconds
 And I enter 'Scott' in field 'Insurance_FirstName'
 And I enter 'Freeman' in field 'Insurance_LastName'
 And I click 'Insurance_DOBCal'
 And I select date in Calander grid with current date plus '2'
 And I enter '708 Sterling Avenue' in field 'Insurance_Address'
 And I click 'Insurance_Male'
 And I enter 'Tucson' in field 'Insurance_City'
 And I enter 'America' in field 'Insurance_Country'
 And I pause for '3' seconds
 And I enter 'California' in field 'Insurance_State'
 And I enter '70807' in field 'Insurance_Zip'
 And I enter '100000' in field 'Insurance_AnnualIncome'
 And I enter 'POS' in field 'Insurance_Plan'
 And I click 'Insurance_PreExistingYes'
 And I enter 'Deborah' in field 'Insurance_Vertical_FirstName'
 And I enter 'Freeman' in field 'Insurance_Vertical_LastName'
 And I enter 'Spouse' in field 'Insurance_Vertical_Relationship'
 And I click 'Insurance_Submit'
 Then I pause for '7' seconds
 And I switch back to default content
 Then I should see text 'My Tasks' present on page at 'MyTasksHeader'
 And I enter '$$instanceValue' in field 'WorkTab_Search'
 And I hit Enter key on 'WorkTab_Search'
 And I pause for '5' seconds
 And I click 'InstanceSearchResult'
 And I click 'ClaimTask'
 And I pause for '3' seconds
 And I switch to iFrame 'InsuranceFormFrame'
 Then I should see text 'Insurer Details' present on page at 'sectionHeader'

 
 