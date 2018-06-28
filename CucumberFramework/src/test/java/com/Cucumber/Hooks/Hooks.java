package com.Cucumber.Hooks;

import org.openqa.selenium.WebDriver;
import com.Cucumber.framework.StepBase;
import com.Cucumber.framework.Utilities;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @ScriptName : Hooks
 * @Description : This class contains
 * @Author : Swathin Ratheendren	
 * @Creation Date : September 2016 @Modified Date:
 */
public class Hooks {
	public static Scenario currentScenario;
	private static WebDriver driver=StepBase.getDriver();
	
	@Before
	public void applyHook(Scenario scenario) {
		try {
			currentScenario = scenario;
			StepBase.setScenario(scenario);
			if(System.getProperty("test.PostScenarioTearDown").equals("true")){
				StepBase.setUp(System.getProperty("test.Platform"),System.getProperty("test.Browser"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void removeHook(Scenario scenario) {
		try {
			if(System.getProperty("test.PostScenarioTearDown").equals("true")){
				StepBase.tearDown();
			}
			if(scenario.isFailed()){
				Reporter.addScreenCaptureFromPath(Utilities.takeScreenshot(driver));
				StepBase.embedScreenshot();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
