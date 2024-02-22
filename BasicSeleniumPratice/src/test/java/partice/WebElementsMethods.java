package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		
		//method 1,2,3,4:-sendKeys(),clear(),click(),submit()
	/*	WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		search.sendKeys("bluetooth");
		search.clear();
		search.sendKeys("puma");
	//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		search.submit();*/
		
		//method 5:-getLocation()
/*	WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
	    Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		//method 6:-getSize()
		Dimension size = ele.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//method 7:-getRect()
		Rectangle value = ele.getRect();
		System.out.println(value.getX());
		System.out.println(value.getY());
		System.out.println(value.getHeight());
		System.out.println(value.getWidth());*/
		
		//method 8:-getCssValue()
		/*WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		String col = search.getCssValue("color");
	    System.out.println(col);
	
	    String size = search.getCssValue("font-size");
	     System.out.println(size);*/
	
		//method 9:-getTagName()
	/*WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	String name = logo.getTagName();
	System.out.println(name);
	
	//method 10:-getAttribute()
	String value = logo.getAttribute("class");
	System.out.println(value);*/
		
		//method 11:-isDisplayed()
 /*  WebElement logo = driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
if(logo.isDisplayed())
{
	System.out.println("logo is displayed");
}
else
{
	System.out.println("logo not displayed");
}
	
	//method12:-isEnabled()
WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

	if(search.isEnabled())
	{
		search.sendKeys("bluetooth");
	}
	else
	{
		System.out.println("Element is not Enabled");
	}*/
	
		//method 13:-isSelected()
//driver.get("https://www.facebook.com/");

//driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
Thread.sleep(2000);
/*WebElement radiobutton = driver.findElement(By.xpath("//input[@value=\"1\"]"));

if(radiobutton.isSelected())
{
	System.out.println("radiobutton is selected");
}
else
{
	System.out.println("radiobutton is not selected");
}*/

//method 14:-getDomAttribute()
//DOM:-Document Object Model
/*WebElement name = driver.findElement(By.name("firstname"));
System.out.println(name.getDomAttribute("id"));

//method 15:-getDomProperty()
WebElement button = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
	System.out.println(button.getDomProperty("isConnected"));*/
	
//method 16:-getAccessibleName()
	/*WebElement name =driver.findElement(By.xpath("//button[@name=\"websubmit\"]")); 
	System.out.println(name.getAccessibleName());
	
	//method 17:-getAriaRole()
	System.out.println(name.getAriaRole());
	
	WebElement radiobutton = driver.findElement(By.xpath("//input[@value=\"1\"]"));
	System.out.println(radiobutton.getAriaRole());*/
	
//method 18:-getText()
driver.get("https://www.flipkart.com");
	WebElement bar = driver.findElement(By.name("q"));
	bar.sendKeys("puma");
	bar.submit();
	
	String name = driver.findElement(By.xpath("//a[@title=\"Cell Vive Mesh Wn's Running Shoes For Women\"]")).getText();
	System.out.println(name);
	
	
}
}
