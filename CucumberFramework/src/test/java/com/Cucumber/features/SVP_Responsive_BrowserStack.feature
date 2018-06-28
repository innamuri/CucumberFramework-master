@SVP_Responsive_BS
Feature: Sanity Check on the SVP_Embroderies_Responsive_BS

@Sanity @SVP_Home
Scenario: Navigate to SVP web app and verify successful login
Given My WebApp 'SVP_Embroderies_Responsive_BS' is open
And I wait '15' seconds for presence of element 'SignIn'

@Sanity @SVP_Register
Scenario: Navigate to Register Page
Given I click 'SignIn'
And I wait for '7' seconds
And I click 'SignIn'
And I wait for '7' seconds
And I click 'SignIn'
And I wait for '7' seconds
And I click 'SignIn'
And I wait '10' seconds for presence of element 'Username'
And I click 'RegisterBtn'

@Sanity @SVP_Login
Scenario: Navigate to Login Page and Verify Successful Login
Given I click 'SignIn'
Then I wait '10' seconds for presence of element 'Username'
Then I click 'Username'
And I clear field 'Username'
And I enter 'test@live.com' in field 'Username'
And I wait for '3' seconds
Then I click 'Password'
And I clear field 'Password'
And I enter 'passw0rd' in field 'Password'
And I wait for '7' seconds
And I click 'LogInBtn'
And I wait for '7' seconds
And I wait '10' seconds for presence of element 'My_Account_btn'
Then I should see element 'My_Account_btn' present on page

@Sanity @SVP_ClearCart
Scenario: Navigate to Cart and clear it
Given I verify and clear cart
And I wait '10' seconds for presence of element 'Menu_btn'

@Sanity @SVP_AddProductThroughCat
Scenario: Navigate to Category Page and Subcategory Pages and Add a Product
Given I click 'Menu_btn'
And I wait for '5' seconds
Then I click 'Animals_cat'
And I wait for '5' seconds
And I click 'List_View'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,500'
And I click 'Dropdown1'
And I click 'ART'
#And I select option 'ART' in dropdown 'Product1_Dropdown' by 'value'
And I wait for '5' seconds
And I click 'AddtoCartProd1'
And I wait for '5' seconds
And I click 'CartClose'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Product2'
And I wait for '7' seconds
And I scroll to 'coordinates' - '0,500'
And I wait for '2' seconds
And I click 'Dropdown2'
And I click 'DST'
#And I select option 'DST' in dropdown 'Product2_Dropdown' by 'value'
And I wait for '5' seconds
And I click 'AddtoCart'
And I wait for '5' seconds
And I click 'CartClose'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'SearchIcn'

@Sanity @SVP_AddProductThroughSearch
Scenario: Search Coffe Maker Add a Product
Given I click 'SearchBtn'
Then I enter 'Toys' in field 'Search'
And I click 'SearchIcn'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Product3'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Dropdown3'
And I click 'EXP'
#And I select option 'EXP' in dropdown 'Product3_Dropdown' by 'Text'
And I click 'AddtoCart'
And I wait for '5' seconds
And I click 'CartClose'
And I wait for '5' seconds

@Sanity @SVP_Guest_Checkout @Ignore
Scenario: Verify Order and Perform Successful Order with Guest User
Given I click 'CartIcn' 
And I click 'CartBtn'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Ready_Checkout_btn'
And I click 'GuestUser'
Then I enter 'Test' in field 'FirstName'
And I enter 'Test' in field 'LastName'
And I enter 'Test' in field 'Address'
And I enter 'Test' in field 'State'
And I enter 'Test' in field 'City'
And I enter '12345' in field 'Zipcode'
And I enter 'patel_taha@hotmail.com' in field 'Email'
And I enter '123456789' in field 'Phone'
Then I click 'UseThisAddress_btn'
And I wait for '10' seconds
Then I should see element 'CreditCard' present on page
And I wait '10' seconds for presence of element 'CreditCard'
And I click 'CreditCard'
And I enter '411111111111' in field 'CreditCard'
And I enter '123' in field 'Cvv'
And I select option '10' in dropdown 'Month' by 'value'
And I select option '2022' in dropdown 'Year' by 'Text'
And I click 'Continue'
And I wait for '5' seconds
And I click 'PlaceOrder_btn'
And I wait for '5' seconds

@Sanity @SVP_Checkout
Scenario: Verify Order and Perform Successful Order
Given I click 'CartIcn'
And I click 'CartBtn'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'CheckoutBtn'
And I wait for '5' seconds
And I select option 'MasterCard Credit Card' in dropdown 'Payment_Dropdown' by 'Text'
And I wait for '5' seconds
And I enter '5555555555554444' in field 'CrdtCard'
And I enter '123' in field 'Cvc'
And I select option '10' in dropdown 'Month_Dropdown' by 'Text'
And I select option '2022' in dropdown 'Year_Dropdown' by 'Text'
And I wait for '5' seconds
And I click 'NextBtn'
And I wait for '5' seconds
And I click 'OrderBtn'
And I wait for '8' seconds

@Sanity @SVP_Signout
Scenario: Verify Succesful Logged Out
Given I click 'My_Account_btn'
And I wait for '5' seconds
And I click 'Signout_btn'
And I wait for '5' seconds
Then I click 'Home_logo'