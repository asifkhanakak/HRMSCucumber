#Author syntax.com(Asif)
Feature: Validating Syntax HRMS /getJobTitle.php  API
Background: 
Given user generate token

@SyntaxHRMSAPIEnd2End @getJobsTitleAPI
Scenario: This test will get all job titles using /getJobTitle API
Given user send request with Header in json with Authorization key
When user call getJobeTitle API
Then user check if response code is 200 for getJobTitle API
And user Validate contents of the response body for getJobTitle API

