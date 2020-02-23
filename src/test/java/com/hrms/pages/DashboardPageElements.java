package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {
	
	@FindBy(linkText="Leave")
	public WebElement leaveLink;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText = "PIM")
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployee;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement admin_UserManagment;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement users;
	
	@FindBy(id="menu_admin_Job")
	WebElement admin_job;
	
	@FindBy(id="menu_admin_Organization")
	WebElement admin_Organization;
	
	@FindBy(id="menu_admin_Qualifications")
	WebElement admin_Qualifications;
	
	@FindBy(id="menu_admin_nationality")
	WebElement admin_nationality;
	
	@FindBy(id="menu_admin_Configuration")
	WebElement admin_Configuration;

	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recreitument;
	
	@FindBy(id="menu__Performance")
	WebElement performence;
	
	@FindBy(id="menu_directory_viewDirectory")
	WebElement directory;
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateToLeaveList() {
		jsClick(leaveLink);
		jsClick(leaveList);
	}
	
	public void navigateToAddEmployee() {
		jsClick(pim);
		jsClick(addEmployee);
	}
	public void navigateToUserManagement() throws InterruptedException {
		click(admin);
		Actions action=new Actions(driver);
		action.moveToElement(admin_UserManagment).perform();
		Thread.sleep(2000);
		action.click(users).perform();
	}
	public void navigateToPersonalDetails() {
		String empId="9000";
		click(pim);
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for(int i=1; i<rows.size(); i++) {
			String rowText=rows.get(i-1).getText();
			if(rowText.contains(empId)) {
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i)+"]/td[1]")).click();
			}
		}
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
	

}
