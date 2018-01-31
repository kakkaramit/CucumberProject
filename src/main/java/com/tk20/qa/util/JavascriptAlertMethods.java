package com.tk20.qa.util;

import com.tk20.qa.base.TestBase;

public class JavascriptAlertMethods extends TestBase {
	
	/**
	 * Method to select javascript alert
	 * @param decision
	 */
	
	public static void handleAlert(String decision)
	{
		if(decision.equals("accept"))
			driver.switchTo().alert().accept();
		else
			driver.switchTo().alert().dismiss();
	}
}
