package partice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttribute {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		           //syntax1: And
		//htmltag[@AttributeName="AttributeValue" and @AttributeName="AttributeValue"]
//driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\" and @name=\"q\"]")).sendKeys("iphone");

		               //syntax2: Or
		//htmltag[@AttributeName="AttributeValue" and @AttributeName="AttributeValue"]
driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands or More\" or @name=\"q\"]")).sendKeys("iphone");
driver.findElement(By.xpath("//button[contains(@aria-label,\"Search\")]")).click();

                       //syntax3: Or
		//htmltag[text()="AttributeValue" and @AttributeName="AttributeValue"]
//driver.findElement(By.xpath("//span[text()=\"Mobiles\" or @sdjgv=\"bfh\"]")).click();
	
List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
List<WebElement> allprice = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
	for(int i=0;i<allprice.size();i++)
	{
		System.out.println(allNames.get(i).getText()+"\t"+allprice.get(i).getText());
	}
	}
}
