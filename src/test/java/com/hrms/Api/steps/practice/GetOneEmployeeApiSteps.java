package com.hrms.Api.steps.practice;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;

public class GetOneEmployeeApiSteps {

	private RequestSpecification request;
	private Response response;

	@Given("User calls getOneEmployee API")
	public void user_calls_getOneEmployee_API() {
		request = given().header("Content-Type", "application/json")
				.header("Authorization", SyntaxAPIAuthentecationSteps.Token)
				.param("employee_id", PostCreateEmployeeAPISteps.employee_ID);

	}

	@When("User retrive response for getOneEmployee API")
	public void user_retrive_response_for_getOneEmployee_API() {

		response = request.when().get(APIConstants.get_OneEmployee_URI);
		response.prettyPrint();

	}

	@Then("User verify status code is {int} for getOneEmployee API")
	public void user_verify_status_code_is_for_getOneEmployee_API(Integer int1) {

		response.then().assertThat().statusCode(int1);

	}

	@Then("User Validate created employee exist")
	public void user_Validate_created_employee_exist() {

		// First way to Assert using Matchers
		response.then().body("employee[0].employee_id", equalTo(PostCreateEmployeeAPISteps.employee_ID));

		// Second way to assert
		// First create instance of JsonPath - here we called it jsonPathEvaluator
		// We are also storing the jsonPath(); using response.jsonPath();

		JsonPath jsonPathEvaluator = response.jsonPath();

		// Using the jsonPathEvaluator variable we created we can .get(get what you are
		// looking for)
		// in this case we just want to grab employee id from json response - use
		// postman to see
		// - the response for additional help

		String actualEmployeeID = jsonPathEvaluator.getJsonObject("employee[0].employee_id");

		// Then we are using Assert class from JUnit to verify employee ID's match
		// You can throw in try catch block if you want to - optional

		try {
			// Try the code that may throw an exception
			Assert.assertEquals("Employee id does not Matched", PostCreateEmployeeAPISteps.employee_ID,
					actualEmployeeID);
		} catch (AssertionError e) {
			// if exception gets thrown what do you want to do with it?
			System.out.println("Employee ID's DO NOT MATCH");
		}

		// this will print if exception was not caught
		System.out.println("EMPLOYEE ID's MATCH");

	}

}
