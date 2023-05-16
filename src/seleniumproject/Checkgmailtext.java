package seleniumproject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkgmailtext {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("present");
		}
		
		else
		{
			System.out.println("absent");
		}

	}

}
