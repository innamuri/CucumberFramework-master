@CircuitCity_Sanity
Feature: Circuit City Sanity Test Cases  

@Sanity @AddProductToCartByCategory @RunCC_1
Scenario: Open Circuit City Dev Site & Add a Single  Product to Cart
Given My WebApp 'CircuitCity_Dev' is open
Then I should see element 'Products_MainMenu' present on page
And I should see element 'Deals_MainMenu' present on page
And I should see element 'SmartRooms_MainMenu' present on page
And I should see element 'Service_MainMenu' present on page
And I should see element 'Brands_MainMenu' present on page
And I should see element 'TheCity_MainMenu' present on page
When I click 'Products_MainMenu'
Then I should see element 'Accessories' present on page
And I should see element 'ServicesTraining' present on page
And I should see element 'Computers&Tablets' present on page
And I should see element 'OfficeEquipments&Supplies' present on page
And I should see element 'PowerEquipment' present on page
And I should see element 'InformationTechnology' present on page
And I should see element 'SmartRooms' present on page
And I should see element 'ConsumerElectronics' present on page
And I should see element 'SecurityDevices' present on page
And I click 'InformationTechnology'
Then I should see text 'Information Technology ' present on page at 'CategoryHeading'
And I scroll to 'element' - 'CategoryHeading'
And I should see text 'Lenovo ThinkCentre M92p 2988A1U Desktop Computer' present on page at 'FirstProduct'
When I click 'BuyNowBtn'
And I wait for '3' seconds
Then I should see text 'This item has been successfully added:' present on page at 'SuccessAddCartMsg'
And I should see element 'ProductValidate' present on page 
And I wait for '3' seconds
Then I click 'Close_AddToCardPopUp'
And I wait for '10' seconds

@Sanity @AddProductThroughSearch 
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

@Sanity @Login
Scenario: Enter invalid credentials in the LoginPage & verify error message
Given I enter 'testuser123' in field 'LoginIdField'
And I enter 'TestPassword' in field 'PasswordField'
And I click 'SignInBtn'
Then I should see text 'Username or Password is incorrect.' present on page at 'LandingHeader'

