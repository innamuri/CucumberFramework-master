package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.pageObjects.GetPageObject;

public class Aramark_CIP3_T{

	static GetPageObject PO = new GetPageObject();

	//Aramark Login Page 
	public static void Aramark_Login(){
		PO.add("url::https://qa-portal.ecps.ca/");
		PO.add("MemberLogin::xpath=//*[@id=\"topNavLinksContainer\"]/nav/div[1]/ul/li[2]/a");
		PO.add("LanguageMenu::id=btn_submit_Popup");
		PO.add("CPS_Username::id=usernameInput");
		PO.add("CPS_Password::id=passwordInput");
		PO.add("LogInBtn::name=btn_submit");
	}

	//Aramark Login Landing page
	public static void Aramark_LandingPage(){
		PO.add("UserMenu::xpath=//*[@id='sizingB']/ul/li[1]/a");
		PO.add("userTxtlocation::classname=dist-username");
		PO.add("SubmitCompany&Language::xpath=//input[@value='Submit']");
		PO.add("logoutLink::id=logoutlink");
		PO.add("CIP3.0_Tab::xpath=//a[contains(text(),\"CIP 3.0\")]");
		PO.add("Close_UserMenu::classname=close");
	}

	//CIP3.0 tab
	public static void Aramark_CIP(){
		PO.add("Plan_Btn::name=plan");
		PO.add("Enrollment_Btn::name=enrollment");
		PO.add("Customers_Btn::xpath=//a[contains(text(),\"Customers\")]");
		PO.add("Home_link::linkText=Home");
		PO.add("HomeBanner::classname=bx-viewport");
	}

	//Plan page
	public static void Aramark_Plan(){
		PO.add("PlanListingCrumb::linkText=Plan Listing");
		PO.add("CreatePlan_Btn::xpath=//button[contains(text(),\"Create Plan\")]");
		PO.add("FilterBySection::xpath=//span[contains(text(),\"Filter by\")]");
		PO.add("PlanListingHeader::xpath=//span[contains(text(),\"Plan Listing\")]");
		PO.add("PlanListing_Table::id=listingGrid");
		PO.add("PlanListing_TableBody::xpath=//*[@id=\"listingGrid\"]/tbody[1]");
		PO.add("RowsPerGrid_TxtField::name=number");
		PO.add("RowsPerGrid_Btn::id=rpp_btn");
		PO.add("ExpandAll_Btn::path=//label[@title='Expand All']");
		PO.add("CollapseAll_Btn::xpath=//label[@title='Collapse All']");
		PO.add("KeywordSearch_Tab::xpath=//span[contains(text(),'Keyword Search')]");
		PO.add("KeywordSearch_TxtField::xpath=//input[@ng-model='planName.strName']");
		PO.add("PlanStatus_Tab::xpath=//span[contains(text(),'Plan Status')]");
		PO.add("Published_CheckBox::xpath=(//label[contains(.,' Published ')])/..//input[@ng-model='filterPlanStatus[statusP.name]']");
		PO.add("Published_Label::xpath=//label[@for='checkbox2']");
		PO.add("Draft_CheckBox::xpath=(//label[contains(.,' Draft ')])/..//input[@ng-model='filterPlanStatus[statusP.name]']");
		PO.add("Draft_Label::xpath=(//label[@for='checkbox2'])[2]");
		PO.add("Closed_CheckBox::xpath=(//label[contains(.,' Closed ')])/..//input[@ng-model='filterPlanStatus[statusP.name]']");
		PO.add("Closed_Label::xpath=(//label[@for='checkbox2'])[3]");
		PO.add("PendingClose_CheckBox::xpath=(//label[contains(.,' Pending Close ')])/..//input[@ng-model='filterPlanStatus[statusP.name]']");
		PO.add("PendingClose_Label::xpath=(//label[@for='checkbox2'])[4]");
		PO.add("EnrollmentWindow_Tab::xpath=//span[contains(text(),'Enrollment Window')]");
		PO.add("Open_CheckBox::xpath=(//input[@ng-model='filterEWindowStatus[eWindow.name]'])[1]");
		PO.add("Open_Label::xpath=(//label[@for='checkbox2'])[5]");
		PO.add("Close_CheckBox::xpath=(//input[@ng-model='filterEWindowStatus[eWindow.name]'])[2]");
		PO.add("Close_Label::xpath=(//label[@for='checkbox2'])[6]");
		PO.add("firstRow_PlanListingTable::xpath=//*[@id='listingGrid']/tbody[1]/tr[1]/td[1]");
		PO.add("firstItem_PlanListingTable::xpath=//*[@id='listingGrid']/tbody[1]/tr/td[1]/a/span/span");
		PO.add("TableSearchResult::xpath=//*[@id='listingGrid']/tbody[2]/tr/td");
		PO.add("Name_PlanListingTable::xpath=//th[contains(.,'Name')]");
		PO.add("Status_PlanListingTable::xpath=//th[contains(.,'Status')]");
		PO.add("Enrollment_PlanListingTable::xpath=//th[contains(.,'Enrollment')]");
		PO.add("Description_PlanListingTable::xpath=//th[contains(.,'Description')]");
		PO.add("Action_PlanListingTable::xpath=//th[contains(.,'Action')]");
		PO.add("Name_PL_AscendSort::xpath=//th[@class='name-col ng-binding sorting_asc']");
		PO.add("Name_PL_DescendSort::xpath=//th[@class='name-col ng-binding sorting_desc']");
		PO.add("Status_PL_DescendSort::xpath=//th[@class='status-col ng-binding sorting_desc']");
		PO.add("Status_PL_AscendSort::xpath=//th[@class='status-col ng-binding sorting_asc']");
		PO.add("Enrollment_PL_DescendSort::xpath=//th[@class='enrollment-col ng-binding sorting_desc']");
		PO.add("Enrollment_PL_AscendSort::xpath=//th[@class='enrollment-col ng-binding sorting_asc']");
		PO.add("Description_PL_DescendSort::xpath=//th[@class='description-col ng-binding sorting_desc']");
		PO.add("Description_PL_AscendSort::xpath=//th[@class='description-col ng-binding sorting_asc']");
		PO.add("PlanDetail_Header::xpath=//*[@id='planDetailTotalGhum']/div[2]/h2");  	 	
		PO.add("PL_Edit_Plan::xpath=//span[@title='Edit']");
		PO.add("PL_Copy_Plan::xpath=//span[@title='Copy']");
		PO.add("PL_Delete_Plan::xpath=//span[@title='Delete']");
		PO.add("Delete_Confirmation_Header::xpath=//h4[@class='modal-title']");
		PO.add("Delete_Yes_Btn::xpath=//button[contains(.,'Yes')]");
		PO.add("Delete_No_Btn::xpath=//button[contains(.,'No')]");
		PO.add("Pagination_Next::xpath=//*[@id='listingGrid']/tfoot/tr/th/div[3]/ul/li[5]/a");
		PO.add("Pagination_Previous::xpath=//*[@id='listingGrid']/tfoot/tr/th/div[3]/ul/li[1]/a");
		PO.add("Copyright_Text::xpath=//*[@id='footer']/div[1]");
		PO.add("TermsandConditions_Header::xpath=(//h1[@class='blue'])[1]");
		PO.add("PrivacyPolicy_Header::xpath=(//h1[@class='blue'])[2]");
	}

	//Create Plan page
	public static void Aramark_CreatePlanPage(){
		PO.add("CreatePlanHeader::xpath=//span[@ng-bind=\"PlanLables.createIncentivePlan\"]");
		PO.add("Cancel_CreatePlan::xpath=//button[@ng-bind=\"PlanLables.btnCancel\"]");
		PO.add("Confirm_Cancel_No_Btn::xpath=//button[@ng-bind=\"PlanLables.hNo\"]");
		PO.add("Confirm_Cancel_Yes_Btn::xpath=//button[@ng-bind=\"PlanLables.hYes\"]");
	}

	//Create Plan page
	public static void Aramark_CreatePlan_Step2(){
		PO.add("Home_BreadcrumbLink::xpath=(//a[contains(.,'Home')])");
		PO.add("PlanListing_BreadcrumbLink::xpath=//a[contains(.,'Plan Listing')]");
		PO.add("CreatePlan_BreadcrumbLink::xpath=//a[contains(.,'Create Incentive Plan')]");
		PO.add("CreatePlanHeader::xpath=//span[@ng-bind=\"PlanLables.createIncentivePlan\"]");
		PO.add("CreatePlan_Step::xpath=//span[@ng-bind='PlanLables.lblOne']");
		PO.add("PlanParameter_Step::xpath=//span[@ng-bind='PlanLables.hPlanParameters']");
		PO.add("ManageRate_Step::xpath=//span[@ng-bind='PlanLables.hManageRateModels']");
		PO.add("ManageSupplier_Step::xpath=//span[@ng-bind='PlanLables.hManageSupplierGroups']");
		PO.add("Incentive_Step::xpath=//span[@ng-bind='PlanLables.hIncentiveProgram']");
		PO.add("PlanName_Label::xpath=(//span[@ng-bind='PlanLables.hPlanName']/..//span[@ng-bind='hPlanName'])");
		PO.add("Status_Label::xpath=(//span[@ng-bind='PlanLables.hStatus']/..//span[@ng-bind='hPlanStatus'])");
		PO.add("StartDate_Label::xpath=(//span[@ng-bind='PlanLables.hStartDate']/..//span[@ng-bind='hPlanStartDate'])");
		PO.add("LastCalcDate_Label::xpath=(//span[@ng-bind='PlanLables.lastCalcDate']/..//span[@ng-bind='hLastCalcDate'])");
		PO.add("PlanParamenterSection::xpath=//h3[@ng-bind='plan.pageLabels.planParameters']");
		PO.add("EnrollmentTemplateSection::xpath=//h3[@ng-bind='plan.pageLabels.enrollmentTemplate']");
		PO.add("PlanName::name=strName");
		PO.add("ReportTitle_English::name=strReportTitleEN");
		PO.add("ReportTitle_French::name=strReportTitleFR");
		PO.add("PlanDescription::name=strDescription");
		PO.add("PlanStartDate::xpath=//span[@class='glyphicon glyphicon-calendar']");
		PO.add("PlanStart_Year::xpath=//*[@class='btn btn-calc-year btn-sm uib-title']");
		PO.add("PStartDate_YearInc::xpath=//i[@class='glyphicon glyphicon-chevron-right']");
		PO.add("PStartDate_YeadDec::xpath=//i[@class='glyphicon glyphicon-chevron-left']");
		PO.add("PStartDate_Month::xpath=//span[contains(text(),'"+HashMapContainer.get("PLStart_Month")+"')]");
		PO.add("PTermDuration_12Months::xpath=(//input[@name='ptermDuration.name'])[1]");
		PO.add("PTermDuration_6Months::xpath=(//input[@name='ptermDuration.name'])[2]");
		PO.add("PTermDuration_3Months::xpath=(//input[@name='ptermDuration.name'])[3]");
		PO.add("PaymentPerTermMonths::name=intPaymentTermID");
		PO.add("RenewalIndicator_Automatic::xpath=(//input[@name='pRenew.name'])[1]");
		PO.add("RenewalIndicator_Manual::xpath=(//input[@name='pRenew.name'])[2]");
		PO.add("RenewalIndicator_Never::xpath=(//input[@name='pRenew.name'])[3]");
		PO.add("AlignEnrollmentTerms_Yes::xpath=//label[contains(.,'Yes')])/..//input[@ng-model='plan.planBean.blnCalendarBased']");
		PO.add("AlighEnrollmentTerms_No::xpath=//label[contains(.,'No')])/..//input[@ng-model='plan.planBean.blnCalendarBased']");
		PO.add("ProratePaymentWhenTerminate_Yes::xpath=(//label[contains(.,'Yes')])/..//input[@ng-model='plan.planBean.blnProratePayment']");
		PO.add("ProratePaymentWhenTerminate_No::xpath=(//label[contains(.,'No')])/..//input[@ng-model='plan.planBean.blnProratePayment']");
		PO.add("SetMinimumPaymentThreshold_Yes::xpath=(//label[contains(.,'Yes')])/..//input[@ng-model='plan.planBean.blnMinThreshold']");
		PO.add("SetMinimumPaymentThreshold_No::xpath=(//label[contains(.,'No')])/..//input[@ng-model='plan.planBean.blnMinThreshold']");
		PO.add("MinimumPayment::name=intMinPayment");
		PO.add("CreatePlan_Next::xpath=//button[@ng-bind='PlanLables.btnNext']");
		PO.add("CreatePlan_Previous::xpath=//button[@ng-bind='PlanLables.btnPrevious']");
		PO.add("Save_CreatePlan::xpath=//button[@ng-bind='PlanLables.btnSave']");
		PO.add("Cancel_CreatePlan::xpath=//button[@ng-bind=\"PlanLables.btnCancel\"]");
		PO.add("Confirm_Cancel_No_Btn::xpath=//button[@ng-bind=\"PlanLables.hNo\"]");
		PO.add("Confirm_Cancel_Yes_Btn::xpath=//button[@ng-bind=\"PlanLables.hYes\"]");
	}

	//Load PageObjects 
	public static void loadallPageObjects(){
		Aramark_Login();
		Aramark_LandingPage();
		Aramark_CIP();
		Aramark_Plan();
		Aramark_CreatePlanPage();
		Aramark_CreatePlan_Step2();
		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
		Aramark_Login();
		Aramark_LandingPage();
		Aramark_CIP();
		Aramark_Plan();
		Aramark_CreatePlanPage();
		System.out.println("Object Load to HM Successfull!"+HashMapContainer.getPO("Confirm_Cancel_Yes_Btn"));
	}
}
