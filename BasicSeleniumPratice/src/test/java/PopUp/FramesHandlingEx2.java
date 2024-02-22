package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandlingEx2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(1);
		
		//driver.switchTo().frame("singleframe");
	
		WebElement txt = driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));
		driver.switchTo().frame(txt);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("shobha");

	}

}
