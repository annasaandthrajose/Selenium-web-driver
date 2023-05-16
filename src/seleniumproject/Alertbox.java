package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox {
FirefoxDriver driver;
@Before
public void alertb()
{
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
	 driver=new FirefoxDriver();
}
@Test
public void alertt()
{
	driver.get("file:///C:/Users/HP/Desktop/Alert1.html");
driver.findElement(By.xpath("/html/body/input[1]")).click();
Alert a=driver.switchTo().alert();
String text=a.getText();
System.out.println(text);
a.accept();
driver.findElement(By.name("firstname")).sendKeys("lUCA");
driver.findElement(By.name("lastname")).sendKeys("Appu");
driver.findElement(By.xpath("/html/body/input[4]")).click();
}
}
