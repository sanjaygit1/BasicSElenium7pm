package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingFlipKArt {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		/*driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("puma");
    	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	
    	String data = driver.findElement(By.xpath("//a[text()=\"Wild Rider Rollin Sneakers For Women\"]")).getText();
	    System.out.println(data);*/
		
	//	driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\" and @name=\"q\"]")).sendKeys("iphone");
	
		driver.findElement(By.xpath("//input[contains(@title,\"Se\")]")).sendKeys("Bluetooth");
	}
}
