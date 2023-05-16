package testngpackage;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 public class Datadriven {
	FirefoxDriver driver;
	@BeforeTest
	public void datadrivent()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
	@BeforeMethod()
	public void datadrivenm()
	{
		driver.get("https://www.facebook.com/");
		}
@Test
public void testdatadriven() throws Exception 
{
	FileInputStream f= new FileInputStream("C:\\Automation\\Data driven.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(f);
	XSSFSheet sh=w.getSheet("Sheet1");
	int rowcount=sh.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
	String user=sh.getRow(i).getCell(0).getStringCellValue();
		String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("username="+user+" "+"password="+pswd);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(pswd);
		}
}
}
