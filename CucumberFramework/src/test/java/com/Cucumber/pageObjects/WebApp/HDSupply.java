package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.pageObjects.GetPageObject;

public class HDSupply{

	static GetPageObject PO = new GetPageObject();

	//IHS eCommerce login page
	public static void HDS_Homepage(){
		PO.add("url::https://www.whitecap.com/shop/en/wc/home");
		PO.add("HomePageLogo::xpath=//*[@id='contentRecommendationWidget_HeaderStoreLogo_Content']/div/a/img");
		PO.add("ShopByCategory::id=departmentButton_14051");
		PO.add("CategorySelect_Electric&Lighting::xpath=//a[contains(.,'Electrical & Lighting')]");
		PO.add("PageHeader::xpath=//*[@id='PageHeading_4_-2001_3074457345618261125']/h1");
		PO.add("Product_Battery::xpath=//img[@alt='Batteries: 61532']");
		PO.add("Product_Battery_item::xpath=//img[@alt='Household Batteries: 62299']");
		PO.add("Product_EnergizerD::xpath=//*[@id='catalogEntry_img56151']/img");
		PO.add("Product_Details::xpath=//*[@id='product-1']/div[2]/div[2]/div[3]");
		PO.add("Product_offerPrice::xpath=//*[@id='offerPrice_Widget_CatalogEntryList_701_495856151']");
		PO.add("AddToCart_Btn::id=listViewAdd2Cart_56151");
		PO.add("Cart_AddSuccessMsg::xpath=//*[@id='offerPrice_Widget_CatalogEntryList_701_495856151']");
		PO.add("ProductInCart::xpath=//img[@alt='Energizer D Industrial Battery 12/pack']");
		PO.add("GoToCart::xpath=//*[@id='GotoCartButton2']/span");
		PO.add("ProductLogo::xpath=//a[@title='Energizer D Industrial Battery 12/pack']");
		PO.add("Product_Weight::xpath=//*[@id='lineItemRow']/td[1]");
		PO.add("Product_availability::xpath=//*[@id='WC_OrderItemDetailsf_td_1_1']/p");
		PO.add("Product_EachPrice::xpath=//*[@id='WC_OrderItemDetailsf_td_3_1']/span");
		PO.add("Product_TotalPrice::xpath=//*[@id='WC_OrderItemDetailsf_td_4_1']/span");
		PO.add("Product_RemoveFromCart::id=WC_OrderItemDetailsf_links_2_1");
		PO.add("ProductCard_Empty::id=WC_EmptyShopCartDisplayf_div1");
	}

	//Load PageObjects 
	public static void loadallPageObjects(){
		HDS_Homepage();
		System.out.println("Object Load to HM Successfull!");
	}
}
