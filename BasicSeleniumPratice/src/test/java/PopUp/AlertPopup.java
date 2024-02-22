package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopup {

	@Test
	public void AlertPopup() {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]")).click();
		
	//	Alert alt = driver.switchTo().alert();
	//	alt.accept();
	
	/*driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
	Alert alt = driver.switchTo().alert();
	//alt.dismiss();
	String txt = alt.getText();
	System.out.println(txt);*/
	
	driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]")).click();
	Alert alt1 = driver.switchTo().alert();
	alt1.sendKeys("welcome");
	alt1.accept();
	
	}

}
