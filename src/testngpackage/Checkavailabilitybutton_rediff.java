package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkavailabilitybutton_rediff {
	FirefoxDriver driver;
	@BeforeTest
	public void redifft()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@BeforeMethod
public void rediffm()
{
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void rediffcheckbutton()
{
	WebElement buttonr=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	String b=buttonr.getAttribute("value");
	if(b.equals("check available"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
