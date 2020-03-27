package com.hrms.Api.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

public class PostCreateEmployeeAPISteps {

	private RequestSpecification request;
	private Response response;
	public static Object employee_ID;

	@Given("User call CreateEmployee API to verify that an Employee was created")
	public void user_call_CreateEmployee_API() {
		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthentecationSteps.Token);
		request.body(CommonMethods.readJSONFile(APIConstants.create_Employee_JSON));
	}

	@When("User retrive response for createEmployee API")
	public void user_retrive_response() {

		response = request.when().post(APIConstants.create_Employee_URI);
		response.prettyPrint();
	}

	@Then("User verify status code is {int} for createEmployee Api")
	public void user_verify_status_code_is(int int1) {

		// No need to use junit Assert, instead its Prefer to use RestAssured Assert
		// response.then().assertThat
		// Assert.assertEquals(int1, response.getStatusCode());

		response.then().assertThat().statusCode(int1);

	}

	@Then("User Validate employee was created")
	public void user_Validate_employee_is_created() {

		response.then().body("Message", equalTo("Entry Created"));

		response.then().body("Employee[0].emp_firstname", equalTo("Dane"));

		JsonPath jsonPathEvaluator = response.jsonPath();
		String firstName = jsonPathEvaluator.get("Employee[0].emp_firstname");
		System.out.println("Employee first name is = " + firstName);

		employee_ID = jsonPathEvaluator.get("Employee[0].employee_id");

		System.out.println("Employee ID is: " + employee_ID);

	}

}
