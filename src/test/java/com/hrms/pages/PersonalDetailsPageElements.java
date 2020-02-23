package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {
	
	@FindBy(id = "empPic")
	public WebElement empPicture;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement nameOnPicture;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement empId;

	@FindBy(id = "btnSave")
	public WebElement edit_saveBtn;
	
	@FindBy(id="personal_txtEmpFirstName")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='personal_txtEmpMiddleName']")
	public WebElement middleName;
	
	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")
	public WebElement lastName;
	
	@FindBy(id="personal_txtOtherID")
	public WebElement othrId;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement licNo;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement licExpMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement licExpYear;
	
	@FindBy(xpath="//ul[@class='radio_list']")
	public WebElement genderRadBtn;
	
	@FindBy(id="personal_cmbMarital")
	public WebElement maritalStatus;
	
	@FindBy(id="personal_cmbNation")
    public WebElement nationality;
	
	@FindBy(id="personal_DOB")
	public WebElement dob;
	
	@FindBy(xpath="//a[text()='Dependents']")
	public WebElement dependentsTab;
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
