package com.Cucumber.stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.framework.StepBase;
import com.Cucumber.framework.Utilities;
import com.Cucumber.framework.WrapperFunctions;
import com.Cucumber.pageObjects.GetPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.CucumberException;

public class IHSMarkit_CustomSteps {
	private static WebDriver driver = StepBase.getDriver();
	private static WrapperFunctions wrapFunc= new WrapperFunctions();
	private static String EMAP_DEV_DBUrl = "IHSCOMSCUSDDB.ihsmpub.local";
	private static String EMAP_DEV_DBName = "CWAdmin";
	private static String EMAP_DEV_DBUserName = "gxb53511";
	private static String EMAP_DEV_DBPassword = "AP9R@jV3K0Qx5";
	
	
	@Then("^I should see the added '(.*)'$")
	public static void i_should_see_added_SessionOrSpeaker(String text) throws Exception {
		try {
			String td = "//td[text()='" + text + "']";
			WrapperFunctions.highLightElement(StepBase.getDriver().findElement(By.xpath(td)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Given("^I verify dropdown '(.*)' is selected by '(.*)'$")
	public static void I_verify_dropdownContent(String element, String text) throws Exception {
		try {
			wrapFunc.waitForElementPresence(GetPageObject.OR_GetElement(element));
			WebElement findElement = driver.findElement(GetPageObject.OR_GetElement(element));
			Select sc = new Select(findElement);
			String text2 = sc.getFirstSelectedOption().getText();
			Assert.assertEquals(text2,text);
			WrapperFunctions.highLightElement(findElement);

		} catch (Exception e) {
			throw new Exception("Drop Down not selected");
		}
	}
	
	@Then("^I should see added '(.*)' in Agenda Page$")
	public static void i_should_see_added(String text) {
		try {

			String td = "//*[text()[contains(.,'" + text + "')]]";
			WrapperFunctions.highLightElement(driver.findElement(By.xpath(td)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Then("^I should see added timeslot '(.*)' in Agenda Page$")
	public static void i_should_see_added_timeslot(String text) {
		try {
			String td = "//*[text()[contains(.,'" + text + "')]]";
			WrapperFunctions.highLightElement(driver.findElement(By.xpath(td)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@When("^I Create new Speaker Tier as '(.*)'$")
	public static void i_create_new_speaker_tier(String text) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
			List<WebElement> row = driver.findElements(By.xpath("(//table[@class='table'])[2]//tr"));
			for (int i = 2; i < row.size(); i++) {

				try {
					driver.findElement(By.xpath("(//table[@class='table'])[2]//tr[" + i + "]//td//input[@ng-reflect-model]"))
							.isDisplayed();
				} catch (Exception e) {
					driver.findElement(By.xpath("(//input[@placeholder='Enter speaker tier name'])[" + i + "]"))
							.sendKeys(text);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("^I Create new session Status as '(.*)'$")
	public static void i_create_new_session_tier(String text) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
			List<WebElement> row = driver.findElements(By.xpath("(//table[@class='table'])[1]//tr"));
			for (int i = 2; i < row.size(); i++) {

				try {
					driver.findElement(
							By.xpath("(//table[@class='table'])[1]//tr[" + i + "]//td//input[@ng-reflect-model]"))
							.isDisplayed();
				} catch (Exception e) {
					driver.findElement(By.xpath("(//input[@placeholder='Enter status name'])[" + i + "]"))
							.sendKeys(text);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Given("^I execute Query '(.*)' on EMAP DB(dev) to see ColumnIndex:'(.*)'$")
	public static void EMAP_ExecuteQuery(String QueryStatement, String ColumnIndex) throws Exception {
		try {			
			Utilities.getDBData(EMAP_DEV_DBUrl,EMAP_DEV_DBName,EMAP_DEV_DBUserName,EMAP_DEV_DBPassword, QueryStatement,Integer.parseInt(ColumnIndex));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	
	@Given("^I execute Query to Delete Speaker who's FirstName is '(.*)'$")
	public static void EMAP_DeleteSpeakerQuery(String SpeakerFirstName) throws Exception {
		try {	
			String QueryStatement = "Declare @speakerid int\r\n" + 
					"\r\n" + 
					"print 'Speaker Records Deletion for a specific Speakers'\r\n" + 
					"print '---------------------------------------------------------'\r\n" + 
					"print ''\r\n" + 
					"\r\n" + 
					"DECLARE db_cursor CURSOR FOR \r\n" + 
					"SELECT SpeakerId FROM dbo.Speaker\r\n" + 
					"WHERE FirstName = '"+SpeakerFirstName+"' -- SpeakerId\r\n" + 
					"\r\n" + 
					"OPEN db_cursor  \r\n" + 
					"FETCH NEXT FROM db_cursor INTO @speakerid\r\n" + 
					"WHILE @@FETCH_STATUS = 0  \r\n" + 
					"BEGIN  \r\n" + 
					"      \r\n" + 
					"	  -- Delete those Speaker Id related data in the child table\r\n" + 
					"	  BEGIN TRANSACTION t1\r\n" + 
					"	  BEGIN TRY\r\n" + 
					"				print 'Transaction Started for the Speaker Id: ' + convert(nvarchar(50), @speakerid) + ' ........ '\r\n" + 
					"\r\n" + 
					"				print '1. --> Deleting Records from the table: dbo.EventSpeakerTaxonomy'  \r\n" + 
					"				Delete from dbo.EventSpeakerTaxonomy where EventSpeakerId IN (SELECT EventSpeakerId FROM dbo.EventSpeaker where SpeakerId = @speakerid)\r\n" + 
					"\r\n" + 
					"				print '2. --> Deleting Records from the table: dbo.EventSessionSpeaker'  \r\n" + 
					"				Delete from dbo.EventSessionSpeaker where EventSpeakerId IN (SELECT EventSpeakerId FROM dbo.EventSpeaker where SpeakerId = @speakerid)\r\n" + 
					"\r\n" + 
					"				print '3. --> Deleting Records from the table: dbo.SpeakerAdditionalContact'  \r\n" + 
					"				Delete from dbo.SpeakerAdditionalContact where SpeakerId = @speakerid\r\n" + 
					"\r\n" + 
					"				print '4. --> Deleting Records from the table:dbo.EventSpeakerConferencePartner'  				\r\n" + 
					"				Delete from dbo.EventSpeakerConferencePartner where EventSpeakerId IN (select EventSpeakerId from dbo.EventSpeaker where SpeakerId = @speakerid)\r\n" + 
					"				\r\n" + 
					"				print '5. --> Deleting Records from the table: dbo.EventSpeaker'  \r\n" + 
					"				Delete from dbo.EventSpeaker where EventSpeakerId IN (SELECT EventSpeakerId FROM dbo.EventSpeaker where SpeakerId = @speakerid)			\r\n" + 
					"\r\n" + 
					"				print '6. --> Deleting Records from the table: dbo.Speaker'  \r\n" + 
					"				Delete from dbo.Speaker where SpeakerId = @speakerid			\r\n" + 
					"				\r\n" + 
					"						 \r\n" + 
					"		  COMMIT TRANSACTION t1\r\n" + 
					"		  print 'Transaction Commited for the Speaker Id: ' + convert(nvarchar(50), @speakerid)\r\n" + 
					"		  print ' ######################################################################################################## '\r\n" + 
					"		  print ''\r\n" + 
					"	  END TRY\r\n" + 
					"	  BEGIN CATCH\r\n" + 
					"			ROLLBACK TRANSACTION t1\r\n" + 
					"			print 'Error and Transaction is rollbacked for the Speaker Id: ' + convert(nvarchar(50),@speakerid) + ' ***************** '\r\n" + 
					"			SELECT ERROR_NUMBER() AS ErrorNumber, ERROR_MESSAGE() AS ErrorMessage;\r\n" + 
					"	  END CATCH\r\n" + 
					"	 \r\n" + 
					"      FETCH NEXT FROM db_cursor INTO @speakerid \r\n" + 
					"END \r\n" + 
					"\r\n" + 
					"CLOSE db_cursor  \r\n" + 
					"DEALLOCATE db_cursor ";
			Utilities.ExecuteQuery(EMAP_DEV_DBUrl,EMAP_DEV_DBName,EMAP_DEV_DBUserName,EMAP_DEV_DBPassword, QueryStatement);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Given("^I execute Query to Delete Session with Title - '(.*)'$")
	public static void EMAP_DeleteSessionQuery(String SessionTitle) throws Exception {
		try {	
			String QueryStatement = "Declare @eventsessionid int\r\n" + 
					"\r\n" + 
					"print 'Sessions Records Deletion for a specific Sessions'\r\n" + 
					"print '---------------------------------------------------------'\r\n" + 
					"print ''\r\n" + 
					"\r\n" + 
					"DECLARE db_cursor CURSOR FOR \r\n" + 
					"SELECT EventSessionId FROM dbo.EventSession\r\n" + 
					"WHERE SessionTitle = '"+SessionTitle+"' -- SessionID\r\n" + 
					"\r\n" + 
					"OPEN db_cursor  \r\n" + 
					"FETCH NEXT FROM db_cursor INTO @eventsessionid\r\n" + 
					"WHILE @@FETCH_STATUS = 0  \r\n" + 
					"BEGIN  \r\n" + 
					"      \r\n" + 
					"	  -- Delete those Speaker Id related data in the child table\r\n" + 
					"	  BEGIN TRANSACTION t1\r\n" + 
					"	  BEGIN TRY\r\n" + 
					"				print 'Transaction Started for the Event Session Id: ' + convert(nvarchar(50), @eventsessionid) + ' ........ '\r\n" + 
					"\r\n" + 
					"				print '1. --> Deleting Records from the table: dbo.EventSessionHyperLink'  \r\n" + 
					"				Delete from dbo.EventSessionHyperLink where EventSessionId IN (SELECT EventSessionId FROM dbo.EventSession where EventSessionId = @eventsessionid)\r\n" + 
					"\r\n" + 
					"				print '2. --> Deleting Records from the table: dbo.EventSessionSpeaker'  \r\n" + 
					"				Delete from dbo.EventSessionSpeaker where EventSessionId IN (SELECT EventSessionId FROM dbo.EventSession where EventSessionId = @eventsessionid)\r\n" + 
					"\r\n" + 
					"				print '3. --> Deleting Records from the table: dbo.EventSessionTaxonomy'  \r\n" + 
					"				Delete from dbo.EventSessionTaxonomy where EventSessionId IN (SELECT EventSessionId FROM dbo.EventSession where EventSessionId = @eventsessionid)\r\n" + 
					"\r\n" + 
					"				print '4. --> Deleting Records from the table:dbo.EventTimeSlotSession'  				\r\n" + 
					"				Delete from dbo.EventTimeSlotSession where EventSessionId IN (SELECT EventSessionId FROM dbo.EventSession where EventSessionId = @eventsessionid)\r\n" + 
					"				\r\n" + 
					"				print '5. --> Deleting Records from the table: dbo.EventSession'  \r\n" + 
					"				Delete from dbo.EventSession where EventSessionId = @eventsessionid\r\n" + 
					"								\r\n" + 
					"						 \r\n" + 
					"		  COMMIT TRANSACTION t1\r\n" + 
					"		  print 'Transaction Commited for the Event Session Id: ' + convert(nvarchar(50), @eventsessionid)\r\n" + 
					"		  print ' ######################################################################################################## '\r\n" + 
					"		  print ''\r\n" + 
					"	  END TRY\r\n" + 
					"	  BEGIN CATCH\r\n" + 
					"			ROLLBACK TRANSACTION t1\r\n" + 
					"			print 'Error and Transaction is rollbacked for the Event Session Id: ' + convert(nvarchar(50),@eventsessionid) + ' ***************** '\r\n" + 
					"			SELECT ERROR_NUMBER() AS ErrorNumber, ERROR_MESSAGE() AS ErrorMessage;\r\n" + 
					"	  END CATCH\r\n" + 
					"	 \r\n" + 
					"      FETCH NEXT FROM db_cursor INTO @eventsessionid\r\n" + 
					"END \r\n" + 
					"\r\n" + 
					"CLOSE db_cursor  \r\n" + 
					"DEALLOCATE db_cursor ";
			Utilities.ExecuteQuery(EMAP_DEV_DBUrl,EMAP_DEV_DBName,EMAP_DEV_DBUserName,EMAP_DEV_DBPassword, QueryStatement);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Given("^I execute Query to Delete Timeslot with Title - '(.*)'$")
	public static void EMAP_DeleteTimeslotQuery(String TimeslotTitle) throws Exception {
		try {	
			String QueryStatement = "Declare @eventtimeslotid int\r\n" + 
					"\r\n" + 
					"print 'Event Time Slot Records Deletion for a specific Timeslot'\r\n" + 
					"print '---------------------------------------------------------'\r\n" + 
					"print ''\r\n" + 
					"\r\n" + 
					"DECLARE db_cursor CURSOR FOR \r\n" + 
					"SELECT EventTimeSlotId FROM dbo.EventTimeSlot\r\n" + 
					"WHERE TimeSlotTitle = '"+TimeslotTitle+"' -- SpeakerId\r\n" + 
					"\r\n" + 
					"OPEN db_cursor  \r\n" + 
					"FETCH NEXT FROM db_cursor INTO @eventtimeslotid\r\n" + 
					"WHILE @@FETCH_STATUS = 0  \r\n" + 
					"BEGIN  \r\n" + 
					"      \r\n" + 
					"	  -- Delete those Timeslot Id related data in the child table\r\n" + 
					"	  BEGIN TRANSACTION t1\r\n" + 
					"	  BEGIN TRY\r\n" + 
					"				print 'Transaction Started for the Event Timeslot Id: ' + convert(nvarchar(50), @eventtimeslotid) + ' ........ '\r\n" + 
					"\r\n" + 
					"				print '1. --> Deleting Records from the table: dbo.EventTimeSlotSession'  \r\n" + 
					"				Delete from dbo.EventTimeSlotSession where EventTimeSlotId IN (SELECT EventTimeSlotId FROM dbo.EventTimeSlot where EventTimeSlotId = @eventtimeslotid)\r\n" + 
					"\r\n" + 
					"				print '2. --> Deleting Records from the table: dbo.EventTimeSlot'  \r\n" + 
					"				Delete from dbo.EventTimeSlot where EventTimeSlotId = @eventtimeslotid												\r\n" + 
					"						 \r\n" + 
					"		  COMMIT TRANSACTION t1\r\n" + 
					"		  print 'Transaction Commited for the Event Timeslot Id: ' + convert(nvarchar(50), @eventtimeslotid)\r\n" + 
					"		  print ' ######################################################################################################## '\r\n" + 
					"		  print ''\r\n" + 
					"	  END TRY\r\n" + 
					"	  BEGIN CATCH\r\n" + 
					"			ROLLBACK TRANSACTION t1\r\n" + 
					"			print 'Error and Transaction is rollbacked for the Event Timeslot Id: ' + convert(nvarchar(50),@eventtimeslotid) + ' ***************** '\r\n" + 
					"			SELECT ERROR_NUMBER() AS ErrorNumber, ERROR_MESSAGE() AS ErrorMessage;\r\n" + 
					"	  END CATCH\r\n" + 
					"	 \r\n" + 
					"      FETCH NEXT FROM db_cursor INTO @eventtimeslotid\r\n" + 
					"END \r\n" + 
					"\r\n" + 
					"CLOSE db_cursor  \r\n" + 
					"DEALLOCATE db_cursor ";
			Utilities.ExecuteQuery(EMAP_DEV_DBUrl,EMAP_DEV_DBName,EMAP_DEV_DBUserName,EMAP_DEV_DBPassword, QueryStatement);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}

}
