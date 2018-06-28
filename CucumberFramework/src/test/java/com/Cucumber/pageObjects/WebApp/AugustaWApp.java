package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.pageObjects.GetPageObject;

public class AugustaWApp{

	static GetPageObject PO = new GetPageObject();

	//Aramark Login Page 
	public static void Augusta_HomePage(){
		PO.add("url::http://52.88.75.221/webapp/wcs/stores/servlet/en/asg");
		PO.add("MainSearchField::id=SimpleSearchForm_SearchTerm");
		PO.add("SignInRegisterLink::xpath=//a[@aria-label=\"Sign In / Register\")");
		PO.add("EmailIDField::name=logonId");
		PO.add("PasswordField::name=logonPassword");
		PO.add("SignInBtn::xpath=//span[contains(text(),\"Sign In\")]");
		PO.add("ValidateLoginSuccess::xpath=//*[@id=\"Header_GlobalLogin_signOutQuickLinkUser\"]");
	}
	
	
	//Load PageObjects 
	public static void loadallPageObjects(){
		Augusta_HomePage();
		System.out.println("Object Load to HM Successfull!");
	}

	/*public static void main(String[] args) {

		System.out.println("Object Load to HM Successfull!"+HashMapContainer.getPO("Confirm_Cancel_Yes_Btn"));
	}*/
}
