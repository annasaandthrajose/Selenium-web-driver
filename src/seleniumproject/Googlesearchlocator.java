package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearchlocator {
	FirefoxDriver driver;
	@Before
	public void  beforem()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();

}
	@Test
	public void testm()
	{
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("golden retriver");
		search.submit();
	
		
	}
}