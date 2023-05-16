package seleniumproject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumproject {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String actualtitle=driver.getTitle();
		String exp="Facebook – log in or sign up";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
