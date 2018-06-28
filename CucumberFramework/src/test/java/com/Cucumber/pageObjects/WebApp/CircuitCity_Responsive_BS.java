package com.Cucumber.pageObjects.WebApp;


import com.Cucumber.pageObjects.GetPageObject;

public class CircuitCity_Responsive_BS{

	static GetPageObject PO = new GetPageObject();

	//CC Login Page 
	public static void CC_Login(){
		PO.add("url::https://qalive.circuitcity.com/shop");
		//PO.add("url::https://cctdev.royalcyber.org/shop");
		PO.add("SignIn::id=Header_GlobalLogin_signInQuickLink");
		PO.add("Username::name=logonId");
		PO.add("ProdItem_1::xpath=(//div[@class='product-image'])[1]");
		PO.add("ProdItem_1_onHover::name=learn-more");
	//	PO.add("Username::id=Header_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1");
		PO.add("Password::id=Header_GlobalLogin_WC_AccountDisplay_FormInput_logonPassword_In_Logon_1");
		PO.add("LogInBtn::id=Header_GlobalLogin_WC_AccountDisplay_links_2");
		PO.add("MyAccountBtn::id=sign");
		PO.add("RegisterBtn::id=Header_GlobalLogin_WC_AccountDisplay_links_3");
	}

	//CC Login Page 
		public static void CC_Nav(){
			PO.add("Menu_btn::id=departmentsButton");
			PO.add("Prod_cat::id=allDepartmentsButton");
			PO.add("Cams_cat::id=departmentLink_25503_alt");
			PO.add("Smart_cat::id=departmentLink_28001_alt");
			PO.add("Prodid1img::id=CatalogEntryProdImg_52290");
		//	PO.add("Prodid1name::id=WC_CatalogEntryDBThumbnailDisplayJSPF_52290_link_9b");
			PO.add("Prodid1name::xpath=//*[@id=\"WC_CatalogEntryDBThumbnailDisplayJSPF_52290_link_9b\"]");
			PO.add("AddtoCart::xpath=//*[@id=\"productPageAdd2Cart\"]");
			PO.add("Search::id=SimpleSearchForm_SearchTerm");
			PO.add("SearchIcn::classname=submitButton");
			PO.add("Prodid2::id=CatalogEntryProdImg_61428");
			PO.add("CartIcn::id=widget_minishopcart");
			PO.add("CartBtn::id=GotoCartButton1");
		}

	//Load PageObjects 
	public static void loadallPageObjects(){
		CC_Login();
		CC_Nav();

		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
		CC_Login();
		CC_Nav();

		System.out.println("Object Load to HM Successfull!");
	}
}
