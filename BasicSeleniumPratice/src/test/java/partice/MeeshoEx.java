package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoEx {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder=\"Try Saree, Kurti or Search by Product Code\"]")).sendKeys("shoes");
	driver.findElement(By.cssSelector("div[class=\"sc-ehvNnt gVKRDY\"]")).click();
	
	}

}
