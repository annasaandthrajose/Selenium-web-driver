package testngpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot_rediff {
	FirefoxDriver driver;
	@BeforeTest
	public void screenshotr()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@BeforeMethod
public void screenshotm()
{
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void screenshott() throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("E:\\Screenshot//image.png"));
	WebElement button1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	File src1=button1.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1,new File("./Screenshot/img.png"));
	

}
}
