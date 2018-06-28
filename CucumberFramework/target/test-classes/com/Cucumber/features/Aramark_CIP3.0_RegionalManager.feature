@Aramark_CIP3.0_RegionalMangager
Feature: Aramark CPS - CIP3.0 - Plan Listing Page - Regional Manager

@Sanity @loginToCIPasRM @now1
Scenario: Login as Regional Manager on Aramark app and verify successful login
Given My WebApp 'Aramark_CIP3' is open
And I wait for '2' seconds
And I click 'MemberLogin'
When I login to aramark as 'Regional_Manager'
Then I should see element 'LanguageMenu' present on page
Then I should see text 'Select Company & Language' present on page at 'LanguageMenuHeader'
Then I click 'LanguageMenu_Submit'
And I wait for '10' seconds
#Following step verifies if user successfully logged in by checking for an element/text in next page. 
And I click 'UserMenu'
And I wait for '2' seconds
Then I should see text 'RD RM' present on page at 'userTxtlocation'
And I should see element 'logoutLink' present on page
And I click 'CIP3.0_Tab'
 
@Sanity @gotoPlanListing @loginToCIPasRM @now1 
Scenario: Navigate to Plan Listing Page
Given I click 'Plan_Btn'
And I wait '10' seconds for presence of element 'PlanListing_Table'
And I verify screenshot to Baseline of page 'C:\\Users\\user\\Desktop\\PlanListing.png'
#Then I should see element 'CreatePlan_Btn' present on page

@Sanity @PlanStatus @now1 @loginToCIPasRM
Scenario: Verify the Plan Status filter feature - By default Only Published options should be checked/enabled 
Given I should see element 'PlanListing_Table' present on page
When I click 'PlanStatus_Tab'
Then I verify checkbox 'Published_CheckBox' is 'checked'
And I verify checkbox 'Draft_CheckBox' is 'unchecked'
And I verify checkbox 'Closed_CheckBox' is 'unchecked'
And I verify checkbox 'PendingClose_CheckBox' is 'unchecked'
Given I click 'Published_CheckBox'
And I wait for '5' seconds
Then I verify value: 'Draft' in column: '2' of all rows of table: 'PlanListing_TableBody'
And I click 'Published_CheckBox'
And I wait for '5' seconds
And I click 'Draft_CheckBox' 
And I wait for '5' seconds
Then I verify value: 'Published' in column: '2' of all rows of table: 'PlanListing_TableBody'
And I click 'Published_CheckBox'
Then I should see text 'No Records Found' present on page at 'TableSearchResult'

@Sanity @NavigatetoCreatePlanPage
Scenario: Verify the Create Plan page 
Given I click 'CreatePlan_Btn'
And I wait for '10' seconds

@Sanity @VerifyCreatePlanPageHeaders @Ignore
Scenario Outline: Verify Create incentive plan page headers
Given I should see element '<ElementsOnCreatePlanPage>' present on page
Examples:
|ElementsOnCreatePlanPage|
|CreatePlanHeader|
|Home_BreadcrumbLink|
|PlanListing_BreadcrumbLink|
|CreatePlan_BreadcrumbLink|
|CreatePlan_Step|
|PlanParameter_Step|
|ManageRate_Step|
|ManageSupplier_Step|
|Incentive_Step|
|PlanParamenterSection|

@Sanity @CreatePlanStep1 @Ignore
Scenario Outline: Verify the values in Static bar in Create Incentive Plan page
Given I should see text '<TestValue>' present on page at '<Location>'

Examples: 
|TestValue	|Location			|
|N/A		|PlanName_Label		|
|Draft		|Status_Label		|
|N/A		|StartDate_Label	|
|N/A		|LastCalcDate_Label	|