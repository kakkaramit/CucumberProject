//package com.tk20.qa.testcases;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import com.tk20.qa.base.TestBase;
//import com.tk20.qa.pages.HomePage;
//import com.tk20.qa.pages.LoginPage;
//
//public class LoginPageTest extends TestBase{
//
//	LoginPage loginpage;
//	HomePage homepage;
//
//
//	public LoginPageTest()
//	{
//		super();
//	}
//
//	@BeforeSuite
//	public void steUp()
//	{
//		initialization();
//		loginpage = new LoginPage();
//	}
//
//	@Test(priority=1)
//	public void loginPageTitleTest()
//	{
//		String title=loginpage.validatePageTitle();
//		Assert.assertEquals(title, "CampusTools HigherEd - Log In");
//	}
//	
//	@Test(priority=2)
//	public void loginPageImageTest()
//	{
//		boolean logo=loginpage.validateImageLogo();
//		Assert.assertTrue(logo, "Logo not found.");
//	}
//	
//	@Test(priority=3)
//	public void loginTest()
//	{
//		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
//
//	@AfterSuite
//	public void close() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		tearDown();
//	}
//
//}
