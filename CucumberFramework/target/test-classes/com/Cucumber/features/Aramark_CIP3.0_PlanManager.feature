@Aramark_CIP3.0_PlanManager
Feature: Aramark CPS - CIP3.0 - Plan Listing Page - Plan Manager "superqa2"

@Sanity @loginToCIPasPM @now313
Scenario: Login as Plan Manager on Aramark app and verify successful login
Given My WebApp 'Aramark_CIP3' is open
And I wait for '2' seconds
#When I login to aramark as 'plan_manager'
And I click 'MemberLogin'
And I login to aramark as 'superqa2'
And I click 'UserMenu'
And I wait for '2' seconds
Then I should see text 'super qa2' present on page at 'userTxtlocation'
And I should see element 'logoutLink' present on page
And I click 'Close_UserMenu'
 
@Sanity @VerifyCIP3.0Page @now313
Scenario: Navigate to CIP3.0 tab and verify the CIP3.0 Portlet page
Given I click 'CIP3.0_Tab'
Then I should see element 'Plan_Btn' present on page
And I should see element 'Enrollment_Btn' present on page
And I should see element 'Customers_Btn' present on page

@Sanity @VerifyPlanListingPage @now313
Scenario: Hover mouse over 'Plan' tile and verify the UI change, then click on the Plan button and verify the Plan Listing page
Given I mouse over 'Plan_Btn'
#Then I wait for '5' seconds
Then I click 'Plan_Btn'
And I wait '5' seconds for presence of element 'CreatePlan_Btn'
And I should see element 'Home_link' present on page
And I should see element 'PlanListingCrumb' present on page
And I should see element 'CreatePlan_Btn' present on page
And I should see element 'FilterBySection' present on page
And I should see element 'PlanListingHeader' present on page
And I should see element 'PlanListing_Table' present on page
And I should see element 'RowsPerGrid_TxtField' present on page
And I should see element 'RowsPerGrid_Btn' present on page
  
@Sanity 
Scenario: Click on the Home link and verify navigation to home page
Given I click 'Home_link'
Then I should see element 'HomeBanner' present on page
And I click 'CIP3.0_Tab'
  
@Sanity @gotoPlanListing @now 
Scenario: Navigate to Plan Listing Page
Given I click 'Plan_Btn'
And I wait '5' seconds for presence of element 'CreatePlan_Btn'
#And I should see element 'CreatePlan_Btn' present on page
And I verify screenshot to Baseline of page 'C:\Users\taha.patel\Desktop\PlanListing.png'
  
@Sanity @gotoCreatePlanPage @now
Scenario: Navigate to Create Plan page
Given I click 'CreatePlan_Btn'
And I wait '5' seconds for presence of element 'CreatePlanHeader'
And I wait for '5' seconds
Then I should see text 'Create Incentive Plan' present on page at 'CreatePlanHeader'
And I click 'Cancel_CreatePlan'
And I click 'Confirm_Cancel_Yes_Btn'
And I wait '5' seconds for presence of element 'CreatePlan_Btn' 
And I wait for '5' seconds
#Then I should see element 'CreatePlan_Btn' present on page
  
@Sanity @FilterBySection @now
Scenario: Verify the Functions in FilterBy section of Plan Listing Page
Given I should see text 'Plan Listing' present on page at 'PlanListingHeader'
When I click 'ExpandAll_Btn'
Then I should see element 'CollapseAll_Btn' present on page
And I should see element 'KeywordSearch_Tab' present on page
And I should see element 'KeywordSearch_TxtField' present on page
And I should see element 'PlanStatus_Tab' present on page
And I should see element 'Published_Label' present on page
And I should see element 'Draft_Label' present on page
And I should see element 'Closed_Label' present on page
And I should see element 'PendingClose_Label' present on page
And I should see element 'EnrollmentWindow_Tab' present on page
And I should see element 'Open_Label' present on page
And I should see element 'Close_Label' present on page
And I click 'KeywordSearch_Tab'
And I click 'PlanStatus_Tab'
And I click 'EnrollmentWindow_Tab'
And I verify tool tip message 'Expand All' for element 'ExpandAll_Btn'
And I wait for '5' seconds
And I click 'ExpandAll_Btn'
And I verify tool tip message 'Collapse All' for element 'CollapseAll_Btn'
Then I click 'CollapseAll_Btn'
   
@Sanity @KeywordSearch @now
Scenario: Verify the Keyword search feature - It should apply instant search & filtering - Search/filter should not be case sensitive - Matching words be highlighted in yellow - If not found then display "No matching record found"
Given I should see element 'PlanListingHeader' present on page
And I click 'KeywordSearch_Tab'
And I wait for '5' seconds
When I enter 'After build Smoke Test 002' in field 'KeywordSearch_TxtField'
And I wait for '5' seconds
Then I should see text 'After build Smoke Test 002' present on page at 'firstRow_PlanListingTable'
And I enter 'A plan for renewal' in field 'KeywordSearch_TxtField'
And I wait for '5' seconds
Then I should see text 'A plan for renewal' present on page at 'firstRow_PlanListingTable'
And I wait for '5' seconds
And I verify that field 'firstItem_PlanListingTable' should be highlighted with Colour: 'rgba(255, 255, 0, 1)'
And I enter 'ABCDAFeHEJ' in field 'KeywordSearch_TxtField'
And I wait for '5' seconds
And I should see text 'No Records Found' present on page at 'TableSearchResult'
And I clear field 'KeywordSearch_TxtField'
And I click 'KeywordSearch_Tab'

@now
Scenario: Verify the Plan Status filter feature - By default all options should be checked/enabled - 
Given I should see element 'PlanListing_Table' present on page
When I click 'PlanStatus_Tab'
Then I verify checkbox2 'Published_CheckBox' is 'checked'
And I verify checkbox2 'Draft_CheckBox' is 'checked'
And I verify checkbox2 'Closed_CheckBox' is 'checked'
And I verify checkbox2 'PendingClose_CheckBox' is 'checked'
And I wait for '5' seconds
And I click 'Published_CheckBox'
And I wait for '5' seconds
And I click 'Draft_CheckBox'
And I wait for '5' seconds
And I click 'Closed_CheckBox'
And I wait for '5' seconds
And I click 'PendingClose_CheckBox'

@Sanity @PlanStatus @now
Scenario: Verify the Plan Status filter feature - By default all options should be checked/enabled - 
Given I should see element 'PlanListing_Table' present on page
#When I click 'PlanStatus_Tab'
Then I verify checkbox2 'Published_CheckBox' is 'checked'
And I verify checkbox2 'Draft_CheckBox' is 'checked'
And I verify checkbox2 'Closed_CheckBox' is 'checked'
And I verify checkbox2 'PendingClose_CheckBox' is 'checked'
And I wait for '5' seconds
And I click 'Published_CheckBox'
And I wait for '5' seconds
Then I verify value: 'Published' in column: '2' of all rows of table: 'PlanListing_TableBody'
And I click 'Published_CheckBox'
And I wait for '5' seconds
And I click 'Draft_CheckBox' 
And I wait for '5' seconds
Then I verify value: 'Draft' in column: '2' of all rows of table: 'PlanListing_TableBody'
And I wait for '5' seconds
And I click 'Draft_CheckBox' 
And I click 'Closed_CheckBox'
Then I should see text 'No Records Found' present on page at 'TableSearchResult'
And I wait for '5' seconds
And I click 'Closed_CheckBox'

@Sanity @Enrollment @now
Scenario: Verify the Enrollment Window Filter feature
Given I should see element 'PlanListing_Table' present on page
When I click 'EnrollmentWindow_Tab'
And I verify checkbox2 'Open_CheckBox' is 'checked'
And I verify checkbox2 'Close_CheckBox' is 'checked'
Then I verify value: 'Open' in column: '3' of all rows of table: 'PlanListing_TableBody'
When I click 'Open_CheckBox'
And I wait for '5' seconds
When I click 'Close_CheckBox'
And I wait for '5' seconds
Then I verify value: 'Close' in column: '3' of all rows of table: 'PlanListing_TableBody'
Then I click 'Open_CheckBox'

@Sanity @PlanListingTable 
Scenario: Verify the Plan Listing table headers and the sorting icon
Given I should see element 'PlanListing_Table' present on page
Then I should see element 'Name_PlanListingTable' present on page
And I should see element 'Status_PlanListingTable' present on page
And I should see element 'Enrollment_PlanListingTable' present on page
And I should see element 'Description_PlanListingTable' present on page
And I should see element 'Action_PlanListingTable' present on page
And I should see element 'Name_PL_AscendSort' present on page
And I click 'Name_PlanListingTable'
And I should see element 'Name_PL_DescendSort' present on page
And I click 'Status_PlanListingTable'
Then I should see element 'Status_PL_AscendSort' present on page
And I click 'Status_PL_AscendSort'
Then I should see element 'Status_PL_DescendSort' present on page
And I click 'Enrollment_PlanListingTable'
Then I should see element 'Enrollment_PL_AscendSort' present on page
And I click 'Enrollment_PL_AscendSort'
Then I should see element 'Enrollment_PL_DescendSort' present on page
And I click 'Description_PlanListingTable'
Then I should see element 'Description_PL_AscendSort' present on page
And I click 'Description_PL_AscendSort'
Then I should see element 'Description_PL_DescendSort' present on page

@Sanity @PlanDetail
Scenario: User Clicks on the Plan Link in Plan listing table and verify the plan details page
Given I should see element 'PlanListing_Table' present on page
When I click 'KeywordSearch_Tab'
And I enter 'After build Smoke Test 002' in field 'KeywordSearch_TxtField'
And I wait for '5' seconds
And I click link 'After build Smoke Test 002'
And I wait for '15' seconds
Then I should see text 'After build Smoke Test 002' present on page at 'PlanDetail_Header'
And I click link 'Home'
And I click 'CIP3.0_Tab'
And I click 'Plan_Btn'
And I wait '5' seconds for presence of element 'PlanListing_Table'
#And I should see element 'PlanListing_Table' present on page

@Sanity @ActionColumn
Scenario: Verify Action column in Plan listing table
Given I should see element 'PL_Edit_Plan' present on page_
And I should see element 'PL_Copy_Plan' present on page_
And I should see element 'PL_Delete_Plan' present on page_
And I verify tool tip message 'Edit' for element 'PL_Edit_Plan'
And I verify tool tip message 'Copy' for element 'PL_Copy_Plan'
And I verify tool tip message 'Delete' for element 'PL_Delete_Plan'
 
@Sanity @EditPlan
Scenario: Navigate to Edit plan page and verify 
Given I click 'PL_Edit_Plan'
And I wait for '10' seconds
Then I should see element 'ModifyPlanHeader' present on page
And I click 'Cancel_CreatePlan'
And I click 'Confirm_Cancel_Yes_Btn'
And I wait for '15' seconds
Then I should see element 'CreatePlan_Btn' present on page

@Sanity @copyPlan 
Scenario: Navigate to Copy plan page and verify
Given I click 'PL_Copy_Plan'
And I wait for '10' seconds
Then I should see element 'CreatePlanHeader' present on page
And I click 'Cancel_CreatePlan'
And I click 'Confirm_Cancel_Yes_Btn'
And I wait for '15' seconds
Then I should see element 'CreatePlan_Btn' present on page 

@Sanity @DeletePlan
Scenario: Click on the Delete Plan Icon and verify the Delete PopUp
Given I click 'PL_Delete_Plan'
And I wait for '15' seconds
Then I should see element 'Delete_Confirmation_Header' present on page
And I click 'Delete_No_Btn'
And I wait for '10' seconds
Then I should see element 'PlanListing_Table' present on page

@Sanity @RowsPerGrid 
Scenario: Verify the RowsPerGrid Function and the pagination for Plan Listing table
Given I verify value '25' in field 'RowsPerGrid_TxtField'
Then I verify the Item count in field: 'PlanListing_TableBody' as '25'
When I enter '7' in field 'RowsPerGrid_TxtField'
And I click 'RowsPerGrid_Btn'
And I wait for '5' seconds
Then I verify the Item count in field: 'PlanListing_TableBody' as '7'
Then I should see element 'Pagination_Next' present on page_
#And I verify element 'Pagination_Previous' is disabled
And I click 'Pagination_Next'
Then I verify the Item count in field: 'PlanListing_TableBody' as '7'
And I click 'Pagination_Previous'
And I clear field 'RowsPerGrid_TxtField'
And I click 'RowsPerGrid_Btn'
And I wait for '5' seconds
#Then I should not see element 'Pagination_Next' present on page

@Sanity @PageFooterVerification @now
Scenario: Verify the Page Footer Section - Copy Rights text, Terms & Conditions, Privacy policy and navigate and verify 
Given I should see element 'Copyright_Text' present on page
And I click link 'Terms and Conditions'
And I wait for '8' seconds
Then I should see text 'TERMS and CONDITIONS' present on page at 'TermsandConditions_Header'
And I click link 'Home'
And I click 'CIP3.0_Tab'
And I click 'Plan_Btn'
And I wait for '10' seconds
And I should see element 'PlanListing_Table' present on page
And I click link 'Privacy Policy'
And I wait for '8' seconds
Then I should see text 'Website Privacy Statement' present on page at 'PrivacyPolicy_Header'
Then I click 'UserMenu'
And I wait for '2' seconds
Then I click 'logoutLink'
And I close browser