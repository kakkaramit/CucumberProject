package com.tk20.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.tk20.qa.base.TestBase;
import com.tk20.qa.util.ClickOnElementMethods;
import com.tk20.qa.util.JavascriptAlertMethods;
import com.tk20.qa.util.ValidationMethodsAssert;

public class AssignmentSubmissionPage extends TestBase {

	 String coursePagetitle="TK20 | Courses";

	 String assignmentname="Assignment 1234";


	@FindBy(how=How.XPATH, using="//a[@href='#Courses']")
	WebElement coursesidemenu;

	@FindBy(how=How.XPATH, using="//a[@href='#CoursesCoursework']")
	WebElement courseworksidemenu;

	@FindBy(how=How.XPATH, using="//a[contains(@onclick, 'Assignment 1234')]")
	WebElement assignmentlink;

	@FindBy(how=How.XPATH, using="//a[@href='#Details']")
	WebElement detailssubtab;

	@FindBy(how=How.XPATH, using="//button[@id='addartifact3602a8c0784c2f9615c24fc26c2-f1a']")
	WebElement artifactselectbtn;

	@FindBy(how=How.XPATH, using="//button[@id='submitbtn']")
	WebElement assignmentsubmitbtn;

	@FindBy(how=How.XPATH, using="//a[contains(@onclick, 'Assignment 1234')]/preceding::label[1]")
	WebElement selectassignmentcheckbox;

	@FindBy(how=How.XPATH, using="//a[contains(@onclick, 'Assignment 1234')]/preceding::span[2]/span")
	WebElement pendingflag;

	@FindBy(how=How.XPATH, using="//button[@data-original-title='Recall']")
	WebElement recallbtn;
	
	@FindBy(how=How.XPATH, using="//button[@name='Save']")
	WebElement assignmentsavebtn;
	
	@FindBy(how=How.XPATH, using="//button[@class='navbar-toggle collapsed']")
	WebElement togglebtn;



	public AssignmentSubmissionPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void clickCoursesSidemenu()
	{	
		if(prop.getProperty("browser").equals("android"))
		{
			ClickOnElementMethods.clickForcefully(togglebtn);
		}
		ClickOnElementMethods.clickForcefully(coursesidemenu);
	}

	public void validatePageTitle() 
	{
		ValidationMethodsAssert.validateTitle(coursePagetitle);
	}

	public void clickCourseworkSidemenu() 
	{
		
		ClickOnElementMethods.clickForcefully(courseworksidemenu);
	}

	public void validateAssignmentLink() 
	{
		ValidationMethodsAssert.validateElementText(assignmentlink,assignmentname);
	}

	public void clickAssignment()
	{
		ClickOnElementMethods.clickForcefully(assignmentlink);
	}

	public void validateDetailsPage() 
	{
		ValidationMethodsAssert.validateElementPresence(detailssubtab);
	}

	public void clickSelectbutton()
	{
		ClickOnElementMethods.clickForcefully(artifactselectbtn);
	}

	public void clickSubmitButton()
	{
		ClickOnElementMethods.clickForcefully(assignmentsubmitbtn);
	}

	public void acceptAlert()
	{
		JavascriptAlertMethods.handleAlert("accept");
	}

	public void selectCheckbox()
	{
		ClickOnElementMethods.clickForcefully(selectassignmentcheckbox);
	}

	public void validatePendingFlag() 
	{
		ValidationMethodsAssert.validateElementText(pendingflag, "pending");
	}

	public void clickRecallButton()
	{
		ClickOnElementMethods.clickForcefully(recallbtn);
	}
	
	public void clickSave()
	{
		ClickOnElementMethods.clickForcefully(assignmentsavebtn);
	}
}
