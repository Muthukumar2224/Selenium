package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSVGElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  
    driver.findElement(By.xpath("//a[contains(@href,'Time')]//*[name()='svg']")).click();
  //  driver.findElement(By.xpath("//*[local-name()='svg']//following::span[.='Time']")).click();
   // driver.findElement(By.xpath("	//*[name()='svg']")).click();
	}

}
