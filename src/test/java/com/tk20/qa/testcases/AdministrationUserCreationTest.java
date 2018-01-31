package com.tk20.qa.testcases;

import java.net.MalformedURLException;
import java.util.Map;

import com.tk20.qa.base.TestBase;
import com.tk20.qa.pages.AdministrationPage;
import com.tk20.qa.pages.LoginPage2;
import com.tk20.qa.util.Log;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdministrationUserCreationTest extends TestBase{
	
	public static LoginPage2 loginpage;
	public static AdministrationPage adminpage;

	public AdministrationUserCreationTest()
	{
		super();
	}


	@Given("^User already logged in to the application$")
	public void user_already_logged_in_to_the_application() throws MalformedURLException {
		Log.info("Open browser and start testing.");
		TestBase.initialization();
		loginpage=new LoginPage2();
		adminpage = new AdministrationPage();
		Log.info("Enter username and password");
		loginpage.login("akakkar@tk20.com", "t3stf1rst");
		Log.info("click login button.");
		loginpage.clickLoginbtn();
	    
	}

	@When("^User clicks 'Administration' sidemenu$")
	public void user_clicks_Administration_sidemenu() {
		Log.info("Click Administration side menu");
	    adminpage.clickAdministrationSidemenu();
	    
	}

	@Then("^Application navigate to 'Create User' side menu and validate header text\\.$")
	public void application_navigate_to_Create_User_side_menu_and_validate_header_text() {
	    Log.info("Verify create user header.");
		adminpage.verifyCreateUserHeader();
	    
	}

	@When("^I clicked 'Create New User' button$")
	public void i_clicked_Create_New_User_button() {
	    Log.info("Click on create new user button.");
	    adminpage.clickCreateNewUserBtn();
	    
	}

	@When("^selected a role from the 'Role' drop down$")
	public void selected_a_role_from_the_Role_drop_down() {
	    Log.info("Select role from drop down list");
	    adminpage.selectRoleFromDropDown();
	    
	}

	@Then("^I clicked 'Next' button$")
	public void i_clicked_Next_button() {
	    Log.info("Click on next button.");
	    adminpage.clickNextBtn();
	}

	@When("^I input details within input field of create user and click update button$")
	public void i_input_details_within_input_field_of_create_user_and_click_update_button(DataTable data) {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		// for(Map<String,String> mdata: data.asMaps(String.class, String.class))
		Log.info("Enter text in PID, FIRSTNAME, LASTNAME and EMAIL fields.");
		for(Map<String, String> mdata: data.asMaps(String.class, String.class))
			{
				adminpage.enterUserData(mdata.get("pid"), mdata.get("fname"), mdata.get("lname"), mdata.get("email"));
				adminpage.clickUpdateBtn();
				i_clicked_Create_New_User_button();
				selected_a_role_from_the_Role_drop_down();
				i_clicked_Next_button();
			}
			
			adminpage.clickCancelLink();
	    
	}
	
	@Then("^All the users should be created and verified$")
	public void all_the_users_should_be_created_and_verified() {
	    
	}
}
