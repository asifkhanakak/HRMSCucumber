package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DependentsPageElements {
	
	@FindBy(id="btnAddDependent")
	public WebElement addBtn;
	
	@FindBy(id="dependent_name")
	public WebElement name;
	
	@FindBy(id="dependent_relationshipType")
	public WebElement relationshipType;
	
	@FindBy(id="dependent_dateOfBirth")
	public WebElement dob;
	
	@FindBy(id="btnSaveDependent")
	public WebElement saveBtn;
	
	@FindBy(id="dependent_relationship")
	public WebElement otherRelationship;
	
	public DependentsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
