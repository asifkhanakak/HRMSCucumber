#Author student@Syntax.com(Asif)
@Employeedependents
Feature: Employee dependents

  Background: 
    Given I am logged into HRMS application
    And I nevigate to Employee dependents page with employee id=999

  Scenario Outline: Assign dependents to employee
    When I click on add button
    And I enterd dependent "<Name>"and "<DateOfBirth>"
    And I select "<Relationship>" or "<OtherRelationship>" from dropdown
    And I Click on save button
    Then I see employee dependent with "<Name>" and "<DateOfBirth>" is added

    Examples: 
      | Name   |  | Relationship |  | OtherRelationship |  | DateOfBirth |
      | Tom    |  | Child        |  |                   |  | 1980-01-10  |
      | John   |  | Child        |  |                   |  | 1985-03-22  |
      | Jack   |  | Other        |  | stepdaughter      |  | 1990-04-11  |
      | Taylor |  | Other        |  | stepSon           |  | 1995-05-30  |
