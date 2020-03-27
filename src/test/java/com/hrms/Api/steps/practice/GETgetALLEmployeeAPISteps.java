package com.hrms.Api.steps.practice;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GETgetALLEmployeeAPISteps {

	private RequestSpecification request;
	private Response response;

	@Given("user calls getAllEmployees to retrieve all employee")
	public void user_calls_getAllEmployees_to_retrieve_all_employee() {

		request = given().header("Content-Type", "Application/json").header("Authorization",
				SyntaxAPIAuthentecationSteps.Token);

		// Printing all data that we send with the request
		// System.out.println(request.log().all());
	}

	@When("User retrieves response for getAllEmployees to retrieve List of employees")
	public void user_retrieves_response_for_getAllEmployees_to_retrieve_List_of_employees() {

		response = request.when().get(APIConstants.get_AllEmployees_URI);

	}

	@Then("status code is {int} for getAllEmployee")
	public void status_code_is_for_getAllEmployee(int int1) {

		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates List of Employees is successfully Returned")
	public void user_validates_List_of_Employees_is_successfully_Returned() {
		
		JSONObject jsonObject = new JSONObject(response.prettyPrint());
		JSONArray jsArray = jsonObject.getJSONArray("Employee");

		System.out.println("Size of list for returned Employee is: " + jsArray.length());

		for (int i = 0; i < jsArray.length(); i++) {
			String created_emp_fName = response.jsonPath().getString("Employee[" + i + "].emp_firstname");

			if (created_emp_fName.equals("Dane")) {
				System.out.println("IF condation is execuated!!!!!");
				response.then().body("Employee[" + i + "].emp_lastname", equalTo("Hogan"));
				response.then().body("Employee[" + i + "].emp_middle_name", equalTo("empMiddle"));
				response.then().body("Employee[" + i + "].emp_birthday", equalTo("1991-04-22"));
				response.then().body("Employee[" + i + "].emp_status", equalTo("Employee"));
				response.then().body("Employee[" + i + "].emp_job_title", equalTo("Developer"));
				System.out.println("!!!!!!!!!!!!!!!!! Our created employee " + created_emp_fName + " is found!!!!");
				response.then().assertThat().body("Employee[" + i + "].emp_firstname", equalTo(created_emp_fName));
			} else {
				// System.out.println("Still searching for our employee " +i +"
				// "+created_emp_fName);
			}
		}
	}

}
