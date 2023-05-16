package seleniumproject;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlink {
//	private static final String List = null;
//	private static final String HttpURLConnection = null;
	FirefoxDriver driver;
@Before
public void brokenb()
{
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
	 driver=new FirefoxDriver();
}
@Test
public void brokent()
{
	driver.get("https://www.facebook.com/");
	List<WebElement> l=driver.findElements(By.tagName("a"));
	for(WebElement a:l)
	{
		String link=a.getAttribute("href");
		verify(link);
		
	}

}
private void verify(String link)
{
	try {
		URL ob=new URL(link);
		HttpsURLConnection con=(HttpsURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Response code is 200 successfull----"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("no content error 404----"+link);
		}
		
	}
	catch(Exception e)
	{
		System.out.println("Error");
	}
}
}
