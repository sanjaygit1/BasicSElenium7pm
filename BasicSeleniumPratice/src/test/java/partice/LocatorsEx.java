package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsEx {

	public static void main(String[] args) {
		
		//Launching chrome Browser
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        
        //using id() locator
       /* driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();*/
        
        //using name() locator
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        
        //using className() locator
        driver.findElement(By.className("btn_action")).click();
	
	}

}
