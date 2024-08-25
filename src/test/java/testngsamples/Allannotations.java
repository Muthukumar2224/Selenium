package testngsamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotations {
	
    @BeforeSuite
	void bs()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	void as() {
		System.out.println("After Suite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	void at()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	void qw()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	void we() {
		System.out.println("After Class");
	}
	@BeforeMethod
	void rt()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	void ty()
	{
		System.out.println("After Method");
	}
	@Test
	void test1() {
		System.out.println("1 Test Method Execution");
	}
	@Test
	void test2() {
		System.out.println("2 Test Method Execution");
	}
	
	
}
