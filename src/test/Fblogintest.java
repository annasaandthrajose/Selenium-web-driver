package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fblogin;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void testpom()
{
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
	 driver=new FirefoxDriver();
}
@BeforeMethod
public void pommethod()
{
	driver.get("https://www.facebook.com/");
}
@Test
public void pomtest()
{
	Fblogin ob=new Fblogin(driver);
	ob.setvalues("luca@gmail.com", "appu1234");
	ob.login();
	driver.navigate().back();
}
}
