package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClassEX {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		//Normal Approach
	WebElement name = driver.findElement(By.id("user-name"));
	name.sendKeys("standard_user");
	name.sendKeys(Keys.CONTROL,"a");//Select
	name.sendKeys(Keys.CONTROL,"c");//copy
	name.sendKeys(Keys.TAB,Keys.CONTROL,"v");
	//WebElement word = driver.findElement(By.name("password"));
	//word.sendKeys(Keys.CONTROL,"v");//paste
	
	
	
	
	
	
	
	
	
	
	}

}
