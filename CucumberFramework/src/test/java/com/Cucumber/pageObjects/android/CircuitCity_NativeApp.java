package com.Cucumber.pageObjects.android;

import com.Cucumber.pageObjects.GetPageObject;

public class CircuitCity_NativeApp{

	static GetPageObject PO = new GetPageObject();

	public static void CircuitCity_Home(){
		PO.add("CC_Search::xpath=//*[@resource-id='com.royalcyber.circuitcity:id/search']");
		PO.add("MenuIcon::xpath=//android.widget.ImageButton[@content-desc='Open Menu']");
	}


	//Load PageObjects 
	public static void loadallPageObjects(){
		CircuitCity_Home();
		System.out.println("Object Load to HM Successfull!");
	}

}
