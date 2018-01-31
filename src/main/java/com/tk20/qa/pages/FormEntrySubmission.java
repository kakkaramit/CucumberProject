package com.tk20.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.tk20.qa.base.TestBase;
import com.tk20.qa.util.ClickOnElementMethods;
import com.tk20.qa.util.DataInputMethods;
import com.tk20.qa.util.FileUploadMethod;


public class FormEntrySubmission extends TestBase {
	
	@FindBy(how=How.XPATH, using="//input[@id='3602a8c0784c2f9615c24fc26c2-f7b']")
	WebElement clickdate;
	
	@FindBy(how=How.XPATH, using="//input[@id='3602a8c0784c2f9615c24fc26c2-f7b']/following::a")
	WebElement clickdatecalander;
	
	@FindBy(how=How.XPATH, using="//div[@id='datepicker-calendar-3602a8c0784c2f9615c24fc26c2-f7b']/table//child::td")
	List<WebElement> listdates;

	@FindBy(how=How.ID, using="3602a8c0784c2f9615c24fc26c2-f79")
	WebElement decimalvalue;

	@FindBy(how=How.XPATH, using="//span[text()=' green']/parent::label")
	WebElement likertvalue;

	@FindBy(how=How.XPATH, using="//select[@id='3602a8c0784c2f9615c24fc26c2-f6a']")
	WebElement dropdownvalue;

	@FindBy(how=How.XPATH, using="//div/div[label[contains(.,'5 File')]]/following-sibling::div//div[@class='ajax-file-upload btn btn-green icon-plus add-file']")
	WebElement filevalue;

	@FindBy(how=How.ID, using="label3602a8c0784c2f9615c24fc26c2-f60")
	WebElement radiovalue;

	@FindBy(how=How.ID, using="label3602a8c0784c2f9615c24fc26c2-f5a")
	WebElement checkboxvalue;

	@FindBy(how=How.ID, using="3602a8c0784c2f9615c24fc26c2-f48")
	WebElement singletextvalue;

	@FindBy(how=How.XPATH, using="//label[@id='3602a8c0784c2f9615c24fc26c2-f540']")
	WebElement rubric1value;

	@FindBy(how=How.XPATH, using="//label[@id='3602a8c0784c2f9615c24fc26c2-f531']")
	WebElement rubric2value;

	@FindBy(how=How.XPATH, using="//button[text()='Add']")
	WebElement addbtn;

	@FindBy(how=How.XPATH, using="//a[text()='Cancel']")
	WebElement cancellink;


	public String filelocation="C:\\Users\\akakkar\\Documents\\Teacher Work Sample fall 17'.pdf";

	public FormEntrySubmission()
	{
		PageFactory.initElements(driver, this);
	}



	public void selectDate()
	{
		ClickOnElementMethods.clickForcefully(clickdate);
		ClickOnElementMethods.clickForcefully(clickdatecalander);
		List<WebElement> date=listdates;
		for(WebElement newdate:date)
		{
			if(newdate.getText().equals(24))
			{
				ClickOnElementMethods.clickForcefully(newdate);
			}
		}
	}

	public void inputDecimal()
	{
		DataInputMethods.enterText(decimalvalue, "123456");
	}	
	public void selectLikert()
	{
		ClickOnElementMethods.clickForcefully(likertvalue);
	}
	public void selectValueFromDropDown()
	{
		DataInputMethods.selectOptionFromDropdown(dropdownvalue, "Value", "1");
	}
	public void selectFile() throws IOException 
	{
		ClickOnElementMethods.click(filevalue);
		FileUploadMethod.fileUpload(filelocation);
	}
	public void selectRadiobutton()
	{
		DataInputMethods.selectRadioButton(radiovalue);
	}
	public void selectCheckBox()
	{
		DataInputMethods.checkCheckbox(checkboxvalue);
	}

	public void inputTextInSingleLine()
	{
		DataInputMethods.enterText(singletextvalue, "Assignment text for testing");
	}

	public void SelectRadioForRubric1()
	{
		DataInputMethods.selectRadioButton(rubric1value);
	}

	public void SelectRadioForRubric2()
	{
		DataInputMethods.selectRadioButton(rubric2value);
	}

	public void clickAdd()
	{
		ClickOnElementMethods.clickForcefully(addbtn);
	} 
	public void clickCancel()
	{
		ClickOnElementMethods.clickForcefully(cancellink);
	}

	
}
