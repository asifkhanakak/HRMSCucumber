#Author:Syntax.com(Asif Khan)
@sprint2 @addemployee
Feature: Add Employee

  Background: 
    Given I am logged into HRMS application
    And I navigated to Add Employee Page

  @regression
  Scenario: Add new Employee
    When I add "John", "j", "Adam"
    And I click save
    Then I see Employee has been succesfully added
