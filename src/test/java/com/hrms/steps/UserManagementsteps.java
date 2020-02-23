package com.hrms.steps;



import com.hrms.utils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserManagementsteps extends CommonMethods {
	

	
	@Given("I navigate to UserManagment page")
	public void i_navigate_to_UserManagment_page()  {
		try {
			dashboard.navigateToUserManagement();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("I Click on add button")
	public void i_Click_on_add_button() {

	}

	@When("I add {string}, {string},{string},{string}")
	public void i_add(String string, String string2, String string3, String string4) {

	}

	@When("I click on save button")
	public void i_click_on_save_button() {

	}

	@Then("I verify new user is added")
	public void i_verify_new_user_is_added() {

	}

}
