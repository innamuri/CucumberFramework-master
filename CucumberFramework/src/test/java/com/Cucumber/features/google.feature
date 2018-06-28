@google 
Feature: Google search test script! 

@Sanity
Scenario Outline: Do google search for given keywords and verify correct search resutl is returned.
	Given My WebApp 'google' is open 
	When I enter '<SearchKeyword>' in field 'googleSearch' 
	And I click 'searchBtn' 
	Then I should see element '<searchResult>' present on page
	
	Examples: 
		|SearchKeyword  |	searchResult 	|
		|cucumber	   	|CucumberResultImage|
		|Calabash		|	CalabashResult	|
		
