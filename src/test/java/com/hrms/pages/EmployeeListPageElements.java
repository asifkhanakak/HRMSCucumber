package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPageElements {
	
	@FindBy(id="empsearch_id")
	public WebElement idSearch;

	@FindBy(xpath="//a[text()='John K']")
	public WebElement myEmployee;
	
	@FindBy(id="searchBtn")
	public WebElement searchbtn;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr")
	public List<WebElement> empTableRows;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement idClick;
	
	@FindBy(xpath="//a[text()='Next']")
	public WebElement empTableNextBtn;
	
	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
