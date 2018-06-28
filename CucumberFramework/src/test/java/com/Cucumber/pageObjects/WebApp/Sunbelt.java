package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.pageObjects.GetPageObject;

public class Sunbelt {
	static GetPageObject PO = new GetPageObject();

	public static void Sunbelt_Login() {
		PO.add("url::http://newpdp.rcdnb.com/company/logout");
		PO.add("UserName_Sunbelt::xpath=//input[@id='login-username']");
		PO.add("Password::xpath=//input[@id='login-password']");
		PO.add("Login_Button::xpath=//button[@class='btn btn-block']");
		PO.add("Build_a_list_tab::xpath=(//a[contains (text(),'Build a List')])[4]");
	}

	public static void Sunbelt_BuildAList() {
		PO.add("Industry_Name::xpath=(//i[@class='jstree-icon jstree-checkbox'])[3]");
		PO.add("Results_Companies::xpath=//span[@class='result-count']");

		PO.add("Linkage::xpath=//*[@id=\"buildlisttable\"]/tbody/tr[1]/td[2]/a");
		PO.add("Preview_Results::xpath=(//button[@id='btn_submit'])[1]");
		PO.add("Checkbox_CompanyName::xpath=(//input[@type='checkbox'])[3]");

		PO.add("Download_Results::cssselector=a.icon-border.fa.fa-download::before");
		PO.add("Download_Selected::xpath=//a[@id='selectedexport']");
		PO.add("DownloadAll::xpath=//a[@id='fullexport']");
		PO.add("CompanyName::xpath=//*[@id=\"buildlisttable\"]/tbody/tr[1]/td[3]");
	}

	public static void Sunbelt_Overview() {
		PO.add("D-U-N-S_Number::xpath=(//div[@class='col-md-6 col-xs-6'])[1]");

		PO.add("Download::xpath=//i[@class='fa fa-download']");
		PO.add("Print::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_History::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistory_Content::xpath=(//div[@class='panel-body'])[1]");
		PO.add("Hierarchy::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("Hierarchy_Content::xpath=(//div[@class='panel-body'])[2]");

		/*
		 * PO.add("Parent::"); PO.add("DomesticParent::"); PO.add("UltimateParent::");
		 */

		PO.add("FamilyTree::xpath=//a[@id='tab_button_familytree']");
		PO.add("Contacts::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Conatcts::xpath=(//i[@class='fa fa fa-print'])[2]");

	}

	public static void Sunbelt_FamilyTree() {
		PO.add("FamilyTree::xpath=//a[@id='tab_button_familytree']");
		PO.add("Alternative_Tab::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree::xpath=//i[@class='icon-download-alt']");

	}

	public static void Sunbelt_Contacts() {
		PO.add("Contacts_tab::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Button::xpath=(//i[@class='fa fa fa-print'])[2]");
	}

	public static void Sunbelt_CompanySearch_DunsFile() {
		PO.add("CompanySearch_Button::xpath=//a[contains(text(),' Company Search')]");
		PO.add("CompanyName_CompanySearch::xpath=//input[@id='company_name']");
		PO.add("UploadFile_Button::xpath=//input[@class='upload']");
		PO.add("Search_Button_CompanySearch::xpath=(//button[@class='btn btn-custom'])[2]");
		PO.add("Checkbox_CompanySearch::xpath=(//input[@type='checkbox'])[9]");
		PO.add("Download_CompanySearch::xpath=//a[@class='icon-border fa fa-download']");
		PO.add("FilterOptions_CompanySearch::xpath=//a[@class='icon-border fa fa-filter']");
		PO.add("HideBranches_Filter::xpath=(//input[@type='checkbox'])[1]");
		PO.add("DomesticUltimateSite_Filter::xpath=(//input[@type='checkbox'])[2]");
		PO.add("HeadquartersOnly_Filter::xpath=(//input[@type='checkbox'])[3]");
		PO.add("Refresh_Button::xpath=//button[@id='refresh']");
		PO.add("Linkage_CompanySearch::xpath=//i[@class='fa fa-sitemap']");
		PO.add("CompanyName_CompanySearch_DunsFile::xpath=//table[@id='companysearchtable']/tbody/tr/td[3]");
		//// table[@id='buildlisttable']/tbody/tr/td[3]

		PO.add("Download_CompanySearch_DunsFile::xpath=//i[@class='fa fa-download']");
		PO.add("Print_CompanySearch_DunsFile::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_History_CompanySearch_DunsFile::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistory_Content_CompanySearch_DunsFile::xpath=(//div[@class='panel-body'])[1]");
		PO.add("Hierarchy_CompanySearch_DunsFile::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("Hierarchy_Content_CompanySearch_DunsFile::xpath=(//div[@class='panel-body'])[2]");
		PO.add("FamilyTree_CompanySearch_DunsFile::xpath=//a[@id='tab_button_familytree']");

		PO.add("Alternative_Tab::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree::xpath=//i[@class='icon-download-alt']");
		PO.add("Contacts_tab_CompanySearch_DunsFile::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Button_CompanySearch_DunsFile::xpath=(//i[@class='fa fa fa-print'])[2]");
		PO.add("BuildAList_tab::xpath=//a[contains(text(),' Build a List')]");

	}

	public void Sunbelt_IndustryAndCompany() {
		PO.add("Industry_Name_withCompanyName::xpath=(//i[@class='jstree-icon jstree-checkbox'])[4]");
		PO.add("Company::xpath=//a[@aria-controls='collapseCompany']");
		PO.add("Company_GreaterThanValue::xpath=//input[@id='employee_greater']");
		PO.add("Company_LessThanValue::xpath=//input[@id='employee_lesser']");
		PO.add("Preview_CompanyResults::xpath=(//button[@id='btn_submit'])[1]");

		PO.add("Checkbox_CompanyName_IndustryAndCompany::xpath=(//input[@type='checkbox'])[3]");
		PO.add("Download_Results_IndustryAndCompany::xpath=//a[@class='icon-border fa fa-download']");
		PO.add("Download_Selected_IndustryAndCompany::xpath=//a[@id='selectedexport']");
		PO.add("DownloadAll_IndustryAndCompany::xpath=//a[@id='fullexport']");
		PO.add("CompanyName_IndustryAndCompany::xpath=//*[@id=\"buildlisttable\"]/tbody/tr[1]/td[3]");

		PO.add("D-U-N-S_Number_IndustryAndCompany::xpath=(//div[@class='col-md-6 col-xs-6'])[1]");
		PO.add("Download_IndustryAndCompany::xpath=//i[@class='fa fa-download']");
		PO.add("Print_IndustryAndCompany::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_History_IndustryAndCompany::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistory_Content_IndustryAndCompany::xpath=(//div[@class='panel-body'])[1]");
		PO.add("Hierarchy_IndustryAndCompany::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("Hierarchy_Content_IndustryAndCompany::xpath=(//div[@class='panel-body'])[2]");

		/*
		 * PO.add("Parent_IndustryAndCompany::");
		 * PO.add("DomesticParent_IndustryAndCompany::");
		 * PO.add("UltimateParent_IndustryAndCompany::");
		 */

		PO.add("FamilyTree_IndustryAndCompany::xpath=//a[@id='tab_button_familytree']");
		PO.add("Alternative_Tab_IndustryAndCompany::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab_IndustryAndCompany::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree_IndustryAndCompany::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree_IndustryAndCompany::xpath=//i[@class='icon-download-alt']");
		PO.add("Contacts_IndustryAndCompany::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Conatcts_IndustryAndCompany::xpath=(//i[@class='fa fa fa-print'])[2]");

	}

	public void Sunbelt_IndustryAndCreditPercentile() {
		PO.add("BuildAList_tab::xpath=//a[contains(text(),' Build a List')]");
		PO.add("IndustryName_CreditPercentile::xpath=(//i[@class='jstree-icon jstree-checkbox'])[5]");
		PO.add("CreditPercentile::xpath=//a[@aria-controls='collapseCreditPercentile']");
		PO.add("CreditPercentile_GreaterThanValue::xpath=//input[@id='credit_greater']");
		PO.add("CreditPercentile_LessThanValue::xpath=//input[@id='credit_lesser']");
		PO.add("Preview_CreditPercentile::xpath=(//button[@id='btn_submit'])[1]");

		PO.add("Checkbox_CompanyName_IndustryAndCreditPercentile::xpath=(//input[@type='checkbox'])[6]");
		PO.add("Download_Results_IndustryAndCreditPercentile::xpath=//a[@class='icon-border fa fa-download']");
		PO.add("Download_Selected_IndustryAndCreditPercentile::xpath=//a[@id='selectedexport']");
		PO.add("DownloadAll_IndustryAndCreditPercentile::xpath=//a[@id='fullexport']");
		PO.add("CompanyName_IndustryAndCreditPercentile::xpath=//*[@id=\"buildlisttable\"]/tbody/tr[1]/td[3]");

		PO.add("D-U-N-S_Number_IndustryAndCreditPercentile::xpath=(//div[@class='col-md-6 col-xs-6'])[1]");
		PO.add("Download_IndustryAndCreditPercentile::xpath=//i[@class='fa fa-download']");
		PO.add("Print_IndustryAndCreditPercentile::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_History_IndustryAndCreditPercentile::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistory_Content_IndustryAndCreditPercentile::xpath=(//div[@class='panel-body'])[1]");
		PO.add("Hierarchy_IndustryAndCreditPercentile::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("Hierarchy_Content_IndustryAndCreditPercentile::xpath=(//div[@class='panel-body'])[2]");

		/*
		 * PO.add("Parent_IndustryAndCompany::");
		 * PO.add("DomesticParent_IndustryAndCompany::");
		 * PO.add("UltimateParent_IndustryAndCompany::");
		 */

		PO.add("FamilyTree_IndustryAndCreditPercentile::xpath=//a[@id='tab_button_familytree']");
		PO.add("Alternative_Tab_IndustryAndCreditPercentile::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab_IndustryAndCreditPercentile::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree_IndustryAndCreditPercentile::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree_IndustryAndCreditPercentile::xpath=//i[@class='icon-download-alt']");
		PO.add("Contacts_IndustryAndCreditPercentile::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Conatcts_IndustryAndCreditPercentile::xpath=(//i[@class='fa fa fa-print'])[2]");

	}

	public void Sunbelt_IndustryLocationType() {
		PO.add("BuildAList_tab::xpath=//a[contains(text(),' Build a List')]");
		PO.add("IndustryNameForLocationType::xpath=(//i[@class='jstree-icon jstree-checkbox'])[5]");
		PO.add("LocationType::xpath=//a[@aria-controls='collapseLocationType']");
		PO.add("LocationType_Branch::xpath=(//input[@class='loc_type'])[3]");
		PO.add("Preview_IndustryLocationType::xpath=(//button[@id='btn_submit'])[1]");

		PO.add("Checkbox_IndustryLocationType::xpath=(//input[@type='checkbox'])[3]");
		PO.add("Linkage_IndustryLocationType::xpath=(//i[@class='fa fa-sitemap'])[3]");
		PO.add("Overview_tab::xpath=//a[contains(text(),'Overview')]");
		PO.add("Download_Results_IndustryLocationType::xpath=//a[@class='icon-border fa fa-download']");
		PO.add("Download_Selected_IndustryLocationType::xpath=//a[@id='selectedexport']");
		PO.add("DownloadAll_IndustryLocationType::xpath=//a[@id='fullexport']");
		PO.add("CompanyName_IndustryLocationType::xpath=//*[@id='buildlisttable']/tbody/tr[1]/td[3]");

		PO.add("D-U-N-S_Number_IndustryLocationType::xpath=(//div[@class='col-md-6 col-xs-6'])[1]");
		PO.add("Download_IndustryLocationType::xpath=//i[@class='fa fa-download']");
		PO.add("Print_IndustryLocationType::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_History_IndustryLocationType::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistory_Content_IndustryLocationType::xpath=(//div[@class='panel-body'])[1]");
		PO.add("Hierarchy_IndustryLocationType::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("Hierarchy_Content_IndustryLocationType::xpath=(//div[@class='panel-body'])[2]");

		/*
		 * PO.add("Parent_IndustryAndCompany::");
		 * PO.add("DomesticParent_IndustryAndCompany::");
		 * PO.add("UltimateParent_IndustryAndCompany::");
		 */

		PO.add("FamilyTree_IndustryLocationType::xpath=//a[@id='tab_button_familytree']");
		PO.add("Alternative_Tab_IndustryLocationType::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab_IndustryLocationType::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree_IndustryLocationType::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree_IndustryLocationType::xpath=//i[@class='icon-download-alt']");
		PO.add("Contacts_IndustryLocationType::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Conatcts_IndustryLocationType::xpath=(//i[@class='fa fa fa-print'])[2]");
	}

	public void Sunbelt_IndustryAndGeography() {
		PO.add("BuildAList_tab::xpath=//a[contains(text(),' Build a List')]");
		PO.add("IndustryNameForGeography::xpath=(//i[@class='jstree-icon jstree-checkbox'])[5]");
		PO.add("Geography::xpath=//a[@aria-controls='collapseGeography']");
		PO.add("Geography_ZipCode::xpath=//input[@id='zip_codes']");
		PO.add("Preview_IndustryAndGeography::xpath=(//button[@id='btn_submit'])[1]");

		PO.add("Checkbox_IndustryAndGeography::xpath=(//input[@type='checkbox'])[6]");
		PO.add("Download_Results_IndustryAndGeography::xpath=//a[@class='icon-border fa fa-download']");
		PO.add("Download_Selected_IndustryAndGeography::xpath=//a[@id='selectedexport']");
		PO.add("DownloadAll_IndustryAndGeography::xpath=//a[@id='fullexport']");
		PO.add("CompanyName_IndustryAndGeography::xpath=//*[@id=\"buildlisttable\"]/tbody/tr[1]/td[3]");

		PO.add("D-U-N-S_Number_IndustryAndGeography::xpath=(//div[@class='col-md-6 col-xs-6'])[1]");
		PO.add("Download_IndustryAndGeography::xpath=//i[@class='fa fa-download']");
		PO.add("Print_IndustryAndGeography::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_History_IndustryAndGeography::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistory_Content_IndustryAndGeography::xpath=(//div[@class='panel-body'])[1]");
		PO.add("Hierarchy_IndustryAndGeography::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("Hierarchy_Content_IndustryAndGeography::xpath=(//div[@class='panel-body'])[2]");

		/*
		 * PO.add("Parent_IndustryAndCompany::");
		 * PO.add("DomesticParent_IndustryAndCompany::");
		 * PO.add("UltimateParent_IndustryAndCompany::");
		 */

		PO.add("FamilyTree_IndustryAndGeography::xpath=//a[@id='tab_button_familytree']");
		// PO.add("Alternative_Tab_IndustryAndGeography::xpath=(//button[@class='btn
		// btn-mini ft_filter'])[1]");
		// PO.add("Minority_Tab_IndustryAndGeography::xpath=//button[@class='btn
		// btn-mini ft_filter']");
		PO.add("Print_FamilyTree_IndustryAndGeography::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree_IndustryAndGeography::xpath=//i[@class='icon-download-alt']");
		PO.add("Contacts_IndustryAndGeography::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Conatcts_IndustryAndGeography::xpath=(//i[@class='fa fa fa-print'])[2]");
	}

	public void Sunbelt_CustomerProspect() {
		PO.add("BuildAList_tab::xpath=//a[contains(text(),' Build a List')]");
		PO.add("IndustryNameCustomerProspect::xpath=(//i[@class='jstree-icon jstree-checkbox'])[5]");
		PO.add("CustomerProspect::xpath=//a[@aria-controls='collapseSix']");
		PO.add("Customer_Checkbox::xpath=//input[@id='customer']");
		PO.add("ActiveCustomer::xpath=//input[@class='acct_type']");
		PO.add("Preview_CustomerProspect::xpath=(//button[@id='btn_submit'])[1]");
		PO.add("Linkage_CustomerProspect::xpath=//i[@class='fa fa-sitemap']");
		PO.add("Checkbox_CustomerProspect::xpath=(//input[@type='checkbox'])[3]");
		PO.add("Download_Results_CustomerProspect::xpath=//a[@class='icon-border fa fa-download']");
		PO.add("DownloadSelected_Results_CustomerProspect::xpath=//a[@id='selectedexport']");
		PO.add("DownloadAll_CustomerProspect::xpath=//a[@id='fullexport']");
		PO.add("CompanyName_CustomerProspect::xpath=//*[@id=\"buildlisttable\"]/tbody/tr[1]/td[3]");

		PO.add("D-U-N-S_Number_CustomerProspect::xpath=(//div[@class='col-md-6 col-xs-6'])[1]");
		PO.add("Download_CustomerProspect::xpath=//i[@class='fa fa-download']");
		PO.add("Print_CustomerProspect::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_History_CustomerProspect::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistory_Content_CustomerProspect::xpath=(//div[@class='panel-body'])[1]");
		PO.add("Hierarchy_CustomerProspect::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("Hierarchy_Content_CustomerProspect::xpath=(//div[@class='panel-body'])[2]");

		/*
		 * PO.add("Parent_IndustryAndCompany::");
		 * PO.add("DomesticParent_IndustryAndCompany::");
		 * PO.add("UltimateParent_IndustryAndCompany::");
		 */

		PO.add("FamilyTree_CustomerProspect::xpath=//a[@id='tab_button_familytree']");
		PO.add("Alternative_Tab_CustomerProspect::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab_CustomerProspect::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree_CustomerProspect::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree_CustomerProspect::xpath=//i[@class='icon-download-alt']");
		PO.add("Contacts_CustomerProspect::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Conatcts_CustomerProspect::xpath=(//i[@class='fa fa fa-print'])[2]");
	}

	public void Sunbelt_CompanySearch() {
		PO.add("CompanySearch_Button::xpath=//a[contains(text(),' Company Search')]");
		PO.add("CompanyName_CompanySearch::xpath=//input[@id='company_name']");
		PO.add("State::xpath=//select[@name='state']");
		PO.add("Search_Button_CompanySearch::xpath=(//button[@class='btn btn-custom'])[2]");
		PO.add("Linkage_CompanySearch::xpath=//i[@class='fa fa-sitemap']");

		PO.add("CheckboxCompanySearch::xpath=(//input[@type='checkbox'])[3]");
		PO.add("DownloadCompanySearch::xpath=//a[@class='icon-border fa fa-download']");
		PO.add("FilterOptionsCompanySearch::xpath=//a[@class='icon-border fa fa-filter']");
		PO.add("HideBranchesFilter::xpath=(//input[@type='checkbox'])[1]");
		PO.add("DomesticUltimateSiteFilter::xpath=(//input[@type='checkbox'])[2]");
		PO.add("HeadquartersOnlyFilter::xpath=(//input[@type='checkbox'])[3]");
		PO.add("RefreshButton::xpath=//button[@id='refresh']");

		PO.add("CompanyNameCompanySearch::xpath=//table[@id='companysearchtable']/tbody/tr/td[3]");

		PO.add("DownloadcompanySearch::xpath=//i[@class='fa fa-download']");
		PO.add("PrintCompanySearch::xpath=//i[@class='fa fa fa-print']");
		PO.add("Financial_HistoryCompanySearch::xpath=//a[contains(text(), 'Financial History')]");
		PO.add("FinancialHistoryContent_CompanySearch::xpath=(//div[@class='panel-body'])[1]");
		PO.add("HierarchyCompanySearch::Xpath=//a[contains(text(), 'Hierarchy')]");
		PO.add("HierarchyContent_CompanySearch::xpath=(//div[@class='panel-body'])[2]");
		PO.add("FamilyTreeCompanySearch::xpath=//a[@id='tab_button_familytree']");

		PO.add("Alternative_Tab_CompanySearch::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab_CompanySearch::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree_CompanySearch::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree_CompanySearch::xpath=//i[@class='icon-download-alt']");
		PO.add("Contacts_tabCompanySearch::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_ButtonCompanySearch::xpath=(//i[@class='fa fa fa-print'])[2]");
		// PO.add("BuildAList_tab::xpath=//a[contains(text(),' Build a List')]");
		PO.add("RecentMatches::xpath=//table[@id='recentsearches']");

		PO.add("LogOut::xpath=//i[@class='fa fa-sign-out']");
	}

	public void Sunbelt_PageValidation() {
		PO.add("SunbeltRentals::xpath=//div[@class='col-md-11 col-md-offset-1 breadcrumbs-padding']");
		PO.add("Preview_Results_element::xpath=//li[contains (text(),'Preview Results')]");
		PO.add("CompanyName_Page::xpath=//h1[@class='overview-hdr']");
		PO.add("FamilyTree_tab::xpath=//a[contains (text(),'Family Tree')]");
		PO.add("Contacts_tab::xpath=//a[contains (text(),'Contacts')]");
		PO.add("CompanySearch_Page::xpath=(//div[@class='col-md-12'])[1]");
	}
	
	public void Sunbelt_Hierarchy()
	{
		PO.add("Parent::xpath=//*[@id=\"collapseThree\"]/div/div/table/tbody/tr[1]/td[2]/a");
		PO.add("DomesticParent::xpath=//*[@id=\"collapseThree\"]/div/div/table/tbody/tr[2]/td[2]/a");
		PO.add("UltimateParent::xpath=//*[@id=\"collapseThree\"]/div/div/table/tbody/tr[3]/td[2]/a");
		PO.add("Parent_print::xpath=(//i[@class='fa fa-print'])[1]");
		PO.add("DomesticParent_print::xpath=(//i[@class='fa fa-print'])[2]");
		PO.add("UltimateParent_print::xpath=(//i[@class='fa fa-print'])[3]");
	}

	public void loadallPageObjects() {
		Sunbelt_Login();
		Sunbelt_BuildAList();
		Sunbelt_Overview();
		Sunbelt_FamilyTree();
		Sunbelt_Contacts();
		Sunbelt_CompanySearch_DunsFile();
		Sunbelt_IndustryAndCompany();
		Sunbelt_IndustryAndCreditPercentile();
		Sunbelt_IndustryLocationType();
		Sunbelt_IndustryAndGeography();
		Sunbelt_CustomerProspect();
		Sunbelt_CompanySearch();
		Sunbelt_PageValidation();
		Sunbelt_Hierarchy();
	}

}
