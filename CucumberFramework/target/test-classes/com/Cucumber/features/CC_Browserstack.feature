@CC_Browserstack
Feature: Sanity Check on the CircuitCity_Responsive_BS

@Sanity @CC_Home 
Scenario: Navigate to CC web app and verify Home Page
Given My WebApp 'CC_Browserstack' is open
And I scroll through page
And I wait for '10' seconds
And I wait '5' seconds for presence of element 'SignIn'
Then I should see element 'SignIn' present on page

@Sanity @CC_Register @Register_Screen_UI
Scenario: Navigate to Register Page and Verify UI Screen
Given I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I scroll through page
And I wait for '5' seconds

@Sanity @CC_Login @SignIn_As_Forgot_Password_Screen_UI
Scenario: Navigate to Login Page and Verify Forgot Password Screen UI
Given I click 'SignIn'
And I click 'Forgot_Password_Btn'
And I wait for '5' seconds
Then I should see element 'Reset_Password_Field' present on page
And I should see element 'Submit_Reset_Password_Btn' present on page
And I scroll through page
And I wait for '5' seconds

@Sanity @CC_SignIn
Scenario: Navigate to Sign In Page and Verify Successful Login
Given I click 'SignIn'
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Username'
And I clear field 'Username'
And I enter 'taha.patel@royalcyber.com' in field 'Username'
And I wait for '3' seconds
Then I click 'Password'
And I clear field 'Password'
And I enter 'passw0rd' in field 'Password'
And I wait for '7' seconds
And I click 'LogInBtn'
And I wait for '7' seconds
And I wait '10' seconds for presence of element 'My_Account_btn'
Then I should see element 'My_Account_btn' present on page
And I wait for '10' seconds
And I click 'Home_logo'
And I wait for '5' seconds
And I click 'My_Account_btn'
And I wait '10' seconds for presence of element 'Signout_btn'
And I click 'Signout_btn'
And I wait '10' seconds for presence of element 'SignIn'

@Sanity @CC_AddProductThroughSearch
Scenario: Search Lenovo Add a Product
Given I enter 'Lenovo' in field 'Search'
And I wait for '5' seconds
And I click 'SearchIcn'
And I wait for '10' seconds
Then I scroll to 'coordinates' - '0,300'
And I click 'Product_image'
And I wait for '5' seconds
And I scroll through page
And I wait for '10' seconds
And I click 'AddtoCart'
And I wait for '5' seconds
And I click 'ContinueShopping_btn'
And I wait for '5' seconds

@Sanity @CC_PLP 
Scenario: Navigate to Category Page and Subcategory Page and verify PLP
Given I click 'Menu_btn'
And I wait for '5' seconds
Then I click 'Prod_cat'
And I wait for '5' seconds
#And I scroll through page
#Then I wait for '10' seconds
And I click 'Audio_Cat'
And I wait for '5' seconds
#And I scroll through page
#And I wait for '20' seconds
#And I scroll to 'coordinates' - '300,200'
#And I wait for '20' seconds

@Sanity @CC_AddProductThroughCat
Scenario: Navigate to Category Page and Subcategory Pages and Add a Product
Given I wait '10' seconds for presence of element 'Product_image'
And I wait for '2' seconds
And I click 'Product_image'
And I wait '10' seconds for presence of element 'AddtoCart'
Then I should see element 'AddtoCart' present on page
And I wait for '10' seconds
Then I scroll through page
And I wait for '10' seconds
And I click 'AddtoCart'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'ViewCart'
Then I should see element 'ViewCart' present on page

@Sanity @Cart
Scenario: Go to Cart and Check UI
Given I click 'ViewCart'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
#And I scroll through page
#And I wait for '10' seconds
#And I scroll to 'top' - '0,0'
Then I click 'Ready_Checkout_btn'
And I wait for '5' seconds
Then I scroll through page
And I wait for '10' seconds

@Sanity @Shipping
Scenario: Check UI of Shipping
Given I click 'GuestUser'
Then I scroll through page
And I wait for '10' seconds
Then I enter 'Test' in field 'FirstName'
And I enter 'Test' in field 'LastName'
And I enter '55 Shuman Blvd, Suite 275, Naperville,IL 60563 USA' in field 'Address'
And I enter 'Naperville' in field 'City'
And I enter 'IL' in field 'State'
And I enter '60563' in field 'Zipcode'
And I enter 'taha.patel@royalcyber.com' in field 'Email'
And I enter '123456789' in field 'Phone'
And I wait for '2' seconds
Then I click 'Continue_btn'
#Then I should see element 'Orignal_Address' present on page
And I wait for '10' seconds
Then I click 'Continue_btn'
#And I wait for '10' seconds
#Then I scroll through page
And I wait for '5' seconds

@Sanity @Payment
Scenario: Check UI of Payment
Given I scroll to 'coordinates' - '0,300'
And I wait for '10' seconds
#Then I should see element 'CreditCard' present on page
And I switch to iFrame 'Iframe_CreditCard'
And I wait for '2' seconds
Then I enter '4111111111111111' in field 'CreditCard'
And I wait for '2' seconds
Then I switch to default content
#And I wait '5' seconds for presence of element 'CreditCard'
#And I click 'CreditCard'
#And I enter '4111111111111111' in field 'CreditCard'
And I switch to iFrame 'Iframe_Cvv'
And I wait for '2' seconds
Then I enter '123' in field 'Cvv'
And I wait for '2' seconds
Then I switch to default content
And I wait for '5' seconds
#And I enter '123' in field 'Cvv'
And I switch to iFrame 'Iframe_Month'
And I select option '10' in dropdown 'Month' by 'value'
And I wait for '2' seconds
Then I switch to default content
And I wait for '5' seconds
And I switch to iFrame 'Iframe_Year'
And I select option '2022' in dropdown 'Year' by 'value'
And I wait for '2' seconds
Then I switch to default content
And I wait for '5' seconds
And I click 'PaymentContinue_btn'
And I wait for '5' seconds
And I scroll through page
And I wait for '5' seconds
#And I click 'PlaceOrder_btn'





@Sanity @CC_AddProductThroughSearch @Ignore
Scenario: Search Coffe Maker Add a Product
Given I enter 'Coffee maker' in field 'Search'
And I click 'SearchIcn'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Product2'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'AddtoCart'
And I wait for '2' seconds
And I click 'ContinueShopping_btn'
And I wait for '2' seconds


@Sanity @CC_ClearCart @Ignore
Scenario: Navigate to Cart and clear it
Given I verify and clear cart
And I wait '10' seconds for presence of element 'Menu_btn'


@Sanity @CC_Guest_Checkout @Ignore
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

@Sanity @CC_Checkout @Ignore
Scenario: Verify Order and Perform Successful Order
Given I click 'CartIcn'
And I click 'CartBtn'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Ready_Checkout_btn'
And I wait for '5' seconds
And I click 'Address_Chkbx'
And I wait for '5' seconds
And I click 'UseThisAddress_btn'
And I wait for '5' seconds
And I click 'PaymentContinue_btn'
And I wait for '5' seconds
And I click 'PlaceOrder_btn'
And I wait for '5' seconds

@Sanity @CC_Signout @Ignore
Scenario: Verify Succesful Logged Out
Given I click 'My_Account_btn'
And I wait for '5' seconds
And I click 'Signout_btn'
And I wait for '5' seconds
Then I click 'Home_logo'


