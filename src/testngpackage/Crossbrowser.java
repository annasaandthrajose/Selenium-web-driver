package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
WebDriver driver;
@Parameters("browser")
@BeforeTest
public void crosstest(String b)
{
	if(b.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Selenium luminar\\chromedriver_win32 (2)/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if(b.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver","C:\\Automation\\Selenium\\edgedriver_win64\\msedgedriver.exe" );
	 driver=new EdgeDriver();
	}
	else
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/");
	}
	}


