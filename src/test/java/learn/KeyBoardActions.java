package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   
   driver.get("https://text-compare.com/");
   driver.manage().window().maximize();
   
   driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
   Actions act = new Actions(driver);
   //Select all using ctrl+A
   act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
   //copy using Ctrl+C
   act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
  //move using TAB
   act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
   //paste using Ctrl+v
   act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();  
   
	}

}
