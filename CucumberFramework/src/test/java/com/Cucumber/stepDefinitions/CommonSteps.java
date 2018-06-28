package com.Cucumber.stepDefinitions;

import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.framework.StepBase;
import cucumber.runtime.CucumberException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.imageio.ImageIO;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.Cucumber.framework.Utilities;
import com.Cucumber.framework.WrapperFunctions;
import com.Cucumber.pageObjects.GetPageObject;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @ScriptName : Utilities
 * @Description : This class contains Commonly used Keyword for Mobile/Web
 *              application automation using Cucumber framework
 * @Author : Swathin Ratheendren	
 * @Creation Date : September 2016 @Modified Date:
 */
public class CommonSteps {

	private static WrapperFunctions wrapFunc = new WrapperFunctions();
	private static WebDriver driver;
	private static Utilities utils = new Utilities();
	private static String UserName = "patel_taha@hotmail.com";
	private static String Password = "passw0rd";
	private static BufferedImage bufferedImage;
	private static byte[] imageInByte;

	@Given("^My WebApp '(.*)' is open$")
	public static void my_webapp_is_open(String url) throws Exception {
		try {			
			driver = StepBase.getDriver();
			System.out.println("Driver value: "+driver);
			driver.get(GetPageObject.OR_GetURL(url));
			wrapFunc.waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Given("^My NativeApp '(.*)' is open$")
	public static void my_nativeapp_is_open(String app) throws Exception {
		try {
			driver = StepBase.getDriver();
			if(System.getProperty("test.PageObjectMode").equalsIgnoreCase("csv"))
			{	
				GetPageObject.ReadCSV(app);
				
			}else if (System.getProperty("test.PageObjectMode").equalsIgnoreCase("class")){
				GetPageObject.ReadPOClass(app);
			}
			Thread.sleep(15000);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I login to IHS-eCommerce Admin portal as Administrator$")
	public static void I_loginIhsEcomm() {
		try {
			driver.findElement(GetPageObject.OR_GetElement("Ihs_Email")).sendKeys("swathin.ratheendren@ihsmarkit.com");
			driver.findElement(GetPageObject.OR_GetElement("Ihs_Password")).sendKeys("IHS_Markit123$");
			driver.findElement(GetPageObject.OR_GetElement("Ihs_Password")).submit();
			//driver.findElement(GetPageObject.OR_GetElement("logoutLink")).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I login to aramark as '(.*)'$")
	public static void I_loginAramark_asUserType(String userType) {
		try {
			if(userType.equalsIgnoreCase("plan_manager")){
				driver.findElement(GetPageObject.OR_GetElement("CPS_Username")).sendKeys(" ");
				driver.findElement(GetPageObject.OR_GetElement("CPS_Password")).sendKeys(" ");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
			}else if(userType.equalsIgnoreCase("superqa2")){
				driver.findElement(GetPageObject.OR_GetElement("CPS_Username")).sendKeys("superqa2");
				driver.findElement(GetPageObject.OR_GetElement("CPS_Password")).sendKeys("AramarkP@ssw0rd");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
			}else if(userType.equalsIgnoreCase("regional_manager")){
				driver.findElement(GetPageObject.OR_GetElement("CPS_Username")).sendKeys("regionalM04");
				driver.findElement(GetPageObject.OR_GetElement("CPS_Password")).sendKeys("passw0rd");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
				driver.findElement(GetPageObject.OR_GetElement("SubmitCompany&Language")).click();
			}else if(userType.equalsIgnoreCase("regional_analyst")){
				driver.findElement(GetPageObject.OR_GetElement("CPS_Username")).sendKeys("ranalyst001");
				driver.findElement(GetPageObject.OR_GetElement("CPS_Password")).sendKeys("passw0rd");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
				driver.findElement(GetPageObject.OR_GetElement("SubmitCompany&Language")).click();
			}else if(userType.equalsIgnoreCase("financial_analyst")){
				driver.findElement(GetPageObject.OR_GetElement("CPS_Username")).sendKeys("fanalyst001");
				driver.findElement(GetPageObject.OR_GetElement("CPS_Password")).sendKeys("passw0rd");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
				driver.findElement(GetPageObject.OR_GetElement("SubmitCompany&Language")).click();
			}else if(userType.equalsIgnoreCase("account_manager")){
				driver.findElement(GetPageObject.OR_GetElement("CPS_Username")).sendKeys("am_am001");
				driver.findElement(GetPageObject.OR_GetElement("CPS_Password")).sendKeys("passw0rd");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
				driver.findElement(GetPageObject.OR_GetElement("SubmitCompany&Language")).click();
			}

			driver.findElement(GetPageObject.OR_GetElement("logoutLink")).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I enter valid Credentials in '(.*)' & '(.*)' fields$")
	public static void I_enter_Creds_in_fields(String element1, String element2) {
		try {

			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element1));
			driver.findElement(GetPageObject.OR_GetElement(element1)).sendKeys(UserName);
			driver.findElement(GetPageObject.OR_GetElement(element2)).sendKeys(Password);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I navigate to '(.*)' page$")
	public static void I_NavigateTo(String url){
		try{
			driver.navigate().to(HashMapContainer.getPO(url));
		}catch(Exception e){
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I enter '(.*)' in field '(.*)'$")
	public static void I_enter_in_field(String value, String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			//driver.findElement(GetPageObject.OR_GetElement(element)).clear();
			if(value.length()>1){
				if(value.substring(0,2).equals("$$"))
				{
					System.out.println("Fetching from HMcontainer!");
					value = HashMapContainer.get(value);
				}
			}
			driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys(value);
			// TODO Dismiss keyboard for webView
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I clear field '(.*)'$")
	public static void I_clear_Field(String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			driver.findElement(GetPageObject.OR_GetElement(element)).clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I enter HCInstance '(.*)' in field '(.*)'$")
	public static void I_enter_HCInstance_in_field(String value, String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			driver.findElement(GetPageObject.OR_GetElement(element)).clear();
			if(value.substring(0,2).equals("$$"))
			{
				//System.out.println("Fetching from HMcontainer!");
				value = HashMapContainer.get(value);
			}
			driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys("Health Care Enrollment "+value);
			// TODO Dismiss keyboard for webView
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I hit enter-key on element '(.*)'$")
	public static void I_hit_key_on_element(String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys(Keys.ENTER);
			// TODO Dismiss keyboard for webView
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I hit down Arrow key on element '(.*)'$")
	public static void I_hit_Downkey_on_element(String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys(Keys.ARROW_DOWN);
			// TODO Dismiss keyboard for webView
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I mouse over '(.*)'$")
	public static void I_mouse_over(String element){
		try{
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(GetPageObject.OR_GetElement(element));
			action.moveToElement(we).build().perform();
		}catch(Exception e){
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I verify tool tip message '(.*)' for element '(.*)'$")
	public static void I_Verify_ToolTip_Message(String expectedMessage,String element){
		try{
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement we = driver.findElement(GetPageObject.OR_GetElement(element));
			/*Actions action = new Actions(driver);
			WebElement we = driver.findElement(GetPageObject.OR_GetElement(element));
			action.moveToElement(we).build().perform();
			 */
			String ToolTipMessage = we.getAttribute("title");
			Assert.assertEquals(expectedMessage,ToolTipMessage);
		}catch(Exception e){
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I verify value '(.*)' in field '(.*)'$")
	public static void I_Verify_value_inField(String expectedValue, String element){
		try{
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			String ActualValue = driver.findElement(GetPageObject.OR_GetElement(element)).getAttribute("value");
			Assert.assertEquals(expectedValue,ActualValue, "Actual value does not match the expected value in specified field!");
		}catch(Exception e){
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I verify element '(.*)' is disabled$")
	public static void I_Verify_Element_isDisabled(String element){
		try{
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement elem = driver.findElement(GetPageObject.OR_GetElement(element));
			if(elem.isEnabled()){
				throw new Exception("Element is enabled!");
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I enter '(.*)' into RichText Editor '(.*)'$")
	public static void I_enter_into_RichTextEditor(String value, String element) {
		try {
			driver.switchTo().frame("tinymce");
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			driver.findElement(GetPageObject.OR_GetElement(element)).clear();
			driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys(value);
			driver.switchTo().defaultContent();
			// TODO Dismiss keyboard for webView
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Given("^I click '(.*)'$")
	public static void I_click(String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			driver.findElement(GetPageObject.OR_GetElement(element)).click();
			//StepBase.embedScreenshot(); // Reporter.addScreenCaptureFromPath(Utilities.takeScreenshot(driver));
			wrapFunc.waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Given("^I take screenshot$")
	public static void take_Screenshot() {
		try {
			StepBase.embedScreenshot();
			Reporter.addScreenCaptureFromPath(Utilities.takeScreenshot(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}



	@Given("^I click link '(.*)'$")
	public static void I_click_link(String linkText) {
		try {
			driver.findElement(By.linkText(linkText)).click();
			wrapFunc.waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I drag field '(.*)' and drop '(.*)'$")
	public static void I_drag_Field(String element, String element2) {
		try {
			WebElement source = driver.findElement(GetPageObject.OR_GetElement(element));
			WebElement target = driver.findElement(GetPageObject.OR_GetElement(element2));
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Given("^I click alert accept$")
	public static void I_click_alert_accept() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	//Specific to RC BPM applications
	@Then("^I select date '(.*)'-'(.*)'-'(.*)' in Calander grid$")
	public static void 	I_select_Date_inCal(int month,int day,int year) {
		try {
			WebElement previousYear = driver.findElement(By.xpath("//span[@data-dojo-attach-point=\"previousYearLabelNode\"]"));
			String prevYear = String.valueOf((year-1));
			while(!previousYear.getText().equals(prevYear)){
				previousYear.click();
			}
			Thread.sleep(1000);

			driver.findElement(By.xpath("//span[contains(text(),\""+day+"\")]")).click();
			StepBase.embedScreenshot(); 
			wrapFunc.waitForPageToLoad();

		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I click by JS '(.*)'$")
	public static void I_clickJS(String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			System.out.println(driver.findElement(GetPageObject.OR_GetElement(element)).isEnabled());
			System.out.println(driver.findElement(GetPageObject.OR_GetElement(element)).isDisplayed());
			wrapFunc.clickByJS(GetPageObject.OR_GetElement(element));
			StepBase.embedScreenshot(); 
			wrapFunc.waitForPageToLoad();

		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	/*@Then("^I hit Enter key on '(.*)'$")
	public static void I_hitEnterkey(String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			//driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys(Keys.ENTER);
			driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys(Keys.ENTER);
			((AppiumDriver<WebElement>)driver).tap(1, 500, 840, 1);
			StepBase.embedScreenshot();
			wrapFunc.waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}*/


	@Then("^I create the request query '(.*)'$")
	public static void I_Create_Request(String element) {

		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement x = driver.findElement(GetPageObject.OR_GetElement(element));
			if(x.isDisplayed()){
				WrapperFunctions.highLightElement(driver.findElement(GetPageObject.OR_GetElement(element)));
			}else{
				throw new Exception("Element is not found!");
			}

		} catch (Exception e) {
			e.printStackTrace();
			StepBase.embedScreenshot();
			System.out.println("Element is not found");
			throw new ElementNotFoundException(element, "", "");
		}
	}

	@Then("^I should see element '(.*)' present on page$")
	public static void I_should_see_on_page(String element) {

		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement x = driver.findElement(GetPageObject.OR_GetElement(element));
			if(x.isDisplayed()){
				WrapperFunctions.highLightElement(driver.findElement(GetPageObject.OR_GetElement(element)));
			}else{
				throw new Exception("Element is not found! :"+element);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Element is not found! :"+element);
			throw new ElementNotFoundException(element, "", "");
		}
	}

	@Then("^I should see element '(.*)' present on page_$")
	public static void I_should_see_on_page_AndScreenshot(String element) {

		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement x = driver.findElement(GetPageObject.OR_GetElement(element));
			if(x.isDisplayed()){
				WrapperFunctions.highLightElement(driver.findElement(GetPageObject.OR_GetElement(element)));
				StepBase.embedScreenshot();  
				Reporter.addScreenCaptureFromPath(Utilities.takeScreenshot(driver));
			}else{
				throw new Exception("Element is not found!");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Element is not found");
			throw new ElementNotFoundException(element, "", "");
		}
	}

	@Then("^I should not see element '(.*)' present on page$")
	public static void I_should_not_see_on_page(String element) throws Exception{

		try {
			WebElement x = driver.findElement(GetPageObject.OR_GetElement(element));
			System.out.println("Element is displayed: "+x.isDisplayed());
			if(x.isEnabled()){
				StepBase.embedScreenshot(); 
				WrapperFunctions.highLightElement(driver.findElement(GetPageObject.OR_GetElement(element)));
				throw new Exception("Element is found on page!");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is found on Page!");
		}
	}

	@Then("^I should see text '(.*)' present on page$")
	public static void I_should_see_text_present_on_page(String expectedText) {
		try {
			if (driver.getPageSource().contains(expectedText)) {
				System.out.println("Text " + expectedText + " found on page!");
				StepBase.embedScreenshot(); 
			} else {
				throw new ElementNotFoundException(expectedText, " ", " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ElementNotFoundException(expectedText, " ", " ");
		}
	}

	@Then("^I verify checkbox '(.*)' is '(.*)'$")
	public static void I_verify_checkBox_is_Checked(String checkbox, String status) {
		try {

			if(status.equalsIgnoreCase("checked")){
				if (!driver.findElement(GetPageObject.OR_GetElement(checkbox)).isSelected()) {
					throw new Exception("Specified Checkbox is not checked!");
				}	
			}else if(status.equalsIgnoreCase("unchecked")){
				if (driver.findElement(GetPageObject.OR_GetElement(checkbox)).isSelected()) {
					throw new Exception("Specified Checkbox is checked!");
				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}


	@Then("^I switch to iFrame '(.*)'$")
	public static void I_switchTo_iFrame(String FrameID) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(FrameID));
			WebElement frame = driver.findElement(GetPageObject.OR_GetElement(FrameID));
			driver.switchTo().frame(frame);
			StepBase.embedScreenshot(); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}

	}

	@Then("^I switch to default content$")
	public static void I_switchTo_DefaultContent() {
		try {
			driver.switchTo().defaultContent();
			StepBase.embedScreenshot(); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}

	}

	@Then("^I switch back to Main Window$")
	public static void I_switchTo_MainWindow() {
		try {
			driver.switchTo().window(driver.getWindowHandle());
			StepBase.embedScreenshot(); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}

	}

	@Then("^I should see text '(.*)' present on page at '(.*)'$")
	public static void I_should_see_text_present_on_page_At(String expectedText, String location) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(location));
			//WebElement we = driver.findElement(GetPageObject.OR_GetElement(location));
			String actualText = driver.findElement(GetPageObject.OR_GetElement(location)).getText();
			WrapperFunctions.highLightElement(driver.findElement(GetPageObject.OR_GetElement(location)));
			Assert.assertEquals(expectedText, actualText);
			StepBase.embedScreenshot(); 
			Reporter.addScreenCaptureFromPath(Utilities.takeScreenshot(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I should see text matching regx '(.*)' present on page at '(.*)'$")
	public static void I_should_see_text_matching_regularExpression(String regx, String location) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(location));
			String actualText = driver.findElement(GetPageObject.OR_GetElement(location)).getText();
			//Assert.assertTrue(actualText.matches(regx),"Actual Text Found: "+actualText+"|");
			Assert.assertTrue(actualText.matches(regx));
			StepBase.embedScreenshot(); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}

	}

	@Then("^I wait '(.*)' seconds for presence of element '(.*)'$")
	public static void I_wait_for_presence_of_element(int seconds, String element) {
		try {
			//wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element), seconds);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I wait for '(.*)' seconds$")
	public static void I_pause_for_seconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}


	@Then("^I switch to window with title '(.*)'$")
	public static void I_switch_to_window_with_title(String title) {
		try {
			wrapFunc.switchToWindowUsingTitle(title);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}

	}

	@Then("^I select option '(.*)' in dropdown '(.*)' by '(.*)'$")
	public static void I_select_option_in_dd_by(String option, String element, String optionType) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			wrapFunc.selectDropDownOption(GetPageObject.OR_GetElement(element), option, optionType);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I scroll to '(.*)' - '(.*)'$")
	public static void I_scroll_to_element(String scrolltype, String element) {
		try {
			wrapFunc.scroll(scrolltype, element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I scroll through page$")
	public static void I_scroll_thru_page() {
		try {
			for(int i=0;i<=16;i++){
				wrapFunc.scroll("coordinates", "0,200");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I get text from BPM_App '(.*)' and store in '(.*)'$")
	public static void I_get_text_from_BPMApp(String element, String StoreVar) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			String InstanceName = driver.findElement(GetPageObject.OR_GetElement(element)).getText();
			//System.out.println("Instance Full: "+InstanceName);
			//System.out.println("Instance: "+InstanceName.substring(24,27));
			HashMapContainer.add("$$"+StoreVar, InstanceName.substring(24,27));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I store text '(.*)' as '(.*)'$")
	public static void I_get_text_from(String TextValue, String ValueName) {
		try {
			HashMapContainer.add("$$"+ValueName, TextValue);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I get text from '(.*)' and store$")
	public static void I_get_text_from(String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			String value = driver.findElement(GetPageObject.OR_GetElement(element)).getText();
			HashMapContainer.add("$$"+element, value);

		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I enter from stored variable '(.*)' into feild '(.*)'$")
	public static void I_enter_from_StoredValue(String StoredValue, String element) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			driver.findElement(GetPageObject.OR_GetElement(element)).sendKeys(HashMapContainer.get(StoredValue));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I compare '(.*)' with stored value '(.*)'$")
	public static void I_compare_with_StoredValue(String element, String storedValue) {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			String actualValue = driver.findElement(GetPageObject.OR_GetElement(element)).getText();
			storedValue = HashMapContainer.get(storedValue);
			Assert.assertEquals(storedValue,actualValue , "I Compare "+actualValue+" with expected value "+storedValue);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

	@Then("^I verify screenshot to Baseline of page '(.*)'$")
	public static void I_verify_Screenshot_toBaselined(String ImageBaseline)throws Exception{
		try{
			File f1 = new File(Utilities.takeScreenshot(driver));
			System.out.println("ActualSS Path: "+f1);
			File f2 = new File(ImageBaseline);
			Float PercentageVariation = Utilities.compareImage(f1,f2);
			System.out.println("% of variation in image comparison with Baseline image: "+PercentageVariation+"%");
			if (PercentageVariation!=0.0){
				bufferedImage = Utilities.getDifferenceImage(f1,f2);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(bufferedImage, "jpg", baos);
				baos.flush();
				imageInByte = baos.toByteArray();
				baos.close();
				throw new Exception("Compared images do not match!");
			}
		}catch(Exception e){
			e.printStackTrace();
			StepBase.embedProvidedScreenshot(imageInByte);
			throw new CucumberException(e.getMessage(),e);
		}
	}
	
	@Then("^I try to login to WinSupply with '(.*)' credentials$")
    public static void I_loginWinSupply_asUserType(String userType) {
           try {
                  if(userType.equalsIgnoreCase("invalid_user")){
                         driver.findElement(GetPageObject.OR_GetElement("UserName")).sendKeys("wp8devadmin");
                         driver.findElement(GetPageObject.OR_GetElement("Password")).sendKeys("password");
                        driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
                  }else if(userType.equalsIgnoreCase("valid_user")){
                        driver.findElement(GetPageObject.OR_GetElement("UserName")).clear();
                         driver.findElement(GetPageObject.OR_GetElement("UserName")).sendKeys("wp8devadmin");
                         driver.findElement(GetPageObject.OR_GetElement("Password")).sendKeys("password1234");
                        driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
                        driver.findElement(GetPageObject.OR_GetElement("Logout")).isDisplayed();
                  }
           } catch (Exception e) {
                  e.printStackTrace();
                  throw new CucumberException(e.getMessage(), e);
           }
    }
	
	@Then("^I verify and clear cart$")
	public static void checkANDclearcart() throws Exception {
		try{
			String ActualValue = driver.findElement(GetPageObject.OR_GetElement("Cart_val")).getText();
			if(ActualValue.equals("0")){
				System.out.println("\n Product in Cart: 0");
			}
			else{	
				System.out.println("\n Product in Cart: " + ActualValue);
				Thread.sleep(5000);
				driver.findElement(GetPageObject.OR_GetElement("CartIcn")).click();
				driver.findElement(GetPageObject.OR_GetElement("CartBtn")).click();
				Thread.sleep(5000);
				driver.findElement(GetPageObject.OR_GetElement("Remove_btn")).click();
				Thread.sleep(5000);
				driver.findElement(GetPageObject.OR_GetElement("Home_logo")).click();
				Thread.sleep(5000);
				}}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Then("^I login to CircuitCity as '(.*)'$")
	public static void I_Login_CircuitCity(String UserType) {
		try {
			
			if(UserType.equalsIgnoreCase("invalid")){
				driver.findElement(GetPageObject.OR_GetElement("UserName")).sendKeys("test");
				driver.findElement(GetPageObject.OR_GetElement("Password")).sendKeys("test");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
			}else{
				driver.findElement(GetPageObject.OR_GetElement("UserName")).sendKeys("test");
				driver.findElement(GetPageObject.OR_GetElement("Password")).sendKeys("test");
				driver.findElement(GetPageObject.OR_GetElement("LogInBtn")).click();
			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I switch tab$")
	public static void switchTab() throws Exception {
		try{
	//		 String winHandleBefore = driver.getWindowHandle();

			    // Perform the click operation that opens new window

		//	    driver.findElement(GetPageObject.OR_GetElement("AvailableJobs_Link")).click();
		//	    driver.close();
			    // Switch to new window opened
			    for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			    }

			    // Perform the actions on new window

			    // Close the new window, if that window no more required
	//		    driver.close();

			    // Switch back to original browser (first window)
	//		    driver.switchTo().window(winHandleBefore);
			    
			    
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Then("^I close browser$")
	public static void I_Close_Browser() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I quit browser$")
	public static void I_Quit_Browser() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}	
}
