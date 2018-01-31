package com.tk20.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import com.tk20.qa.base.TestBase;
import com.tk20.qa.pages.AssignmentSubmissionPage;
import com.tk20.qa.pages.FormEntrySubmission;
import com.tk20.qa.pages.LoginPage2;
import com.tk20.qa.util.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplicationAssignmentSubmissionTest extends TestBase {
	

	public static LoginPage2 loginpage;
	public static AssignmentSubmissionPage assignmentsubmissionpage;
	public static FormEntrySubmission formsubmission;

	public ApplicationAssignmentSubmissionTest()
	{
		super();
	}

	@Given("^Open browser and login to the application\\.$")
	public void open_browser_and_login_to_the_application() throws MalformedURLException{
		Log.info("Open browser and start testing.");
		TestBase.initialization();
		loginpage=new LoginPage2();
		assignmentsubmissionpage= new AssignmentSubmissionPage();
		formsubmission=new FormEntrySubmission();
		Log.info("Enter username and password");
		loginpage.login("martin.brown47166", "t3stf1rst");
		Log.info("click login button.");
		loginpage.clickLoginbtn(); 
	    
	}

	@When("^User clicks 'Courses' sidemenu$")
	public void user_clicks_Courses_sidemenu() throws InterruptedException{
		Thread.sleep(3000);
	    Log.info("Click courses side menu.");
	    assignmentsubmissionpage.clickCoursesSidemenu();
	}

	@Then("^Application navigates to Courses > My Courses sie menu$")
	public void application_navigates_to_Courses_My_Courses_sie_menu() throws InterruptedException{
	    Log.info("Validate courses page title.");
	    Thread.sleep(3000);
	    assignmentsubmissionpage.validatePageTitle();
	    
	}

	@When("^User clicks 'Coursework' sidemenu\\.$")
	public void user_clicks_Coursework_sidemenu() throws InterruptedException{
	    Log.info("Click coursework side menu.");
	    Thread.sleep(4000);
	    assignmentsubmissionpage.clickCourseworkSidemenu();
	}

	@Then("^Application navigates to 'Assignments' side menu$")
	public void application_navigates_to_Assignments_side_menu(){
	    Log.info("Application navigates to Assignment side menu");
	    
	}

	@Then("^Assignment is displayed on the page and name of assignment is in link form$")
	public void assignment_is_displayed_on_the_page_and_name_of_assignment_is_in_link_form(){
	    Log.info("Validate assigment name is displayed in a form of link");
	    assignmentsubmissionpage.validateAssignmentLink();
	    
	}

	@Given("^I am on assignment side menu$")
	public void i_am_on_assignment_side_menu(){
	    
	    
	}

	@When("^I clicked on name of an assignment$")
	public void i_clicked_on_name_of_an_assignment() throws InterruptedException{
	    Log.info("Click on link of an assignment.");
	    Thread.sleep(4000);
	    assignmentsubmissionpage.clickAssignment();
	}

	@Then("^application navigates and displayed assignment details page$")
	public void application_navigates_and_displayed_assignment_details_page(){
	    Log.info("Validate correct landing page displayed on clicking assignment link.");
	    assignmentsubmissionpage.validateDetailsPage();
	}

	@When("^I clicked select button corresponing to an artifact$")
	public void i_clicked_select_button_corresponing_to_an_artifact() throws InterruptedException{
		Thread.sleep(2000);
	    Log.info("Click Select button corresponding to an artifact.");
	    assignmentsubmissionpage.clickSelectbutton();
	}

	@Then("^An artifact form is displayed in editable mode$")
	public void an_artifact_form_is_displayed_in_non_editable_mode(){
	    Log.info("Artifact form page should display in editable mode.");
	   
	    
	}

	@Given("^I am on the Form page$")
	public void i_am_on_the_Form_page(){
	    
	    
	}

	@When("^I selected date for 'Date' type entry$")
	public void i_selected_date_for_Date_type_entry(){
		Log.info("Select date from date field.");
	//	formsubmission.selectDate();
	    
	}

	@When("^I input value for 'Decimal' type entry$")
	public void i_input_value_for_Decimal_type_entry(){
	    Log.info("Enter decimal number.");
	    formsubmission.inputDecimal();		 
	}

	@When("^I select radio button for 'Likert' type entry$")
	public void i_select_radio_button_for_Likert_type_entry(){
	    Log.info("Select likert value.");
	    formsubmission.selectLikert();
	    
	}

	@When("^I select value from 'Dropdown' type entry$")
	public void i_select_value_from_Dropdown_type_entry(){
	    Log.info("Select value from drop down.");
	    formsubmission.selectValueFromDropDown();
	}

	@When("^I upload file for 'File' type entry$")
	public void i_upload_file_for_File_type_entry() throws IOException, InterruptedException{
	    Thread.sleep(3000);
		Log.info("Select file to upload.");
	    formsubmission.selectFile();
	}

	@When("^I select radio dutton for 'Radio' type entry$")
	public void i_select_radio_dutton_for_Radio_type_entry() throws InterruptedException{
		Thread.sleep(3000);
		Log.info("Select radio button.");
	    formsubmission.selectRadiobutton();
	}

	@When("^i select check box for 'Checkbox' type entry$")
	public void i_select_check_box_for_Checkbox_type_entry(){
	    Log.info("Select checkbox.");
	    formsubmission.selectCheckBox();
	    
	}

	@When("^I select first radio button for 'Rubric' type entry$")
	public void i_select_first_radio_button_for_Rubric_type_entry(){
	    Log.info("Select radio button for rubric 1.");
	    formsubmission.SelectRadioForRubric1();
	    
	}

	@When("^I select second radio button for 'Rubric' type entry$")
	public void i_select_second_radio_button_for_Rubric_type_entry(){
	    Log.info("Select radio button for rubric 2.");
	    formsubmission.SelectRadioForRubric2();
	}

	@When("^I input text in 'Single Line Text' tupe entry$")
	public void i_input_text_in_Single_Line_Text_tupe_entry(){
	    Log.info("Enter text in single line text.");
	    formsubmission.inputTextInSingleLine();
	}

	@When("^I press \"([^\"]*)\" button$")
	public void i_press_button(String arg1) throws InterruptedException{
		Thread.sleep(5000);
	   Log.info("Click add button.");
	   formsubmission.clickAdd();
	}
	
	@Then("^I should see 'Form saved' and application navigates to Assignment details page\\.$")
	public void i_should_see_Form_saved_and_application_navigates_to_Assignment_details_page() throws Throwable {
		Log.info("Application should navigate to details sub tab and form is saved.");
	    assignmentsubmissionpage.clickSave();
	}

	@Then("^I submiited the assignment$")
	public void i_submiited_the_assignment() throws InterruptedException{
		Thread.sleep(5000);
	  Log.info("Click Submit button to submit Assignment.");  
	  assignmentsubmissionpage.clickSubmitButton();
	}

	@Then("^select yes for the submission alert message$")
	public void select_yes_for_the_submission_alert_message(){
	    Log.info("Click Accept for alert message.");
	    assignmentsubmissionpage.acceptAlert();
	}

	@When("^I selected checkbox corresponding to an assignment$")
	public void i_selected_checkbox_corresponding_to_an_assignment(){
	    Log.info("Select checkbox for an assignment");
	    assignmentsubmissionpage.selectCheckbox();
	}

	@When("^click 'Recall' button$")
	public void click_Recall_button(){
	    Log.info("Click recall button");
	    assignmentsubmissionpage.clickRecallButton();
	}

	@Then("^An assignment is recalled and pending flag is displayed corresponing to an assignment\\.$")
	public void an_assignment_is_recalled_and_pending_flag_is_displayed_corresponing_to_an_assignment(){
	    Log.info("Validate pending flag correspodning to recalled assignment.");
	    assignmentsubmissionpage.validatePendingFlag();
	}

	@Then("^Close the brwser\\.$")
	public void close_the_brwser(){
	    Log.info("Close the browser.");
	    TestBase.tearDown();
	}

}
