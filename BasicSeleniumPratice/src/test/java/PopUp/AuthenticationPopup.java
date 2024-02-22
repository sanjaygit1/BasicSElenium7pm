package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthenticationPopup {

	@Test
	public void AuthenticationPopup() {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
	
	
	//driver.get("https://username:password@Url")
        
   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	
	}

}
