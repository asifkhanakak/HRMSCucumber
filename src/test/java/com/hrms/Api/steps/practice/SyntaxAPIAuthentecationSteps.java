package com.hrms.Api.steps.practice;

import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;


public class SyntaxAPIAuthentecationSteps {

	private Response response;
	public static String Token;
	private static RequestSpecification request;
	String generateTokenURI = "http://166.62.36.207/syntaxapi/api/generateToken.php";

	@Given("user generate token")
	public void user_generate_token() {

		request = given().header("Content-Type", "application/json");

		//System.out.println(request.log().all());

		response = request.body(CommonMethods.readJSONFile(APIConstants.generate_Token_JSON))
				.when().post(generateTokenURI);

		//System.out.println(response.prettyPrint());

		Token = "Bearer "+response.jsonPath().getString("token");

		System.out.println(Token);
	}

}
