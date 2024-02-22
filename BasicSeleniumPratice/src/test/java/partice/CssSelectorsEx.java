package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//syntax1:-  [AttributeName="AttributeValue"]
//	driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
//	driver.findElement(By.cssSelector("[id=\"password\"]")).sendKeys("secret_sauce");
	
	//syntax2:-  htmltag[AttributeName="AttributeValue"]
//	driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	
		//syntax3:-  #AttributeValue   [# indicates id() in cssSelector]
	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	
	//syntax4:-  htmltag#AttributeValue
	//driver.findElement(By.cssSelector("input#login-button")).click();
	
	//syntax5:- .AttributeValue
	//driver.findElement(By.cssSelector(".btn_action")).click();
	
	//syntax6:-  htmltag.AttributeValue
	driver.findElement(By.cssSelector("input.btn_action")).click();
	
	
	
	
	}

}
