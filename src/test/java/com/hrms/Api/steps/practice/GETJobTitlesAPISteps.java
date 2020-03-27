package com.hrms.Api.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.hrms.utils.APIConstants;

public class GETJobTitlesAPISteps {

	RequestSpecification httpRequest;
	Response response;

	@Given("user send request with Header in json with Authorization key")
	public void user_send_request_with_Header_in_json_with_Authorization_key() {

		httpRequest = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthentecationSteps.Token);
	}

	@When("user call getJobeTitle API")
	public void user_call_getJobeTitle_API() {

		response = httpRequest.when().get(APIConstants.get_Job_title);
	}

	@Then("user check if response code is {int} for getJobTitle API")
	public void user_check_if_response_code_is_for_getJobTitle_API(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}

	@Then("user Validate contents of the response body for getJobTitle API")
	public void user_Validate_contents_of_the_response_body_for_getJobTitle_API() {

		JSONObject json = new JSONObject(response.prettyPrint());
		JSONArray array = json.getJSONArray("Job Title List");
		for (int i = 0; i <= array.length() - 1; i++) {
			//System.out.println(array.get(i));
			if (i == 0) {
				Assert.assertEquals("Cloud Architect", array.get(i));
			} else if (i == 1) {
				Assert.assertEquals("Cloud Consultant", array.get(i));
			} else if (i == 2) {
				Assert.assertEquals("Cloud Product and Project Manager", array.get(i));
			} else if (i == 3) {
				Assert.assertEquals("IT Analyst", array.get(i));
			} else if (i == 4) {
				Assert.assertEquals("Network Administrator", array.get(i));
			} else if (i == 5) {
				Assert.assertEquals("IT Support Manager", array.get(i));
			} else if (i == 6) {
				Assert.assertEquals("Data Quality Manager", array.get(i));
			} else if (i == 7) {
				Assert.assertEquals("Database Administrator", array.get(i));
			}
		}
		Assert.assertEquals(18, array.length());
		System.out.println(array.length());

	}

}
