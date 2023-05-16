package seleniumproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junit {
	FirefoxDriver driver;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@Test
public void test()
{
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("anna@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("anjana");
	driver.findElement(By.name("login")).click();
}
@After
public void teardown()
{
	//driver.quit();
}
}
