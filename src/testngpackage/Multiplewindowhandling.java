package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandling {
	FirefoxDriver driver;
	@BeforeTest
	public void multiple() 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
}
	@BeforeMethod
	public void method()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test() throws Exception
	{
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allwindow=driver.getWindowHandles();
		for(String handle:allwindow)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				driver.findElement(By.name("emailid")).sendKeys("luca@gmail.com");
				driver.close();
			}
			driver.switchTo().window(parentWindow);
			
		}
	}
}