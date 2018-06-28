@OfficeNational
Feature: Sanity Check on the Office National Android app

@P1 
Scenario Outline: Verify the login functionality on the Office National app by entering the user credentials in following examples table
 Given My NativeApp 'OfficeNational' is open
 When I enter '<USERNAME>' in field 'Username'
 And I enter '<PASSWORD>' in field 'Password'
 And I click 'Log_in'
 Then I should see text 'Office National' present on page at 'PageHeader'
 And I click 'NavigationDrawer'
 And I click 'LogOutBtn'
 Then I should see text 'Welcome' present on page at 'PageHeader'

		Examples:
				|USERNAME |PASSWORD|
				|testmba03|password|
				|testmba04|user456 |

@P1
Scenario: Search a Product by SKU and add it to cart and then verify its added successfully
Given My NativeApp 'OfficeNational' is open
When I enter 'testmba03' in field 'Username'
And I enter 'password' in field 'Password'
And I click 'Log_in'
Then I should see text 'Office National' present on page at 'PageHeader'
When I enter 'Cartridge bci3ebk' in field 'searchField'
And I Tap key at x '1000' & y '1820' coordinates on android keyboard
And I click 'AddToCartBtn'
Then I should see text 'Enter Quantity' present on page at 'QuantityPopUpHeader'
And I click 'QuantityPopUpOkBtn'
And I click 'CartBtn'
And I should see element 'ProductAddedInCart' present on page
And I should see text '$23.55' present on page at 'cartTxnTotal'
 
@P1 
Scenario: Remove the Product from cart and verify it was successfully removed
Given My NativeApp 'OfficeNational' is open
When I enter 'testmba03' in field 'Username'
And I enter 'password' in field 'Password'
And I click 'Log_in'
Then I should see text 'Office National' present on page at 'PageHeader'
And I click 'CartBtn'
And I click 'removeItem'
Then I should see text '$0.00' present on page at 'cartTxnTotal'