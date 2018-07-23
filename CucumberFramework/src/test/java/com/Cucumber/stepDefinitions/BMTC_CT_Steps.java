package com.Cucumber.stepDefinitions;

import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.framework.StepBase;
import cucumber.runtime.CucumberException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Cucumber.framework.Utilities;
import com.Cucumber.framework.WrapperFunctions;
import com.Cucumber.pageObjects.GetPageObject;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;


public class BMTC_CT_Steps {

	static WrapperFunctions wrapFunc = new WrapperFunctions();
	static StepBase sb = new StepBase();
	public static WebDriver driver = StepBase.getDriver();
	static Utilities util = new Utilities();
	
	public static Integer getDropCountOptionValue(String dropdownvalue) {
//		String valuedropdown = HashMapContainer.get(dropdownvalue);
	    Pattern pattern = Pattern.compile("([0-9]+[0-9])");
		Matcher matcher = pattern.matcher(dropdownvalue);
		matcher.find();
		return Integer.valueOf(matcher.group());
	}
	
	@Then("I compare '(.*)' with product count '(.*)'$")
	public static void i_compare_OtherContentProductsNum_With_TotalProducts(String othecontenttext, String productcount) throws Exception {
	   try {
	    String contenttext = HashMapContainer.get(othecontenttext);
	    String string2 = HashMapContainer.get(productcount);
	  //  String text2 = "Other content (5)";
//	    othecontenttext = "Other content (5)";
	    int length = contenttext.length();
	    String substring = contenttext.substring(length-2, length-1);
	    System.out.println(substring);
	    System.out.println("Other Content Tab Product Count: " + substring + " Total Products Count on All pages: " + string2);

	    Assert.assertEquals(substring, string2);
	    
	    System.out.println("Products count is same");
	   } catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    throw new Exception("Comparison failed");
	   }}
	
	@Then("I compare '(.*)' with total products '(.*)'$")
	public static void i_verify_DropdownValue_With_TotalProducts(String dropdownvalue, String productcount) throws Exception {
	   try {
	    String prodcount = HashMapContainer.get(productcount);
//	    System.out.println(valuedropdown);
//	    System.out.println(prodcount);
	    String valuedropdown = HashMapContainer.get(dropdownvalue);
	    Pattern pattern = Pattern.compile("([0-9]+[0-9])");
		Matcher matcher = pattern.matcher(valuedropdown);
		matcher.find();
		String group = matcher.group();
//		System.out.println(group);
	    System.out.println("Dropdown value: " + group + " Total Products Count: " + prodcount);
	    Assert.assertEquals(group, prodcount);
	    System.out.println("Products count is same");
	    } catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    throw new Exception("Comparison failed");
	    }}

	@Then("^I get count from '(.*)' and print$")
	public static void I_get_count_from_and_print(String element) {
		try {
			int productCount = 0;
			Integer pageNo=1;
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement arrow = driver.findElement(GetPageObject.OR_GetElement("TopNextArrow"));
			if(arrow.isDisplayed()) {
				do {
					List<WebElement> list = driver.findElements(GetPageObject.OR_GetElement(element));
					productCount = productCount + list.size();
					System.out.println("product count on page no : " + pageNo + " is : " + list.size());
		//			System.out.println("Value: "+page1_products);
					arrow.click();
					Thread.sleep(10000);
					arrow = driver.findElement(GetPageObject.OR_GetElement("TopNextArrow"));
					pageNo++;
				} while (arrow.isDisplayed());
				List<WebElement> list = driver.findElements(GetPageObject.OR_GetElement(element));
				productCount = productCount + list.size();
				System.out.println("product count on page no : " + pageNo + " is : " + list.size());
				System.out.println("Total product count = " + productCount + " with total pages = " + pageNo);
				System.out.println(productCount);
			    String productadd = Integer.toString(productCount);
				HashMapContainer.add("$$"+element, productadd);
			} else {
				List<WebElement> list = driver.findElements(GetPageObject.OR_GetElement(element));
				productCount = productCount + list.size();
				System.out.println("product count on page no : " + pageNo + " is : " + list.size());
				System.out.println("Total product count = " + productCount + " with total pages = " + pageNo);
				System.out.println(productCount);
			    String productadd = Integer.toString(productCount);
				HashMapContainer.add("$$"+element, productadd);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Then("^I verify selected dropdown option with '(.*)' and print$")
	public static void I_verify_selected_dropdown_option_with_Products_and_print(String element) {
		try {
			//			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement arrow = driver.findElement(GetPageObject.OR_GetElement("TopNextArrow"));
			List<WebElement> list = driver.findElements(GetPageObject.OR_GetElement(element));
			int productCount = list.size();
			if(productCount <= getDropCountOptionValue(driver.findElement(GetPageObject.OR_GetElement("Dropdown_1st_option")).getText())) {
				System.out.println("Product count on page is: " + productCount);
				System.out.println(productCount);
			    String TotalProducts = Integer.toString(productCount);
				HashMapContainer.add("$$"+element, TotalProducts);
				if(!arrow.isDisplayed()) {
				System.out.println("Pagination not coming, working fine");
				}
				else {
				System.out.println("Pagination coming, not working fine");
				}
			} else {
				System.out.println("Product count on page is more than speceified: " + productCount);
//				System.out.println(productCount);
			    String TotalProducts = Integer.toString(productCount);
				HashMapContainer.add("$$"+element, TotalProducts);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
}