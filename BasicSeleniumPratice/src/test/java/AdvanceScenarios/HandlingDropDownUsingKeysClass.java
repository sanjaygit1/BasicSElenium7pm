package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDropDownUsingKeysClass {

	@Test
	public void handlingDropDownUsingKeysClass() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		Thread.sleep(1000);
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();
		
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		
		dateList.sendKeys(Keys.ARROW_UP);
		dateList.sendKeys(Keys.ARROW_UP);
		dateList.sendKeys(Keys.ARROW_UP);
	}

}
