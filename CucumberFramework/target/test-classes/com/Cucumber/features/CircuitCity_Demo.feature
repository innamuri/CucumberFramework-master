@CircuitCity_Demo
Feature: Circuit City Web - Sanity Check on the Circuit City Web

@Sanity @loginWithInvalidCredentials
Scenario: Verify the login functionality on the WinSupply Web by entering the invalid user credentials
Given My WebApp 'Circuit_City' is open
And I click 'SignIn_Btn'
Then I login to CircuitCity as 'invalid_user'
And I wait for '2' seconds
Then I should see text 'Either the logon ID or the password entered is incorrect. Enter the information again.' present on page at 'InvalidCredentials_Header'

@Sanity @loginWithValidCredentials
Scenario: Verify the login functionality on the WinSupply Web by entering the valid user credentials
Given I login to CircuitCity as 'valid_user'
And I wait for '5' seconds
Then I should see element 'Home' present on page
And I should see element 'Logout' present on page
And I click 'MyAccount'

@Sanity @NavigateToLinks
Scenario: Verify the links
Given I click 'ProductsMenu'
Then I click 'CamerasLink'
And I should see text 'CAMERAS ' present on page at 'CamerasTitle'
And I click 'Home'

@Sanity @Search
Scenario: Verify the Search
Given I click 'Search'
When I enter 'Zerowater' in field 'Search'
And I click 'SearchButton'
Then I should see text 'ZeroWater 10 Cup Pitcher' present on page at 'SearchBreadcrumb'

@Sanity @ProductAddtoCart
Scenario: Verify the Product is added to cart successfully from detail page
Given I click 'AddToCart_Btn'
And I wait for '5' seconds
#Then I click 'CloseBtn'
Then I should see text 'Your item was added' present on page at 'CartMsg'
And I click 'ViewCart'
And I wait for '2' seconds
And I click 'DeleteProduct'
And I wait for '5' seconds

@Sanity @MyAccount
Scenario: Verify the My Account Links
Given I click 'MyAccount'
And I click 'OrderHistory'
Then I should see text 'Order History' present on page at 'OrderHistoryTitle'
And I click 'Home'

@Sanity @Logout
Scenario: Verify the Logout Happening Successfully
Given I click 'MyAccount'
Then I click 'Logout'
And I should see text 'SIGN IN' present on page at 'SignIn_Btn'
