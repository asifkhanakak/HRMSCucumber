package com.hrms.utils;

public class Constants {

	//public static final String HRMS_URL="http://166.62.36.207/Syntax_HRM/symfony/web/index.php/auth/login";

	//public static final String BROWSER="chrome";
	
	//specify path to chrome & gecko driver
	
	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe";
			
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver.exe";
	
	public static final int PAGE_LOAD_TIME=30;
	
	public static final int IMPLICIT_LOAD_TIME=10;
	
	public static final int EXPLICIT_LOAD_TIME=30;
	
	public static final String CREDENTIALS_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/configs/Configuration.properties";
	
	public static final String XL_DATA_FILEPATH="C:/Users/Asif Khan/eclipse-workspace/HRMS/src/test/resources/testdata/HrmsTestData.xlsx";

	public static final String SCREENSHOTS_FILEPATH = System.getProperty("user.dir")+"/target/screenshots/";

}