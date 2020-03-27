#Author Syntax Compony(AsifKhan)
#Keyword This test will update existing employee dsta

Feature: Validating Syntax HRMS /updateEmployee.php API
Background:
Given  user generate token

@SyntaxHRMSAPIEnd2End @SyntaxHRmsUpdateEmployeeApi
Scenario: Updating created employee using /updateEmployee.php API
Given User call updateEmployee aPI
When User retrives response from updateEmployee APi
Then User Verifies response code is 200 for UpdateEmployee APi
Then User verifies employee name was updated
Then User validates employee was updated

