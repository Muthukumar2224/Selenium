package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangehrmTestng {
	WebDriver driver;
  @Test(priority=-1)
  void openapp()
  {
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
  }
  @Test(priority=2)
  void testlogo() throws InterruptedException
  {
	  Thread.sleep(3000);
	   boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	   System.out.println("Logo is Displayed: "+status);
  }
  @Test(priority=3)
  void login()
  {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  @Test(priority=4)
  void logout()
    {
	  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li[4]")).click();
	
  }
}
