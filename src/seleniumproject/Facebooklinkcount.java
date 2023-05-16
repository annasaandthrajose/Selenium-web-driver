package seleniumproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklinkcount {
FirefoxDriver driver;
@Before
public void linkcountb()
{
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
	 driver=new FirefoxDriver();
}
@Test
public void linkcountt()
{
	driver.get("https://www.facebook.com/");
	List<WebElement> l=driver.findElements(By.tagName("a"));
	System.out.println("facebook link count="+l.size());
	for(WebElement a:l)
	{
		System.out.println(a.getText());
	}
}
}
