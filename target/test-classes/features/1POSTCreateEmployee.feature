#Author:emaleasif@domain.com(Syntax Team)
#Keywords This Test will create one Employee in the Syntax HRMS database :

Feature: Validating Syntax HRMS /createEmployee.php API

  Background: 
    Given user generate token

@SyntaxHRMSAPIEnd2End @SyntaxCreateEmployeeAPI
  Scenario: This test will check to see if Employee has been created
    Given User call CreateEmployee API to verify that an Employee was created
    When User retrive response for createEmployee API
    Then User verify status code is 200 for createEmployee Api
    Then User Validate employee was created
