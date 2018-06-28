package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.pageObjects.GetPageObject;

public class Circuit_City{

	static GetPageObject PO = new GetPageObject();

	//CircuitCity Login Page 
	public static void CircuitCity_Login(){
		PO.add("url::http://cct-live.qa.coc.ibmcloud.com/webapp/wcs/stores/servlet/en/circuitcityb2c");
		PO.add("SignIn_Btn::id=Header_GlobalLogin_signInQuickLink");
		PO.add("UserName::name=logonId");
		PO.add("Password::name=logonPassword");
		PO.add("LogInBtn::id=Header_GlobalLogin_WC_AccountDisplay_links_2");
		PO.add("InvalidCredentials_Header::id=Header_GlobalLogin_logonErrorMessage_GL");
		}

	//CircuitCity Landing page
	public static void CircuitCity_LandingPage(){
		PO.add("Home::xpath=//*[@id=\"contentImage_1_HeaderStoreLogo_Content\"]");
		PO.add("ProductsMenu::xpath=//*[@id=\"allDepartmentsButton\"]/span");
		PO.add("CamerasLink::id=departmentLink_3074457345616680169_alt");
		PO.add("CamerasTitle::xpath=//*[@id=\"PageHeading_1_-3001_3074457345618259606\"]/h1/div/h2");
		}

	//CircuitCity Search
	public static void CircuitCity_Search(){
		PO.add("Search::id=SimpleSearchForm_SearchTerm");
		PO.add("SearchButton::xpath=//*[@id=\"searchBox\"]/a[2]");
		PO.add("SearchBreadcrumb::xpath=//*[@id=\"widget_breadcrumb\"]/ul/li[2]");
		PO.add("SearchWarning::classname=wpsFieldWarningText");
		PO.add("CloseSearch::xpath=//button[@name='closeSearchButton']");
		}
	
	//CircuitCity ProductAddtoCart
	public static void CircuitCity_ProductAddtoCart(){
		PO.add("ProductImg::id=CatalogEntryProdImg_3074457345616683129");
		PO.add("AddToCart_Btn::id=add2CartBtn");
		PO.add("CloseBtn::id=MiniShopCartCloseButton_2");
		PO.add("CartMsg::id=cartDropdownMessage");
		PO.add("ViewCart::id=GotoCartButton2");
		PO.add("DeleteProduct::id=WC_OrderItemDetailsf_links_2_1");
		}
	

	//Footer page
	public static void CircuitCity_MyAccount(){
		PO.add("MyAccount::id=Header_GlobalLogin_signOutQuickLink");
		PO.add("OrderHistory::xpath=//*[@id=\"Header_GlobalLogin_loggedInDropdown\"]/div/div/div/div[2]/div[2]/div[1]/a");
		PO.add("OrderHistoryTitle::xpath=//*[@id=\"OrderListPageHeading\"]/h1");
		}

	//Create Plan page
	public static void CircuitCity_Logout(){
		PO.add("Logout::id=Header_GlobalLogin_loggedInDropdown_SignOut");
		PO.add("WelcomeButton::xpath=.//*[@id='content']/div[1]/header/div[4]/div/div/div[1]/nav/ul/li/a");
		PO.add("LoginButton::xpath=.//*[@id='wpthemeLogin']/a");
		}

	//Load PageObjects 
	public static void loadallPageObjects(){
CircuitCity_Login();
CircuitCity_LandingPage();
CircuitCity_Search();
CircuitCity_ProductAddtoCart();
CircuitCity_MyAccount();
CircuitCity_Logout();
		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
CircuitCity_Login();
CircuitCity_LandingPage();
CircuitCity_Search();
CircuitCity_ProductAddtoCart();
CircuitCity_MyAccount();
CircuitCity_Logout();
		System.out.println("Object Load to HM Successfull!"+HashMapContainer.getPO("Confirm_Cancel_Yes_Btn"));
	}
}