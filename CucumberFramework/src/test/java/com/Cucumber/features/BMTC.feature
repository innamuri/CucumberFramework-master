@BMTC_CT
Feature: BMTC Regression Test Cases

@MainPage
Scenario: Main BMTC application Page
Given My WebApp 'BMTC' is open
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I enter 'bed' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '10' seconds
#Then I should see text 'Search results for "Chair" (175 matches.)' present on page at 'Search_text'
Then I should see text '"bed"' present on page at 'Searched_text'
#Then I get text from 'Search_text' and print

@TC1
Scenario: Validation of Other Content tab is displayed
Given My WebApp 'BMTC' is open
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I enter 'bed' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '10' seconds
Then I should see text '"bed"' present on page at 'Searched_text'
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see text 'Other Content' present on page

@TC2
Scenario: Validation of number of count is displayed  with Other content texts.
Given My WebApp 'BMTC' is open
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I enter 'bed' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '10' seconds
#Then I should see text 'Search results for "Chair" (175 matches.)' present on page at 'Search_text'
Then I should see text '"bed"' present on page at 'Searched_text'
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see text 'Other Content' present on page
#Then I should see text 'Other Content' present on page at 'OtherContent_Button'
#Then I should see text 'Other Content (4)' present on page at 'OtherContent_text'
Then I get text from 'OtherContent_text' and print
Then I get count from 'Products' and print
Then I get count from 'Products' and print

@TC3
Scenario: Validation of number of count is correctly displayed.
Given My WebApp 'BMTC' is open
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I enter 'bed' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '10' seconds
#Then I should see text 'Search results for "Chair" (175 matches.)' present on page at 'Search_text'
Then I should see text '"bed"' present on page at 'Searched_text'
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see text 'Other Content' present on page
Then I get text from 'OtherContent_text' and print
Then I get count from 'Products' and print

@TC4
Scenario: Validation of Display drop down will be displayed.
Given My WebApp 'BMTC' is open
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I enter 'bed' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '10' seconds
Then I should see text '"bed"' present on page at 'Searched_text'
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see element 'Display_Dropdown' present on page

@TC5
Scenario: Validation of Display option is showing properly.
Given My WebApp 'BMTC' is open
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I enter 'bed' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '10' seconds
Then I should see text '"bed"' present on page at 'Searched_text'
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see element 'Display_Dropdown' present on page

And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$UltimateParent_print' with '$$D-U-N-S_Number'


@CompanySearch_DunsFile 
Scenario: Validations for Company Search Page
And I wait for '10' seconds
And I click 'CompanySearch_Button'
And I wait for '5' seconds
#And I click 'CompanyName_CompanySearch'
#And I wait for '5' seconds
#And I enter 'Microsoft' in field 'CompanyName_CompanySearch'
And I wait for '3' seconds
And I scroll to 'element' - 'UploadFile_Button'
#Then I should see element 'UploadFile_Button' present on page_
And I enter 'D:/New folder/5 DUNS.txt' in field 'UploadFile_Button'

#And I click 'UploadFile_Button'
#And I upload file to 'C:\Users\user\Desktop\5 DUNS.txt'
#And I enter 'C:\Users\user\Desktop\5 DUNS.txt' in field 'UploadFile_Button'
