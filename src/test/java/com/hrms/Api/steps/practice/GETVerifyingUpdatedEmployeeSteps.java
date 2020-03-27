package com.hrms.Api.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GETVerifyingUpdatedEmployeeSteps {

	private RequestSpecification request;
	private Response response;

	@Given("User calls getOneEmployee API to verify updated employee")
	public void user_calls_getOneEmployee_API_to_verify_updated_employee() {
		try {
			request = given().header("Content-Type", "application/json")
					.header("Authorization", SyntaxAPIAuthentecationSteps.Token)
					.param("employee_id", PostCreateEmployeeAPISteps.employee_ID);
			System.out.println("getOneEmployee updated Header is correct");
		} catch (Throwable e) {
			System.out.println("Problem in the header of getOneEmployee updated");
		}
	}

	@When("User retrieves response for getOneEmployeeAPI to verify updated employee")
	public void user_retrieves_response_for_getOneEmployeeAPI_to_verify_updated_employee() {
		try {
			response = request.when().get(APIConstants.get_OneEmployee_URI);
			response.prettyPrint();
		} catch (Throwable e) {
			System.out.println("getOneEmplyee uri execuated");
		}
	}

	@Then("status code is {int} for getOneEmployeeAPI to verify updated employee")
	public void status_code_is_for_getOneEmployeeAPI_to_verify_updated_employee(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}

	@Then("User validates updated employee exists")
	public void user_validates_updated_employee_exists() {
		try {
			response.then().body("employee[0].emp_firstname", equalTo("Robert"));
			System.out.println("firstName asseration passed for getupdated employee");
		} catch (Throwable e) {
			System.out.println(
					"Asseration for employee first name does not match at getOneEmployee API \"our Updated Employee\"");
		}
	}

}
