#Author: asifkhan@syntax.com(Asif)

Feature:  Verifying updated employee using /getOneEmployee.php HRMS API

  Background: 
    Given user generate token

@SyntaxHRMSAPIEnd2End @SyntaxGetOneEmployeeAPI
  Scenario: Retrieving updated Employee using /getOneEmployee.php API
    Given User calls getOneEmployee API to verify updated employee
    When User retrieves response for getOneEmployeeAPI to verify updated employee 
    Then status code is 200 for getOneEmployeeAPI to verify updated employee
    Then User validates updated employee exists