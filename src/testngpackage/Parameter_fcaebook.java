package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_fcaebook {
	FirefoxDriver driver;
	@BeforeTest
	public void parat()
	{

		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@BeforeMethod
public void paramm()
{
	driver.get("https://www.google.com/");
}
@Parameters("p")
@Test
public void paramf(String p)
{
	WebElement se=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	se.sendKeys(p);
	se.submit();
}
}
