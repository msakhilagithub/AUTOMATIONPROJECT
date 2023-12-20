package Pagepkg;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ajiologin 
{
	WebDriver driver;
	
	@FindBy(id="loginAjio")
	WebElement signin;
	
	@FindBy(name="username")
	WebElement phnno;
	
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div[3]/label[1]/span")
	WebElement gender;
	
	@FindBy(name="user-name")
	WebElement name;
	
	@FindBy(name="email-mob")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div[10]/label/span")
	WebElement tandc;
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div[12]/input")
	WebElement otp;
	
	@FindBy(xpath="//*[@id=\"closeBtn\"]")
	WebElement close;
	
	
	@FindBy(tagName="a")
	public
	List<WebElement>Li;
	
	
	
	
	public Ajiologin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void signinn(String mobno)
	{
		signin.click();
		phnno.sendKeys(mobno,Keys.ENTER);
		
	}
	
	
	public void details(String fullname,String emailid)
	{
		gender.click();
		name.sendKeys(fullname);
		email.sendKeys(emailid);
		tandc.click();
		otp.click();
		close.click();
		
	}
	
	public void broklink(String Li)
	{
		
	}

}
