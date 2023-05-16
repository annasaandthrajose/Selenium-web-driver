package testngpackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprogramme {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com/");
	
}
@Test(dependsOnMethods="test2")
public void test1()
{
	System.out.println("test1");
}
@Test(enabled=false)
public void test2()
{
	System.out.println("test2");
}
@AfterMethod()

	public void aftermtd()
	{
	System.out.println("After Method");
}
@AfterTest
public void aftertest()
{
	driver.quit();
}
}
