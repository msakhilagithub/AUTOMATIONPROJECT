package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpage 
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement aserachbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement asearchbutton;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement samsung;
	
	@FindBy(xpath="//*[@id=\\\"add-to-cart-button\\\"]")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//*[@id=\\\"attach-sidesheet-view-cart-button\\\"]/span/input")
	WebElement cartbutton;
	
	



 public Amazonpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void search(String mob)
{
	aserachbox.sendKeys(mob);
	asearchbutton.click();
}



public void firstphone()
{
	samsung.click();
}

public void  addtocart()
{
	addtocartbutton.submit();
	
	
}
public void  cartsidebutton()
{
	cartbutton.click();
}



}
