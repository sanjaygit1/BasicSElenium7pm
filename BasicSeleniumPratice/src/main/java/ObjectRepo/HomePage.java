package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[text()=\"ADD TO CART\"])[1]")
	private WebElement txt;

	@FindBy(xpath="//div[text()=\"29.99\"]")
    private WebElement price;
	
	//gettermethod
	public WebElement getTxt() {
		return txt;
	}
	public WebElement getPrice() {
		return price;
	}
  
	public void clickTxt()
	{
		txt.click();
	}
	
	public void printPrice()
	{
		String ele = price.getText();
		System.out.println(ele);
	}
}
