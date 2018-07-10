package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.pageObjects.GetPageObject;

public class BMTC {
	static GetPageObject PO = new GetPageObject();

	public static void BMTC_Main() {
		PO.add("url::https://192.168.16.198/en");
		PO.add("Search::id=SimpleSearchForm_SearchTerm");
		PO.add("Search_Icon::xpath=//*[@id='searchBox']/a");
		PO.add("Search_text::xpath=//div[@class='searchSummaryWidget']");
		PO.add("Searched_text::xpath=//div[@class='searchSummaryWidget']//h1/span[1]");
		PO.add("OtherContent_Tab::id=tab3");
		PO.add("OtherContent_text::id=wpTabId");
	}

	public static void BMTC_BuildAList() {
		PO.add("Display_Dropdown::id=pageSize_WP");
		PO.add("Products::xpath=//*[@id='content-wrapper']/div[2]/div");

		PO.add("NextArrow::xpath=//div[@class='controls pagination_present']/div[@class='paging_controls']/a[@class='right_arrow']");
		PO.add("Preview_Results::xpath=(//button[@id='btn_submit'])[1]");
		PO.add("Checkbox_CompanyName::xpath=(//input[@type='checkbox'])[3]");

		PO.add("Download_Results::cssselector=a.icon-border.fa.fa-download::before");
		PO.add("Download_Selected::xpath=//a[@id='selectedexport']");
		PO.add("DownloadAll::xpath=//a[@id='fullexport']");
		PO.add("CompanyName::xpath=//*[@id=\"buildlisttable\"]/tbody/tr[1]/td[3]");
	}

	public static void BMTC_Overview() {
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

	public static void BMTC_FamilyTree() {
		PO.add("FamilyTree::xpath=//a[@id='tab_button_familytree']");
		PO.add("Alternative_Tab::xpath=(//button[@class='btn btn-mini ft_filter'])[1]");
		PO.add("Minority_Tab::xpath=//button[@class='btn btn-mini ft_filter']");
		PO.add("Print_FamilyTree::xpath=//i[@class='icon-print']");
		PO.add("Download_FamilyTree::xpath=//i[@class='icon-download-alt']");

	}

	public static void BMTC_Contacts() {
		PO.add("Contacts_tab::xpath=//a[@id='tab_button_contact']");
		PO.add("Print_Button::xpath=(//i[@class='fa fa fa-print'])[2]");
	}

	public static void BMTC_CompanySearch_DunsFile() {
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



	public void loadallPageObjects() {
		BMTC_Main();
		BMTC_BuildAList();
		BMTC_Overview();
		BMTC_FamilyTree();
		BMTC_Contacts();
	}

}
