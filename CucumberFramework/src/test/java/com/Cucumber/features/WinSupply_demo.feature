@WinSupply_Demo
Feature: WinSupply Web - Sanity Check on the WinSupply Web

@Sanity @loginWithInvalidCredentials
Scenario: Verify the login functionality on the WinSupply Web by entering the invalid user credentials
Given My WebApp 'WinSupplyWebApp' is open
Then I try to login to WinSupply with 'invalid_user' credentials
And I wait for '2' seconds
Then I should see text 'EJPAK0004W: Login failed. Please enter a valid user ID and password.' present on page at 'InvalidCredentials_Header'

@Sanity @loginWithValidCredentials
Scenario: Verify the login functionality on the WinSupply Web by entering the valid user credentials
Given I try to login to WinSupply with 'valid_user' credentials
And I wait for '5' seconds
Then I should see element 'Home' present on page
#And I should see element 'Logout' present on page

@Sanity @NavigateToLinks
Scenario: Verify the links
Given I click 'ReadMore'
And I should see text '/News Detail' present on page at 'Breadcrumb'
Then I click 'Home'
And I should see element 'MyBookmarks' present on page
And I mouse over 'MyCompany'
And I click 'CompanyNameChange'
And I should see text '/Company Name Change' present on page at 'Breadcrumb'
And I should see text 'Company Name Change' present on page at 'PageHeader'
Then I mouse over 'MyCompany'
And I mouse over 'CompanyReports'
And I click 'CompanyClosingCheckList'
Then I should see text '/Company Reports' present on page at 'Breadcrumb'
Then I mouse over 'MyCompany'
And I mouse over 'Marketing'
And I click 'MarketingLeadGeneration'
Then I should see text '/ Marketing' present on page at 'Breadcrumb'
Then I mouse over 'Services'
And I click 'InventorySolutions'
Then I should see text '/Inventory Solutions' present on page at 'Breadcrumb'
Then I mouse over 'Support'
And I click 'WinSupport'
Then I should see text '/WinSupport' present on page at 'Breadcrumb'
Then I click 'Home'

@Sanity @Search
Scenario: Verify the Search
Given I click 'Search'
When I enter 'Support' in field 'Search'
And I click 'SearchButton'
Then I should see text 'EJPJN0001E: A problem occurred during the search. If the problem persists please contact your System Administrator.' present on page at 'SearchWarning'
And I click 'CloseSearch'
Then I click 'Home'

@Sanity @Footer
Scenario: Verify the Footer Links
Given I click 'DirectDeposit'
#Then I should see element 'Logo' present on page
#And I close browser
And I click 'MyCustomers'
Then I should see text '/Account Linkage' present on page at 'Breadcrumb'
And I click 'Home'

@Sanity @Logout
Scenario: Verify the Logout Happening Successfully
Given I click 'Logout'
Then I should see element 'WelcomeButton' present on page
And I should see element 'LoginButton' present on page
