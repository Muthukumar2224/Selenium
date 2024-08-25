package testngsamples;

import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority=1,groups= {"sanity"})
   void loginByEmail()
   {
	   System.out.println("mail login");
   }
	@Test(priority=2,groups= {"sanity"})
   void loginByFb()
   {
	   System.out.println("Fb login");

   }
	@Test(priority=3,groups= {"sanity"})
   void loginByTwitter() {
	   System.out.println("Twitter login");
   }
}
