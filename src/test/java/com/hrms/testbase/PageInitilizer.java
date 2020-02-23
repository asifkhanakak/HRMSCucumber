package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.ContactDetailsPageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.DependentsPageElements;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitilizer extends BaseClass{
	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements pdetails;
	protected static ContactDetailsPageElements contactDetails;
	protected static DependentsPageElements dependents;
	protected static EmployeeListPageElements empList;
	
	public static void initilizeAllPages() {
	login=new LoginPageElements();
	dashboard=new DashboardPageElements();
	addEmp=new AddEmployeePageElements();
	pdetails=new PersonalDetailsPageElements();
	contactDetails=new ContactDetailsPageElements();
	dependents=new DependentsPageElements();
	empList=new EmployeeListPageElements();

	}
}
