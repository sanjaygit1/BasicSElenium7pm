package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPratice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        
    driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("phone");
    driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
    
    String name = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).getText();
	
	System.out.println(name);
	}

}
