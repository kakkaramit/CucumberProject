package com.tk20.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import com.tk20.qa.base.TestBase;
import com.tk20.qa.pages.LoginPage2;
import com.tk20.qa.util.Log;
import com.tk20.qa.util.ScreenShotMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplicationLoginTest extends TestBase{

	public static LoginPage2 loginpage;

	public ApplicationLoginTest()
	{
		super();
	}

	
	@Given("^Open browser Firefox and start browser$")
	public void open_browser_Firefox_and_start_browser() throws MalformedURLException  {
		Log.info("Open browser and start testing.");
		TestBase.initialization();
		loginpage=new LoginPage2();
		Log.info("Validate login page title.");
		loginpage.validateLoginPageTitle();
	}

	
	@When("^I enter invalid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void i_enter_invalid_and_invalid(String username, String password) throws InterruptedException  {
		Log.info("Enter invalid username and invalid password.");
		loginpage.login(username, password);  
	}

	
	@Then("^On clicking 'Login' button, an error message 'Invalid Username/Password' is displayed to the user\\.$")
	public void on_clicking_Login_button_an_error_message_Invalid_Username_Password_is_displayed_to_the_user()  {
		Log.info("Click Login button");
		loginpage.clickLoginbtn();
		Log.info("Validate error message.");
		loginpage.validateErrorMessage();

	}

	
	@When("^I enter valid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void i_enter_valid_and_invalid(String username, String password)  {
		Log.info("Enter valid username and invalid password.");
		loginpage.login(username, password);   

	}

	
	@Then("^on clicking login button, an error message invalid username/password is displayed\\.$")
	public void on_clicking_login_button_an_error_message_invalid_username_password_is_displayed()  {
		Log.info("Click Login button");
		loginpage.clickLoginbtn();
		Log.info("Validate error message.");
		loginpage.validateErrorMessage();

	}

	
	@When("^I enter invalid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_invalid_and_valid(String username, String password)  {
		Log.info("Enter invalid username and valid password.");
		loginpage.login(username, password);

	}

	
	@Then("^on clicking login button(\\d+), an error message invalid username/password is displayed\\.$")
	public void on_clicking_login_button_an_error_message_invalid_username_password_is_displayed(int username)  {
		Log.info("Click Login button");
		loginpage.clickLoginbtn();
		Log.info("Validate error message.");
		loginpage.validateErrorMessage();

	}

	
	@When("^I enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enters_valid_and_valid(String username, String password)  {
		Log.info("Enter valid username and valid password.");
		loginpage.login(username, password);

	}

	
	@Then("^user should be able to login successfully and Home text is displayed as a header of the page\\.$")
	public void user_should_be_able_to_login_successfully_and_Home_text_is_displayed_as_a_header_of_the_page()  {
		Log.info("Click Login button");
		loginpage.clickLoginbtn();
	}

	
	@Then("^verify page title and url\\.$")
	public void verify_page_title_and_url()  {
		Log.info("Validate home page title.");

		
			loginpage.validateHomePageTitle();
		

	}

	@And("^close driver\\.$")
	public void close_driver()  {
		Log.info("Closing the browser.");
		TestBase.tearDown(); 
	}

	@After
    public static void capture_ScreenShot(Scenario scenario) throws IOException
        {
            if(scenario.isFailed())    
                {
          
        			ScreenShotMethods.takeScreenShot();
        		
                    scenario.write("Scenario failed");
                }
            else
                {
                    scenario.write("Scenario passed");
                }
        }
	
}
