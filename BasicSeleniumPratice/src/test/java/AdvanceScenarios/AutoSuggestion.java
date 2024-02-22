package AdvanceScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestion {

	@Test
	public void autoSuggestion() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		
		Thread.sleep(2000);
List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
	
Thread.sleep(1000);
for (WebElement sugg : allSugg)
{
	System.out.println(sugg.getText());
	String ele = sugg.getText();
if(ele.contains("bluetooth headphones"))
	{
	sugg.click();
	break;
	}

}
	}

}
