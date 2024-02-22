package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0;i<2;i++)
		{
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}
		
		for(int i=0;i<1;i++)
		{
			js.executeScript("window.scrollBy(0,-200)");
			Thread.sleep(1000);
		}
	}

}
