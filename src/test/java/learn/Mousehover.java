package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo-opencart.com/");
    driver.manage().window().maximize();
    
   WebElement desktop =  driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
   WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (2)']"));
   
   Actions act = new Actions(driver);
   act.moveToElement(desktop).moveToElement(mac).click().build().perform();
	}

}
