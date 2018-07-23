@BMTC_CT
Feature: BMTC Regression Test Cases

Background: Open BMTC Application
Given My WebApp 'BMTC' is open
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I enter 'furniture' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '5' seconds
#Then I should see text 'Search results for "Chair" (175 matches.)' present on page at 'Search_text'
Then I should see text '"furniture"' present on page at 'Searched_text'

@TC1
Scenario: TC1: Validation of Other Content tab is displayed
Then I should see element 'OtherContent_Tab' present on page
And I wait for '3' seconds
And I click 'OtherContent_Tab'
Then I should see text 'Other content' present on page

@TC2
Scenario: TC2: Validation of number of count is displayed  with Other content texts.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see text 'Other content' present on page
#Then I should see text 'Other content' present on page at 'OtherContent_Button'
#Then I should see text 'Other Content (4)' present on page at 'OtherContent_text'
Then I get text from 'OtherContent_text' and print

@TC3
Scenario: TC3: Validation of number of count is correctly displayed.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see text 'Other content' present on page
Then I get text from 'OtherContent_text' and store
#Then I get text from 'OtherContent_text' and print
#Then I verify Other Content
Then I get count from 'Products' and print
Then I compare '$$OtherContent_text' with product count '$$Products'


@TC4
Scenario: TC4: Validation of Display drop down will be displayed.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see element 'Display_Dropdown' present on page

@TC5
Scenario: TC5: Validation of Display option is showing properly.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I click 'Display_Dropdown'
Then I should see element 'Dropdown_1st_option' present on page

@TC6
Scenario: TC6: Validation of functionality of Display drop down working correctly.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I click 'Display_Dropdown'
Then I should see element 'Dropdown_1st_option' present on page
Then I get text from 'Dropdown_1st_option' and store
Then I verify selected dropdown option with 'Products' and print
Then I compare '$$Dropdown_1st_option' with total products '$$Products'

@TC7
Scenario: TC7: Validation of pagination is displaying.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see element 'PaginationTop' present on page

@TC8
Scenario: TC8: Validation of selected page is underlined.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see element 'Page2_Top' present on page
And I click 'Page2_Top'
And I wait for '5' seconds
Then I should see text '2' present on page at 'PageSelected'

@TC9
Scenario: TC9: Validation of user able to see the other pages by clicking on it at the top of the result records.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see element 'Page2_Top' present on page
And I click 'Page2_Top'
And I wait for '5' seconds
Then I should see element 'TopPreviousArrow' present on page

@TC10
Scenario: TC10: Validation of user able to see the next page by clicking on forward arrow icon > at the top.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
And I wait for '3' seconds
Then I should see element 'TopNextArrow' present on page

@TC11
Scenario: TC11: Validation of user able to see the previous page by clicking on previous arrow icon < at the top.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
And I wait for '3' seconds
Then I click 'TopNextArrow'
And I wait for '5' seconds
Then I should see element 'TopPreviousArrow' present on page

@TC12
Scenario: TC12: Validation of user able to see the other pages by clicking on it at the bottom of the result records.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I should see element 'Page2_Bottom' present on page
And I click 'Page2_Bottom'
And I wait for '5' seconds
Then I should see element 'BottomPreviousArrow' present on page

@TC13
Scenario: TC13: Validation of user able to see the next page by clicking on forward arrow icon > at the bottom.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
And I wait for '3' seconds
Then I should see element 'BottomNextArrow' present on page

@TC14
Scenario: TC14: Validation of user able to see the previous page by clicking on previous arrow icon < at the bottom.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
And I wait for '3' seconds
Then I click 'BottomNextArrow'
And I wait for '3' seconds
Then I should see element 'BottomPreviousArrow' present on page

@TC15
Scenario: TC15: Validation of user able to see the blog page by clicking on blog title.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
And I wait for '3' seconds
#Then I get text from 'BlogName' and store
Then I click 'BlogName'
And I wait for '3' seconds
Then I switch tab
And I wait for '3' seconds
Then I should see element 'BlogTitlePDP' present on page
#Then I compare 'BlogTitlePDP' with stored value 'BlogName'

@TC16
Scenario: TC16: Validation of user able to see the blog page by clicking on blog image.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I click 'BlogImage'
And I wait for '3' seconds
Then I switch tab
And I wait for '3' seconds
Then I should see element 'BlogTitlePDP' present on page

@TC17
Scenario: TC17: Validation of user able to see the blog page by clicking on Read More… link.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
Then I click 'BlogReadMore'
And I wait for '3' seconds
Then I switch tab
And I wait for '3' seconds
Then I should see element 'BlogTitlePDP' present on page

@TC19
Scenario: TC19: Validation of system display no result record found when there is no data in the system for that keyword.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I clear field 'Search'
And I enter 'tsest' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '5' seconds
Then I should see text 'Sorry, your search for "tsest" did not return any results. Please try another search.' present on page at 'NoResults'

@TC20
Scenario: TC20: Validation of system display 	Did you mean… when provide an incorrect spelling of the keyword.
Then I should see element 'OtherContent_Tab' present on page
And I click 'OtherContent_Tab'
And I wait for '3' seconds
Then I should see element 'Search' present on page
And I clear field 'Search'
And I enter 'chaiir' in field 'Search'
And I wait for '3' seconds
And I click 'Search_Icon'
And I wait for '5' seconds
Then I should see text 'Sorry, your search for "chaiir" did not return any results. Please try another search.' present on page at 'NoResults'
Then I should see text 'Did you mean:  ' present on page at 'DidYouMean'
Then I should see text 'chair' present on page at 'chair'
And I click 'chair'
And I wait for '5' seconds
Then I should see element 'OtherContent_Tab' present on page

