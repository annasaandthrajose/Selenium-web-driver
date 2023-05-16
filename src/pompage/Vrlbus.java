package pompage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Vrlbus {
	WebDriver driver;
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.xpath("//*[@id=\"ToCity\"]");
	By date1=By.xpath("//*[@id=\"txtFromDate\"]");
	By searchb=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	public Vrlbus(WebDriver driver)
	{
		this.driver=driver;
	}
public void setvalue(String source1,String desti,String date2) throws Exception{


driver.findElement(source).sendKeys(source1,Keys.ENTER);
	driver.findElement(destination).sendKeys(desti,Keys.ENTER);

driver.findElement(By.xpath("//*[@id=\"txtFromDate\"]")).click();
while(true)
{
WebElement month=driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[2]"));
String month1=month.getText();
if(month1.equals("May 2023"))
{
	System.out.println(month1);
	break;
}
else
{
	driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[3]")).click();
}

	
}
	
List<WebElement> alldates=driver.findElements(By.xpath("/html/body/div/div[1]/table/tbody/tr/td"));
for(WebElement date:alldates)
{
	String da=date.getText();
	if(da.equals("10"))
	{
		date.click();
		Thread.sleep(3000);
	}
}

	
}
public void searching() throws Exception
{
	
	driver.findElement(searchb).click();
}
}
