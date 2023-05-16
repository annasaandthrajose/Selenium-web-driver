package pomtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompage.Vrlbus;

public class vrlbustest {
	WebDriver driver;
	@BeforeTest
	public void vrlbus() throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
		
	}
@BeforeMethod
public void vrlmethod() throws Exception
{
	driver.get("https://www.vrlbus.in/#/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void vrltest() throws Exception
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Vrlbus obj=new Vrlbus(driver);
	obj.setvalue("Ahmedabad","Bangalore","10-05-2023");
	obj.searching();
}
}
