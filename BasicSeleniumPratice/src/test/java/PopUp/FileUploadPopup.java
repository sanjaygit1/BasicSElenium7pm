package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.foundit.in/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//div[contains(text(),\" Upload Resume\")]")).click();

WebElement ele = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
ele.sendKeys("C:\\Users\\Shobha\\Downloads\\ProjectSetUpSteps.txt");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id=\"pop_upload\"]")).click();
	
	}

}
