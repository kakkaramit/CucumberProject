package com.tk20.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.tk20.qa.base.TestBase;
import com.tk20.qa.util.ClickOnElementMethods;
import com.tk20.qa.util.DataInputMethods;
import com.tk20.qa.util.ValidationMethodsAssert;

public class AdministrationPage extends TestBase{
	
	static String adminPageTitle="TK20 | Administrations";

	@FindBy(how=How.XPATH, using="//a[@href='#Administration']")
	WebElement adminclick;
	
	@FindBy(how=How.XPATH, using="//span[text()='Create New User']/ancestor::button")
	WebElement clickcreateuser;

	@FindBy(how=How.NAME, using="selectRole")
	WebElement role;

	@FindBy(how=How.XPATH, using="//a[text()='Next']")
	WebElement nxtbtn;

	@FindBy(how=How.ID, using="ssn")
	WebElement pid;

	@FindBy(how=How.ID, using="fname")
	WebElement firstname;

	@FindBy(how=How.ID, using="lname")
	WebElement lastname;

	@FindBy(how=How.ID, using="email")
	WebElement email;

	@FindBy(how=How.XPATH, using="//button[@name='submit2']")
	WebElement updatebtn;
	
	@FindBy(how=How.XPATH, using="//div[@class='heading']/h1")
	WebElement createuserheader;
	
	@FindBy(how=How.ID, using="cancel2")
	WebElement cancellink;
	
	@FindBy(how=How.XPATH, using="//button[@class='navbar-toggle collapsed']")
	WebElement togglebtn;
	
	
	/*a[@href='#Administration']
	span[text()='Create New User']/ancestor::button
	select[@name='selectRole']
	a[text()='Next']
	input[@id='ssn']
	input[@id='fname']
	input[@id='lname']
	input[@id='email']
	button[@name='submit2']*/
	
	public AdministrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdministrationSidemenu() {
		if(prop.getProperty("browser").equals("android"))
		{
			ClickOnElementMethods.clickForcefully(togglebtn);
		}
		ClickOnElementMethods.clickForcefully(adminclick);
	}
	
	public void validatePageTitle()
	{
		ValidationMethodsAssert.validateTitle(adminPageTitle);
	}
	
	public void clickCreateNewUserBtn() {
		ClickOnElementMethods.clickForcefully(clickcreateuser);
	}
	
	public void selectRoleFromDropDown() {
		
		DataInputMethods.selectOptionFromDropdown(role, "text", prop.getProperty("createrole"));
	}
	
	public void clickNextBtn() {
		ClickOnElementMethods.clickForcefully(nxtbtn);
	}
	
	public void enterUserData(String p_id, String f_name, String l_name, String e_mail ) {
		DataInputMethods.enterText(pid, p_id);
		DataInputMethods.enterText(firstname, f_name);	
		DataInputMethods.enterText(lastname, l_name);
		DataInputMethods.enterText(email, e_mail);
		
	}
	
	public void clickUpdateBtn()
	{
		ClickOnElementMethods.clickForcefully(updatebtn);
	}
	
	public void verifyCreateUserHeader()
	{
		ValidationMethodsAssert.validateElementPresence(createuserheader);
	}
	
	public void clickCancelLink()
	{
		ClickOnElementMethods.clickForcefully(cancellink);
	}
	
}
