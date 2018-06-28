@Aramark_CPS
Feature: Aramark CPS - Education section - Sanity check 

@Sanity @loginToCps @AddEducation @Aramark_CPS
Scenario: Login to Aramark as Admin user and verify successful login.
 Given My WebApp 'IHS_Login' is open
 Then I should not see element 'LanguageMenu' present on page
 When I enter valid CPSAdmin Credentials in 'CPS_Username' & 'CPS_Password' fields
 And I click 'LogInBtn'
 #Following step verifies if user successfully logged in by checking for an element/text in next page. 
 Then I should see text 'CPS_ENGLISH cps_admin1 (Facility_NS: 002-002)' present on page at 'userTxtlocation'
 And I should see element 'logoutLink' present on page
 When I enter 'Swathin' in field 'userTxtlocation'
 And I click 'Submit'

@AddCourse @AddEducation
Scenario: Navigate to Education tab in CPS portal and create a new course & verify successful course creation
 When I click 'EductionTab'
 Then I should see text 'Topic By Category' present on page at 'EduPageHeaderText'
 And I scroll to 'element' - 'EduPageHeaderText'
 And I click 'CreateCourseBtn'
 Then I should see text 'Create New Course' present on page at 'CreateNewCourseHeader'
 And I select option 'GESPRA' in dropdown 'SelectCompany' by 'Text'
 And I select option 'English' in dropdown 'SelectLanguage' by 'Text'
 And I select option 'Alberta' in dropdown 'SelectProvince' by 'Text'
 And I select option 'Administration' in dropdown 'SelectDepartment' by 'Text'
 And I select option 'Facilities Management' in dropdown 'SelectCategory' by 'Text'
 And I select option 'Acute Care' in dropdown 'SelectFacilityType' by 'Text'
 And I enter 'RoyalCyber - Demo Test' in field 'TitleTextField'
 And I scroll to 'bottom' - ''
 And I enter 'CucumberTestDemo-randomtext' in field 'summaryTextField'
 And I enter 'AdminNote-DemoText' in field 'AdminNotes'
 And I select option 'Recipe' in dropdown 'SelectModule' by 'Text'
 And I select option 'Published' in dropdown 'SelectStatus' by 'Text'
 And I enter 'Keyword-Test' in field 'Keyword'
 And I click 'Addpart'
 And I enter 'Swathin-TestTile-AddPartSection' in field 'AddPartTitle'
 And I click 'SavePart'
 And I pause for '5' seconds
 And I click 'SaveEducationCourse'
 #Following step Verification of successful Course creation! 
 Then I should see text 'RoyalCyber - Demo Test' present on page at 'Descriptionheader'
 
 
 
 