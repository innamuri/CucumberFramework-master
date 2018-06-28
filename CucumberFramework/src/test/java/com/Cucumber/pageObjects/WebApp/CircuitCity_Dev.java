package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.pageObjects.GetPageObject;

public class CircuitCity_Dev{

	static GetPageObject PO = new GetPageObject();

	//Aramark Login Page 
	public static void CircuitCity_Home1(){
		PO.add("url::https://172.125.38.144/webapp/wcs/stores/servlet/en/circuitcityb2c/");
		PO.add("Products_MainMenu::xpath=//a/..//span[contains(text(),'Products')]");
		PO.add("Deals_MainMenu::xpath=//a/..//span[contains(text(),'Deals')]");
		PO.add("SmartRooms_MainMenu::xpath=//a/..//span[contains(text(),'Smart Rooms')]");
		PO.add("Service_MainMenu::xpath=//a/..//span[contains(text(),'Service')]");
		PO.add("Brands_MainMenu::xpath=//a/..//span[contains(text(),'Brands')]");
		PO.add("TheCity_MainMenu::xpath=//a/..//span[contains(text(),'The City')]");
		
		//Products Menu - Products By Category
		PO.add("Accessories::xpath=//a[contains(text(),\"Accessories\")]");
		PO.add("ServicesTraining::xpath=//a[contains(text(),\"Services Training\")]");
		PO.add("Computers&Tablets::xpath=//a[contains(text(),\"Computers and Tablets\")]");
		PO.add("OfficeEquipments&Supplies::xpath=//a[contains(text(),\"Office Equipment & Supplies\")]");
		PO.add("PowerEquipment::xpath=//a[contains(text(),\"Power Equipment\")]");
		PO.add("InformationTechnology::xpath=//a[contains(text(),\"Information Technology\")]");
		PO.add("SmartRooms::xpath=//a[contains(text(),\"Smart Rooms\")]");
		PO.add("ConsumerElectronics::xpath=//a[contains(text(),\"Consumer Electronics\")]");
		PO.add("SecurityDevices::xpath=//a[contains(text(),\"Security Devices\")]");
		
		//Information Technology
		PO.add("CategoryHeading::xpath=//h2");
		PO.add("FirstProduct::xpath=(//div[@class=\"product_name\"]/..//a[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_10009_link_9b'])[1]");
		PO.add("BuyNowBtn::xpath=(//a[@title=\"BUY NOW\"])[1]");
		
		//Success Add to Cart PopUp
		PO.add("SuccessAddCartMsg::xpath=//h3[@id='cartDropdownMessage']");
		PO.add("ProductValidate::xpath=//div[@class=\"product_name\"]/..//a");
		PO.add("Close_AddToCardPopUp::xpath=//a[@id='MiniShopCartCloseButton_2']");
		
		//CC Global Search field
		PO.add("SearchGlobal::id=SimpleSearchForm_SearchTerm");
		PO.add("SearchBtn::className=miniSearch_button_header");
		PO.add("SearchMessage::xpath=//h1[@role='heading']");
		PO.add("EstimatedDelivery::xpath=//*[@id='WC_ShopCartDisplay_div_5']/div[3]/div[1]/div[3]/div[2]/div[4]/div");
		PO.add("SecondProduct::xpath=(//div[@class=\"product_name\"]/..//a[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_11509_link_9b'])[1]");
		PO.add("GotoCart::xpath=//span[contains(text(),'Go to Cart')]");
		PO.add("CartNavSuccess::xpath=//h1");
		PO.add("CartValue::xpath=//h1/..//span[@class='red']");
		PO.add("ReadyToCheckOut::xpath=//a[contains(text(),' READY TO CHECKOUT ')]");
		PO.add("CheckOutAsGuest::xpath=//div[contains(text(),'CHECKOUT AS GUEST')]");
		
		PO.add("LoginIdField::id=WC_CheckoutLogon_FormInput_logonId");
		PO.add("PasswordField::id=WC_CheckoutLogon_FormInput_logonPassword");
		PO.add("SignInBtn::id=guestShopperLogon");
		PO.add("LandingHeader::xpath=//*[@id='shippingActive']/h2");
		
	}

	//Load PageObjects 
	public static void loadallPageObjects(){
		CircuitCity_Home1();
		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
		//System.out.println("Object Load to HM Successfull!"+HashMapContainer.getPO("Confirm_Cancel_Yes_Btn"));
	}
}
