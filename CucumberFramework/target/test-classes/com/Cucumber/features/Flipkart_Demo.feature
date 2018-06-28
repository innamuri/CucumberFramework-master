@Flipkart_Demo
Feature: Sanity flow on Flipkart Site to Demo the Automated Execution on Mobile and Desktop

Scenario: Verify that proper error message is thrown when user clicks login without entering credentials
 Given My WebApp 'HDSupply_ResponsiveSite' is open
 And I click 'SignInBtn'
 When I click 'LoginBtn'
 Then I should see text 'Invalid email id / mobile' present on page at 'ResponseMsgHeader'

Scenario: Sign in with Existing user on the Amazon Mobile responsive site
 Given I enter 'swathins@gmail.com' in field 'EmailField'
 And I enter FKPassword in field 'PasswordField'
 And I click 'LoginBtn'
 Then I should see element 'SearchForProducts' present on page
 
Scenario: Search for a product and Open it, then view the entire product page
 Given I click 'SearchForProducts' 
 And I enter 'Lenovo Laptop' in field 'SearchForProductsPage'
 And I click 'ProductSuggestion'
 When I click 'LenovoG50-80'
 Then I should see text 'Lenovo G50-80 Core i5 - (8 GB/1 TB HDD/DOS/2 GB Graphics) 80E503CMIH G50-80 Notebook' present on page at 'ProductTitle'
 And I scroll to 'coordinates' - '0,200'
 And I click 'GotIt'
 And I scroll through page

 