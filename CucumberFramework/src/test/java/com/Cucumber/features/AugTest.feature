@googa
Feature: Google search test script! 

@SanityTests
Scenario: Do google search for given keywords and verify correct search resutl is returned.
	Given My WebApp 'AugustaWApp' is open
	When I click 'SignInRegisterLink' 
	And I enter 'ramya@royalcyber.com' in field 'EmailIDField'
	And I enter 'royalcyber1' in field 'PasswordField' 
	And I click 'SignInBtn' 
	Then I should see element 'ValidateLoginSuccess' present on page
	And I should see text 'Ramya Raju' present on page at 'ValidateLoginSuccess'