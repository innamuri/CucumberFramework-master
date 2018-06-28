package com.Cucumber.stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.Cucumber.framework.HashMapContainer;
import com.Cucumber.framework.StepBase;
import com.Cucumber.framework.WrapperFunctions;
import com.Cucumber.pageObjects.GetPageObject;

import cucumber.api.java.en.Given;
import cucumber.runtime.CucumberException;

public class IHS_eCommerce_Custom_TestDefinitions {
	private static WrapperFunctions wrapFunc = new WrapperFunctions();
	private static int rowCount;
	private static int columns_count;
	private static String[][] TableValue = new String[100][100]; ;
	private static WebDriver driver = CommonSteps.driver; 
	public static By PlanListing_NameColumn = By.xpath("//th[contains(text(),\"Name\")]");
	public static By PlanListing_StatusColumn = By.xpath("//th[contains(text(),\"Status\")]");
	public static By PlanListing_EnrollmentColumn = By.xpath("//th[contains(text(),\"Enrollment\")]");
	public static By PlanListing_DescriptionColumn = By.xpath("//th[contains(text(),\"Description\")]");
	public static By PlanListing_ActionColumn = By.xpath("//th[contains(text(),\"Action\"]");
	public static By PlanListing_Table = By.id("listingGrid");
	//public static By PlanListing_TableBody = By.xpath("//*[@id=\"listingGrid\"]/tbody[1]");

	private static int get_CurrentTableRowCount(By Table)throws Exception{
		try{
			//ProcessTable(GetPageObject.OR_GetElement(Table));
			ProcessTable(Table);
			return rowCount;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	private static String get_CellValue(int row, int column, By Table)throws Exception{
		try{
			//ProcessTable(GetPageObject.OR_GetElement(Table));
			ProcessTable(Table);
			System.out.println("Cell Value: "+TableValue[row][column]); 
			return TableValue[row][column];
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	private static void ProcessTable(By Table){
		WebElement CTable = driver.findElement(Table);
		List<WebElement> rows_CTable = CTable.findElements(By.tagName("tr"));
		rowCount = rows_CTable.size();
		System.out.println("row count: "+rowCount);
		//Loop will execute till the last row of table.
		for (int row=0; row<rowCount; row++){
			//To locate columns(cells) of that specific row.
			List<WebElement> Columns_row = rows_CTable.get(row).findElements(By.tagName("td"));
			//To calculate no of columns(cells) In that specific row.
			columns_count = Columns_row.size();
			System.out.println("column count:"+columns_count);
			//Loop will execute till the last cell of that specific row.
			for (int column=0; column<columns_count; column++){
				//To retrieve text from that specific cell.
				String celtext = Columns_row.get(column).getText();
				TableValue[row][column] = celtext;
				System.out.println("Table value: "+TableValue[row][column]+" "+row+" "+column);
			}
		}
	}

	@Given("^I verify that field '(.*)' should be highlighted with Colour: '(.*)'$")
	public static void my_nativeapp_is_open(String element, String colour) throws Exception {
		try {
			String bgcolour = driver.findElement(GetPageObject.OR_GetElement(element)).getCssValue("background-color");
			Assert.assertEquals(bgcolour, colour, "The mentioned Element is not Highlighted or Expected colour does not match!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Given("^I verify value: '(.*)' in column: '(.*)' of all rows of table: '(.*)'$")
	public static void Verify_Columnvalue_inAllRows_in_Table(String ExpectedValue, int column, String table) throws Exception {
		try {
			String ActualValue=null;
			ProcessTable(GetPageObject.OR_GetElement(table));
			for(int i =0; i<get_CurrentTableRowCount(GetPageObject.OR_GetElement(table));i++){
				 ActualValue = get_CellValue(i, (column-1), GetPageObject.OR_GetElement(table));
			}
			Assert.assertEquals(ActualValue, ExpectedValue,"Expected Value does not match Actual Value in table");
			StepBase.embedScreenshot();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Given("^I Click '(.*)' with reference to '(.*)'$")
	public static void click_with_refrence(String element, String reference) {
		try {
			HashMapContainer.add("SKU", reference);
			
			if(element.equals("selectItem_checkBox")){
			driver.findElement(By.xpath("(//td[contains(.,'"+HashMapContainer.get("SKU")+"')]/..//td/..//td/div/input[@type='checkbox'])")).click();
			}else if (element.equals("selectItem_cog")){
			driver.findElement(By.xpath("(//td[contains(.,'"+HashMapContainer.get("SKU")+"')]/..//td/..//td/div/a/i[@class='fa fa-cog'])")).click();
			}
			wrapFunc.waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
	
	@Given("^I verify table values '(.*)' in Product table in Product Management page$")
	public static void verifyTableValue_ProductManagementPage(String values) {
		try {
			String[] ExpectedValue = values.split("|");
			String[] tablevalue = values.split("|");
			for(int i = 0; i<tablevalue.length; i++){
			WebElement tableval = driver.findElement(GetPageObject.OR_GetElement(tablevalue[i]));
			String ActualValue = tableval.getText();
			WrapperFunctions.highLightElement(tableval);
			System.out.println("Actual value: "+ActualValue+" Expected Value: "+ExpectedValue[i]);
			Assert.assertEquals(ActualValue, ExpectedValue[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CucumberException(e.getMessage(), e);
		}
	}
		
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/com/Cucumber/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ecadqa1.ihs.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("swathin.ratheendren@ihsmarkit.com");
		driver.findElement(By.id("Password")).sendKeys("IHS_Markit123$");
		driver.findElement(By.id("Password")).submit();
		Thread.sleep(5000);
		driver.navigate().to("http://ecadqa1.ihs.com/Management/Productsbeta");
		//WebElement table = driver.findElement(By.xpath("//table[@class='btn btn-primary btn-sm']"));
		By table = By.xpath("//*[@id='mainContent']/div/div[2]/div/div[2]/div/table/tbody"); 
		
		ProcessTable(table);
		/*
		driver.findElement(By.xpath("(//input[@name='ptermDuration.name'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='ptermDuration.name'])[3]")).click();
		//driver.findElement(By.xpath("(//input[@name='ptermDuration.name'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='pRenew.name'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='pRenew.name'])[3]")).click();
		//driver.findElement(By.xpath("(//input[@name='pRenew.name'])[1]")).click();
		driver.findElement(By.xpath("(//label[contains(.,'No')])/..//input[@ng-model='plan.planBean.blnCalendarBased']")).click();
		driver.findElement(By.xpath("(//label[contains(.,'Yes')])/..//input[@ng-model='plan.planBean.blnCalendarBased']")).click();
		driver.findElement(By.xpath("(//label[contains(.,'No')])/..//input[@ng-model='plan.planBean.blnProratePayment']")).click();
		driver.findElement(By.xpath("(//label[contains(.,'Yes')])/..//input[@ng-model='plan.planBean.blnProratePayment']")).click();
		driver.findElement(By.xpath("(//label[contains(.,'No')])/..//input[@ng-model='plan.planBean.blnMinThreshold']")).click();
		driver.findElement(By.xpath("(//label[contains(.,'Yes')])/..//input[@ng-model='plan.planBean.blnMinThreshold']")).click();
		Thread.sleep(10000);*/
		/*Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@ng-click=\"pageNavigateToCreate()\"]")).click();
		Thread.sleep(12000);
		Select_Plan_StartMonth2("September","2021");
		Thread.sleep(7000);*/
		
		//get_CurrentTableRowCount(PlanListing_TableBody);
		//ProcessTable(PlanListing_TableBody);
		//get_CurrentTableColumnsCount(PlanListing_TableBody);
		//get_CurrentTableRowCount(PlanListing_TableBody);
		//get_CellValue(0, 1, PlanListing_TableBody);
		//driver.close();
	}
}
