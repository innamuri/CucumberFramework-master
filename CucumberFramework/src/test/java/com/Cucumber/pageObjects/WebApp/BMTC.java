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
		PO.add("PageSelected::xpath=(//a[@class='active selected'])[3]");
	}

	public static void BMTC_TC() {
		PO.add("Display_Dropdown::id=pageSize_WP");
		PO.add("Products::xpath=//*[@id='content-wrapper']/div[2]/div");
		

		PO.add("TopNextArrow::xpath=//div[@class='controls pagination_present']/div[@class='paging_controls']/a[@class='right_arrow']");
		PO.add("Dropdown_1st_option::id=dijit_MenuItem_0_text");
		PO.add("PaginationTop::xpath=//*[@id='content-wrapper']/div[@class='header_bar']/div[@class='controls pagination_present']/div[@class='paging_controls']");
		PO.add("TopPreviousArrow::xpath=//div[@class='controls pagination_present']/div[@class='paging_controls']/a[@class='left_arrow']");
		PO.add("Page2_Top::xpath=//*[@id='content-wrapper']/div[@class='header_bar']/div[@class='controls pagination_present']/div[@class='paging_controls']/div[@class='pages pageControlMenu']/div/div/div/div/div/a[2]");
		PO.add("BlogImage::xpath=//*[@id='content-wrapper']/div[@class='product_listing_container flex']/div[@class='wp-wrapper item-flex'][1]/div[@class='blog-tumb']/a/img");
		PO.add("BlogName::xpath=//*[@id='content-wrapper']/div[@class='product_listing_container flex']/div[@class='wp-wrapper item-flex'][1]/div[@class='blog-decrp']/a/div");
		PO.add("BlogReadMore::xpath=//*[@id='content-wrapper']/div[@class='product_listing_container flex']/div[@class='wp-wrapper item-flex'][1]/div[@class='blog-decrp']/div[@class='read-more']/a");
		
		PO.add("BlogTitlePDP::xpath=//div[@class='td-ss-main-content']/article/div[@class='td-post-header']/header/h1");
		
		
		PO.add("Page2_Bottom::xpath=//*[@id='content-wrapper']/div[@class='paging_controls']/div/div/div/div/div/div[@class='pageControl number']/a[2]");
		PO.add("PaginationBottom::xpath=//*[@id='content-wrapper']/div[@class='paging_controls']");
		PO.add("BottomNextArrow::xpath=//*[@id='content-wrapper']/div[@class='paging_controls']/a[@class='right_arrow']");
		PO.add("BottomPreviousArrow::xpath=//*[@id='content-wrapper']/div[@class='paging_controls']/a[@class='left_arrow']");
		PO.add("SearchTextWithSuggestion::xpath=//div[@id='content']/div[1]/div[3]/div[1]/div[@class='searchSummaryWidget searchSummaryWidgetWithSuggestion']/div[@class='widget_title_container_position']/div/span/div");
		PO.add("NoResults::xpath=//div[@id='content']/div[1]/div[3]/div[1]/div[@class='searchSummaryWidget searchSummaryWidgetWithSuggestion']/div[@class='widget_search_results_position']/div/div[@class='results_description']");
		PO.add("DidYouMean::xpath=//div[@id='content']/div[1]/div[3]/div[1]/div[@class='searchSummaryWidget searchSummaryWidgetWithSuggestion']/div[@class='widget_search_results_position']/div[@class='widget_search_results']/span[1]");
		PO.add("chair::xpath=//div[@id='content']/div[1]/div[3]/div[1]/div[@class='searchSummaryWidget searchSummaryWidgetWithSuggestion']/div[@class='widget_search_results_position']/div[@class='widget_search_results']/span[4]/a");
		
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




	public void loadallPageObjects() {
		BMTC_Main();
		BMTC_TC();
		BMTC_Overview();
		BMTC_FamilyTree();
	}

}
