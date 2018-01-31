//package com.tk20.qa.testcases;
//
//import java.util.Map;
//
//import com.tk20.qa.base.TestBase;
//import com.tk20.qa.pages.AdministrationPage;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class ApplicationAdministrationUserCreationTest extends TestBase {
//	AdministrationPage adminpage;
//
//	@Given("^I am on Administration Users sidemenu$")
//	public void i_am_on_Administration_Users_sidemenu() throws InterruptedException {
//		adminpage= new AdministrationPage();
//		Thread.sleep(3000);
//		adminpage.clickAdministrationSidemenu();
//
//	}
//
//	@When("^I clicked 'Create New User' button$")
//	public void i_clicked_Create_New_User_button() throws InterruptedException {
//		Thread.sleep(3000);
//		adminpage.clickCreateNewUserBtn();
//	}
//
//	@When("^selected a role from the 'Role' drop down$")
//	public void selected_a_role_from_the_Role_drop_down() {
//		adminpage.selectRole();
//
//	}
//
//	@Then("^I clicked 'Next' button$")
//	public void i_clicked_Next_button() {
//		adminpage.clickNextBtn();
//
//	}
//
//	@When("^I input details within input field of create user and click update button$")
//	public void i_input_details_within_input_field_of_create_user(DataTable data) throws InterruptedException {
//
//		// For automatic transformation, change DataTable to one of
//		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//		// E,K,V must be a scalar (String, Integer, Date, enum etc)
//		for(Map<String,String> mdata: data.asMaps(String.class, String.class))
//		{
//			adminpage.enterUserData(mdata.get("pid"), mdata.get("fname"), mdata.get("lname"), mdata.get("email"));
//			adminpage.clickUpdateBtn();
//			i_clicked_Create_New_User_button();
//			selected_a_role_from_the_Role_drop_down();
//			i_clicked_Next_button();
//		}
//		
//		adminpage.clickCancelLink();
//	}
//
//}
