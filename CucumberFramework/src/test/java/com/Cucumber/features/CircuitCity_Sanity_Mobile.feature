@CircuitCity_Sanity_Mobile
Feature: Circuit City Sanity Test Cases  

@Sanity @AddProductToCartByCategory 
Scenario: Open Circuit City Dev Site & Add a Single  Product to Cart
Given My WebApp 'CircuitCity_Dev' is open
Given I enter 'Lenovo ThinkCentre M92p 2988A1U Desktop Computer' in field 'SearchGlobal'
When I click 'SearchBtn'
Then I should see element 'SearchMessage' present on page
And I scroll to 'element' - 'SearchMessage'
And I should see text 'Lenovo ThinkCentre M92p 2988A1U Desktop Computer' present on page at 'FirstProduct'
When I click 'BuyNowBtn'
And I wait for '3' seconds
Then I should see text 'This item has been successfully added:' present on page at 'SuccessAddCartMsg'
And I should see element 'ProductValidate' present on page 
And I wait for '3' seconds
Then I click 'Close_AddToCardPopUp'
And I wait for '10' seconds

@Sanity @AddProductThroughSearch @Ignore
Scenario: Add Second Product to Cart & Verify in cart
Given I enter '19" Class (18.5" Viewable) - Widescreen LED' in field 'SearchGlobal'
When I click 'SearchBtn'
Then I should see element 'SearchMessage' present on page
Then I should see text '19" Class (18.5" Viewable) - Widescreen LED' present on page at 'SecondProduct'
And I scroll to 'element' - 'SearchMessage'
And I click 'BuyNowBtn'
And I wait for '3' seconds
Then I should see text 'This item has been successfully added:' present on page at 'SuccessAddCartMsg'
And I should see element 'ProductValidate' present on page 
And I wait for '3' seconds
When I click 'GotoCart'
Then I should see text 'Cart: $875.00' present on page at 'CartNavSuccess'
And I scroll to 'element' - 'EstimatedDelivery'
And I click 'ReadyToCheckOut'
Then I wait for '5' seconds

@Ignore
Scenario: Enter invalid credentials in the LoginPage & verify error message
Given I enter 'testuser123' in field 'LoginIdField'
And I enter 'TestPassword' in field 'PasswordField'
And I click 'SignInBtn'
Then I should see text 'Username or Password is incorrect.' present on page at 'LandingHeader'

