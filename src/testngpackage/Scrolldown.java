package testngpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
FirefoxDriver driver;
@BeforeTest
public void test()
{
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
	 driver=new FirefoxDriver();
}
@BeforeMethod
public void method()
{
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=3993209994960489384&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9149414&hvtargid=kwd-298741529014&hydadcr=5903_2362026");
}
@Test
public void test1()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
}
