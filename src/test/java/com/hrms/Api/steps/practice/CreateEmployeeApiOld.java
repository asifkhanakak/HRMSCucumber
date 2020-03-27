package com.hrms.Api.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import com.hrms.utils.CommonMethods;

public class CreateEmployeeApiOld {

	private static RequestSpecification request;
	private static Response response;

	@Given("user calls CreateEmployee Api")
	public void user_calls_CreateEmployee_Api() {

		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthentecationSteps.Token);
		request.body(CommonMethods
				.readJSONFile(System.getProperty("user.dir") + "/src/test/resources/JSONfiles/CreateEmployee.json"));
	}

	@When("user retreive response")
	public void user_retreive_response() {
		response = request.post("http://166.62.36.207/syntaxapi/api/createEmployee.php");
	}

	@Then("status code is {int}")
	public void status_code_is(int int1) {

		 response.then().assertThat().statusCode(int1);
	}

	@Then("user validate employee is created")
	public void user_validate_employee_is_created() {

	}
}
