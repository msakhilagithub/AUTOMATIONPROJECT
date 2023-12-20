package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjiowindowHandle 
{
    WebDriver driver;
    
    @FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")
    WebElement searchfield;
	
    @FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span")
    WebElement searchicon ;
    
    @FindBy(xpath="//*[@id=\"main-content\"]/div[1]/div/div[1]/a/div/div[1]/div[1]/img")
    WebElement prod1 ;
    
    @FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[3]/div/span")
    WebElement size ;
    
    @FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]/div")
    WebElement addtobag ;
    
    @FindBy(xpath="//div[@class=\"ic-cart \"]")
	public
    WebElement hoverbag ;
    
    @FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/h1")
    WebElement proceedbag ;
    
    @FindBy(xpath="//button[@class=\"rilrtl-button button shipping-button\"]")
    WebElement shipping ;
  
    @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")
    WebElement mobno ;
  
  
	
	
	
	
	
	
	
	
	public AjiowindowHandle (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void search(String top) 
	{
		searchfield.sendKeys(top);
		searchicon.click();
	}
	
	public void productclick()
	{
		prod1.click();
		
	}
	public void nextwindow()
	{
		size.click();
		addtobag.click();
		proceedbag.click();
		
	}
	
	public void shippingdetails(String numbr)
	{
		shipping.click();
		mobno.sendKeys(numbr);
	}
	
}
