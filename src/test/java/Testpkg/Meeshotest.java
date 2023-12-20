package Testpkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pagepkg.Meeshopage;

////////////MEESHO//////////////////////

public class Meeshotest 
{
	WebDriver driver;
	@BeforeTest
	public  void setup()
	{
		   driver=new ChromeDriver();
		   driver.get("https://www.meesho.com/");
	}
	
	@Test
	public void test1() throws Exception
	{   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	     
	       driver.manage().window().maximize();
	       
		   Meeshopage mp=new Meeshopage (driver);
		   mp.searchmethod("saree");
		   
		   Thread.sleep(6000);
		   Actions act=new Actions(driver);
		   act.moveToElement(mp.men);
		   act.perform();
		   
		   String actualtitle=driver.getTitle();
		   String expectedtitle="meesho.com";
		   if(actualtitle.equalsIgnoreCase(expectedtitle)) //SOFT ASSERTION
		   {
			   System.out.println("Title matches");
		   }
		   else
		   {
			   System.out.println("Title IS NOT matching");
		   }
		   
		   driver.navigate().back();
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		   
		   mp.hair();
		   
		   
		   
		   
	}
}
