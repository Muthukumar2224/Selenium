package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
      driver.manage().window().maximize();
      
      WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
      Actions act = new Actions(driver);
      
      act.contextClick(button).build().perform();
      
      driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
      
      driver.switchTo().alert().accept();
      
	}

}
