package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.in");
WebElement ele = driver.findElement(By.xpath("(//a[text()=\"Customer Service\"])[1]"));
		  Actions act = new Actions(driver);
	//	act.moveToElement(ele).perform();
	//	act.click(ele).perform();
		//or
	act.moveToElement(ele).click(ele).perform();*/
		
	/*	driver.get("https://www.saucedemo.com/v1/");
		WebElement USERNAME = driver.findElement(By.name("user-name"));
		WebElement PASSWORD = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.className("btn_action"));
		
		Actions act = new Actions(driver);
	//	act.sendKeys(USERNAME, "standard_user").perform();
	//	act.sendKeys(PASSWORD, "secret_sauce").perform();
	//	act.click(loginButton).perform();
		
		//or
		act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(loginButton).build().perform();*/
		
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		//act.clickAndHold(drag).perform();
		//act.release(drop).perform();
	//or
	    act.dragAndDrop(drag, drop).perform();*/
	
	/*    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement ele = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
	     Actions act = new Actions(driver);
	//act.contextClick(ele).perform();
	
	WebElement ele2 = driver.findElement(By.xpath("//a[.=\"Insurance Project\"]"));
	act.contextClick(ele2).perform();
	
	
	WebElement txt = driver.findElement(By.xpath("//button[.=\"Double-Click Me To See Alert\"]"));
	act.doubleClick(txt).perform();*/
	

driver.get("https://www.agoda.com/");
Actions act = new Actions(driver);
Thread.sleep(2000);
act.moveByOffset(50, 30).click().build().perform();
	

	}

}
