package Testpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.AjiowindowHandle;

public class AjiowindowHandleTest 
{
	WebDriver driver;
@BeforeTest
public  void setup()
{
	   driver=new ChromeDriver();
	   driver.get("https://www.ajio.com/");
}

@Test
public void test1()
{   
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
String parentwindow=driver.getWindowHandle();
AjiowindowHandle obj=new AjiowindowHandle(driver);
obj.search("Top");
obj.productclick();




Set<String>allwindows=driver.getWindowHandles();
for(String handle:allwindows)
{
	if(!handle.equalsIgnoreCase(parentwindow))
	{
		driver.switchTo().window(handle);
		driver.manage().window().maximize();
		obj.nextwindow();
		
		Actions act=new Actions(driver);
		act.moveToElement(obj.hoverbag);
		act.perform();
		
		obj.shippingdetails("9656597789");
		
		
	}
	
	
	
}
	
	
}

}
