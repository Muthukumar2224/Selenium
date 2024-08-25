package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
		  
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3)); 
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  
		  WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		  username.sendKeys("Admin");
		  WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		  password.sendKeys("admin123");
		  
		  WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		  loginbtn.click();

	}

}
