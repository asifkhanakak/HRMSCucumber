package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class PersonalDetails extends CommonMethods {

	@Given("I navigated to personal detail page")
	public void i_navigated_to_personal_detail_page() throws InterruptedException {
		jsClick(dashboard.pim);
		//jsClick(empList.idSearch);
		Thread.sleep(2000);
		//sendText(empList.idSearch, "999");
		
		//jsClick(empList.searchbtn);
		//jsClick(empList.myEmployee);

		boolean found = false;
		while (!found) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			for (int i = 1; i < rows.size(); i++) {
				String rowsText = rows.get(i - 1).getText();
				System.out.println(rowsText);
				if (rowsText.contains("4060")) {
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[2]")).click();
					jsClick(empList.idClick);
					break;
				}
			}
			jsClick(empList.empTableNextBtn);
		}
	}

	@When("I click on edit button") 
	public void i_click_on_edit_button() {
		jsClick(pdetails.edit_saveBtn);
	}

	@When("I entered the following information")
	public void i_entered_the_following_information(DataTable pdtable) {
		List<Map<String, String>> pdData = pdtable.asMaps();
		for (Map<String, String> map : pdData) {

			sendText(pdetails.firstName, map.get("FirstName"));
			sendText(pdetails.middleName, map.get("MiddleName"));
			sendText(pdetails.lastName, map.get("LastName"));
			sendText(pdetails.othrId, map.get("OtherId"));
			sendText(pdetails.licNo, map.get("LicenseNumber"));
		}

	}

	@When("I click on save button on Personal Details page")
	public void i_click_on_save_button_on_Personal_Details_page() {
		jsClick(pdetails.edit_saveBtn);
	}

	@Then("I verify employee personal detils has been updated")
	public void i_verify_employee_personal_detils_has_been_updated() {
		String actual = pdetails.licNo.getAttribute("value");
		Assert.assertEquals("personal data is not updated", "123456", actual);
		;
	}

}
