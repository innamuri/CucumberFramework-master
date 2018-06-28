package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.pageObjects.GetPageObject;

public class CircuitCity_Responsive_BS_Qa_Auth {

	static GetPageObject PO = new GetPageObject();

//   CC_Home 
		public static void CC_Home(){
			PO.add("url::https://prodlive.circuitcity.com/shop");
		}	

//   CC_Register 
		public static void CC_Register(){
			PO.add("Register_Btn::id=Header_GlobalLogin_WC_AccountDisplay_links_3");
			PO.add("First_Name_Field::id=WC__NameEntryForm_FormInput_firstName_1");
			PO.add("Last_Name_Field::id=WC__NameEntryForm_FormInput_lastName_1");
			PO.add("Email_ID_Field::id=WC_UserRegistrationAddForm_FormInput_logonId_In_Register_1_1");
			PO.add("Reg_Password_Field::id=WC_UserRegistrationAddForm_FormInput_logonPassword_In_Register_1");
			PO.add("Reg_Confirm_Password_Field::id=WC_UserRegistrationAddForm_FormInput_logonPasswordVerify_In_Register_1");
			PO.add("Phone_Num_Field::id=WC_UserRegistrationAddForm_FormInput_phoneNum_In_Register_1");
			PO.add("Create_Account_Btn::id=WC_UserRegistrationAddForm_links_1");
			PO.add("Already_Have_Account_Btn::xpath=//*[@id=\"box\"]/div[2]/a");
		}		

//   CC_Login
		public static void CC_Login(){
			PO.add("SignIn::id=Header_GlobalLogin_signInQuickLink");
//			PO.add("Username::name=logonId");
			PO.add("Username::id=Header_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1");
			PO.add("Invalid_Username_Error::id=Header_GlobalLogin_inlineLogonErrorMessage_GL_logonId");
			PO.add("Invalid_Credentials_Error::id=Header_GlobalLogin_logonErrorMessage_GL");
			PO.add("Password::id=Header_GlobalLogin_WC_AccountDisplay_FormInput_logonPassword_In_Logon_1");
			PO.add("Forgot_Password_Btn::id=Header_GlobalLogin_WC_AccountDisplay_links_1");
			PO.add("Reset_Password_Field::id=WC_PasswordResetForm_FormInput_logonId_In_ResetPasswordForm_1");
			PO.add("Submit_Reset_Password_Btn::id=WC_PasswordResetForm_Link_2");
			PO.add("Invalid_ID_Reset_Password_Error::id=error_msg");
			PO.add("Valid_ID_Reset_Password_Msg::id=msg");
			PO.add("GmailURL::https://gmail.com");
			PO.add("Gmail_SignIn_Btn::linkText=SIGN IN");
			PO.add("Gmail_ID_Field::id=identifierId");
			PO.add("Gmail_IDNext_Btn::id=identifierNext");
			PO.add("Gmail_Pswrd_Field::name=password");
			PO.add("Gmail_PswrdNext_Btn::id=passwordNext");
			PO.add("Menu_Btn::xpath=//*[@id=\"tltbt\"]/div[2]/div[2]/div");
			PO.add("Spam_Btn::linkText=Spam");
			PO.add("Password_Reset_Email::linkText=Your password has been reset.");
			PO.add("Reset_Pswrd_Link::linkText=Click here to Reset Password");
			PO.add("New_Pswrd_Field::id=WC_PasswordResetForm_FormInput_logonPassword_In_ResetPasswordForm_1");
			PO.add("Verify_New_Pswrd_Field::id=WC_PasswordResetForm_FormInput_logonPasswordVerify_In_ResetPasswordForm_1");
			PO.add("Change_Pswrd_Btn::id=WC_PasswordResetForm_Link_2");
			PO.add("LogInBtn::id=Header_GlobalLogin_WC_AccountDisplay_links_2");
			PO.add("RememberMe_Chkbx::id=Header_GlobalLogin_WC_AccountDisplay_FormInput_rememberMe_In_Logon_1_img");			
			PO.add("MyAccountBtn::id=myAccountQuickLink");
		}
		
//	 CC_ClearCart
		public static void CC_ClearCart(){
			PO.add("CartIcn::id=widget_minishopcart");
			PO.add("CartBtn::id=GotoCartButton1");
			PO.add("Cart_val::id=minishopcart_total");
			PO.add("Remove_btn::id=WC_OrderItemDetailsf_links_2_1");
			PO.add("Home_logo::id=contentLink_1_HeaderStoreLogo_Content");
		}

//	 CC_AddProductThroughCat
		public static void CC_AddProductThroughCat(){
			PO.add("Menu_btn::id=departmentsButton");
			PO.add("Prod_cat::id=allDepartmentsButton");
//qalive
			PO.add("Cams_cat::id=departmentLink_3074457345616682170_alt");
//cct-dev
//			PO.add("Cams_cat::id=departmentLink_25503_alt");	
			PO.add("Cams::xpath=//*[@id=\"container_14601\"]/div[1]/div/div[2]/ul[1]/li[2]/div/a");
			PO.add("Accessories::xpath=//*[@id=\"container_14601\"]/div[1]/div/div[2]/ul[1]/li[1]/div/a");
			PO.add("Cb&Cs::xpath=//*[@id=\"container_14601\"]/div[1]/div/div[2]/ul[1]/li[1]/div/a");
			PO.add("SortBy_Dropdown::id=orderBy_5_-3004_3074457345618265611");
			PO.add("Filter_Badges::xpath=//*[@id=\"container_3074457345618272604\"]/div[3]/div[1]/div[1]/div[1]/div/div[2]/a");
			PO.add("By_Category::id=section_button_parentCatgroup_id_search_5_-3004_3074457345618265611");
			PO.add("By_Color::id=section_button_ads_f10019_ntk_cs_5_-3004_3074457345618265611");
			PO.add("By_Resolution::id=section_button_ads_f11005_ntk_cs_5_-3004_3074457345618265611");
			PO.add("By_Price::id=section_button_3_5_-3004_3074457345618265611");
			PO.add("By_Brand::id=section_button_mfName_ntk_cs_5_-3004_3074457345618265611");
			PO.add("ItemsPerPage::name=pageSize");
			PO.add("Pag_Num::xpath=//*[@id='container_3074457345618272604']/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div/div/div/a");
			PO.add("Pagination::classname=num_products");
			PO.add("PLP_Img::xpath=//*[@id=\"catalogEntry_img3074457345616727208\"]/img");
			PO.add("Compare_1::id=comparebox_3074457345616682174");
			PO.add("Compare_2::id=comparebox_3074457345616682176");
			PO.add("Compare_3::id=comparebox_3074457345616682178");
			PO.add("Compare_4::id=comparebox_3074457345616682180");
			PO.add("Compare_5::id=comparebox_3074457345616682182");
			PO.add("Comapre_Now_Btn::linkText=COMPARE NOW");
			PO.add("Compare_Back_Breadcrumb::id=compareBackLink");
			PO.add("Cat_Camera_Chk::id=facetLabel_3074457345616682198");
			PO.add("Cat_Camera_Value_Chk::id=facet_count3074457345616682198");
			
			
			
			
			PO.add("Product::linkText=Case Logic TBC411INDIGO DSLR COMPACT BACKPACK DOBBY");
			PO.add("AddtoCart::linkText=ADD TO CART");
			PO.add("ContinueShopping_btn::id=WC_BreadCrumbTrailDisplay_links_2a");
//			PO.add("CartClose::id=MiniShopCartCloseButton_2");
		}

//   CC_AddProductThroughSearch 
		public static void CC_AddProductThroughSearch(){
			PO.add("Search::id=SimpleSearchForm_SearchTerm");
			PO.add("SearchIcn::classname=submitButton");
			PO.add("Product2::linkText=Conair DCC-3200 14 Cup Programmable Coffeemaker");
		}
			
//   CC_Checkout 
		public static void CC_Checkout(){
			PO.add("Ready_Checkout_btn::linkText= READY TO CHECKOUT ");
			PO.add("Address_Chkbx::id=79537063143");
			PO.add("UseThisAddress_btn::id=shippingButton");
			PO.add("PaymentContinue_btn::id=update");
			PO.add("PlaceOrder_btn::id=placeOrder");
		}

//   CC_Guest_Checkout
		public static void CC_Guest_Checkout(){
			PO.add("GuestUser::id=guestShopperContinue");
			PO.add("UseThisAddress_btn::id=shippingButton");
			PO.add("Continue::id=submit");
			PO.add("PaymentContinue_btn::id=update");
			PO.add("PlaceOrder_btn::id=placeOrder");
			PO.add("FirstName::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_firstName_1");
			PO.add("LastName::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_lastName_1");
			PO.add("Address::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_address1_1");
			PO.add("State::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_state_1");
			PO.add("City::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_city_1");
			PO.add("Zipcode::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_zipCode_1");
			PO.add("Email::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_email1_1");
			PO.add("Phone::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_phone1_1");
			PO.add("Zipcode::id=WC_ShippingAddressForm_AddressEntryForm_FormInput_zipCode_1");
			PO.add("CreditCard::id=credit-card-number");
			PO.add("Cvv::id=cvv");
			PO.add("Month::id=expiration-month");
			PO.add("MonthValue::value=10");
			PO.add("MonthName::linkText=10 - October");
			PO.add("Year::id=expiration-year");
			PO.add("YearValue::value=2022");
			PO.add("YearName::linkText=2022");
			
		}		
//   CC_Signout 
		public static void CC_Signout(){
			PO.add("My_Account_btn::id=Header_GlobalLogin_signOutQuickLink");
			PO.add("Signout_btn::id=Header_GlobalLogin_loggedInDropdown_SignOut");
		}
		

	//Load PageObjects 
	public static void loadallPageObjects(){
		CC_Home();
		CC_Register();
		CC_Login();
		CC_ClearCart();
		CC_AddProductThroughCat();
		CC_AddProductThroughSearch();
		CC_Checkout();
		CC_Signout();
		CC_Guest_Checkout();

		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
		CC_Home();
		CC_Register();
		CC_Login();
		CC_ClearCart();
		CC_AddProductThroughCat();
		CC_AddProductThroughSearch();
		CC_Checkout();
		CC_Signout();
		CC_Guest_Checkout();

		System.out.println("Object Load to HM Successfull!");
	}
}
