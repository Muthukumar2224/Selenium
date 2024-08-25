package testngsamples;

import org.testng.annotations.Test;

public class SignupTest {
	@Test(priority=1,groups= {"regression"})
void SignupEmail()
{
	System.out.println("Email Signup");
}
	@Test(priority=2,groups= {"regression"})
void SignupFb()
{
	System.out.println("Fb Signup");
}
	@Test(priority=3,groups= {"regression"})
void SignupTwitter()
{
	System.out.println("Twitter Signup");
}
}
