#Author: your.email@your.domain.com
Feature: Validating Syntax HRMS API's

  Background: 
    Given user generate token

  @APITest
  Scenario: This test will check if new Employee can be created
    Given user calls CreateEmployee Api
    When user retreive response
    Then status code is 200
    And user validate employee is created
