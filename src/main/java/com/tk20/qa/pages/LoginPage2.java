package com.tk20.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.tk20.qa.base.TestBase;
import com.tk20.qa.util.ClickOnElementMethods;
import com.tk20.qa.util.DataInputMethods;
import com.tk20.qa.util.ValidationMethodsAssert;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage2 extends TestBase {

	public String loginPageTitle="CampusTools HigherEd - Log In";
	public String homePageTitle="TK20 | Home1";
	public String errorText="Invalid Username/Password";


	@FindBy(how=How.ID, using="user")
	WebElement username;

	@FindBy(how=How.ID, using="pass")
	WebElement password;

	@FindBy(how=How.NAME, using="login2")
	WebElement login;

	@FindBy(how=How.XPATH, using="//div[@class='logo tk20']")
	WebElement tk20logo;

	@FindBy(how=How.XPATH, using="//div[@id='error']/p")
	WebElement error;

	@FindBy(how=How.XPATH, using="//a[contains(text(), 'forgot your username or password?')]")
	WebElement forgotlogin;

	public LoginPage2() {
		PageFactory.initElements(driver, this);
	}

	public void validateLoginPageTitle()
	{
		ValidationMethodsAssert.validateTitle(loginPageTitle);
	}

	public void validateHomePageTitle()
	{
		ValidationMethodsAssert.validateTitle(homePageTitle);
	}

	public boolean validateImageLogo()
	{
		return ValidationMethodsAssert.isElementDisplayed(tk20logo);
	}

	public void login(String ur, String pwd) {

		DataInputMethods.enterText(username, ur);
		DataInputMethods.enterText(password, pwd);		
	}

	public void clickLoginbtn()
	{
		ClickOnElementMethods.clickForcefully(login);
	}

	public void clickForgetLink() 
	{
		ClickOnElementMethods.click(forgotlogin);
	}

	public void validateErrorMessage()
	{
		ValidationMethodsAssert.validateElementText(error, errorText);
	}

}
