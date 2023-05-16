package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonetesting {
	FirefoxDriver driver;
	@Before
	public void beforea()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
	@Test
	public void texta()
	{
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]")).click();
		WebElement val=driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]/div/span"));
		//driver.findElement(By.xpath("\"//input[@id='ap_email']"));
		val.click();
		val.sendKeys("luca@gmail.com");
		driver.findElement(By.xpath("//span[@id='continue-announce']")).click();
		
	}
}
