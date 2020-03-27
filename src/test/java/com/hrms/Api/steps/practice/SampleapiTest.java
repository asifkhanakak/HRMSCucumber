package com.hrms.Api.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleapiTest {

	// @Test
	public void getAllJobsTitle() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NzYwMzMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc5MTIzMywidXNlcklkIjoiODcifQ.Kv4FgtxBLSqic3Ul3aAyEX0HpKp4wXXV-Yb0brWz7KA")
				.when().get("http://166.62.36.207/syntaxapi/api/jobTitle.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	// @Test
	public void getOneEmployee() {
		Response response = RestAssured.given().param("employee_id", "3562").contentType("application/json").header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NzYwMzMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc5MTIzMywidXNlcklkIjoiODcifQ.Kv4FgtxBLSqic3Ul3aAyEX0HpKp4wXXV-Yb0brWz7KA")
				.when().get("http://166.62.36.207/syntaxapi/api/getOneEmployee.php");
		response.prettyPrint();

	}

	// @Test
	public void getEmployeeStatus() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NzYwMzMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc5MTIzMywidXNlcklkIjoiODcifQ.Kv4FgtxBLSqic3Ul3aAyEX0HpKp4wXXV-Yb0brWz7KA")
				.when().get("http://166.62.36.207/syntaxapi/api/employeeStatus.php");
		response.prettyPrint();
	}

	// @Test
	public void createEmployee() {

		Response response = RestAssured.given().param("emp_firstname", "dane").param("emp_lastname", "Hogan")
				.param("emp_middle_name", "syntax").param("emp_gender", "2").param("emp_birthday", "1991-04-22")
				.param("emp_status", "Employee").param("emp_job_title", "Developer").contentType("application/json")
				.header("Authorization",
						"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NzYwMzMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc5MTIzMywidXNlcklkIjoiODcifQ.Kv4FgtxBLSqic3Ul3aAyEX0HpKp4wXXV-Yb0brWz7KA")
				.when().post("http://166.62.36.207/syntaxapi/api/createEmployee.php");

		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		System.out.println(actualStatusCode);

		Assert.assertEquals("200", actualStatusCode);
	}

	//@Test
	public void createEmployee_2() {
		
		Response response= RestAssured.given().params("emp_firstname", "dane", "emp_lastname", "Hogan","emp_status", "Employee","emp_gender", "2","emp_birthday", "1991-04-22","emp_status", "Employee","emp_job_title", "Developer")
		.contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NzYwMzMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc5MTIzMywidXNlcklkIjoiODcifQ.Kv4FgtxBLSqic3Ul3aAyEX0HpKp4wXXV-Yb0brWz7KA")
		.when().post("http://166.62.36.207/syntaxapi/api/createEmployee.php");
		
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		System.out.println(actualStatusCode);

		Assert.assertEquals("200", actualStatusCode);
		
	}
	
}
