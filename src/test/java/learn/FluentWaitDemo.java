package learn;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       
       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    		   .withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2))
    		   .ignoring(NoSuchElementException.class);
       
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  
		  WebElement username = wait.until(new Function<WebDriver, WebElement>()
		  {
			  public WebElement apply(WebDriver driver)
			  {
				  return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			  }
		  }
		  );	
		  username.sendKeys("Admin");
	}
	
}
