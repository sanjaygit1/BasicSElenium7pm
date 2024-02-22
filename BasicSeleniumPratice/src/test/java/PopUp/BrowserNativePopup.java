package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNativePopup {

	public static void main(String[] args) {
	
	 /*	EdgeOptions opt = new EdgeOptions();
	     opt.addArguments("--disable-notifications");
		
		WebDriver driver=new EdgeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();*/
	
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--incognito");
	
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://flipkart.com");
	}

}
