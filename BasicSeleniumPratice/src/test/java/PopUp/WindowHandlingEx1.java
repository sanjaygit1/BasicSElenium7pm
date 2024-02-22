package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
//driver.findElement(By.linkText("Watch the Videos")).click();
	
	String mainid = driver.getWindowHandle();//win1
	System.out.println(mainid);
	
	Set<String> allIds = driver.getWindowHandles();//win1 win2
	System.out.println(allIds);
	
	for (String id : allIds)
	{
		if(!mainid.equals(id))
		{
			driver.switchTo().window(id);
			driver.findElement(By.linkText("Watch the Videos")).click();
	
		}
	}	
	
	
	
	}

}
