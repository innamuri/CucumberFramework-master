@CC_Responsive_BS
Feature: Sanity Check on the CircuitCity_Responsive_BS

@Sanity @CC_Home
Scenario: Navigate to CC web app and verify successful login
Given My WebApp 'CircuitCity_Responsive_BS_Qa_Auth' is open
And I wait '5' seconds for presence of element 'SignIn'
Then I should see element 'SignIn' present on page

@Sanity @CC_Register @Register_Screen_UI
Scenario: Navigate to Register Page and Verify UI Screen
Given I click 'SignIn'
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
Then I should see element 'First_Name_Field' present on page
Then I should see element 'Last_Name_Field' present on page
Then I should see element 'Email_ID_Field' present on page
Then I should see element 'Reg_Password_Field' present on page
Then I should see element 'Reg_Confirm_Password_Field' present on page
Then I should see element 'Phone_Num_Field' present on page
Then I should see element 'Create_Account_Btn' present on page
Then I should see element 'Already_Have_Account_Btn' present on page

@Sanity @CC_Register @Register_Successful_Valid_Details
Scenario: Verify Successful Registration with Valid Details
Given I should see element 'First_Name_Field' present on page
Then I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'passw0rd' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait '10' seconds for presence of element 'MyAccountBtn'
Then I should see element 'MyAccountBtn' present on page
And I wait for '10' seconds
And I click 'Home_logo'
And I wait for '5' seconds
And I click 'MyAccountBtn'
And I wait '10' seconds for presence of element 'Signout_btn'
And I click 'Signout_btn'
And I wait '10' seconds for presence of element 'SignIn'

@Sanity @CC_Register @Register_Blank_Email_ID
Scenario: Verify Error Message Displaying for Blank Email ID in Registration Page
Given I check and Sign out
And I wait '10' seconds for presence of element 'SignIn'
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'passw0rd' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'The Email ID/Logon Id field cannot be empty.' present on page

@Sanity @CC_Register @Register_Already_Registerd_Email_ID
Scenario: Verify Error Message Displaying for Already Registered Email ID in Registration Page
Given I check and Sign out
And I scroll to 'top' - '0,0'
And I wait '10' seconds for presence of element 'SignIn'
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I enter 'taha.royalcyber@gmail.com' in field 'Email_ID_Field'
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'passw0rd' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'Error: The logon ID you entered already exists. Type a different logon ID and try again.' present on page

@Sanity @CC_Register @Register_Invalid_Format_Email_ID
Scenario: Verify Error Message Displaying for Invalid Format Email ID in Registration Page
Given I check and Sign out
And I wait '10' seconds for presence of element 'SignIn'
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I enter 'Test' in field 'Email_ID_Field'
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'passw0rd' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'The email entered is not in a valid format.' present on page
And I scroll to 'top' - '0,0'

@Sanity @CC_Register @Register_Blank_Password
Scenario: Verify Error Message Displaying for Blank Password in Registration Page
Given I check and Sign out
And I wait '10' seconds for presence of element 'SignIn'
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I wait for '5' seconds
Then I should see text 'The password field cannot be empty.' present on page
#And I enter 'passw0rd' in field 'Reg_Confirm_Password_Field'
#And I clear field 'Phone_Num_Field'
#And I enter '1234567890' in field 'Phone_Num_Field'
#And I click 'Create_Account_Btn'
And I wait for '5' seconds
#Then I should see text 'The password field cannot be empty.' present on page

@Sanity @CC_Register @Register_Blank_Confirm_Password
Scenario: Verify Error Message Displaying for Blank Confirm Password in Registration Page
Given I check and Sign out
And I wait '10' seconds for presence of element 'SignIn'
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'The password verify field cannot be empty.' present on page

@Sanity @CC_Register @Register_Blank_Phone_Num
Scenario: Verify Error Message Displaying for Blank Phone Number in Registration Page
Given I check and Sign out
And I wait for '5' seconds
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'passw0rd' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'The phone number field cannot be empty.' present on page

@Sanity @CC_Register @Register_Invalid_Password_Less_Char
Scenario: Verify Error Message Displaying for Invalid Password (Less Char) in Registration Page
Given I check and Sign out
And I wait for '5' seconds
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter 'pass' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'pass' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'Passwords must be at least 6 characters in length, and include 1 digit(s) and 1 letter(s).' present on page

@Sanity @CC_Register @Register_Invalid_Password_All_Alphabets
Scenario: Verify Error Message Displaying for Invalid Password (All Alphabets) in Registration Page
Given I check and Sign out
And I wait for '5' seconds
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter 'password' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'password' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'Passwords must be at least 6 characters in length, and include 1 digit(s) and 1 letter(s).' present on page

@Sanity @CC_Register @Register_Invalid_Password_All_Numbers
Scenario: Verify Error Message Displaying for Invalid Password (All Numbers) in Registration Page
Given I check and Sign out
And I wait for '5' seconds
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter '12345678' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter '12345678' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'Passwords must be at least 6 characters in length, and include 1 digit(s) and 1 letter(s).' present on page

@Sanity @CC_Register @Register_Invalid_Confirm_Password
Scenario: Verify Error Message Displaying for Invalid Confirm Password in Registration Page
Given I check and Sign out
And I wait for '5' seconds
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'pass' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567890' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'The passwords entered do not match.' present on page

@Sanity @CC_Register @Register_Invalid_Phone_Num
Scenario: Verify Error Message Displaying for Invalid Phone Number in Registration Page
Given I check and Sign out
And I wait for '5' seconds
Then I click 'SignIn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'Register_Btn'
And I click 'Register_Btn'
And I wait '10' seconds for presence of element 'First_Name_Field'
And I clear field 'First_Name_Field'
And I enter 'Test' in field 'First_Name_Field'
And I clear field 'Last_Name_Field'
And I enter 'Test' in field 'Last_Name_Field'
And I clear field 'Email_ID_Field'
And I register email id
And I clear field 'Reg_Password_Field'
And I enter 'passw0rd' in field 'Reg_Password_Field'
And I clear field 'Reg_Confirm_Password_Field'
And I enter 'passw0rd' in field 'Reg_Confirm_Password_Field'
And I clear field 'Phone_Num_Field'
And I enter '1234567' in field 'Phone_Num_Field'
And I click 'Create_Account_Btn'
And I wait for '5' seconds
Then I should see text 'The phone number entered is not in a valid format.' present on page

@Sanity @CC_Login @SignIn_Screen_As_UI
Scenario: Navigate to Login Page and Verify UI of Sign In Screen
Given I check and Sign out
Then I click 'SignIn'
Then I wait '10' seconds for presence of element 'Username'
And I should see element 'Username' present on page
And I should see element 'Password' present on page
And I should see element 'Forgot_Password_Btn' present on page
And I should see element 'LogInBtn' present on page
And I should see element 'Register_Btn' present on page

@Sanity @CC_Login @SignIn_As_Valid_Credentials
Scenario: Navigate to Login Page and Verify Successful Login with Valid Credentials
Given I click 'Username'
And I clear field 'Username'
And I enter 'taha.royalcyber@gmail.com' in field 'Username'
And I wait for '3' seconds
Then I click 'Password'
And I clear field 'Password'
And I enter 'passw0rd' in field 'Password'
And I wait for '7' seconds
And I click 'LogInBtn'
And I wait for '7' seconds
And I wait '10' seconds for presence of element 'MyAccountBtn'
Then I should see element 'MyAccountBtn' present on page

@Sanity @CC_Login @SignIn_As_Invalid_Username
Scenario: Navigate to Login Page and Verify Error Message for Invalid Username
Given I check and Sign out
And I wait '10' seconds for presence of element 'SignIn'
Then I click 'SignIn'
Then I click 'Username'
And I clear field 'Username'
And I enter 'invalidusername' in field 'Username'
And I wait for '3' seconds
Then I click 'Password'
And I clear field 'Password'
And I enter 'passw0rd' in field 'Password'
And I wait for '7' seconds
And I click 'LogInBtn'
And I wait for '7' seconds
Then I should see text 'Either the logon ID or the password entered is incorrect. Enter the information again.' present on page
Then  I should see element 'Invalid_Credentials_Error' present on page

@Sanity @CC_Login @SignIn_As_Invalid_Password
Scenario: Navigate to Login Page and Verify Error Message for Invalid Password
Given I click 'Username'
And I clear field 'Username'
And I enter 'taha.royalcyber@gmail.com' in field 'Username'
And I wait for '3' seconds
Then I click 'Password'
And I clear field 'Password'
And I enter 'invalidpassw0rd' in field 'Password'
And I wait for '7' seconds
And I click 'LogInBtn'
And I wait for '7' seconds
Then I should see text 'Either the logon ID or the password entered is incorrect. Enter the information again.' present on page
Then  I should see element 'Invalid_Credentials_Error' present on page

@Sanity @CC_Login @SignIn_As_Valid_Credentials_with_RememberMe
Scenario: Navigate to Login Page and Verify Successful Login with Valid Credentials and Remember Me
Given I click 'Username'
And I clear field 'Username'
And I enter 'taha.royalcyber@gmail.com' in field 'Username'
And I wait for '3' seconds
Then I click 'Password'
And I clear field 'Password'
And I enter 'passw0rd' in field 'Password'
And I wait for '2' seconds
And I click 'RememberMe_Chkbx'
And I wait for '7' seconds
And I click 'LogInBtn'
And I wait for '7' seconds
And I wait '10' seconds for presence of element 'MyAccountBtn'
Then I should see element 'MyAccountBtn' present on page
And I wait for '10' seconds
And I click 'Home_logo'
And I wait '10' seconds for presence of element 'MyAccountBtn'
And I click 'MyAccountBtn'
And I wait '10' seconds for presence of element 'Signout_btn'
And I click 'Signout_btn'
And I wait '10' seconds for presence of element 'SignIn'
And I click 'SignIn'
And I wait for '5' seconds
Then I verify text 'taha.royalcyber@gmail.com' in field 'Username'
And I wait for '5' seconds

@Sanity @CC_Login @SignIn_As_Forgot_Password_Screen_UI
Scenario: Navigate to Login Page and Verify Forgot Password Screen UI
Given I click 'Forgot_Password_Btn'
And I wait for '5' seconds
Then I should see element 'Reset_Password_Field' present on page
And I should see element 'Submit_Reset_Password_Btn' present on page

@Sanity @CC_Login @SignIn_As_Invalid_ID_Reset_Password_Error_Message
Scenario: Navigate to Login Page and Verify Error Message for Invalid ID Reset Password
Given I click 'Reset_Password_Field'
And I clear field 'Reset_Password_Field'
And I enter 'Test' in field 'Reset_Password_Field'
Then I click 'Submit_Reset_Password_Btn'
And I wait for '5' seconds
Then I should see text 'The logon ID that you entered is not valid. Check your entry and try again.' present on page
Then I should see element 'Invalid_ID_Reset_Password_Error' present on page

@Sanity @CC_Login @SignIn_As_Invalid_ID_Reset_Password_Error_Message
Scenario: Navigate to Login Page and Verify Error Message for Invalid ID Reset Password
Given I click 'Reset_Password_Field'
And I clear field 'Reset_Password_Field'
And I enter 'test' in field 'Reset_Password_Field'
Then I click 'Submit_Reset_Password_Btn'
And I wait for '5' seconds
Then I should see text 'The password for this logon ID cannot be reset. Contact the store for assistance.' present on page
Then I should see element 'Invalid_ID_Reset_Password_Error' present on page

@Sanity @CC_Login @SignIn_As_Valid_ID_Reset_Password
Scenario: Navigate to Login Page and Verify Error Message for Valid ID Reset Password
Given I click 'Reset_Password_Field'
And I clear field 'Reset_Password_Field'
And I enter 'taha.royalcyber@gmail.com' in field 'Reset_Password_Field'
Then I click 'Submit_Reset_Password_Btn'
And I wait for '5' seconds
Then I should see text 'A mail is sent to your Email ID with link to reset password' present on page
Then I should see element 'Valid_ID_Reset_Password_Msg' present on page

@Sanity @CC_Login @SignIn_As_New_Password_Working @Ignore
Scenario: Navigate to Login Page and Verify New Password Working
Given I navigate to 'GmailURL' page
Then I click 'Gmail_SignIn_Btn'
And I click 'Gmail_ID_Field'
And I clear field 'Gmail_ID_Field'
And I enter 'taha.royalcyber@gmail.com' in field 'Gmail_ID_Field'
And I click 'Gmail_IDNext_Btn'
And I wait for '5' seconds
And I click 'Gmail_Pswrd_Field'
And I clear field 'Gmail_Pswrd_Field'
And I enter 'Cyber2003' in field 'Gmail_Pswrd_Field'
And I click 'Gmail_PswrdNext_Btn'
And I wait for '5' seconds
And I click 'Menu_Btn'
And I wait for '5' seconds
And I click 'Spam_Btn'
And I wait for '5' seconds
And I click 'Password_Reset_Email'
And I wait for '5' seconds
Then I should see text 'Click here to Reset Password' present on page
Then I should see element 'Reset_Pswrd_Link' present on page
And I click 'Reset_Pswrd_Link'
And I wait for '5' seconds
Then I should see element 'New_Pswrd_Field' present on page
Then I should see element 'Verify_New_Pswrd_Field' present on page
Then I should see element 'Change_Pswrd_Btn' present on page
And I click 'New_Pswrd_Field'
And I clear field 'New_Pswrd_Field'
And I enter 'Cyber2003' in field 'New_Pswrd_Field'

@Sanity @CC_PLP @Ignore
Scenario: Navigate to Category Page and Subcategory Page and verify PLP
Given I click 'Menu_btn'
And I wait for '5' seconds
Then I click 'Prod_cat'
And I wait for '5' seconds
And I click 'Cams_cat'
And I wait for '5' seconds
And I click 'Cams'
And I wait for '5' seconds
Then I should see element 'SortBy_Dropdown' present on page
Then I should see element 'Filter_Badges' present on page
Then I click 'Filter_Badges'
And I wait for '5' seconds
Then I should see element 'By_Category' present on page
Then I should see element 'By_Color' present on page
Then I should see element 'By_Resolution' present on page
Then I should see element 'By_Price' present on page
Then I should see element 'By_Brand' present on page
And I click 'Filter_Badges'
And I wait for '5' seconds
And I scroll through page
Then I should see element 'ItemsPerPage' present on page
Then I should see element 'Pagination' present on page


@Sanity @CC_PLP @Compare_Products @Ignore
Scenario: Add Products to Compare
Given I click 'Compare_1'
And I wait for '2' seconds
Then I click 'Compare_1'
And I wait for '2' seconds
Then I click 'Compare_3'
And I wait for '2' seconds
Then I click 'Compare_4'
And I wait for '2' seconds
Then I click 'Compare_5'
And I wait for '2' seconds
Then I should see text 'The maximum number of products that can be compared is 4. Please refine your selection.' present on page
Then I should see element 'Comapre_Now_Btn' present on page
And I click 'Comapre_Now_Btn'
And I wait for '5' seconds
Then I should see element 'Compare_Back_Breadcrumb' present on page
Then I should see text 'Compare Products' present on page
And I click 'Compare_Back_Breadcrumb'
And I wait for '10' seconds

@Sanity @CC_PLP @Filter_By_Cat @Ignore
Scenario: Add Products to Compare
Given I click 'Filter_Badges'
And I get text from '(.*)' and store

		


And I click 'Cb&Cs'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Product'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'AddtoCart'
And I wait for '5' seconds
And I click 'ContinueShopping_btn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'SearchIcn'

@Sanity @CC_ClearCart @Ignore
Scenario: Navigate to Cart and clear it
Given I verify and clear cart
And I wait '10' seconds for presence of element 'Menu_btn'

@Sanity @CC_AddProductThroughCat @Ignore
Scenario: Navigate to Category Page and Subcategory Pages and Add a Product
Given I click 'Menu_btn'
And I wait for '5' seconds
Then I click 'Prod_cat'
And I wait for '5' seconds
And I click 'Cams_cat'
And I wait for '5' seconds
And I click 'Cams'
And I wait for '5' seconds
And I click 'Accessories'
And I wait for '2' seconds
And I click 'Cb&Cs'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'Product'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,300'
And I click 'AddtoCart'
And I wait for '5' seconds
And I click 'ContinueShopping_btn'
And I wait for '5' seconds
And I wait '10' seconds for presence of element 'SearchIcn'

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

