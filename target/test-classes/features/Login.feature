 @sprint1
Feature: Login

  @smoke, @login
  Scenario: valid Login
    When I enter valid username and password
    And I click on login button
    Then I sucsesfully loggedin

  @smoke
  Scenario: Invalid Login
    When I enter valid username and invalid password
    And I click on login button
    Then I see error message

  @regression
  Scenario Outline: Invalid Login and Valaditing error mesasges
    When I enter "<Username>" and "<Password>"
    And I click on login button
    Then I see "<ErrorMessage>"

    Examples: 
      | Username |  | Password   |  | ErrorMessage              |
      | Admin    |  | Admin123   |  | Invalid Credentials       |
      | Admin    |  |            |  | password can not be Empty |
      |          |  | Syntax@123 |  | Username can not be empty |
      |          |  |            |  | Username can not be empty |
