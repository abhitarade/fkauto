package auto.Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseMethod 
{
	
	public static WebDriver driver=null; 

	public static void main(String[] args) 
	{
		
	}
		
	
	
	
	
	
	// mouse on method
		public static void MouseOn(Object [] mon)
		{
			try
			{
			String elexpath=(String) mon[0];
			Actions act=new Actions(driver);
			WebElement ele=driver.findElement(By.xpath(elexpath));
			act.moveToElement(ele).build().perform();
			System.out.println("Successfully moved to given element");
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Failed: move to element");
				System.out.println(e);
			}
		}
	
		
	// close driver method
		public static void CloseDriver(int timeMilisec) throws InterruptedException
		{
			try
			{
			Thread.sleep(timeMilisec);
			driver.close();
			System.out.println("Successfully closed Driver after waiting \""+timeMilisec+"\" miliseconds");
			}
			catch(Exception e)
			{System.out.println("Failed: clossing browser");
			System.out.println(e);
			}
		}
	
		
	//select value method
		public static void SelectValue(Object [] selval)
		{
			try
			{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String xpofsel=(String) selval[0];
			String val=(String) selval[1];
			Select sc=new Select(driver.findElement(By.xpath(xpofsel)));
			sc.selectByVisibleText(val);
			System.out.println("Successfully Selected given value from dropdown as   :" +val);
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			System.out.println("Failed: selecting dropdown value");
			System.out.println(e);
			}
			
		}
	
		
	// sendkey method
		public static void Sendkey(Object [] sk)
		{
			try
			{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			int l=sk.length;
			for(int i=0; i<l/2; i++)
			{
			int a=i*2;	
			String xptosk=(String) sk[a];
			String value=(String) sk[a+1];
			driver.findElement(By.xpath(xptosk)).clear();
			driver.findElement(By.xpath(xptosk)).sendKeys(value);
			System.out.println("successfully entered key as  \""+value+"\"");
			Thread.sleep(2000);
			}
			}
			catch(Exception e)
			{
			System.out.println("Failed: sending key");
			System.out.println(e);}
		}
	
	
	// clickit method
		public static void Clickit(Object [] clk)
		{
			try
			{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String xptoclk=(String) clk[0];
			driver.findElement(By.xpath(xptoclk)).click();
			System.out.println("successfully clicked on element");
			Thread.sleep(1000);
			} 
			catch(Exception e)
			{
				System.out.println("Failed: clicking on element");
				System.out.println(e);
			}
			
		}
	
		
	//get url method
		public static void Geturl(Object [] url)
		{
			try 
			{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String takeurl=(String) url[0];
			driver.get(takeurl);
			System.out.println("Successfully gtting url as   \""+takeurl+"\"");
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Failed: Getting url");
				System.out.println(e);
			}
		}
	
		
	//Browser launch method
		public static void LaunchBrowser(Object [] bname)
		{
			try
			{
			String name=(String) bname[0];
		
			if(name.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Successfully opened \"chrome\" driver");
			}
			else if(name.equalsIgnoreCase("ff"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				System.out.println("Successfully opened \"FireFox\" driver");
			}
			else if(name.equalsIgnoreCase("edge"))
			{
				
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				System.out.println("Successfully opened \"edge\" driver");
				
			}
			else
			{
			System.out.println("Enter browesername is not valid");
			}
			}
			catch(Exception e)
			{
				System.out.println("Failed: Opening Browser");
				System.out.println(e);
			}

	}

}
