package com.Cucumber.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {
	
	public static Properties objConfig = new Properties();
	
	public static void LoadAllConfig(){
		try {
			objConfig = new Properties();
			objConfig.load(new FileInputStream(	"C:/Users/user/workspace_Labs/CucumberFramework/" + "/src/test/java/com/Cucumber/Config.properties"));
			objConfig.setProperty("os.name", System.getProperty("os.name"));
			/*System.setProperty("testPlatform",Platform);
			System.setProperty("testBrowser",Browser);*/
			System.setProperty("test.PostScenarioTearDown", objConfig.getProperty("test.PostScenarioTearDown"));
			System.setProperty("test.DisableCucumberReport", objConfig.getProperty("test.DisableCucumberReport"));
			System.setProperty("test.DisableScreenShotCapture", objConfig.getProperty("test.DisableScreenShotCapture"));
			System.setProperty("test.highlightElements", objConfig.getProperty("test.highlighElements"));
			System.setProperty("test.PageObjectMode", objConfig.getProperty("test.PageObjectMode"));
			System.setProperty("test.implicitlyWait", objConfig.getProperty("test.implicitlyWait"));
			System.setProperty("test.pageLoadTimeout", objConfig.getProperty("test.pageLoadTimeout"));
			//System.setProperty("test.AppType", objConfig.getProperty("test.AppType"));
			//System.setProperty("test.Browser", objConfig.getProperty("test.Browser"));
			//System.setProperty("test.Platform", objConfig.getProperty("test.Platform"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
