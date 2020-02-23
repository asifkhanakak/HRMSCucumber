package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeDependentsSteps extends CommonMethods {

	@Given("I nevigate to Employee dependents page with employee id=999")
	public void i_nevigate_to_Employee_dependents_page() throws InterruptedException {
		jsClick(dashboard.pim);
		jsClick(empList.idSearch);
		Thread.sleep(2000);
		sendText(empList.idSearch, "999");
		
		jsClick(empList.searchbtn);
		jsClick(empList.myEmployee);
		jsClick(pdetails.dependentsTab);
	}

	@When("I click on add button")
	public void i_click_on_add_button() throws InterruptedException {
		Thread.sleep(2000);
		jsClick(dependents.addBtn);
	}

	@When("I enterd dependent {string}and {string}")
	public void i_enterd_dependent_info(String Name, String DateOfBirth) {
		sendText(dependents.name, Name);
		click(dependents.dob);
		sendText(dependents.dob, DateOfBirth);
	}

	@When("I select {string} or {string} from dropdown")
	public void i_select_and_from_dropdown(String Relationship, String OtherRelationship) throws InterruptedException {
		selectDdValue(dependents.relationshipType, Relationship);
		Thread.sleep(2000);
		if (Relationship.equalsIgnoreCase("Other")) {
			sendText(dependents.otherRelationship, OtherRelationship);
		}
	}

	@When("I Click on save button")
	public void i_Click_on_save_button() throws InterruptedException {
		waitForClickability(dependents.saveBtn);
		Thread.sleep(2000);
		jsClick(dependents.saveBtn);
	}
   
	@Then("I see employee dependent with {string} and {string} is added")
	public void i_see_employee_dependent_is_added(String Name,String DateOfBirth ) {
		System.out.println("Dependent with name "+Name+ " and Date of birth "+DateOfBirth+" is added");
	}

}
