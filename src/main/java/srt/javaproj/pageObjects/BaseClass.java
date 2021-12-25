package srt.javaproj.pageObjects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import srt.javaproj.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String br)
	{
		logger = Logger.getLogger("Facebook");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		
		}
		else if(br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
          driver = new FirefoxDriver();
		}
		
	}
	
	@AfterClass
	public void teardown()
	{
	driver.quit();
	}
	
	public void Wait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void PageloadTimeout()
	{
	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	public void ExplicitWait()
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}
	
	public void maximize()
	{
		driver.manage().window().maximize() ;
	}
	
	
	

}
