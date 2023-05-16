package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbcreatepage;

public class Createpagetest {
	WebDriver driver;
	@BeforeTest
	public void testcreate()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void createmethod()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void createpage()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Fbcreatepage ob1=new Fbcreatepage(driver);
		ob1.createpage();
//	ob1.getstarted();
	}
	
}
