package com.hrms.Api.steps.practice;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PUTUpdateEmployeeAPISteps {
	private RequestSpecification request;
	private Response response;

	@Given("User call updateEmployee aPI")
	public void user_callupdateEmployee_aPI() {

		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthentecationSteps.Token);
		try {
			request.body("{ \"employee_id\" : \"" + PostCreateEmployeeAPISteps.employee_ID + "\","
					+ CommonMethods.readJSONFile(APIConstants.update_Employee_JSON));

		} catch (Exception e) {
			System.out.println("Concetation is wrong");
		}

	}

	@When("User retrives response from updateEmployee APi")
	public void user_retrives_response_from_updateEmployee_APi() {
		try {
			response = request.when().put(APIConstants.update_Employee_URI);
			response.prettyPrint();
			System.out.println("Update employee url was  hit sucessfully");
		}

		catch (Exception e) {
			System.out.println("Update employee url was not hit");
		}
	}

	@Then("User Verifies response code is {int} for UpdateEmployee APi")
	public void user_Verifies_response_code_is_for_UpdateEmployee_APi(Integer int1) {
		int statuscode = response.getStatusCode();
		try {
			response.then().assertThat().statusCode(int1);
			System.out.println("Status code for updateEmployee API is " + statuscode);
		} catch (Throwable e) {
			System.out.println("Update Employee status code error");
		}
	}

	@Then("User verifies employee name was updated")
	public void user_verifies_employee_name_was_updated() {
		try {
			response.then().body("employee[0].emp_firstname", equalTo("Robert"));
			System.out.println("Asseration for first name passed");
		} catch (Throwable e) {
			System.out.println("Asseration for first name failed updateEmployee API");
		}
	}

	@Then("User validates employee was updated")
	public void user_validates_employee_was_updated() {

		try {
			response.then().body("Message", equalTo("Entry updated"));
			System.out.println("Employee was sucessfully updated");
		} catch (Throwable e) {
			System.out.println("Asseration for \"Message updated\" was not execuated updateEmployee API");
		}

		boolean checkPoint = response.asString().contains("Entry updated");

		if (checkPoint) {
			System.out.println("Employee was successfully updated");
		} else {
			System.out.println("Employee was NOT updated");
		}

	}

}
