package Testpkg;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.SaucedemoLogin;

public class SaucedemoLoginTest
{
	WebDriver driver;
   @BeforeTest
   public  void setup()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
   }

     @Test
     public void test1() throws Exception
     {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    		FileInputStream ob= new FileInputStream("C:\\Users\\DELL\\Downloads\\Book1sauce.xlsx");
    		XSSFWorkbook wb=new XSSFWorkbook(ob);
    		XSSFSheet sh=wb.getSheet("Sheet1");
    		int row =sh.getLastRowNum();
    		for(int i=1;i<=row;i++)
    		{
    			
    			
    			String username=sh.getRow(i).getCell(0).getStringCellValue();
    			System.out.println("username :"+username);
    			
    			String password=sh.getRow(i).getCell(1).getStringCellValue();
    			System.out.println("password :"+password);
    			
    			SaucedemoLogin obj=new SaucedemoLogin (driver);
    			obj.setvalues(username, password);
    			obj.login();
    			
    		}
    		SaucedemoLogin obj1=new SaucedemoLogin (driver);
    		obj1.productaddtocart();
    		obj1.checkout();
    		obj1.userdetails("Abhi", "s", "12345");
    		obj1.home();
    		obj1.logout();
    		
    		wb.close();
    	 
    	 
     }
     
     
     
     
     
   }