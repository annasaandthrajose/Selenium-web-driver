package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_dropdown {
	FirefoxDriver driver;
	@Before
	public void dropdownb()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@Test
public void dropdownt()
{
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	WebElement value=driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
	
	Select day=new Select(value);
	day.selectByVisibleText("16");
	WebElement value2=driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
	Select month=new Select(value2);
	month.selectByIndex(5);
	WebElement value3=driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
	Select year=new Select(value3);
	year.selectByValue("2023");
}
}
