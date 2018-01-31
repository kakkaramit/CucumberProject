$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium Project Folder/WorkBook 4/CucumberProjectTestNG/Features/AssignmentSubmission.feature");
formatter.feature({
  "line": 1,
  "name": "Submit an assignment",
  "description": "Assignment should not be submitted without attaching any file or artifact\r\nAssignment should not be submitted until submit button is clicked.\r\nIf user has attached a file or an artifact then on clicking submit button assigment should be submitted.",
  "id": "submit-an-assignment",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "# @tag1"
    }
  ],
  "line": 7,
  "name": "Check wheather assignment is displayed under \u0027Assigments\u0027 sidemenu.",
  "description": "",
  "id": "submit-an-assignment;check-wheather-assignment-is-displayed-under-\u0027assigments\u0027-sidemenu.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Open browser and login to the application.",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User clicks \u0027Courses\u0027 sidemenu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Application navigates to Courses \u003e My Courses sie menu",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks \u0027Coursework\u0027 sidemenu.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Application navigates to \u0027Assignments\u0027 side menu",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Assignment is displayed on the page and name of assignment is in link form",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.open_browser_and_login_to_the_application()"
});
formatter.result({
  "duration": 450338824409,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d63.0.3239.132)\n  (Driver info: chromedriver\u003d2.32.498550 (9dec58e66c31bcc53a9ce3c7226f0c1c5810906a),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027LP0039\u0027, ip: \u0027192.168.20.174\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.32.498550 (9dec58e66c31bc..., userDataDir: C:\\Users\\akakkar\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.132, webStorageEnabled: true}\nSession ID: d1ee97cc954f63e0617f35ef3a63b63f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:325)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:108)\r\n\tat com.sun.proxy.$Proxy17.get(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.get(EventFiringWebDriver.java:167)\r\n\tat com.tk20.qa.base.TestBase.initialization(TestBase.java:199)\r\n\tat com.tk20.qa.testcases.ApplicationAssignmentSubmissionTest.open_browser_and_login_to_the_application(ApplicationAssignmentSubmissionTest.java:31)\r\n\tat ✽.Given Open browser and login to the application.(E:/Selenium Project Folder/WorkBook 4/CucumberProjectTestNG/Features/AssignmentSubmission.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.user_clicks_Courses_sidemenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.application_navigates_to_Courses_My_Courses_sie_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.user_clicks_Coursework_sidemenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.application_navigates_to_Assignments_side_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.assignment_is_displayed_on_the_page_and_name_of_assignment_is_in_link_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Scenario failed");
formatter.after({
  "duration": 840334982,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "# @tag2"
    }
  ],
  "line": 16,
  "name": "Check whether user has attached an artifact within assignment",
  "description": "",
  "id": "submit-an-assignment;check-whether-user-has-attached-an-artifact-within-assignment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I am on assignment side menu",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I clicked on name of an assignment",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "application navigates and displayed assignment details page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I clicked select button corresponing to an artifact",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "An artifact form is displayed in editable mode",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_am_on_assignment_side_menu()"
});
formatter.result({
  "duration": 323608,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_clicked_on_name_of_an_assignment()"
});
formatter.result({
  "duration": 4041264873,
  "error_message": "java.lang.NullPointerException\r\n\tat com.tk20.qa.testcases.ApplicationAssignmentSubmissionTest.i_clicked_on_name_of_an_assignment(ApplicationAssignmentSubmissionTest.java:87)\r\n\tat ✽.When I clicked on name of an assignment(E:/Selenium Project Folder/WorkBook 4/CucumberProjectTestNG/Features/AssignmentSubmission.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.application_navigates_and_displayed_assignment_details_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_clicked_select_button_corresponing_to_an_artifact()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.an_artifact_form_is_displayed_in_non_editable_mode()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Scenario failed");
formatter.after({
  "duration": 342943168,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "# @tag3"
    }
  ],
  "line": 24,
  "name": "Enter data in the form and save it",
  "description": "",
  "id": "submit-an-assignment;enter-data-in-the-form-and-save-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I am on the Form page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I selected date for \u0027Date\u0027 type entry",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I input value for \u0027Decimal\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I upload file for \u0027File\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select radio button for \u0027Likert\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select value from \u0027Dropdown\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select radio dutton for \u0027Radio\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "i select check box for \u0027Checkbox\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select first radio button for \u0027Rubric\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I select second radio button for \u0027Rubric\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I input text in \u0027Single Line Text\u0027 tupe entry",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I press \"Add\" button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should see \u0027Form saved\u0027 and application navigates to Assignment details page.",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I submiited the assignment",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "select yes for the submission alert message",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_am_on_the_Form_page()"
});
formatter.result({
  "duration": 296440,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_selected_date_for_Date_type_entry()"
});
formatter.result({
  "duration": 1083121,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_input_value_for_Decimal_type_entry()"
});
formatter.result({
  "duration": 56856026,
  "error_message": "java.lang.NullPointerException\r\n\tat com.tk20.qa.testcases.ApplicationAssignmentSubmissionTest.i_input_value_for_Decimal_type_entry(ApplicationAssignmentSubmissionTest.java:126)\r\n\tat ✽.And I input value for \u0027Decimal\u0027 type entry(E:/Selenium Project Folder/WorkBook 4/CucumberProjectTestNG/Features/AssignmentSubmission.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_upload_file_for_File_type_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_select_radio_button_for_Likert_type_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_select_value_from_Dropdown_type_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_select_radio_dutton_for_Radio_type_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_select_check_box_for_Checkbox_type_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_select_first_radio_button_for_Rubric_type_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_select_second_radio_button_for_Rubric_type_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_input_text_in_Single_Line_Text_tupe_entry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Add",
      "offset": 9
    }
  ],
  "location": "ApplicationAssignmentSubmissionTest.i_press_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_should_see_Form_saved_and_application_navigates_to_Assignment_details_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_submiited_the_assignment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.select_yes_for_the_submission_alert_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Scenario failed");
formatter.after({
  "duration": 282739368,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 41,
      "value": "# @tag4"
    }
  ],
  "line": 42,
  "name": "Recall assignment",
  "description": "Given: Assignment is already submitted",
  "id": "submit-an-assignment;recall-assignment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "I selected checkbox corresponding to an assignment",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "click \u0027Recall\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "An assignment is recalled and pending flag is displayed corresponing to an assignment.",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Close the brwser.",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.i_selected_checkbox_corresponding_to_an_assignment()"
});
formatter.result({
  "duration": 2920926,
  "error_message": "java.lang.NullPointerException\r\n\tat com.tk20.qa.testcases.ApplicationAssignmentSubmissionTest.i_selected_checkbox_corresponding_to_an_assignment(ApplicationAssignmentSubmissionTest.java:211)\r\n\tat ✽.When I selected checkbox corresponding to an assignment(E:/Selenium Project Folder/WorkBook 4/CucumberProjectTestNG/Features/AssignmentSubmission.feature:44)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.click_Recall_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.an_assignment_is_recalled_and_pending_flag_is_displayed_corresponing_to_an_assignment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationAssignmentSubmissionTest.close_the_brwser()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Scenario failed");
formatter.after({
  "duration": 658144784,
  "status": "passed"
});
});