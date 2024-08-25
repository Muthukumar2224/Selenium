package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertdemo {
	SoftAssert sa;
	@Test
 void Testtitle()
 {
	 String a= "qwerty";
	 String b = "asdfg";
	 
	 Assert.assertEquals(a, b);
	 
	 if(a.equals(b))
	 {
		Assert.assertTrue(true); 
	 }
	 else
	 {
		 Assert.assertTrue(false);
	 }
	
 }
	@Test
	public void abc()
	{
		System.out.println("abc");
		//	SoftAssert sa = new SoftAssert();
		sa = new SoftAssert();
		sa.assertEquals(1,2);
		System.out.println("\t Hard Assert cant't proceed further unlike soft Assert when assertion fails");
		
		sa.assertAll(); //soft assertion always pass when assertAll() is not used
	}
}
