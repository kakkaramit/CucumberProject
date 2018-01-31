package RandomData;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tk20.qa.base.TestBase;


public class ScreenShotMethods extends TestBase {
	
	/**
	 * Method to take screen shot of a page..
	 * @throws IOException
	 */
	public static void takeScreenShot() throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File currentDirFile = new File("Screenshots");
		String path = currentDirFile.getAbsolutePath();
		System.out.println("********************************");
		System.out.println("****\n"+path+"\\screenshot"+System.currentTimeMillis()+".png");
		System.out.println("********************************");
		FileUtils.copyFile(scrFile, new File(path+"\\screenshot "+System.currentTimeMillis()+".png"));
		
		
	}
	 
}

