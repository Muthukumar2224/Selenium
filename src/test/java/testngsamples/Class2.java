package testngsamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	public void abc()
	{
		System.out.println("Abc from classs2");
	}
	@AfterTest
	void At()
	{
		System.out.println("After Test");
	}
}
