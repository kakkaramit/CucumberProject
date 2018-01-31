package com.tk20.qa.util;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk20.qa.base.TestBase;

public class ValidationMethodsAssert extends TestBase
{
	private static WebElement element=null;
	private static WebDriverWait wait;

	/**
	 * Method to get title of a page.
	 * @return
	 */
	public static String getPageTitle()
	{
		return driver.getTitle();
	}

	/**
	 * Method to verify title of a page.
	 * @param title
	 * @throws TestCaseFailed
	 * @
	 */
	public static void validateTitle(String title) 
	{
		String pageTitle = getPageTitle();

	
			//Assert.assertEquals("Page title text not Matched", title, pageTitle);
			
		
			Assert.assertEquals(title, pageTitle);
	}

	/**
	 * Method to verify partial title of a page.
	 * @param partialTitle
	 * @throws TestCaseFailed
	 * @ 
	 */
	public static void validatePartialTitle(String partialTitle) 
	{
		String pageTitle = getPageTitle();

		Assert.assertEquals("Partial text of page title not Matched", partialTitle, pageTitle);
	}

	/**
	 * Method to get text of an element.
	 * @param ele
	 * @return
	 */
	public static String getElementText(WebElement ele)
	{
		wait = new WebDriverWait(driver, 30);
		element =  wait.until(ExpectedConditions.visibilityOf(ele));
		return element.getText();

	}

	/**
	 * Method to verify text of an element
	 * @param ele
	 * @param actualValue
	 * @throws TestCaseFailed
	 * @
	 */
	public static void validateElementText(WebElement ele, String actualValue) 
	{
		String elementText = getElementText(ele);

		Assert.assertEquals("Element text not Matched", actualValue, elementText);
	}

	/**
	 * Method to verify partial text of an element.
	 * @param ele
	 * @param actualValue
	 * @throws TestCaseFailed
	 * @
	 */
	public static void validateElementPartialText(WebElement ele,String actualValue) 
	{
		String elementText = getElementText(ele);

		Assert.assertEquals("Partial text of an element not Matched", actualValue, elementText);
	}

	/**
	 * Method to validate if element is enabled.
	 * @param ele
	 * @return
	 */
	public static boolean isElementEnabled( WebElement ele)
	{
		element=WaitTool.waitForElementPresentAndDisplay(driver, ele, 20);
		return element.isEnabled();
	}

	/**
	 * Method to verify if element is enabled.
	 * @param ele
	 * @throws TestCaseFailed
	 * @
	 */
	public static void validateElementEnable(WebElement ele) 
	{
		boolean result=isElementEnabled(ele);

		Assert.assertTrue("Element is not enabled", result);
	}	  

	/**
	 * Method to get attribute of an element.
	 * @param ele
	 * @param attributeName
	 * @return
	 */
	public static String getElementAttribute( WebElement ele,String attributeName)
	{
		element = WaitTool.waitForElementPresentAndDisplay(driver, ele, 20);
		return element.getAttribute(attributeName);
	}

	/**
	 * Method to verify attribute of an element.
	 * @param attributeName
	 * @param attributeValue
	 * @param ele
	 * @throws TestCaseFailed
	 * @
	 */
	public static void validateElementAttribute(String attributeName, String attributeValue, WebElement ele) 
	{
		String attrVal = getElementAttribute(ele, attributeName);

		Assert.assertEquals("Element attribute not validated.", attributeValue, attrVal);
	}

	/**
	 * Method to validate if element is displayed.
	 * @param ele
	 * @return
	 */
	public static boolean isElementDisplayed( WebElement ele)
	{
		element = WaitTool.waitForElementPresentAndDisplay(driver, ele, 20);
		return element.isDisplayed();
	}

	/**
	 * Method to verify if element is present on the screen.
	 * @param ele
	 * @throws TestCaseFailed
	 * @
	 */
	public static void validateElementPresence(WebElement ele) 
	{

		boolean display= isElementDisplayed(ele);

		Assert.assertTrue("Element is not present", display);

	}

	/**
	 * Method to validate if check box is validated.
	 * @param ele
	 * @throws TestCaseFailed
	 * @
	 */
	public static void ischeckboxvalidated( WebElement ele) 
	{		
		WebElement checkbox=WaitTool.waitForElementPresentAndDisplay(driver, ele, 20);

		boolean check= checkbox.isSelected();

		Assert.assertTrue("Check box is not selected", check);
	} 

	/**
	 * Method to validate if radio button is selected. 
	 * @param ele
	 * @throws TestCaseFailed
	 * @
	 */
	public static void isRadioButtonSelected( WebElement ele) 
	{
		WebElement radioButton= WaitTool.waitForElementPresentAndDisplay(driver, ele, 20);
		boolean radio=radioButton.isSelected();
		Assert.assertTrue("Radio button is not selected.", radio);
	} 


	//	/**
	//	 * Method to assert if radio button is selected or not.
	//	 * @param accessType
	//	 * @param by
	//	 * @param option
	//	 * @param accessName
	//	 * @param shouldBeSelected
	//	 * @throws TestCaseFailed
	//	 * @ 
	//	 */
	//	public static void isOptionFromRadioButtonGroupSelected( String accessType,String by,String option,String accessName,boolean shouldBeSelected) 
	//	{
	//		wait = new WebDriverWait(driver, 30);
	//		List<WebElement> radioButtonGroup = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ele));
	//
	//		for (WebElement rb : radioButtonGroup) {
	//			if(by.equals("value"))
	//			{
	//				if(rb.getAttribute("value").equals(option))
	//				{
	//					
	//						if((rb.isSelected()) && shouldBeSelected)
	//						{System.out.println("Radio Button is selected");}
	//
	//						else 
	//						{throw new TestCaseFailed("Radio Button not selected");}
	//					
	//				}
	//			}
	//			else if(rb.getText().equals(option))
	//			{
	//				
	//					if((!rb.isSelected()) && shouldBeSelected)
	//					{System.out.println("Radio Button is selected");}
	//
	//					else
	//					{throw new TestCaseFailed("Radio Button not selected");}
	//				} 
	//			}
	//		}
	//	

	/**
	 * Method to get alert text
	 * @return
	 */

	public static String getAlertText()
	{
		return driver.switchTo().alert().getText();
	}

	/**
	 * Method to verify alert text.
	 * @param text
	 * @throws TestCaseFailed
	 * @ 
	 */

	public static void validateAlertText(String text) 
	{
		String expectedtext= getAlertText();

		Assert.assertEquals("Text not Matched", text, expectedtext);
	}

	//	/**
	//	 * method to select option from drop down
	//	 * @param accessType
	//	 * @param by
	//	 * @param option
	//	 * @param accessName
	//	 * @param shouldBeSelected
	//	 * @throws TestCaseFailed
	//	 * @ 
	//	 */
	//
	//
	//	{
	//		Select selectList=null;
	//		wait = new WebDriverWait(driver, 30);
	//		WebElement dropdown = wait.until(ExpectedConditions.visibilityof(ele));
	//		selectList = new Select(dropdown);
	//
	//		String actualValue="";
	//		if(by.equals("text"))
	//			actualValue = selectList.getFirstSelectedOption().getText();
	//		else
	//			actualValue = selectList.getFirstSelectedOption().getAttribute("value");
	//
	//		
	//			if((!actualValue.equals(option))&&(shouldBeSelected))
	//			{System.out.println("Option Selected From Dropwdown");}
	//			else if ((actualValue.equals(option))&&(!shouldBeSelected))
	//			{throw new TestCaseFailed("Option Not Selected From Dropwdown");}
	//		} 
}

