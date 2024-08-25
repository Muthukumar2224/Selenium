package testngsamples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	public void xyz()
	{
		System.out.println("xyz from classs1");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("Before Test");
	}
}
