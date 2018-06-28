package com.Cucumber.pageObjects.WebApp;


import com.Cucumber.pageObjects.GetPageObject;

public class SVP_Embroderies_Responsive_BS {

	static GetPageObject PO = new GetPageObject();

//   SVP_Home 
		public static void SVP_Home(){
//			PO.add("url::https://cctdev.royalcyber.org/shop");
			PO.add("url::http://svp-live.qa.coc.ibmcloud.com/webapp/wcs/stores/servlet/en/myembroideries");
		}	

//   SVP_Register 
		public static void SVP_Register(){
			PO.add("RegisterBtn::id=Header_GlobalLogin_WC_AccountDisplay_links_3");
		}		

//   SVP_Login
		public static void SVP_Login(){
			PO.add("SignIn::id=Header_GlobalLogin_signInQuickLink");
			PO.add("Username::id=Header_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1");
			PO.add("Password::id=Header_GlobalLogin_WC_AccountDisplay_FormInput_logonPassword_In_Logon_1");
			PO.add("LogInBtn::id=Header_GlobalLogin_WC_AccountDisplay_links_2");
			PO.add("MyAccountBtn::id=myAccountQuickLink");	
		}
		
//	 SVP_ClearCart
		public static void SVP_ClearCart(){
			PO.add("CartIcn::id=widget_minishopcart");
			PO.add("CartBtn::id=GotoCartButton1");
			PO.add("Cart_val::id=minishopcart_total");
			PO.add("Remove_btn::id=WC_OrderItemDetailsf_links_2_1");
			PO.add("Home_logo::id=contentImage_1_HeaderStoreLogo_Content");
		}

//	 SVP_AddProductThroughCat
		public static void SVP_AddProductThroughCat(){
			PO.add("Menu_btn::id=departmentsButton");
			PO.add("Animals_cat::id=departmentLink_11003");
			PO.add("List_View::id=WC_SearchBasedNavigationResults_pagination_link_list_categoryResults");
			PO.add("Dropdown1::id=attrValue_10951_1-button");
			PO.add("ART::id=ui-id-9");
			PO.add("Product1_Dropdown::id=attrValue_10951_1");
			PO.add("AddtoCartProd1::id=listViewAdd2Cart_10951");
			PO.add("Product2::linkText=Horse");
			PO.add("Dropdown2::id=attrValue_Format_entitledItem_10960-button");
			PO.add("DST::id=ui-id-13");
			PO.add("AddtoCart::linkText=ADD TO CART");
			PO.add("Product2_Dropdown::id=attrValue_Format_entitledItem_10960");
			PO.add("CartClose::id=MiniShopCartCloseButton_2");
		}

//   SVP_AddProductThroughSearch 
		public static void SVP_AddProductThroughSearch(){
			PO.add("SearchBtn::id=searchButton");
			PO.add("Search::id=SimpleSearchForm_SearchTerm");
			PO.add("SearchIcn::classname=submitButton");
			PO.add("Product3::linkText=Toy Train");
			PO.add("Dropdown3::id=attrValue_Format_entitledItem_28047-button");
			PO.add("EXP::id=ui-id-14");
			PO.add("Product3_Dropdown::id=attrValue_Format_entitledItem_28047");
		}
			
//   SVP_Checkout 
		public static void SVP_Checkout(){
			PO.add("CheckoutBtn::id=shopcartCheckout");
			PO.add("Ready_Checkout_btn::linkText= READY TO CHECKOUT ");
			PO.add("Payment_Dropdown::id=payMethodId_1");
			PO.add("CrdtCard::name=account1");
			PO.add("Cvc::name=cc_cvc");
			PO.add("Month_Dropdown::id=expire_month_1");
			PO.add("Year_Dropdown::id=expire_year_1");
			PO.add("NextBtn::id=shippingBillingPageNext");
			PO.add("OrderBtn::id=WC_MultipleShipmentSummary_link_5");
			PO.add("PlaceOrder_btn::id=placeOrder");
		}

//   SVP_Guest_Checkout
		public static void SVP_Guest_Checkout(){
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
//   SVP_Signout 
		public static void SVP_Signout(){
			PO.add("My_Account_btn::id=Header_GlobalLogin_signOutQuickLink");
			PO.add("Signout_btn::id=Header_GlobalLogin_loggedInDropdown_SignOut");
		}
		

	//Load PageObjects 
	public static void loadallPageObjects(){
		SVP_Home();
		SVP_Register();
		SVP_Login();
		SVP_ClearCart();
		SVP_AddProductThroughCat();
		SVP_AddProductThroughSearch();
		SVP_Checkout();
		SVP_Signout();
		SVP_Guest_Checkout();

		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
		SVP_Home();
		SVP_Register();
		SVP_Login();
		SVP_ClearCart();
		SVP_AddProductThroughCat();
		SVP_AddProductThroughSearch();
		SVP_Checkout();
		SVP_Signout();
		SVP_Guest_Checkout();

		System.out.println("Object Load to HM Successfull!");
	}
}