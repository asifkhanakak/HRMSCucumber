package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {

		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		login = new LoginPageElements();
		jsClick(login.loginBtn);
	}

	@Then("I sucsesfully loggedin")
	public void i_sucsesfully_loggedin() {
		System.out.println("I am logged in");

	}

	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
		login = new LoginPageElements();
		sendText(login.username, "Admin");
		sendText(login.password, "Synt");
	}

	@Then("I see error message")
	public void i_see_error_message() {
		boolean error = login.errorMsg.isDisplayed();
		//error=false;
		Assert.assertTrue("Error message is not displayed", error);
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String userName, String password) {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, userName);
		sendText(login.password, password);
	}

	@Then("I see {string}")
	public void i_see(String errorMessage) {
		System.out.println(errorMessage);
	}

}
