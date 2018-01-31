package com.tk20.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.tk20.qa.util.WebEventListener;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class TestBase {

	public static WebDriver driver;
	//public static AppiumDriver adriver;
	//public static RemoteWebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static DesiredCapabilities cap;
	public static ChromeOptions options;
	public static FirefoxOptions firefoxoptions;
	public static final String USERNAME = "sahilcena2018";
	public static final String ACCESS_KEY = "17505000892";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static String sessionId;
	
	private static AppiumDriverLocalService service;
	private static AppiumServiceBuilder builder;
	public static CommandLine cmd;
	public static DefaultExecuteResultHandler handler;
	public static DefaultExecutor executor;
	

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream finput = new FileInputStream(".\\src\\main\\java\\com\\tk20\\qa\\config\\config.properties");
			prop.load(finput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	public static void startServer() {
//		cmd = new CommandLine("C:\\Program Files\\nodejs\\node.exe");
//		cmd.addArgument("C:\\Users\\akakkar\\AppData\\Local\\Programs\\appium-desktop\\resources\\app\\node_modules\\appium\\lib\\Appium.js");
//		cmd.addArgument("--address");
//		cmd.addArgument("127.0.0.1");
//		cmd.addArgument("--port");
//		cmd.addArgument("4723");
//		
//		handler = new DefaultExecuteResultHandler();
//		executor = new DefaultExecutor();
//		executor.setExitValue(1);
//		try {
//			executor.execute(cmd, handler);
//			Thread.sleep(10000);
//		} catch (IOException | InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
//	public static void appiumInitialization()
//	{
//		//Set Capabilities
//		cap = new DesiredCapabilities();
//		cap.setCapability("noReset", "false");
//		
//		//Build the Appium service
//		builder = new AppiumServiceBuilder();
//		builder.withIPAddress("127.0.0.1");
//		builder.usingPort(4723);
//		builder.withCapabilities(cap);
//		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
//		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
//		
//		//Start the server with the builder
//		service = AppiumDriverLocalService.buildService(builder);
//		service.start();
//	}
//	
//	public static void stopServer() {
//		service.stop();
//	}


	public static void initialization() throws MalformedURLException
	{
		String browsername= prop.getProperty("browser");
		if(driver==null)
		{
			if(browsername.equalsIgnoreCase("chrome"))
			{
				//System.setProperty("webdriver.chrome.driver",".\\Resource\\chromedriver.exe");

				ChromeDriverService service = new ChromeDriverService.Builder()
						.usingDriverExecutable(new File(".\\Resource\\chromedriver.exe"))
						.usingAnyFreePort()
						.build();
				cap= DesiredCapabilities.chrome();
				cap.acceptInsecureCerts();
				cap.setAcceptInsecureCerts(true);
				options= new ChromeOptions();
				//options.addArguments("start-maximized");
				options.merge(cap);
				driver= new ChromeDriver(service, options);
				e_driver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();
				e_driver.register(eventListener);
				driver = e_driver;
			}else if(browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", ".\\Resource\\geckodriver.exe");

				cap= DesiredCapabilities.firefox();
				cap.setAcceptInsecureCerts(true);
				firefoxoptions = new FirefoxOptions();
				firefoxoptions.setCapability("marionette", true);
				firefoxoptions.merge(cap);
				driver= new FirefoxDriver(firefoxoptions);
			}else if(browsername.equalsIgnoreCase("chromeheadless"))
			{
				System.setProperty("webdriver.chrome.driver",".\\Resource\\chromedriver.exe");
				options= new ChromeOptions();
				options.addArguments("headless");
				driver= new ChromeDriver(options);
			}else if(browsername.equalsIgnoreCase("firefoxheadless"))
			{
				System.setProperty("webdriver.gecko.driver",".\\Resource\\geckodriver.exe");
				cap= DesiredCapabilities.firefox();
				cap.setAcceptInsecureCerts(true);
				firefoxoptions = new FirefoxOptions();
				//firefoxoptions.setCapability("marionette", true);
				//firefoxoptions.addArguments("-headless");
				firefoxoptions.addArguments("--window-size=480,1000");
				firefoxoptions.setHeadless(true);
				firefoxoptions.merge(cap);
				driver= new FirefoxDriver(firefoxoptions);
			}else if(browsername.equalsIgnoreCase("saucelabs"))
			{
				cap = DesiredCapabilities.chrome();
				cap.setCapability("platform", "Windows XP");
				cap.setCapability("version", "43.0");
				driver = new RemoteWebDriver(new URL(URL), cap);
				sessionId = (((RemoteWebDriver) driver).getSessionId()).toString();
			}else if(browsername.equalsIgnoreCase("android"))
			{
				//appiumInitialization();
				
				cap = new DesiredCapabilities();
				//				cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
				//				cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0.0");
				//				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
				//				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "android");

				cap.setCapability("browserName", "Chrome");
				cap.setCapability("device", "Android");
				cap.setCapability("deviceName", "Android");	
				cap.setCapability("platformName", "Android");
				cap.setCapability("platformVersion","8.1.0");//6.0.1
//				cap.setCapability("autoWebview", true);
//				cap.setCapability("automationName","appium");--compensate-for-unstable-pinch-zoom
//				options= new ChromeOptions();
//				options.addArguments("--compensate-for-unstable-pinch-zoom");
//				cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "120");
//				cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new RemoteWebDriver(new  URL("http://127.0.0.1:4723/wd/hub"), cap);
			}else
			{
				System.out.println("Browser not found. Please check the browser");
			}
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		//driver.manage().window().maximize();
	}

	public static void tearDown()
	{
		driver.close();
	}



}
