package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.pageObjects.GetPageObject;

public class IHSMarkit_EMAP{

	static GetPageObject PO = new GetPageObject();

	//WinSupply Login Page 
	public static void WinSupply_Login(){
		PO.add("url::http://winzonedev1.winwholesale.com:10039/wps/myportal/winzone/home/");
		PO.add("UserName::id=userID");
		PO.add("Password::id=password");
		PO.add("LogInBtn::id=login.button.login");
		PO.add("InvalidCredentials_Header::xpath=//*[@id=\"layoutContainers\"]/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/span");
		
		}

	//WinSupply Landing page
	public static void WinSupply_LandingPage(){
		PO.add("Home::xpath=//img[@alt='Home']");
		PO.add("MyBookmarks::xpath=//*[@id=\"layoutContainers\"]/div[2]/div[2]/div[2]/section/div[2]/div/div[2]");
		PO.add("ReadMore::xpath=.//*[@id='layoutContainers']/div[2]/div[1]/div[1]/div/div/section/div[2]/div/div[2]/div/div[1]/a");
		PO.add("Breadcrumb::xpath=.//*[@id='wzCrumbList']/li[2]");
		PO.add("PageHeader::xpath=.//*[@id='layoutContainers']/div[2]/div[1]/div/section/div[2]/div[2]/div/h2/div/div");
		PO.add("MyCompany::xpath=.//*[@id='Z6_4A461O01I0CI50IJTALULQ00E0']/a/span[1]");
		PO.add("CompanyNameChange::xpath=.//*[@id='Z6_8PG21CC0JOMMB0AUN7ARFN00O6']/a/span");
		PO.add("CompanyReports::xpath=.//*[@id='Z6_4A461O01I0CI50IJTALULQ0093']/a/span[1]");
		PO.add("CompanyClosingCheckList::xpath=.//*[@id='Z6_4A461O01I03A70I76VKMN020A4']/a/span");
		PO.add("CompanyClosingCheckList::xpath=.//*[@id='Z6_4A461O01I03A70I76VKMN020A4']/a/span");
		PO.add("Marketing::xpath=.//*[@id='Z6_4A461O01I0CI50IJTALULQ08O1']/a");
		PO.add("MarketingLeadGeneration::xpath=.//*[@id='Z6_8PG21CC0J84F80AOH9S84N20G2']/a/span");
		PO.add("Services::xpath=.//*[@id='Z6_4A461O01I0CI50IJTALULQ08I0']/a/span[1]");
		PO.add("InventorySolutions::xpath=.//*[@id='Z6_8PG21CC0JG4D30ANQSSNGF10C6']/a/span");
		PO.add("Support::xpath=.//*[@id='Z6_4A461O01I03A70I76VKMN028S4']/a/span[1]");
		PO.add("WinSupport::xpath=.//*[@id='Z6_8PG21CC0JGELC0IFOJL8G92077']/a/span");
		}

	//WinSupply Search
	public static void WinSupply_Search(){
		PO.add("Search::id=wpthemeSearchBoxInput");
		PO.add("SearchButton::xpath=//button[@alt='Search']");
		PO.add("SearchWarning::classname=wpsFieldWarningText");
		PO.add("CloseSearch::xpath=//button[@name='closeSearchButton']");
		}

	//Footer page
	public static void WinSupply_Footer(){
		PO.add("DirectDeposit::xpath=/html/body/div[1]/footer/div[1]/div[2]/div[1]/ul/li[1]/ul/li[2]/a/span");
		PO.add("Logo::xpath=.//*[@id='dijit__WidgetBase_0']/img");
		PO.add("MyCustomers::xpath=/html/body/div[1]/footer/div[1]/div[2]/div[1]/ul/li[6]/a/span");
		}

	//Create Plan page
	public static void WinSupply_Logout(){
		PO.add("Logout::id=logoutlink");
		PO.add("WelcomeButton::xpath=.//*[@id='content']/div[1]/header/div[4]/div/div/div[1]/nav/ul/li/a");
		PO.add("LoginButton::xpath=.//*[@id='wpthemeLogin']/a");
		}

	//Load PageObjects 
	public static void loadallPageObjects(){
WinSupply_Login();
WinSupply_LandingPage();
WinSupply_Search();
WinSupply_Footer();
WinSupply_Logout();
		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
WinSupply_Login();
WinSupply_LandingPage();
WinSupply_Search();
WinSupply_Footer();
WinSupply_Logout();
		System.out.println("Object Load to HM Successfull!"+HashMapContainer.getPO("Confirm_Cancel_Yes_Btn"));
	}
}
