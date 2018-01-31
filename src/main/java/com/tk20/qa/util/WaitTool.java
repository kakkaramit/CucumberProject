package com.tk20.qa.util;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTool  {
	
	public static WebDriverWait wait;
		
	
	 public static List<WebElement> waitForElementsPresentAndDisplay(WebDriver driver, List<WebElement> elements, int timeOutInSeconds) {
	        try {      
	            wait = new WebDriverWait(driver, timeOutInSeconds);
	            List<WebElement> elementsDisplayed = wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	            return elementsDisplayed; // return the element       
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	 
	 
	 
	 
	 public static WebElement waitForElementPresentAndDisplay(WebDriver driver, WebElement elementName, int timeOutInSeconds){
     	try{
     	        wait = new WebDriverWait(driver, timeOutInSeconds);
     	        wait.until(ExpectedConditions.visibilityOf(elementName));
     	        return elementName;
     	}catch(Exception e){
     	    return null;
     	}
 }
}
