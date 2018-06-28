#(Description of the TestSuite File)
Feature: Login feature tests

#(Description of the test case)
Scenario: Login with Valid credentials and verify successful login  
Given My WebApp 'Aramark_CIP3' is open
When I enter 'testuser1' in field 'username'
And I enter 'password' in field 'password'
And I click 'submit'
Then I should see element 'Logout' present on page_
And I should see text 'Pla nManager' present on page at 'Header'