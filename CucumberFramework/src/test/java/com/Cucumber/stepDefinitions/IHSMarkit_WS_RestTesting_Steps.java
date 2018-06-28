package com.Cucumber.stepDefinitions;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class IHSMarkit_WS_RestTesting_Steps {

	
	public static void baseConfig() {
		RestAssured.baseURI="http://dev.emap.ihsmarkit.info.corp";
	}
	
	@Given("^I send rest request to emap dev to fetch SessionInfo$")
	public static void Agenda_TimeSlot_SessionInfo() {
		Response response = RestAssured.
				given()
				.header("Authorization", "Basic c3dhdGhpbi5yYXRoZWVuZHJlbkBpaHNtYXJraXQuY29tOlJDeWJlckcwNDg4JA==")
				.auth().basic("swathin.ratheendren@ihsmarkit.com", "RCyberG0488$")
				.when().get("http://dev.emap.ihsmarkit.info.corp/api/timeslots/sessions?eventId=1003&sessionTypeId=0&day=Monday&sessionId=10597");
		System.out.println(response.then().log().body());
	} 
	
	public static void main(String[] args) {
		Agenda_TimeSlot_SessionInfo();
	}
}
