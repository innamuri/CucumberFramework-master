@CC_Responsive_BS
Feature: Sanity Check on the CircuitCity_Responsive_BS

@tryHover
Scenario: Test Hover
Given My WebApp 'CircuitCity_Responsive_BS' is open
And I scroll to 'coordinates' - '0,2300'
And I wait for '2' seconds
And I mouse over 'ProdItem_1'
And I wait for '3' seconds
#And I mouse over 'ProdItem_1_onHover'
And I wait for '30' seconds

@Sanity @login
Scenario: Navigate to CC web app and verify successful login
Given My WebApp 'CircuitCity_Responsive_BS' is open
And I wait for '10' seconds
#And I wait for '5' seconds
And I wait '10' seconds for presence of element 'SignIn'
And I click 'SignIn'
#And I wait '10' seconds for presence of element 'Username'
And I wait for '10' seconds
#And I click 'RegisterBtn'
#And I scroll through page
#Then I click 'SignIn'
And I wait '10' seconds for presence of element 'Username'
#And I wait for '7' seconds
#And I enter valid Credentials in 'Username' & 'Password' fields
And I enter 'test@live.com' in field 'Username'
And I wait for '7' seconds
#And I scroll to 'coordinates' - '0,100'
#And I wait for '2' seconds
And I enter 'passw0rd' in field 'Password'
And I wait for '7' seconds
And I click 'LogInBtn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'MyAccountBtn'
Then I should see element 'MyAccountBtn' present on page
#Then I should see text 'MY ACCOUNT' present on page at 'MyAccountBtn'

#@Sanity @Navigate
Scenario: Navigate to different links
Given I click 'Menu_btn'
Then I click 'Prod_cat'
And I wait for '5' seconds
#And I scroll to 'coordinates' - '0,600'
#And I scroll through page
And I click 'Cams_cat'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,200'
#And I scroll through page
And I click 'Prodid1name'
#And I click 'Prodid1img'
And I wait for '2' seconds
#And I scroll to 'coordinates' - '0,200'
#And I scroll through page
#And I click 'AddtoCart'
#And I wait for '2' seconds
#And I scroll to 'coordinates' - '400,0'
Then I enter 'Coffee maker' in field 'Search'
And I click 'SearchIcn'
And I wait for '2' seconds
And I click 'Prodid2'
And I wait for '2' seconds
#And I scroll to 'coordinates' - '0,300'
#And I click 'AddtoCart'
#And I wait for '2' seconds
Then I click 'CartIcn'
And I click 'CartBtn'