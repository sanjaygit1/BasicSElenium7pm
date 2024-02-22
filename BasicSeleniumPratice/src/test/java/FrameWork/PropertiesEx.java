package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepo.HomePage;
import ObjectRepo.LoginApp;
import ObjectRepo.LoginPage;
import ObjectRepo.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesEx {

	public static void main(String[] args) throws Throwable {
		
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
		      /*  driver.get("https://www.saucedemo.com/v1/");
		       
		     //using id() locator
		        driver.findElement(By.id("user-name")).sendKeys("standard_user");
			    driver.findElement(By.id("password")).sendKeys("secret_sauce");
			    driver.findElement(By.id("login-button")).click();*/
	
	
//	FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\Properties_File.properties");
	FileInputStream fis = new FileInputStream("./Properties_File.properties");
	Properties pro = new Properties();
	pro.load(fis);
	String URL = pro.getProperty("url");
	String USERNAME = pro.getProperty("username");
	String PASSWORD = pro.getProperty("password");
	driver.get(URL);
	
	
	/*driver.findElement(By.id("user-name")).sendKeys(USERNAME);
    driver.findElement(By.name("password")).sendKeys(PASSWORD);
    driver.findElement(By.id("login-button")).click();*/
	
	LoginApp login = new LoginApp(driver);
	login.loginToApp(USERNAME, PASSWORD);
	}

}
