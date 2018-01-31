package RandomData;
//package com.tk20.qa.testcases;
//
////import org.junit.Assert;
//
//import com.tk20.qa.base.TestBase;
//import com.tk20.qa.pages.HomePage;
//import com.tk20.qa.pages.LoginPage2;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class CucumberLoginPageTest extends TestBase {
//	
//	LoginPage2 LoginPage2;
//	HomePage homepage;
//	
//	public CucumberLoginPageTest()
//	{
//		super();
//	}
//
//	
//	@Given("^Open browser Chrome and start browser$")
//	public void open_browser_Chrome_and_start_browser() throws Throwable {
//	    
//		initialization();
//		LoginPage2 = new LoginPage2();
//	}
//
//	@Then("^verify title of the login page\\.$")
//	public void verify_title_of_the_login_page() throws Throwable {
//	    
//		//String title=LoginPage2.validatePageTitle();
//		//Assert.assertEquals(title, "CampusTools HigherEd - Log In");
//		//Assert.assertEquals(expected, actual);
//	}
//
//	@Then("^verify logo on the login page\\.$")
//	public void verify_tk_logo_on_the_login_page() throws Throwable {
//		boolean logo=LoginPage2.validateImageLogo();
//		//Assert.assertTrue(logo, "Logo not found.");
//	    
//	}
//
//	@When("^I enters valid 'username' and valid 'password'.$")
//	public void i_enters_valid_and_valid() throws Throwable {
//	    
//		homepage=LoginPage2.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
//
//	@Then("^user should be able to login successfully and object of home page is displayed\\.$")
//	public void user_should_be_able_to_login_successfully_and_object_of_home_page_is_displayed() throws Throwable {
//	    
//	    
//	}
//
//	@And("^close driver\\.$")
//	public void close_driver() throws Throwable {
//		Thread.sleep(5000);
//		//tearDown();  
//	    
//	}
//
//
//}
