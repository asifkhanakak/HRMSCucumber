#Author:emaleasif@domain.com(Syntax Team)
#Keywords This Test will create one Employee in the Syntax HRMS database :

Feature: Validating Syntax HRMS /getOneEmployee.php API

  Background: 
    Given user generate token

 @SyntaxHRMSAPIEnd2End @SyntaxHRMSAPIGETOneEmployee
  Scenario: Retreving the created employee using the /getOneEmployee.php API 
    Given User calls getOneEmployee API
    When User retrive response for getOneEmployee API
    Then User verify status code is 200 for getOneEmployee API
    Then User Validate created employee exist
