package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//initialization
		public LoginPage1(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
	
	@FindBys({@FindBy(id="user-name"),@FindBy(xpath = "//input[@data-test=\"username\"]")})
	private WebElement usertext;
	
	public void text(String Username)
	{
		usertext.sendKeys(Username);
	}
}
