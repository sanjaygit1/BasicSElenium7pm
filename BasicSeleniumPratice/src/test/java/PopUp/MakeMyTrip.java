package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();

//driver.findElement(By.xpath("//div[text()=\"March 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"1\"]")).click();
	
	String month = "March 2024";
	String date = "20";
driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]"
		+ "/descendant::p[text()=\""+date+"\"]")).click();}

}
