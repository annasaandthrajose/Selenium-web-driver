package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99actions {
FirefoxDriver driver;
@BeforeTest
public void before()
{
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
	 driver=new FirefoxDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void rightdouble() throws InterruptedException
{
	WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(rightclick);
	act.perform();	
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();																																																																																						
	WebElement doubleclcik =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleclcik);
	act.perform();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
}
}
