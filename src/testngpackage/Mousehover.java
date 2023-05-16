package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {
FirefoxDriver driver;
@BeforeTest
public void hoverbefore()
{
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
	 driver=new FirefoxDriver();
}
@BeforeMethod
public void hovermethod()
{
	driver.get("https://www.ebay.com/");
}
@Test
public void ebay() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(electronics).perform();
	
	WebElement smart=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
	smart.click();
}
}
