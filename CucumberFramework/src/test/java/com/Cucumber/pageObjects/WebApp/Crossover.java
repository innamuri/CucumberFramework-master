package com.Cucumber.pageObjects.WebApp;


import com.Cucumber.pageObjects.GetPageObject;

public class Crossover {

	static GetPageObject PO = new GetPageObject();

//   Crossover_Home
		public static void Crossover_Home(){
			PO.add("url::https://www.crossover.com/");
			PO.add("Homelogo::id=top");
		}	

//   Crossover_JobsLink 
		public static void Crossover_JobsLink(){
			PO.add("AvailableJobs_Link::linkText=Available Jobs");
			PO.add("JobTitle_Field::xpath=//*[@id=\"available-jobs\"]/div[2]/form/div/div[1]/div/input");
		}	
			
//   Crossover_Chief_Search
		public static void Crossover_Chief_Search(){			
			PO.add("Search_Jobs_Button::xpath=//*[@id=\"available-jobs\"]/div[2]/form/div/div[3]/button");
			PO.add("Searched_Text_Verify::xpath=//*[@id=\"available-jobs\"]/div[3]/div[1]/span[2]");
		}

//   Crossover_Java_From_Dropdown
		public static void Crossover_Java_From_Dropdown(){		
			PO.add("Reset_button::xpath=//*[@id=\"available-jobs\"]/div[3]/div[1]/button");
			PO.add("Dropdown::xpath=//*[@id=\"available-jobs\"]/div[2]/form/div/div[2]/job-label-select/div/input[1]");
			PO.add("All_Job_Categories_Dropdown::xpath=//*[@id=\"available-jobs\"]/div[2]/form/div/div[2]/job-label-select/div/div[1]/span/span[2]/span");
			PO.add("Software_Development_Category::xpath=//*[@id=\"ui-select-choices-row-7-1\"]/span/div/span");
			PO.add("Java_Category::linkText=Java");
			PO.add("iOS&Android_Category::xpath=//*[@id=\"ui-select-choices-row-2-5\"]/span/div/span");
		}	

//   Crossover_Main_Page
		public static void Crossover_Main_Page(){
			PO.add("Company::xpath=/html/body/div[2]/div[1]/div/header/nav/div/h1/a/div");
		}	
		

	//Load PageObjects 
	public static void loadallPageObjects(){
		Crossover_Home();
		Crossover_JobsLink();
		Crossover_Chief_Search();
		Crossover_Java_From_Dropdown();
		Crossover_Main_Page();
		
		System.out.println("Object Load to HM Successfull!");
	}

	public static void main(String[] args) {
		Crossover_Home();
		Crossover_JobsLink();
		Crossover_Chief_Search();
		Crossover_Java_From_Dropdown();
		Crossover_Main_Page();
		
		System.out.println("Object Load to HM Successfull!");
	}
}
