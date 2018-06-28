@Augusta_Sublimation
Feature: Augusta-Sublimation

@urlnavigation 
Scenario: Verify the url navigating properly
Given My WebApp 'Augusta_Sublimation' is open
When I click 'Popup'
And I mouse over 'MenuCustomize'
And I click 'MenuSublimation'
Then I should see element 'Logo' present on page_
And I scroll to 'coordinates' - '0,250'
Then I should see element 'Logo' present on page_

@designselection
Scenario: Verify the design selection working properly
When I click 'Category_MainMenu'
And I click 'SubCategory_Menu'
And I click 'Select_a_product_type'
And I click 'Select_a_cut'
And I wait for '5' seconds
And I click 'Select_a_design'
And I wait for '10' seconds
And I scroll to 'coordinates' - '0,250'
And I click 'Select_a_decoration_layout'
And I scroll to 'coordinates' - '0,250'
And I click 'Nextbutton'
And I wait for '10' seconds
Then I should see element 'Logo' present on page_

@selectstyle
Scenario: Verify the style configure review and save working properly
Given I click 'Style1_Main_Color'
And I wait for '5' seconds
When I click 'Style1_Accent_Color1'
And I wait for '5' seconds
And I click 'Style1_Accent_Color2'
And I wait for '5' seconds
And I click 'Style2_Main_Color'
And I wait for '5' seconds
And I click 'Style2_Accent_Color1'
And I wait for '5' seconds
And I scroll to 'coordinates' - '0,250'
And I click 'Style2_Accent_Color2'
And I scroll to 'coordinates' - '0,250'
And I wait for '5' seconds
And I click 'NextbuttonNumbering'
And I wait for '10' seconds


@selectfont 
Scenario: Verify Custom font working properly
When I select option 'PlayerName' in dropdown 'Select_Player_Type' by 'value'
And I scroll to 'coordinates' - '0,200'
And I wait for '5' seconds
And I enter 'Ramya' in field 'Enter_Text'
And I click 'Font_Type'
And I click 'Custom_Font'
And I wait for '5' seconds
#And I select option 'Custom' in dropdown 'Font_Type' by 'Text'
And I click 'Upload_your_Font'
And I click 'Check_box'
And I enter 'C:\Users\user\Desktop\ALEAWB.TTF' in field 'Broswer_Upload'
And I click 'Upload_font'
And I wait for '10' seconds
And I enter 'Custom font uploaded' in field 'Comment_box'
And I click 'Text_Main_Color'
And I click 'Text_Accent_Color'
And I click 'Select_One_More'
And I scroll to 'coordinates' - '0,100'
And I drag field 'Circle' and drop 'Place'
And I click 'Apply'
And I wait for '10' seconds
And I click 'Mascot'
And I wait for '3' seconds

@selectlogo
Scenario: Verify custom log working properly
When I select option 'Custom Mascot / Logo' in dropdown 'Mascot_Library' by 'text'
And I click 'Logo_Button'
And I click 'Check_box_Logo'
And I enter 'C:\Users\user\Desktop\ButterflyLogo.png' in field 'Broswer_Upload_Logo'
And I click 'Upload_font_Logo'
And I wait for '10' seconds
			
@Mascotcolorselection
Scenario: Verify able to select the mascot color properly 
When I click 'Mascot_Color_1'
And I click 'Mascot_Color_2'
And I click 'Mascot_Color_3'
And I click 'Select_One_Mascot'
And I click 'Apply_Mascot'
And I wait for '5' seconds
And I click 'Next_Roster'
And I scroll to 'coordinates' - '0,100'
And I wait for '5' seconds	
Then I should see element 'Click_Here' present on page
And I click 'Click_Here'
#Then i_Verify_DownloadWithFileName 'roster(*)' is 'C:\\Users\\RC-Ramya\\Downloads'

#I verify presence of file '' in folder ""
#then rename file '' in folder '' with timestamp

And I enter '7' in field 'Player_number#'
And I enter 'Dhoni' in field 'Player_name_optional'
And I select option 'YS-$53.00' in dropdown 'Size1' by 'value'
And I select option 'YS-$53.00' in dropdown 'Size2' by 'value'
And I click 'Next_Review_Save'
And I wait for '5' seconds	
And I enter 'Review comment box' in field 'Review_Comment_Box'
And I wait for '5' seconds	
And I click 'Next_Review'	
And I click alert accept
And I wait for '5' seconds



@saveyourdesign
Scenario: Verify able to save the design properly
When I enter 'Ramya' in field 'First_Name'
And I enter 'Raju' in field 'Last_Name'
And I enter 'ramya@royalcyber.com' in field 'Email_id'
And I enter 'Save Design' in field 'Design_Description'
And I click 'Agree'	
And I click 'Save_My_Design'
And I get text from 'Design_Reference' and store

@TO_PLACE_AN_ORDER
Scenario: Verify able to place order after saving the design
When I click 'Click_here'
And I wait for '5' seconds	
And I enter '133779' in field 'Account_number'
And I click 'Submit_Design'
And I wait for '5' seconds	
And I enter 'Royalcyber' in field 'Company_Name'
And I enter 'Ramya' in field 'Contact_Name'
And I wait for '3' seconds	
And I scroll to 'coordinates' - '0,250'
And I enter 'ramya@royalcyber.com' in field 'Email_id_design' 
And I enter '23456343' in field 'Phone' 
And I enter 'Ramya 2018' in field 'Purchase_order_number'
And I click 'Submit_order'
And I wait for '5' seconds	
And I click 'Existing_Address'
And I wait for '3' seconds
And I scroll to 'coordinates' - '0,100'
And I click 'Address_Submit'
And I wait for '3' seconds
And I click 'Order_Agree'
And I click 'Order_Submit'
Then I should see text 'THANK YOU FOR YOUR ORDER' present on page at 'Thank_you'
And I wait for '5' seconds

@Place_order_with_old_design
Scenario: Verify able to place order with old design
And I wait for '15' seconds
When I click 'Logo'
And I wait for '5' seconds
And I enter '$$Design_Reference' in field 'Retrive_save_design'
And I should see element 'Retrive_save_design' present on page_
And I click 'Retrive_go'
And I take screenshot

			
		
		

