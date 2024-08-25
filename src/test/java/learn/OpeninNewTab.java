package learn;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class OpeninNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();  
   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.nopcommerce.com");
    driver.manage().window().maximize();
    
    
    
//   WebElement register =  driver.findElement(By.xpath("//a[normalize-space()='Register']"));
//   
//   Actions act = new Actions(driver);
//   act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
//   
//    List<String> id = new ArrayList(driver.getWindowHandles());
//    driver.switchTo().window(id.get(1));
//    driver.switchTo().window(id.get(0));
	}

}
