@Crossover
Feature: Sanity Check on the Crossover

@Sanity @Crossover_Home
Scenario: Navigate to Crossover web app
Given My WebApp 'Crossover' is open
And I wait '5' seconds for presence of element 'Homelogo'
Then I should see element 'Homelogo' present on page

@Sanity @Crossover_JobsLink
Scenario: Navigate Jobs Link
Given I scroll through page
And I click 'AvailableJobs_Link'
Then I switch tab
And I wait '15' seconds for presence of element 'JobTitle_Field'
Then I should see element 'JobTitle_Field' present on page

@Sanity @Crossover_Chief_Search
Scenario: Search Chief and then reset it
Given I click 'JobTitle_Field'
And I clear field 'JobTitle_Field'
And I enter 'Chief' in field 'JobTitle_Field'
And I wait for '3' seconds
Then I click 'Search_Jobs_Button'
And I wait '5' seconds for presence of element 'Searched_Text_Verify'
And I should see text 'containing keywords "Chief"' present on page at 'Searched_Text_Verify'
And I click 'Reset_button'
And I wait for '5' seconds

@Sanity @Crossover_Java_From_Dropdown
Scenario: Search Java from All Categories Dropdown and then reset it
Given I click 'All_Job_Categories_Dropdown'
Then I should see text 'Software Development' present on page
Then I should see text 'Java' present on page
Then I should see text 'iOS and Android' present on page
And I clear field 'Dropdown'
And I enter 'Java' in field 'Dropdown'
And I wait for '2' seconds
And I hit enter key on element 'Dropdown'
And I wait for '3' seconds
And I wait '5' seconds for presence of element 'Searched_Text_Verify'
And I should see text 'under "Java" category.' present on page at 'Searched_Text_Verify'
And I click 'Reset_button'
And I wait for '5' seconds

@Sanity @Crossover_Main_Page
Scenario: Navigate to main page
Given I click 'Company'
And I wait for '5' seconds

@Sanity @Crossover_Closs_Browser
Scenario: Close browser
Given I close browser
And I wait for '5' seconds
Then I quit browser