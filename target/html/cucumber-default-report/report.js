$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/personalDetails.feature");
formatter.feature({
  "name": "Personal Detail",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@current"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am logged into HRMS application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_into_HRMS_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to personal detail page",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalDetails.i_navigated_to_personal_detail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As an Admin,I should be able to update employee personal details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@current"
    }
  ]
});
formatter.step({
  "name": "I click on edit button",
  "keyword": "When "
});
formatter.match({
  "location": "PersonalDetails.i_click_on_edit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered the following information",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName",
        "OtherId",
        "LicenseNumber"
      ]
    },
    {
      "cells": [
        "John",
        "K",
        "Lary",
        "9876",
        "123456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PersonalDetails.i_entered_the_following_information(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on save button on Personal Details page",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalDetails.i_click_on_save_button_on_Personal_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify employee personal detils has been updated",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalDetails.i_verify_employee_personal_detils_has_been_updated()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: personal data is not updated expected:\u003c[A-]123456\u003e but was:\u003c[]123456\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.hrms.steps.PersonalDetails.i_verify_employee_personal_detils_has_been_updated(PersonalDetails.java:70)\r\n\tat ✽.I verify employee personal detils has been updated(file:src/test/resources/features/personalDetails.feature:15)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});