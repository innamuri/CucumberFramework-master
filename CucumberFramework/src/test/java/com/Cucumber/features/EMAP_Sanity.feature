@EMAP_Sanity 
Feature: A set of Smoke/Sanity Tests to check EMAP Application stability 

Background: Login to EMAP Application 
Given My WebApp 'IHSMarkit_EMAP' is open 
When I enter 'swathin.ratheendren@ihsmarkit.com' in field 'EMAP_EmailLogin' 
When I enter 'RCyberG0488$' in field 'EMAP_Password' 
And I select option 'CERAWeek Conference' in dropdown 'EMAP_Conference' by 'text' 
And I click 'EMAP_SignIn' 
Then I should see text 'Swathin' present on page

@AddSpeaker  
Scenario Outline: Verify User is able to add New Speaker in the speakers Page
When I click 'Speaker_MainMenu' 
And I click 'Speaker_SubMenu' 
And I wait for '20' seconds 
And I click 'SpeakerCog'
And I wait for '20' seconds
And I click 'AddNewSpeaker' 
And I wait for '5' seconds 
And I click 'Speaker_AddButton'
And I should see text 'Last name is a required field.' present on page at 'Speaker_LastNameReqErrorMsg'
And I should see text 'First name is a required field.' present on page at 'Speaker_FirstNameReqErrorMsg'
Then I click 'Speaker_CancelButton'
And I wait for '10' seconds
And I click 'SpeakerCog'
And I click 'AddNewSpeaker'
And I wait for '5' seconds 
When I enter '<Salutation>' in field 'Speaker_Salutation' 
And I enter '<Email>' in field 'Speaker_Email' 
And I enter '<SpeakerLastname>' in field 'Speaker_Lastname' 
And I enter '<SpeakerFirstname>' in field 'Speaker_Firstname' 
And I enter '<SpeakerPhone>' in field 'Speaker_Phone' 
And I enter '<SpeakerMobile>' in field 'Speaker_Mobile' 
And I enter '<SpeakerCompany>' in field 'Speaker_Company' 
And I enter '<Optional Email>' in field 'Speaker_EmailSecondary' 
And I enter '<SpeakerJobtitle>' in field 'Speaker_Jobtitle' 
And I click 'Speaker_AddButton' 
And I wait for '10' seconds 
And I enter '<SpeakerLastname>' in field 'SessionSearch_SessionPage'
And I click 'SearchButton_SessionPage'
And I wait for '5' seconds
And I click 'SearchSpeaker_Lastname'
Then I should see the added '<SpeakerLastname>'
And I should see the added '<SpeakerFirstname>'
And I should see the added '<SpeakerCompany>'
And I should see the added '<SpeakerJobtitle>'
#PENDING_IMPL And I should see text 'CurrentTime' present on page at 'FirstSpeaker_LastUpdated'
And I wait for '20' seconds

Examples: 
|Salutation|Email					  |SpeakerLastname|SpeakerFirstname|SpeakerPhone|SpeakerMobile|SpeakerCompany|Optional Email			 |SpeakerJobtitle|
|Mr		   |AutoTestUser@ihsmarkit.com|Potter		  |Garry		   |23434553	|7834s3478	  |IHS			 |AutoTestUser2@ihsmarkit.com|Associate		 |


@SearchSpeaker @Ignore
Scenario: Search Speaker
When I click 'Speaker_MainMenu' 
And I click 'Speaker_SubMenu' 
And I wait for '10' seconds 
And I enter 'Potter' in field 'Search_SpeakerPage'
And I wait for '5' seconds
And I click 'SearchButton_SpeakerPage'
Then I should see the added 'Potter'

@EditSpeaker 
Scenario Outline: Verify User is able to edit exsiting speaker
When I click 'Speaker_MainMenu' 
And I click 'Speaker_SubMenu' 
And I wait for '40' seconds 
When I enter '<AddedSpeaker>' in field 'Search_SpeakerPage'
And I click 'SearchButton_SpeakerPage' 
And I wait for '5' seconds 
Then I should see the added '<AddedSpeaker>'
And I click 'SearchSpeaker_Lastname'
And I click 'FirstSpeaker_SpeakerNotes' 
And I wait for '5' seconds 
And I enter '<TextArea>' in field 'FirstSpeaker_TextArea' 
When I click 'FirstSpeaker_EventInfo' 
And I wait for '5' seconds 
And I select option '<Status>' in dropdown 'SpeakerStatus_DD' by 'text' 
And I select option '<JobLevel>' in dropdown 'Joblevel_DD' by 'text' 
And I select option '<DietaryType>' in dropdown 'DietaryType_DD' by 'text' 
And I select option '<Tier>' in dropdown 'SpeakerTier_DD' by 'text' 
And I select option '<JobFunction>' in dropdown 'JobFunction_DD' by 'text' 
And I wait for '5' seconds
Then I verify dropdown 'SpeakerStatus_DD' is selected by '<Status>'
Then I verify dropdown 'Joblevel_DD' is selected by '<JobLevel>'
Then I verify dropdown 'DietaryType_DD' is selected by '<DietaryType>'
Then I verify dropdown 'SpeakerTier_DD' is selected by '<Tier>'
Then I verify dropdown 'JobFunction_DD' is selected by '<JobFunction>'
#When I click 'Speaker_Bio' 
#And I wait for '5' seconds 
#And I enter 'C:\\Users\\user\\Pictures\\Capture.PNG' in field 'Browse_Picture' 
#And I click 'Upload_Button' 
#And I enter '<Speakerbio>' in field 'Update_Text' 
#And I click 'Update_Button' 
When I click 'AdditionalContact_Menu' 
And I select option 'Media' in dropdown 'AdditonalContact_Type' by 'text' 
And I enter '<ACphone>' in field 'AdditionalContact_Phone' 
And I enter '<ACname>' in field 'AdditionalContact_Name' 
And I enter '<ACmobile>' in field 'AdditionalContact_Mobile' 
And I enter '<ACtitle>' in field 'AdditionalContact_Title' 
And I enter '<ACemail>' in field 'AdditionalContact_Email' 
And I enter '<ACcompany>' in field 'AdditionalContact_Company' 
And I enter '<ACaddinfo>' in field 'AdditionalContact_AdditionalInfo' 
And I click 'AdditionalContact_AddButton' 
Then I should see element 'AdditionalContactSuccess' present on page
#And I click 'Taxonomy_Manu'
#And I click 'Translation'
#And I click 'Spanish'

Examples: 
|TextArea|Speakerbio|ACphone |ACname   |ACmobile |ACtitle|ACemail	  |ACcompany|ACaddinfo|Status  |JobLevel					    |DietaryType|Tier	|JobFunction|AddedSpeaker|
|ABCD	 |Speaker	|86565435|newspeakr|654322343|mr	 |test@ihs.com|ihs		|hi		  |Accepted|Vice President/Managing Director|Gluten Free|Speaker|Legal	    |Potter		 |

@AddTimeSlot 
Scenario Outline:  Verify User is able to add new timeslot in the timeslot page
When I click 'TimeSlotsMainMenu'
And I click 'Timeslots_MondayTab'
And I click 'AddTimeslotButton_Monday'
And I wait for '5' seconds
And I enter '<MonTimeslottitle>' in field 'TimeslotTitle'
And I select option 'Yes' in dropdown 'TimeslotTitleIsHTML' by 'text'
And I select option 'Yes' in dropdown 'TimeslotShowTitleInsteadofSession' by 'text'
And I enter '<MonStartHour>' in field 'TimeslotStartTime_Hours'
And I enter '<MonStartMinute>' in field 'TimeslotStartTime_Minutes'
And I select option 'AM' in dropdown 'TimeslotStartTime_Session' by 'text'
And I enter '<MonEndHour>' in field 'TimeslotEndTime_Hours'
And I enter '<MonEndMinute>' in field 'TimeslotEndTime_Minutes'
And I select option 'AM' in dropdown 'TimeslotEndTime_Session' by 'text'
And I click 'Timeslot_AddButton'
#Then I should see the added '<MonTimeslotitle>'
And I wait for '5' seconds
When I click 'Timeslots_TuesdayTab'
And I wait for '5' seconds
And I click 'AddTimeslotButton_Tuesday'
And I wait for '5' seconds
And I enter '<TuesTimeslottitle>' in field 'TimeslotTitle'
And I select option 'Yes' in dropdown 'TimeslotTitleIsHTML' by 'text'
And I select option 'Yes' in dropdown 'TimeslotShowTitleInsteadofSession' by 'text'
And I enter '<TuesStartHour>' in field 'TimeslotStartTime_Hours'
And I enter '<TuesStartMinute>' in field 'TimeslotStartTime_Minutes'
And I select option 'AM' in dropdown 'TimeslotStartTime_Session' by 'text'
And I enter '<TuesEndHour>' in field 'TimeslotEndTime_Hours'
And I enter '<TuesEndMinute>' in field 'TimeslotEndTime_Minutes'
And I select option 'AM' in dropdown 'TimeslotEndTime_Session' by 'text'
And I click 'Timeslot_AddButton'
#Then I should see the added '<TuesTimeslottitle>'
Examples:
|MonTimeslottitle|MonStartHour|MonStartMinute|MonEndHour|MonEndMinute|TuesTimeslottitle|TuesStartHour|TuesStartMinute|TuesEndHour|TuesEndMinute|
|TestMonday		 |8			  |30			 |9			|30			 |TestTuesday	   |8			 |30			 |9			 |30		   |


@EditTimeslot 
Scenario Outline: Verify User is able to edit exsiting session in the session page
When I click 'TimeSlotsMainMenu'
And I enter '<EditTitle>' in field 'EditTimeslot_Title'
And I select option 'Yes' in dropdown 'EditHtmlTitle_Mon' by 'text'
And I select option 'Yes' in dropdown 'EditTitleInsteadSession_Mon' by 'text'
And I enter '<EditStartHour>' in field 'EditStartTime_Hours'
And I enter '<EditStartMinute>' in field 'EditStartTime_Minutes'
And I select option 'AM' in dropdown 'EditStartSession' by 'text'
And I enter '<EditEndHour>' in field 'EditEndTime_Hours'
And I enter '<EditEndMinute>' in field 'EditEndTime_Minutes'
And I select option 'AM' in dropdown 'EditEndSession' by 'text'
And I click 'Timeslot_DescriptionMon'
And I wait for '5' seconds
And I enter '<description>' in field 'Description_TextArea'
And I click 'UpdateDescription_Button'
#Then I should see text '<EditTitle>' present on page at 'EditTimeslot_Title'
Examples:
|EditTitle|EditStartHour|EditStartMinute|EditEndHour|EditEndMinute|description	   |
|NewTitle |9		    |30				|10			|30			  |Text Description|


@AddSession 
Scenario Outline: Verify User is able to add new session in the session page
When I click 'Session_MainMenu'
And I wait for '50' seconds
And I click 'AddNewSession'
And I wait for '5' seconds
And I enter '<SessionTitle>' in field 'SessionTitle'
And I enter '<SessionChief>' in field 'SessionChief'
And I enter '<SessionStaff>' in field 'SessionStaff'
And I select option 'Strategic Program' in dropdown 'SessionType' by 'text'
And I select option 'Circle Format' in dropdown 'SessionStyle' by 'text'
And I click 'SessionAdd_Button'
And I wait for '5' seconds
When I enter '<SessionTitle>' in field 'SessionSearch_SessionPage'
And I click 'SearchButton_SessionPage'
And I wait for '10' seconds
Then I should see the added '<SessionTitle>'


Examples: 
|SessionTitle				   |SessionChief |SessionStaff |
|8am to 9am Welcome new Session|Chief Officer|Session Staff|


@EditSession 
Scenario Outline: Verify User is able to edit exsiting session in the session page
When I click 'Session_MainMenu'
And I wait for '50' seconds
When I enter '<SessionTitle>' in field 'SessionSearch_SessionPage'
And I click 'SearchButton_SessionPage'
And I wait for '10' seconds
And I click 'Searched_Session'
And I select option '<SessionStatus>' in dropdown 'SessionStatus' by 'text'
And I select option '<SessionRoomLocation>' in dropdown 'SessionRoomLocation' by 'text'
And I select option '<SessionRoomSetup>' in dropdown 'SessionRoomSetup' by 'text'
And I wait for '5' seconds
Then I verify dropdown 'SessionStatus' is selected by '<SessionStatus>'
And I verify dropdown 'SessionRoomLocation' is selected by '<SessionRoomLocation>'
And I verify dropdown 'SessionRoomSetup' is selected by '<SessionRoomSetup>'
And I click 'SessionDescriptionMenu'
And I wait for '5' seconds
And I click 'SessionDescriptionTextArea'
#And I clear field 'SessionDescriptionTextArea'
And I wait for '5' seconds
And I enter '<SessionDescription>' in field 'SessionDescriptionTextArea'
And I click 'SessionDescriptionUpdateButton'
When I click 'SpeakersTab_Menu'
And I wait for '5' seconds
And I enter '<Speakername>' in field 'SpeakersSearch'
And I click 'SuggestedSpeaker'
And I click 'AddSpeakerButton'
When I click 'TimeslotsMenu'
And I wait for '5' seconds
And I enter '<AddedTimeSlot1>' in field 'TimeslotSearch'
#And I click 'SuggestedTimeslot'
And I hit down Arrow key on element 'TimeslotSearch'
And I hit enter-key on element 'TimeslotSearch'
And I click 'AddTimeslotButton'
#And I enter '<AddedTimeSlot2>' in field 'TimeslotSearch'
#And I click 'SuggestedTimeslot'
#And I click 'AddTimeslotButton'
#When I click 'PartnerBlockMenu'
#And I enter '<PartnerArea>' in field 'PartnerBlockTextArea'
#And I click 'PartnerBlockUpdateButton'
#When I click 'SessionHyperlinksMenu'
#And I click 'SessionHyperlinksAddLinkButton'
#And I enter '<LinkText>' in field 'AddHyperlinkwindow_LinkText'
#And I enter '<Linkurl>' in field 'AddHyperlinkwindow_LinkURL'
#And I select option '<Linktype>' in dropdown 'AddHyperlinkwindow_LinkType' by 'text'
#And I select option '<Linklocation>' in dropdown 'AddHyperlinkwindow_LinkLocation' by 'text'
#And I click 'AddHyperlinkwindow_ShowOnMobile'
#And I click 'AddHyperlinkwindow_AddButton'
#Then I should see text '<LinkText>' present on page at 'AddHyperlinkwindow_LinkText'
#And I should see text '<Linkurl>' present on page at 'AddHyperlinkwindow_LinkURL'
#And I verify dropdown 'AddHyperlinkwindow_LinkType' is selected by '<Linktype>'
#And I verify dropdown 'AddHyperlinkwindow_LinkURL' is selected by '<Linklocation>'
#When I click 'TaxonomiesMenu'
#And I click 'SessionTaxonomy'
#And I click 'SessionTaxonomyCheckbox'

Examples:
|SessionTitle				   |SessionDescription		 |Speakername|PartnerArea |LinkText|Linkurl |SessionStatus|SessionRoomSetup|SessionRoomLocation|LinkText|Linklocation|AddedTimeSlot1|AddedTimeSlot2|
|8am to 9am Welcome new Session|Session Description added|Potter	 |PartnerBlock|Abcd	   |abcd.com|Private	  |Crescent		   |Level One - Lobby  |Link	|Top		 |TestMonday	|TestTuesday   |


@AgendaPageVerification
Scenario Outline: Verify the added timeslot with associated sessions are displayed
When I click 'AgendaMainMenu'
And I wait for '40' seconds
And I click 'QuickViewLink'
Then I should see added timeslot '<MonTimeslottitle>' in Agenda Page
And I should see added '<AddedSession>' in Agenda Page
And I should see added '<AddedSpeaker>' in Agenda Page
When I click 'Agenda_TuesdayTab'
Then I should see the added '<MonTimeslottitle>'
And I should see added '<AddedSession>' in Agenda Page
And I should see added '<AddedSpeaker>' in Agenda Page

Examples:
|MonTimeslottitle|TuesTimeslottitle|AddedSession				  |AddedSpeaker|
|TestMonday		 |TestTuesday	   |8am to 9am Welcome new Session|Potter	   |

@AgendaPage 
Scenario Outline: Verify User is able to edit exisiting timeslot in the Agenda page
When I click 'AgendaMainMenu'
And I click 'MondayTab_TimeSlot'
And I wait for '5' seconds
And I enter '<UpdatedTitle>' in field 'UpdateTitleTimeslot_Agenda'
And I select option 'Tuesday, March 6, 2018' in dropdown 'EditTimeslotDay' by 'text'
And I click 'UpdateTimeslot_Agenda'
Then I should see the added '<UpdatedTitle>'

Examples: 
|UpdatedTitle |
|Updated Title|

@EditAgenda 
Scenario Outline: Verify User is able to edit exisiting session in the Agenda page
When I click 'AgendaMainMenu'
And I click 'Agenda_WednesdayTab'
And I click 'WednesdayTab_Edit'
And I wait for '5' seconds
#And I clear field 'EditSession_Agenda'
#And I enter '<Title>' in field 'EditSession_Agenda'
And I select option 'Plenary' in dropdown 'SelectSession_Agenda' by 'text'
And I wait for '5' seconds
And I click 'SessionUpdateButton'
When I click 'WednesdayTab_Clock'
And I enter '<Timeslotname>' in field 'MoveSession_Agenda'
And I click 'FirstSuggestedSession'
And I click 'SelectButton'

Examples:
|Title	   |Timeslotname|
|Newsession|10			|

@SpeakerEditAgenda @Ignore
Scenario: Verify User is able to edit exisiting speaker	 in the Agenda page
When I click 'AgendaMainMenu'
And I click 'Agenda_WednesdayTab'
And I wait for '5' seconds
When I click 'WednesdayTab_SpeakerSettings'
And I mouse over 'WednesdayTab_SpeakerRoles'
And I click 'WednesdayTab_Chair'
#When I Drag 'DragSpeaker' and Drop the Speaker


@SpeakerSetting
Scenario Outline: Verify the changes made in speaker settings page, reflecting fine in speaker page
Given I click 'Setting_MainMenu'
When I click 'SpeakerSetting_Menu'
And I wait for '20' seconds
Then I should see element 'SpeakerStatus_SpeakerSetting' present on page
And I should see element 'SpeakerTiers_SpeakerSetting' present on page
And I should see element 'SpeakerJobLevel_SpeakerSetting' present on page
And I should see element 'SpeakerJobFunction_SpeakerSetting' present on page
And I should see element 'SpeakerDietaryType_SpeakerSetting' present on page
And I should see element 'SpeakerRole_SpeakerSetting' present on page
And I should see element 'SpeakerContactType_SpeakerSetting' present on page
And I click 'SpeakerTiers_SpeakerSetting'
When I Create new Speaker Tier as '<SpeakerTier>'
And I click 'AddButton_SpeakerTier' 
And I click 'SaveButton_SpeakerSetting'
And I wait for '20' seconds
When I click 'Speaker_MainMenu'
And I click 'Speaker_SubMenu'
And I wait for '20' seconds
And I click 'FirstSpeaker_Lastname'
And I click 'FirstSpeaker_EventInfo'
And I wait for '10' seconds
Then I select option '<SpeakerTier>' in dropdown 'SpeakerTier_DD' by 'text'
And I wait for '5' seconds
Then I verify dropdown 'SpeakerTier_DD' is selected by '<SpeakerTier>'
Examples:
|SpeakerTier|
|IHSSpeaker |

@SessionSetting
Scenario Outline: Verify the changes made in session setting page, reflecting in session page
When I click 'Setting_MainMenu'
And I click 'SessionSetting_Menu'
Then I should see element 'SessionStatus_Setting' present on page
And I should see element 'SessionType_Setting' present on page
And I should see element 'SessionStyles_Setting' present on page
And I should see element 'SessionRoomSetup_Setting' present on page
And I should see element 'SessionRoomlocation_Setting' present on page
And I should see element 'SessionSpeakerStatus_Setting' present on page
When I Create new session Status as '<SessionStatus>'
And I click 'AddButton_SessionStatus'
And I click 'SaveButton_SessionSetting'
And I wait for '20' seconds
When I click 'Session_MainMenu'
And I wait for '20' seconds
And I click 'FirstSession'
Then I select option '<SessionStatus>' in dropdown 'SessionStatusDD' by 'text'
And I wait for '5' seconds
Then I verify dropdown 'SessionStatusDD' is selected by '<SessionStatus>'
Examples:
|SessionStatus|
|IHSTest	  |

@DeleteSpeaker_Session_&_Timeslot @Ignore
Scenario: Delete Added Speaker from Database
Given I execute Query to Delete Speaker who's FirstName is 'Garry'
And I wait for '20' seconds
And I execute Query to Delete Session with Title - '8am Welcome Session'
And I wait for '20' seconds
And I execute Query to Delete Timeslot with Title - 'TestMonday'
And I wait for '20' seconds
