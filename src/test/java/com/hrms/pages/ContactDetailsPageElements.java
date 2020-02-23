package com.hrms.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ContactDetailsPageElements {
	@FindBy(id="btnSave")
	WebElement edit;
	
	@FindBy(id="contact_street1")
	WebElement street1;
	
	@FindBy(id="contact_city")
	WebElement city;
	
	@FindBy(id="contact_emp_zipcode")
	WebElement zipcode;
	
	@FindBy(id="contact_emp_hm_telephone")
	WebElement hm_telephone;
	
	@FindBy(id="contact_emp_work_email")
	WebElement work_email;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	public ContactDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
