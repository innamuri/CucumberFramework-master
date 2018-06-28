@SampleMVCAppTest
Feature: Test The Sample MVC application

@Validate_HomePageLoad @ValidateResultPage
Scenario: Validate text on page 
Given My WebApp 'SampleMVC' is open
Then I should see element 'Count' present on page_

@ValidateResultPage
Scenario: Verify Word count function
Given I enter 'TestWord!' in field 'EnterWord'
And I click 'Count'
Then I should see text 'The word TestWord! has 9 characters. ' present on page at 'Result'
Then I click link 'back'
Then I should see element 'Count' present on page_