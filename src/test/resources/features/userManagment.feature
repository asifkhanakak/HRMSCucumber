#Author: Syntax.com(Asif Khan)
Feature: User Managment

  Background: 
    Given I am logged into HRMS application
    Given I navigate to UserManagment page

  @inprogress
  Scenario: Add new user
    When I Click on add button
    And I add "Anna J Smith", "userALI","Synyax@123","Synyax@123"
    And I click on save button
    Then I verify new user is added
