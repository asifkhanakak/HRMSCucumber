package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	String empid;

	@Given("I am logged into HRMS application")
	public void i_am_logged_into_HRMS_application() {

		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {

		dashboard.navigateToAddEmployee();
	}

	@When("I add {string}, {string}, {string}")
	public void i_add(String fName, String mName, String lName) {

		sendText(addEmp.firstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);
		empid = addEmp.empId.getText();
	}

	@When("I click save")
	public void i_click_save() {
		jsClick(addEmp.saveBtn);
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
		Assert.assertEquals("empId Does not match", pdetails.empId.getText(), empid);

	}

}
