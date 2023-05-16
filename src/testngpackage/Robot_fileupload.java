package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robot_fileupload {
	FirefoxDriver driver;
	@BeforeTest
	public void robott()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@BeforeMethod
public void robotm()
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
}
@Test
public void robottest() throws AWTException
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	fileUpload("E:\\resume_1623858858269.pdf");
}
public void fileUpload(String p) throws AWTException {
	
	StringSelection s=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	Robot r=new Robot();
	r.delay(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
    r.delay(2000);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
}
}
