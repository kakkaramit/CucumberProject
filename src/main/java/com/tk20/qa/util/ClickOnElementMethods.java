package com.tk20.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.tk20.qa.base.TestBase;


public class ClickOnElementMethods extends TestBase
{
	/**
	 * Method to click on an element.	
	 * @param element
	 */
	public static void click(WebElement element)
	{
		WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		element.click();
	}
	
	/**
	 * Method to click forcefully on an element.
	 * @param element
	 */
	public static void clickForcefully(WebElement element)
	{
		WaitTool.waitForElementPresentAndDisplay(driver, element, 20);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	
	/**
	 * Method to double click on an element.
	 * @param element
	 */
	public static void doubleClick(WebElement element)
	{
		WaitTool.waitForElementPresentAndDisplay(driver, element, 20);

		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().perform();
	}
}
