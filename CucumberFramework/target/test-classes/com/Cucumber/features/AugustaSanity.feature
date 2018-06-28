@Sanity @Login @p1
Feature: Test the Augusta eComm site Login functions

@Login_Pass
Scenario: Verify successful login to the Augusta Site
Given My WebApp 'CircuitCityApp' is open
When I click 'SignInRegisterLink'
And I enter 'ramya@royalcyber.com' in field 'EmailIDField'
And I enter 'royalcyber1' in field 'PasswordField'
And I click 'SignInBtn'
And I wait for '3' seconds
And I should see text 'Ramya Raju' present on page at 'ValidateLoginSuccess'

 
