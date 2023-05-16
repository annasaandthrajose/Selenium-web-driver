package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumxpath {
	FirefoxDriver driver;
	@Before
	public void beforex()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		driver=new FirefoxDriver();
	}
@Test
public void testx()
{
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anna@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Luca");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
