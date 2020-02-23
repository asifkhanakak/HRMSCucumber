package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

import com.hrms.utils.CommonMethods;

public class LeaveListPageElements extends CommonMethods{
	
	@FindBy(css="a.toggle.tiptip")
	public WebElement leaveListLbl;
	
	public LeaveListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
