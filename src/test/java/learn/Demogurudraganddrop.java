	package learn;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demogurudraganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
   driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement SourceBank = driver.findElement(By.xpath("//li[@id='credit2']//a[@class='button button-orange']"));	
	WebElement DebitsideAccount = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']//li[@class='placeholder']"));
	
	WebElement sourcevalue = driver.findElement(By.xpath("//a[normalize-space()='5000']"));
	WebElement DebitsideAmount = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable']//li[@class='placeholder']"));
	
	
	
	Actions act = new Actions(driver);
	act.dragAndDrop(SourceBank, DebitsideAccount).build().perform();
	
	Action execution = act.dragAndDrop(sourcevalue, DebitsideAmount).build();
	execution.perform(); 	
	
	
		
	}	

}
