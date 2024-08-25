package testngsamples;

import org.testng.annotations.Test;

public class Paymenttest {
	@Test(priority=1,groups= {"sanity","regression","functional"})
void paymentinrupees()
{
	System.out.println("Payment in rupees");
}
	@Test(priority=2,groups= {"sanity","regression","functional"})
void paymentindollar()
{
	System.out.println("Payment in dollar");
}
	
}
