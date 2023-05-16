package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	FirefoxDriver driver;
	@BeforeTest
	public void datet()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
@BeforeMethod
public void datem()
{
	driver.get("https://www.expedia.com/?=one-key-onboarding-dialog");
	driver.manage().window().maximize();
}
@Test
public void datept()
{
	driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();//click check in button,then got calender menu
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
	//May 2023 xpath in <h2> tag
		String month1=month.getText();
		if(month1.equals("June 2023"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
		//click next button
		}
	}
	List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
for(WebElement dateelement:alldates)
{
	String da=dateelement.getAttribute("data-day");
	System.out.println(da);
	if(da.equals("10"))
	{
		dateelement.click();
		System.out.println("date is selected");
	}
}
}
}
