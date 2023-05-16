package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Parameters("a")
	@Test
	public void test1(String a)
	
	{
		System.out.println(a);
	}

}
