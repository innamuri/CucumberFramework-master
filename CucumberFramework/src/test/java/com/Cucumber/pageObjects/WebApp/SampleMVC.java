package com.Cucumber.pageObjects.WebApp;

import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.pageObjects.GetPageObject;

public class SampleMVC{

	static GetPageObject PO = new GetPageObject();

	//WinSupply Login Page 
	public static void SampleMVC_HomePage(){
		PO.add("url::http://localhost:8090/welcome/jsp/welcome.jsp");
		PO.add("IntroText::xpath=/html/body/div");
		PO.add("EnterWord::xpath=//input[@name='p1']");
		PO.add("Count::xpath=//input[@type='submit']");
	}

	//WinSupply Landing page
	public static void SampleMVC_CountResultPage(){
		PO.add("Result::xpath=/html/body/p");
	}

	//Load PageObjects 
	public static void loadallPageObjects(){
		SampleMVC_HomePage();
		SampleMVC_CountResultPage();
		System.out.println("Object Load to HM Successfull!");
	}

}
