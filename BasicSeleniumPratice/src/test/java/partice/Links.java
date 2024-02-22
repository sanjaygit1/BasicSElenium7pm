package partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		 List<WebElement> ALlLinks = driver.findElements(By.xpath("//a"));

		int count=0;
		for (WebElement link : ALlLinks) 
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println("total num of Links:"+count);
	}

}
