#Author Syntax.com(Asif)
#keyword This Feature will get all Employee from the SyntaxHRMS Database using getAllEmployee API

Feature: Validating Syntax HRMS getAllEmployee.php

Background:
Given  user generate token

@SyntaxHRMSAPIEnd2End @getAllEmployeeAPI
Scenario: Retrieving updated Employee using /getAllEmployees.php
Given user calls getAllEmployees to retrieve all employee
When User retrieves response for getAllEmployees to retrieve List of employees
Then status code is 200 for getAllEmployee
And user validates List of Employees is successfully Returned 


             
