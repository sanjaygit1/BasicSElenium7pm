package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJS {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");	
	WebElement ele = driver.findElement(By.xpath("//a[text()=\"ಕನ್ನಡ\"]"));
/*	Point data = ele.getLocation();
	System.out.println(data.getX());
	System.out.println(data.getY());
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(117,750)");
	ele.click();*/
	
	/*JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",ele);
	ele.click();*/
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

}
