package RandomData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk20.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(how=How.ID, using="user")
	WebElement username;

	@FindBy(how=How.ID, using="pass")
	WebElement password;

	@FindBy(how=How.NAME, using="login2")
	WebElement login;

	@FindBy(how=How.XPATH, using="//div[@class='logo tk20']")
	WebElement tk20logo;

	@FindBy(how=How.XPATH, using="//a[contains(text(), 'forgot your username or password?')]")
	WebElement forgotlogin;

	public LoginPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}

	public String validatePageTitle()
	{
		return driver.getTitle();
	}

	public boolean validateImageLogo()
	{
		return tk20logo.isDisplayed();
	}

	public HomePage login(String ur, String pwd) {
		username.sendKeys(ur);
		password.sendKeys(pwd);
		
		login.click();

		return new HomePage();
	}

	public void clickForgetLink() 
	{
		forgotlogin.click();
	}
	
	

}
