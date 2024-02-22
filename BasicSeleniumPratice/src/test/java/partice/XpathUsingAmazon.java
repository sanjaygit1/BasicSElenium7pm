package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAmazon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		     //xpath by Attribute()
		//syntax1:- //htmltag[@AttributeName="AttributeVAlue"]
	//driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_1\"]")).click();
//driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]")).click();
		
             //xpath by text()
        //syntax2:- //htmltag[text()="AttributeVAlue"]
//driver.findElement(By.xpath("//span[text()=\"Comedy\"]")).click();
	
		//xpath by contains Attribute()
	//syntax3:- //htmltag[contains(@AttributeName,"AttributeValue")]
//driver.findElement(By.xpath("//input[contains(@aria-label,\"S\")]")).sendKeys("Nike");
	
	       //xpath by contains text()
		//syntax4:- //htmltag[contains(text(),"AttributeValue")]
driver.findElement(By.xpath("//a[contains(text(),\"Ideas\")]")).click();

}

}
