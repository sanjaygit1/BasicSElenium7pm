package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginApp {

	//initialization
		public LoginApp(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="user-name")
		private WebElement userText;
		
		@FindBys({@FindBy(name="password"),@FindBy(xpath ="//input[@placeholder=\"Password\"]")})
		private WebElement passwordText;
		
		public void loginToApp(String UserName, String PassWord)
		{
			userText.sendKeys(UserName);
			passwordText.sendKeys(PassWord);
		}


}