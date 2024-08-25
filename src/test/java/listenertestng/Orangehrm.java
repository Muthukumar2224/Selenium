package listenertestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(listenertestng.MyListener.class)

public class Orangehrm {
WebDriver driver;
@BeforeClass	
//	@Parameters({"browser"})
void Setup() throws InterruptedException
{
	
	     driver= new ChromeDriver();
	    
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
@Test(priority=1)
void testlogo()
{
	boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status,true);
}
@Test(priority=2)
void testtitle()
{
	Assert.assertEquals(driver.getTitle(),"OrHRM");
}
@Test(priority=3)
void testurl()
{ 
	Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
@AfterClass
void teardown()
{
	driver.close();
}
}
