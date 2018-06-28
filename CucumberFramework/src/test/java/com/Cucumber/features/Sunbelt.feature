@Sunbelt_CT
Feature: Sunbelt Regression Test Cases

@Login_Sunbelt
Scenario: Login to Sunbelt application
Given My WebApp 'Sunbelt' is open
And I wait for '3' seconds
And I enter 'test2' in field 'UserName_Sunbelt'
And I enter 'test2' in field 'Password'
And I click 'Login_Button'
And I wait for '10' seconds
Then I should see element 'SunbeltRentals' present on page_

#And I get title of page and store with 'title_name'
#And I get text from 'Build_a_list_tab' and store
#Then I compare 'Build_a_list_tab' with stored value '$$title_name'



@BuildAList 
Scenario: Validation on Build A List Page
And I wait for '5' seconds
And I click 'Industry_Name'
Then I should see element 'Industry_Name' present on page_
And I wait for '5' seconds
#And I scroll to 'coordinates' - '(0,300)'
And I wait for '3' seconds
And I get text from 'Results_Companies' and store
Then I should see element 'Results_Companies' present on page_
And I wait for '5' seconds
And I click 'Preview_Results'
And I wait for '5' seconds
Then I should see element 'Preview_Results_element' present on page_

@Preview_Results 
Scenario: Selecting Company Name
And I click 'Linkage'
And I wait for '2' seconds
And I navigate to back
And I wait for '2' seconds
And I click 'Checkbox_CompanyName'
Then I should see element 'Checkbox_CompanyName' present on page_
And I wait for '5' seconds
And I click focus 'Download_Results'
And I wait for '2' seconds
Then I should see element 'Download_Results' present on page_
And I click 'Download_Selected'
Then I should see element 'Download_Selected' present on page_
And I wait for '5' seconds
And I click 'DownloadAll'
And I wait for '5' seconds
Then I should see element 'CompanyName' present on page_
And I click 'CompanyName'

And I wait for '5' seconds
Then I should see element 'CompanyName_Page' present on page_

@Overview 
Scenario: Checking validations on Overview page
And I wait for '5' seconds
And I get text from 'D-U-N-S_Number' and store
Then I should see element 'D-U-N-S_Number' present on page_
And I wait for '3' seconds
And I click 'Download'
Then I should see element 'Download' present on page_
And I wait for '8' seconds
Then I should see element 'Print' present on page_
And I click 'Print'

And I wait for '5' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
And I wait for '3' seconds
And I click 'Financial_History'
And I wait for '3' seconds
And I should see element 'FinancialHistory_Content' present on page_
And I wait for '3' seconds
And I click 'Hierarchy'
And I wait for '3' seconds
And I should see element 'Hierarchy_Content' present on page_
And I wait for '3' seconds
#And I get text from 'Parent' and store
#Then I should see element 'Parent' present on page_
#And I wait for '3' seconds
And I click 'Parent_print'
Then I should see element 'Parent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_Parent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_Parent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'DomesticParent_print'
Then I should see element 'DomesticParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_DomesticParent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_DomesticParent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'UltimateParent_print'
Then I should see element 'UltimateParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'UltimateParent_print'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$UltimateParent_print' with '$$D-U-N-S_Number'


@FamilyTree
Scenario: Validation in Family Tree page
And I click 'FamilyTree'
Then I should see element 'FamilyTree' present on page_
And I wait for '10' seconds
Then I should see element 'Alternative_Tab' present on page_
And I click 'Alternative_Tab'
And I wait for '3' seconds
Then I should see element 'Minority_Tab' present on page_
And I click 'Minority_Tab'
And I wait for '3' seconds
And I click 'Print_FamilyTree'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I click 'Download_FamilyTree'
And I wait for '3' seconds
Then I should see element 'FamilyTree_tab' present on page_

@Contacts 
Scenario: Checking print validation 
And I click 'Contacts_tab'
And I wait for '3' seconds
And I click 'Print_Button'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'Contacts_tab' present on page_

@CompanySearch_DunsFile 
Scenario: Validations for Company Search Page
And I wait for '10' seconds
And I click 'CompanySearch_Button'
And I wait for '5' seconds
#And I click 'CompanyName_CompanySearch'
#And I wait for '5' seconds
#And I enter 'Microsoft' in field 'CompanyName_CompanySearch'
And I wait for '3' seconds
And I scroll to 'element' - 'UploadFile_Button'
#Then I should see element 'UploadFile_Button' present on page_
And I enter 'D:/New folder/5 DUNS.txt' in field 'UploadFile_Button'

#And I click 'UploadFile_Button'
#And I upload file to 'C:\Users\user\Desktop\5 DUNS.txt'
#And I enter 'C:\Users\user\Desktop\5 DUNS.txt' in field 'UploadFile_Button'

Then I should see element 'CompanySearch_Page' present on page_
And I wait for '10' seconds
And I click 'Search_Button_CompanySearch'
And I wait for '5' seconds
And I click 'Checkbox_CompanySearch'
And I wait for '3' seconds
And I click 'Download_CompanySearch'
And I wait for '3' seconds
And I click 'FilterOptions_CompanySearch'
And I wait for '3' seconds
And I click 'HideBranches_Filter'
And I wait for '3' seconds
And I click 'Refresh_Button'
And I wait for '5' seconds
And I click 'FilterOptions_CompanySearch'
And I wait for '3' seconds
And I click 'HideBranches_Filter'
And I wait for '3' seconds
And I click 'DomesticUltimateSite_Filter'
And I wait for '3' seconds
And I click 'Refresh_Button'
And I wait for '5' seconds
And I click 'FilterOptions_CompanySearch'
And I wait for '3' seconds
And I click 'DomesticUltimateSite_Filter'
And I wait for '3' seconds
And I click 'HeadquartersOnly_Filter'
And I wait for '3' seconds
And I click 'Refresh_Button'
And I wait for '3' seconds
And I click 'Linkage_CompanySearch'
And I wait for '5' seconds
And I navigate to back
And I wait for '5' seconds
Then I should see element 'CompanyName_CompanySearch_DunsFile' present on page_
And I click 'CompanyName_CompanySearch_DunsFile'

And I wait for '5' seconds
And I get text from 'D-U-N-S_Number' and store
Then I should see element 'D-U-N-S_Number' present on page_
And I wait for '3' seconds
And I click 'Download_CompanySearch_DunsFile'
And I wait for '3' seconds
And I click 'Print_CompanySearch_DunsFile'
And I wait for '3' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
And I wait for '3' seconds
And I click 'Financial_History_CompanySearch_DunsFile'
And I wait for '3' seconds
And I should see element 'FinancialHistory_Content_CompanySearch_DunsFile' present on page_
And I wait for '3' seconds
And I click 'Hierarchy_CompanySearch_DunsFile'
And I wait for '3' seconds
And I should see element 'Hierarchy_Content_CompanySearch_DunsFile' present on page_
And I wait for '3' seconds

And I click 'Parent_print'
Then I should see element 'Parent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_Parent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_Parent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'DomesticParent_print'
Then I should see element 'DomesticParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_DomesticParent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_DomesticParent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'UltimateParent_print'
Then I should see element 'UltimateParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'UltimateParent_print'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$UltimateParent_print' with '$$D-U-N-S_Number'
And I wait for '2' seconds

And I click 'FamilyTree_CompanySearch_DunsFile'
And I wait for '3' seconds
Then I should see element 'FamilyTree_CompanySearch_DunsFile' present on page_
And I click 'Alternative_Tab'
And I wait for '3' seconds
And I click 'Minority_Tab'
And I wait for '3' seconds
And I click 'Print_FamilyTree'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I click 'Download_FamilyTree'
And I wait for '3' seconds

And I click 'Contacts_tab_CompanySearch_DunsFile'
And I wait for '3' seconds
Then I should see element 'Print_Button_CompanySearch_DunsFile' present on page_
And I click 'Print_Button_CompanySearch_DunsFile'

And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CompanySearch_Page' present on page_

@IndustryAndCompany
Scenario: Checking results for Industry along with Company
And I click 'BuildAList_tab'
And I wait for '10' seconds
And I click 'Industry_Name_withCompanyName'
Then I should see element 'Industry_Name_withCompanyName' present on page_
And I wait for '5' seconds
And I click 'Company'
And I wait for '5' seconds
And I enter '100' in field 'Company_GreaterThanValue'
And I wait for '5' seconds
And I enter '1000' in field 'Company_LessThanValue'
Then I should see element 'Company_LessThanValue' present on page_
And I wait for '5' seconds
And I click 'Preview_CompanyResults'
And I wait for '5' seconds
And I click 'Linkage'
And I wait for '2' seconds
And I navigate to back
And I wait for '2' seconds
And I click 'Checkbox_CompanyName_IndustryAndCompany'
Then I should see element 'Checkbox_CompanyName_IndustryAndCompany' present on page_
And I wait for '5' seconds
And I click focus 'Download_Results_IndustryAndCompany'
And I wait for '2' seconds
And I click 'Download_Selected_IndustryAndCompany'
And I wait for '5' seconds
And I click 'DownloadAll_IndustryAndCompany'
And I wait for '5' seconds
Then I should see element 'CompanyName_IndustryAndCompany' present on page_
And I click 'CompanyName_IndustryAndCompany'

And I wait for '5' seconds
And I get text from 'D-U-N-S_Number' and store
Then I should see element 'S_Number' present on page_
And I wait for '3' seconds
And I click 'Download_IndustryAndCompany'
And I wait for '8' seconds
And I click 'Print_IndustryAndCompany'
And I wait for '5' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
And I wait for '3' seconds
And I click 'Financial_History_IndustryAndCompany'
And I wait for '3' seconds
And I should see element 'FinancialHistory_Content_IndustryAndCompany' present on page_
And I wait for '3' seconds
And I click 'Hierarchy_IndustryAndCompany'
And I wait for '3' seconds
And I should see element 'Hierarchy_Content_IndustryAndCompany' present on page_
And I wait for '3' seconds


And I click 'FamilyTree_IndustryAndCompany'
And I wait for '10' seconds
And I click 'Alternative_Tab_IndustryAndCompany'
And I wait for '3' seconds
And I click 'Minority_Tab_IndustryAndCompany'
And I wait for '3' seconds
And I click 'Print_FamilyTree_IndustryAndCompany'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I click 'Download_FamilyTree_IndustryAndCompany'
And I wait for '3' seconds

And I click 'Contacts_IndustryAndCompany'
And I wait for '3' seconds
And I click 'Print_Conatcts_IndustryAndCompany'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CompanySearch_Page' present on page_

@Industry_CreditPercentile 
Scenario: Checking results for Industry along with Credit Percentile
And I click 'BuildAList_tab'
And I wait for '10' seconds
And I click 'IndustryName_CreditPercentile'
And I wait for '5' seconds
And I click 'CreditPercentile'
And I wait for '5' seconds
And I enter '100' in field 'CreditPercentile_GreaterThanValue'
And I wait for '5' seconds
And I enter '1000' in field 'CreditPercentile_LessThanValue'
And I wait for '5' seconds
And I click 'Preview_CreditPercentile'
And I wait for '5' seconds

And I click 'Checkbox_CompanyName_IndustryAndCreditPercentile'
And I wait for '5' seconds
And I click focus 'Download_Results_IndustryAndCreditPercentile'
And I wait for '2' seconds
And I click 'Download_Selected_IndustryAndCreditPercentile'
And I wait for '8' seconds
And I click 'DownloadAll_IndustryAndCreditPercentile'
And I wait for '8' seconds
And I click 'CompanyName_IndustryAndCreditPercentile'
And I wait for '5' seconds

And I get text from 'D-U-N-S_Number' and store
And I wait for '3' seconds
And I click 'Download_IndustryAndCreditPercentile'
And I wait for '8' seconds
And I click 'Print_IndustryAndCreditPercentile'
And I wait for '5' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
And I wait for '3' seconds
And I click 'Financial_History_IndustryAndCreditPercentile'
And I wait for '3' seconds
And I should see element 'FinancialHistory_Content_IndustryAndCreditPercentile' present on page
And I wait for '3' seconds
And I click 'Hierarchy_IndustryAndCreditPercentile'
And I wait for '3' seconds
And I should see element 'Hierarchy_Content_IndustryAndCreditPercentile' present on page
And I wait for '3' seconds


And I click 'FamilyTree_IndustryAndCreditPercentile'
#And I wait for '10' seconds
#And I click 'Alternative_Tab_IndustryAndCreditPercentile'
And I wait for '3' seconds
#And I click 'Minority_Tab_IndustryAndCreditPercentile'
#And I wait for '3' seconds
#And I click 'Print_FamilyTree_IndustryAndCreditPercentile'
#And I wait for '3' seconds
#And I switch back to Main Window
#And I wait for '3' seconds
#And I click 'Download_FamilyTree_IndustryAndCreditPercentile'
And I wait for '3' seconds

And I click 'Contacts_IndustryAndCreditPercentile'
And I wait for '3' seconds
And I click 'Print_Conatcts_IndustryAndCreditPercentile'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CompanySearch_Page' present on page_

@IndustryLocationType 
Scenario: Checking for Industry with Location Type- Branch
And I click 'BuildAList_tab'
And I wait for '5' seconds
Then I should see element 'IndustryNameForLocationType' present on page_
And I click 'IndustryNameForLocationType'
And I wait for '5' seconds
And I click 'LocationType'
And I wait for '5' seconds
Then I should see element 'LocationType_Branch' present on page_
And I click 'LocationType_Branch'
And I wait for '5' seconds
And I click 'Preview_IndustryLocationType'
And I wait for '5' seconds
Then I should see element 'Linkage_IndustryLocationType' present on page_
And I click 'Linkage_IndustryLocationType'
And I wait for '5' seconds
And I navigate to back
And I wait for '4' seconds
And I click 'Checkbox_IndustryLocationType'
And I wait for '5' seconds
And I click focus 'Download_Results_IndustryLocationType'
And I wait for '2' seconds
And I click 'Download_Selected_IndustryLocationType'
And I wait for '5' seconds
And I click 'DownloadAll_IndustryLocationType'
And I wait for '5' seconds
And I click 'Linkage_IndustryLocationType'
And I wait for '5' seconds
And I click 'Overview_tab'
And I wait for '5' seconds
Then I should see element 'D-U-N-S_Number' present on page_
And I get text from 'D-U-N-S_Number' and store
And I wait for '3' seconds
And I click 'Download_IndustryLocationType'
And I wait for '8' seconds
And I click 'Print_IndustryLocationType'
And I wait for '5' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
And I wait for '5' seconds
And I click 'Overview_tab'
And I wait for '5' seconds
And I click 'Financial_History_IndustryLocationType'
And I wait for '5' seconds
And I should see element 'FinancialHistory_Content_IndustryLocationType' present on page_
And I wait for '5' seconds
And I click 'Hierarchy_IndustryLocationType'
And I wait for '5' seconds
And I should see element 'Hierarchy_Content_IndustryLocationType' present on page_
And I wait for '3' seconds
And I click 'Parent_print'
Then I should see element 'Parent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_Parent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_Parent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'DomesticParent_print'
Then I should see element 'DomesticParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_DomesticParent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_DomesticParent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'UltimateParent_print'
Then I should see element 'UltimateParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'UltimateParent_print'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$UltimateParent_print' with '$$D-U-N-S_Number'
And I click 'FamilyTree_IndustryLocationType'
And I wait for '10' seconds
And I click 'Alternative_Tab_IndustryLocationType'
And I wait for '3' seconds
And I click 'Minority_Tab_IndustryLocationType'
And I wait for '3' seconds
And I click 'Print_FamilyTree_IndustryLocationType'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I click 'Download_FamilyTree_IndustryLocationType'
And I wait for '3' seconds

And I click 'Contacts_IndustryLocationType'
And I wait for '3' seconds
And I click 'Print_Conatcts_IndustryLocationType'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CompanySearch_Page' present on page_

@IndustryAndGeography 
Scenario: Checking for Industry with Geography with zip code:60073
And I click 'BuildAList_tab'
And I wait for '10' seconds
Then I should see element 'IndustryNameForGeography' present on page_
And I click 'IndustryNameForGeography'
And I wait for '5' seconds
And I click 'Geography'
And I wait for '5' seconds
Then I should see element 'Geography_ZipCode' present on page_
And I enter '60073' in field 'Geography_ZipCode'
And I wait for '5' seconds
And I click 'Preview_IndustryAndGeography'
And I wait for '5' seconds

And I click 'Checkbox_IndustryAndGeography'
And I wait for '5' seconds
And I click focus 'Download_Results_IndustryAndGeography'
And I wait for '2' seconds
And I click 'Download_Selected_IndustryAndGeography'
And I wait for '5' seconds
And I click 'DownloadAll_IndustryAndGeography'
And I wait for '5' seconds
Then I should see element 'CompanyName_IndustryAndGeography' present on page_
And I click 'CompanyName_IndustryAndGeography'
And I wait for '5' seconds
Then I should see element 'D-U-N-S_Number' present on page_
And I get text from 'D-U-N-S_Number' and store
And I wait for '3' seconds
And I click 'Download_IndustryAndGeography'
And I wait for '8' seconds
And I click 'Print_IndustryAndGeography'
And I wait for '5' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
And I wait for '3' seconds
And I click 'Financial_History_IndustryAndGeography'
And I wait for '3' seconds
And I should see element 'FinancialHistory_Content_IndustryAndGeography' present on page_
And I wait for '3' seconds
And I click 'Hierarchy_IndustryAndGeography'
And I wait for '3' seconds
And I should see element 'Hierarchy_Content_IndustryAndGeography' present on page_
And I wait for '3' seconds
And I click 'Parent_print'
Then I should see element 'Parent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_Parent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_Parent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'DomesticParent_print'
Then I should see element 'DomesticParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_DomesticParent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_DomesticParent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'UltimateParent_print'
Then I should see element 'UltimateParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'UltimateParent_print'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$UltimateParent_print' with '$$D-U-N-S_Number'
And I click 'FamilyTree_IndustryAndGeography'
And I wait for '3' seconds
Then I should see element 'Print_FamilyTree_IndustryAndGeography' present on page_
And I click 'Print_FamilyTree_IndustryAndGeography'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I click 'Download_FamilyTree_IndustryAndGeography'
And I wait for '3' seconds

And I click 'Contacts_IndustryAndGeography'
And I wait for '3' seconds
Then I should see element 'Print_Conatcts_IndustryAndGeography' present on page_
And I click 'Print_Conatcts_IndustryAndGeography'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CompanySearch_Page' present on page_

@CustomerProspect 
Scenario: Checking for Customer Prospect, Selected Customer - Active Customer
And I click 'BuildAList_tab'
And I wait for '10' seconds
Then I should see element 'IndustryNameCustomerProspect' present on page_
And I click 'IndustryNameCustomerProspect'
And I wait for '5' seconds
And I click 'CustomerProspect'
And I wait for '5' seconds
And I click 'Customer_Checkbox'
And I wait for '10' seconds
Then I should see element 'ActiveCustomer' present on page_
And I click 'ActiveCustomer'
And I wait for '10' seconds
And I click 'Preview_CustomerProspect'
And I wait for '5' seconds
And I click 'Linkage_CustomerProspect'
And I wait for '3' seconds
And I navigate to back
And I wait for '5' seconds
Then I should see element 'Checkbox_CustomerProspect' present on page_
And I click 'Checkbox_CustomerProspect'
And I wait for '5' seconds
And I click focus 'Download_Results_CustomerProspect'
And I wait for '2' seconds
And I click 'DownloadSelected_Results_CustomerProspect'
And I wait for '5' seconds
And I click 'DownloadAll_CustomerProspect'
And I wait for '5' seconds
And I click 'Linkage_CustomerProspect'
And I wait for '5' seconds
Then I should see element 'Overview_tab' present on page_
And I click 'Overview_tab'
And I wait for '5' seconds
And I get text from 'D-U-N-S_Number' and store
And I wait for '3' seconds
And I click 'Download_CustomerProspect'
And I wait for '8' seconds
And I click 'Print_CustomerProspect'
And I wait for '5' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
#And I wait for '3' seconds
And I wait for '5' seconds
And I click 'Overview_tab'
And I wait for '5' seconds
And I click 'Financial_History_CustomerProspect'
And I wait for '3' seconds
And I should see element 'FinancialHistory_Content_CustomerProspect' present on page_
And I wait for '3' seconds
And I click 'Hierarchy_CustomerProspect'
And I wait for '3' seconds
And I should see element 'Hierarchy_Content_CustomerProspect' present on page_
And I wait for '3' seconds
And I click 'Parent_print'
Then I should see element 'Parent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_Parent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_Parent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'DomesticParent_print'
Then I should see element 'DomesticParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_DomesticParent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_DomesticParent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'UltimateParent_print'
Then I should see element 'UltimateParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'UltimateParent_print'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$UltimateParent_print' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'FamilyTree_CustomerProspect'
And I wait for '10' seconds
Then I should see element 'Alternative_Tab_CustomerProspect' present on page_
And I click 'Alternative_Tab_CustomerProspect'
And I wait for '3' seconds
Then I should see element 'Minority_Tab_CustomerProspect' present on page_
And I click 'Minority_Tab_CustomerProspect'
And I wait for '3' seconds
And I click 'Print_FamilyTree_CustomerProspect'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I click 'Download_FamilyTree_CustomerProspect'
And I wait for '3' seconds
Then I should see element 'Contacts_CustomerProspect' present on page_
And I click 'Contacts_CustomerProspect'
And I wait for '3' seconds
And I click 'Print_Conatcts_CustomerProspect'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CompanySearch_Page' present on page_


@CompanySearch 
Scenario: Company Search with Country and State.
And I click 'CompanySearch_Button'
And I wait for '5' seconds
And I enter 'Microsoft Corporation' in field 'CompanyName_CompanySearch'
And I wait for '3' seconds
And I click 'RecentMatches'
And I wait for '3' seconds
And I select option 'CA' in dropdown 'State' by 'value'
And I wait for '3' seconds
Then I should see element 'Search_Button_CompanySearch' present on page_
And I click 'Search_Button_CompanySearch'
And I wait for '5' seconds
And I click 'Linkage_CompanySearch'
And I wait for '5' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CheckboxCompanySearch' present on page_
And I click 'CheckboxCompanySearch'
And I wait for '3' seconds
And I click 'DownloadCompanySearch'
And I wait for '3' seconds
And I click 'FilterOptionsCompanySearch'
And I wait for '3' seconds
And I click 'HideBranchesFilter'
And I click 'Refresh_Button'
And I wait for '3' seconds
And I click 'FilterOptionsCompanySearch'
And I wait for '3' seconds
And I click 'HideBranchesFilter'
And I click 'HeadquartersOnlyFilter'
And I click 'RefreshButton'
And I wait for '3' seconds
And I click 'FilterOptionsCompanySearch'
And I wait for '3' seconds
And I click 'HeadquartersOnlyFilter'
And I click 'DomesticUltimateSiteFilter'
And I click 'RefreshButton'
And I wait for '3' seconds
Then I should see element 'CompanyNameCompanySearch' present on page_
And I click 'CompanyNameCompanySearch'
And I wait for '5' seconds
Then I should see element 'D-U-N-S_Number' present on page_
And I get text from 'D-U-N-S_Number' and store
And I wait for '3' seconds
And I click 'DownloadcompanySearch'
And I wait for '3' seconds
And I click 'PrintCompanySearch'
And I wait for '3' seconds
And I get title of page and store with 'title_name'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
And I compare '$$title_name' with '$$D-U-N-S_Number'
And I wait for '3' seconds
And I click 'Financial_HistoryCompanySearch'
And I wait for '3' seconds
And I should see element 'FinancialHistory_ContentCompanySearch' present on page_
And I wait for '3' seconds
And I click 'HierarchyCompanySearch'
And I wait for '3' seconds
And I should see element 'Hierarchy_ContentCompanySearch' present on page_
And I wait for '3' seconds
And I click 'Parent_print'
Then I should see element 'Parent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_Parent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_Parent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'DomesticParent_print'
Then I should see element 'DomesticParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'titlename_DomesticParent'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$titlename_DomesticParent' with '$$D-U-N-S_Number'
And I wait for '2' seconds
And I click 'UltimateParent_print'
Then I should see element 'UltimateParent_print' present on page_
And I wait for '3' seconds
And I get title of page and store with 'UltimateParent_print'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I compare '$$UltimateParent_print' with '$$D-U-N-S_Number'
And I wait for '3' seconds

And I click 'FamilyTreeCompanySearch'
And I wait for '3' seconds
Then I should see element 'Alternative_Tab_CompanySearch' present on page_
And I click 'Alternative_Tab_CompanySearch'
And I wait for '3' seconds
Then I should see element 'Minority_Tab_CompanySearch' present on page_
And I click 'Minority_Tab_CompanySearch'
And I wait for '3' seconds
And I click 'Print_FamilyTree_CompanySearch'
And I wait for '3' seconds
And I switch back to Main Window
And I wait for '3' seconds
And I click 'Download_FamilyTree_CompanySearch'
And I wait for '3' seconds
And I click 'Contacts_tabCompanySearch'
And I wait for '3' seconds
Then I should see element 'Print_ButtonCompanySearch' present on page_
And I click 'Print_ButtonCompanySearch'
And I wait for '3' seconds
And I navigate to back
And I wait for '3' seconds
Then I should see element 'CompanySearch_Page' present on page_
And I wait for '3' seconds
And I click 'LogOut'