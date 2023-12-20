package Testpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Ajiologin;

public class AjiologinTest 
{
	WebDriver driver;
	//LOGIN
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
		   Ajiologin aj=new Ajiologin (driver);
		   aj.signinn("9656597789");
		   
		   
		   aj.details("Akhila M S", "msmalu29@gmail.com");     
	   }
	   
	   //LINK PRINTING AND RESPONSE CODE GETTING
	   @Test
	   public void test2()
	   {    Ajiologin aj2=new Ajiologin (driver);
	        System .out.println("NO OF LINKS: "+aj2.Li.size());
		   for(WebElement element:aj2.Li)
		   {
			  String link= element.getAttribute("href");
			  String text= element.getText();
			  linkverify (link,text);
		   }
	   }


	public void linkverify(String link,String text) 
	{
		try
		{
			URL U=new URL(link);
			HttpURLConnection con=(HttpURLConnection)U.openConnection();
			System.out.println(con.getResponseCode());
			System.out.println("LINK: "+link);
			System.out.println("TEXT: "+text);
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	   
	   

}
