#Author:TeamAwsome@syntax.com(AsifKhan)
@current
Feature: Personal Detail

  Background: 
    Given I am logged into HRMS application
    And I navigated to personal detail page

  Scenario: As an Admin,I should be able to update employee personal details
    When I click on edit button
    And I entered the following information
      | FirstName   | MiddleName   | LastName   | OtherId   | LicenseNumber |
      | John        | K            | Lary       |    9876   |        123456 |
    And I click on save button on Personal Details page
    Then I verify employee personal detils has been updated
