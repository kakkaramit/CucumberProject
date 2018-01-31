package com.tk20.qa.util;

import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class ScreenshotOnFailer {
	
	@After
    public static void capture_ScreenShot(Scenario scenario) throws IOException
        {
            if(scenario.isFailed())    
                {
          
        			ScreenShotMethods.takeScreenShot();
        		
                    scenario.write("Scenario failed");
                }
            else
                {
                    scenario.write("Scenario passed");
                }
        }

}
