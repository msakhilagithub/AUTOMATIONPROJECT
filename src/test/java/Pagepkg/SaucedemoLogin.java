package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class SaucedemoLogin 
   {
		WebDriver driver;
		
		@FindBy(name="user-name")
		WebElement susername;

		@FindBy(name="password")
		WebElement spassword;
		
		@FindBy(name="login-button")
		WebElement slogin;
		
		@FindBy(name="add-to-cart-sauce-labs-backpack")
		WebElement prod1;
		
		@FindBy(name="add-to-cart-sauce-labs-bike-light")
		WebElement prod2;
		
		@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")
		WebElement prod3;
		

		@FindBy(name="add-to-cart-sauce-labs-fleece-jacket")
		WebElement prod4;
		
		@FindBy(name="add-to-cart-sauce-labs-onesie")
		WebElement prod5;
		
		@FindBy(name="add-to-cart-test.allthethings()-t-shirt-(red)")
		WebElement prod6;
		
		@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
		WebElement cart;
		
		@FindBy(name="checkout")
		WebElement checkout;
		

		@FindBy(name="firstName")
		WebElement sfirstname;
	
		@FindBy(name="lastName")
		WebElement slastname;
		
		@FindBy(name="postalCode")
		WebElement szipcode;
		
		@FindBy(name="continue")
		WebElement contnue;
		

		@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
		WebElement shome;
		
		@FindBy(id="logout_sidebar_link")
		WebElement slogout;
		
		
		
		public SaucedemoLogin(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void setvalues(String username,String password) 
		
		{
					susername.clear();
					susername.sendKeys(username);
					
					spassword.clear();
					spassword.sendKeys(password);
							
		}
		
		public void login()
		{
			slogin.click();
		}
		
		public void productaddtocart()
		{
			prod1.click();
			prod2.click();
			prod3.click();
			prod4.click();
			prod5.click();
			prod6.click();
		
		}
		
		public void checkout()
		{
			cart.click();
			checkout.click();
		}
		
		public void userdetails(String firstname,String lastname,String zipcode)
		{
			sfirstname.sendKeys(firstname);
			slastname.sendKeys(lastname);
			szipcode.sendKeys(zipcode);
			contnue.click();
			
			
		}
		
		public void home()
		{
			shome.click();
		}
		
		public void logout()
		{
			slogout.click();
		}


}
