package com.Cucumber.stepDefinitions;

import org.openqa.selenium.WebDriver;
import com.Cucumber.framework.StepBase;
import com.Cucumber.framework.Utilities;
import com.Cucumber.framework.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.runtime.CucumberException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class CommonStepsMobile {
	
	static WrapperFunctions wrapFunc = new WrapperFunctions();
	static StepBase sb = new StepBase();
	//static StepBase_D2 sb = new StepBase_D2();
	static WebDriver driver;
	static Utilities util = new Utilities();
	
	@SuppressWarnings("unchecked")
	@Then("^I Tap key at x '(.*)' & y '(.*)' coordinates on android keyboard$")
	public static void Tap_SearchSoftKey(int x, int y ) {
		try {
			((AppiumDriver<AndroidElement>)driver).tap(1, x, y, 1);
			wrapFunc.waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Then("^I swipe right$")
	public static void Swipe_direction() {
		try {
			((AppiumDriver<AndroidElement>)driver).swipe(200,200,600, 700, 1);
			wrapFunc.waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
}
