package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExs {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//version3:-
	/*	Options opt = driver.manage();
		Timeouts time = opt.timeouts();
		time.implicitlyWait(10,TimeUnit.SECONDS);
	
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);*/
     //version:-4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Selenium Version 4:-
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//locator1:-id()
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     WebElement login = driver.findElement(By.id("login-button"));
	    
	 /*   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(login));
	    login.click();*/
	    
	   FluentWait wait = new FluentWait(driver);
	   wait.pollingEvery(Duration.ofSeconds(2));
	   wait.withTimeout(Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(login));
	   login.click();
	    
	
	    
	    
	    
	    
	    
	    
	}

}
