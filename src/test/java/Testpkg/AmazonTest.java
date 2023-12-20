package Testpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Amazonpage;

public class AmazonTest 
{
	WebDriver driver;
@BeforeTest
public  void setup()
{
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
}

@Test
public void test1()

{  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	Amazonpage ap1=new Amazonpage (driver);
   ap1.search("mobilephones");
   ap1.firstphone();
	
	

	String title=driver.getTitle();
	System.out.println(title);
	if(title.equalsIgnoreCase("Amazon.in : mobilephones"))
	{
		System.out.println("Title matches");
	}
	else
	{
		System.out.println("Title is not matching");
	}
	
	
	String parentwindow=driver.getWindowHandle();
	Set<String>allwindows=driver.getWindowHandles();
	for(String handle:allwindows)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			//do what ever we want in new window
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			
			Amazonpage ap=new Amazonpage (driver);
			ap.addtocart();
			ap.cartsidebutton();
			
			
			driver.close();
			
		}
		driver.switchTo().window(parentwindow);
		
	}
}

}
