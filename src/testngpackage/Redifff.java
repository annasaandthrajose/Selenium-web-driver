package testngpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifff {
	FirefoxDriver driver;
	@BeforeTest
	public void beforet()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@BeforeMethod
public void beforem()
{
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void rediff()
{
	boolean l=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
			
	if(l)
	{
		System.out.println("Logo is displayed");
	}
	else
	{
		System.out.println("Logo is not displayed");
	}
}
@Test
public void radio()
{
	WebElement radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	boolean r=radio.isSelected();
	if(r)
	{
		System.out.println("radio button is selected");
	}
	else
	{
		System.out.println("radio button is not bselected");
	}
}
@Test
public void button()
{
	WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	boolean b=button.isEnabled();
			if(b)
			{
				System.out.println("create my button is enabled");
			}
			else
			{
				System.out.println("create my button is disabled");
			}
		}
}


