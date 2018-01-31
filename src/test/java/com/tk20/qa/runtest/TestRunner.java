package com.tk20.qa.runtest;


import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Selenium Project Folder\\WorkBook 4\\CucumberProjectTestNG\\Features\\AssignmentSubmission.feature", 
glue="com.tk20.qa.testcases", 
plugin={"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:cucumber-extent\\report.html"},//to generate different types of reporting
monochrome = true, //display the console output in a proper readable format
strict = true, //it will check if any step is not defined in step definition file
dryRun = false) 

public class TestRunner  {
	
	@AfterClass
	public static void reportSetup() 
	{
		Reporter.loadXMLConfig(new File(".\\src\\main\\java\\com\\tk20\\qa\\config\\Extent_Report.xml"));
		Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit", 	"Windows 10");
		Reporter.setSystemInfo("2.53.0", "Selenium");
		Reporter.setSystemInfo("3.3.9", "Maven");
		Reporter.setSystemInfo("1.8.0_66", "Java Version");
		//Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
	}


	
}
