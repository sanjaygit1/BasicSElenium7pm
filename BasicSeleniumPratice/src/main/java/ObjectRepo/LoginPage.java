package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//initialization
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(id="user-name")
	private WebElement USERTEXT;
	
	@FindBy(name="password")
	private WebElement PASSWORDTEXT;
	
	@FindBy(id="login-button")
	private WebElement LOGIN;

	//getter methods
	public WebElement getUSERTEXT() {
		return USERTEXT;
	}

	public WebElement getPASSWORDTEXT() {
		return PASSWORDTEXT;
	}

	public WebElement getLOGIN() {
		return LOGIN;
	}
	
	//Business Logics
	public void loginToApp(String username,String password)
	{
		USERTEXT.sendKeys(username);
		PASSWORDTEXT.sendKeys(password);
		LOGIN.click();
	}
	
	
}
