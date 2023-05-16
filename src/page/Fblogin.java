package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogin {
	WebDriver driver;
	//pom object repositary creation for all webelements in fb login page
	By Fbloginemail=By.id("email");
	By Fbloginpass=By.id("pass");
	By Loginbutton=By.name("login");
	public Fblogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(Fbloginemail).sendKeys(email);
		driver.findElement(Fbloginpass).sendKeys(password);
	}
public void login()
{
	driver.findElement(Loginbutton).click();
}
}
