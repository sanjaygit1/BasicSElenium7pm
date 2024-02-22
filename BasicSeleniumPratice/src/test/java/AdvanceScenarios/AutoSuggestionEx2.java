package AdvanceScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("nike");

		Thread.sleep(2000);
List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
	
	for (WebElement sugg: allSugg)
	{
		System.out.println(sugg.getText());
		String ele = sugg.getText();
		if(ele.contains("nike running shoes for men"))
		{
			sugg.click();
			break;
		}
	}
	
	
	}

}
