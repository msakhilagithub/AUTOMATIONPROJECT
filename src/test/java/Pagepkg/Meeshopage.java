package Pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Meeshopage 
{
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")
	WebElement search ;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[5]")
	public
	WebElement men ;
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[6]/div/div[3]/a[5]/p")
	public
	WebElement jewellery ;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[15]/div[2]/div/span[3]/a")
	public
	WebElement haircolour ;
	
	
	
	
	 public Meeshopage (WebDriver driver)
	 {
	 	this.driver=driver;
	 	PageFactory.initElements(driver, this);
	 }
	 
	 public void searchmethod(String item)
	 {
		 search.sendKeys(item,Keys.ENTER);
		 jewellery.click(); 
		 
	 }
	 
	public void hair()
	{
		haircolour.click();
	}
	 

}
