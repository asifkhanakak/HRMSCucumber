package com.hrms.utils;

public class APIConstants {
	
	
	public static final String generate_Token_URI="http://166.62.36.207/syntaxapi/api/generateToken.php";
	
	public static final String generate_Token_JSON= System.getProperty("user.dir")+"/src/test/resources/JSONfiles/generateToken.json";
	
	public static final String create_Employee_URI="http://166.62.36.207/syntaxapi/api/createEmployee.php";

	public static final String create_Employee_JSON= System.getProperty("user.dir")+"/src/test/resources/JSONfiles/CreateEmployee.json";

	public static final String delete_Employee_URI="http://166.62.36.207/syntaxapi/api/deleteEmployee.php";

	public static final String update_Employee_URI="http://166.62.36.207/syntaxapi/api/updateEmployee.php";
    public static final String update_Employee_JSON= System.getProperty("user.dir")+"/src/test/resources/JSONfiles/updateEmployee.json";
    
	public static final String get_OneEmployee_URI="http://166.62.36.207/syntaxapi/api/getOneEmployee.php";

	public static final String get_AllEmployees_URI="http://166.62.36.207/syntaxapi/api/getAllEmployees.php";

	public static final String get_Job_title= "http://166.62.36.207/syntaxapi/api/jobTitle.php";








}
