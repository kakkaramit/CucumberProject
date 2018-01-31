package com.tk20.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.tk20.qa.base.TestBase;

public class DataInputMethods extends TestBase
{
	private static WebElement dropdown =null;
	private static Select selectList=null;
	
	/**
	 * Method to enter text.
	 * @param element
	 * @param text
	 */
	public static void enterText(WebElement element ,String text)
	{
		WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		element.sendKeys(text);
	}
	
	/**
	 * Method to clear text.
	 * @param element
	 */
	public static void clearText(WebElement element)
	{
		WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		element.clear();
	}
	
	/**
	 * Method to select option from dropdown.
	 * @param element
	 * @param optionBy
	 * @param option
	 */
	public static void selectOptionFromDropdown(WebElement element, String optionBy, String option)
	{
		dropdown = WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		selectList = new Select(dropdown);
		
		if(optionBy.equals("Index"))
			selectList.selectByIndex(Integer.parseInt(option)-1);
		else if (optionBy.equals("value"))
			selectList.selectByValue(option);
		else if (optionBy.equals("text"))
			selectList.selectByVisibleText(option);
	}
	
	/**
	 * Method to de-select all options from multiselect drop-down.	
	 * @param element
	 */
	public static void unselectAllOptionFromMultiselectDropdown(WebElement element)
	{
		dropdown=WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		selectList = new Select(dropdown);
		selectList.deselectAll();
	}
	
	/**
	 * Method to de-select option from drop-down.
	 * @param element
	 * @param optionBy
	 * @param option
	 */
	public static void deselectOptionFromDropdown(WebElement element, String optionBy, String option) 
	{
		dropdown= WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		selectList = new Select(dropdown);
		
		if(optionBy.equals("Index"))
			selectList.deselectByIndex(Integer.parseInt(option)-1);
		else if (optionBy.equals("value"))
			selectList.deselectByValue(option);
		else if (optionBy.equals("text"))
			selectList.deselectByVisibleText(option);
	}
	
	/**
	 * Method to select checkbox.	
	 * @param element
	 */
	public static void checkCheckbox(WebElement element)
	{
		WebElement checkbox=WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		if (!checkbox.isSelected())
			checkbox.click();
	}
	
	/**
	 * Method to de-select checkbox.
	 * @param element
	 */
	public static void uncheckCheckbox(WebElement element)
	{
		WebElement checkbox=WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		if (checkbox.isSelected())
			checkbox.click();
	}
	
	/**
	 * Method to select toogle checkbox.
	 * @param element
	 */
	public static void toggleCheckbox(WebElement element)
	{
		WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		element.click();
	}
	
	/**
	 * Method to select radio button
	 * @param element
	 */
	public static void selectRadioButton(WebElement element)
	{
		WebElement radioButton=WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		if(!radioButton.isSelected())
			radioButton.click();
	}
	
	/* /**
	 * Method to select option from radio button group.
	 * @param accessType
	 * @param option
	 * @param by
	 * @param accessName
	 
	
	public static void selectOptionFromRadioButtonGroup(String accessType, String option, String by, String accessName)
	{
		List<WebElement> radioButtonGroup = driver.findElements(ele);
		for(WebElement rb : radioButtonGroup)
		{
			if(by.equals("value"))
			{
				if(rb.getAttribute("value").equals(option) && !rb.isSelected())
					rb.click();
			}
			else if(by.equals("text"))
			{
				if(rb.getText().equals(option) && !rb.isSelected())
					rb.click();
			}
		}
	}*/
}

