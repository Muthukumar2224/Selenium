package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    driver.manage().window().maximize();
    
    Actions act = new Actions(driver);
    WebElement rome  =driver.findElement(By.xpath("//div[@id='box6']"));
    WebElement Italy = driver.findElement(By.xpath("//div[@id='box106']"));
    
    act.dragAndDrop(rome, Italy).build().perform();
    
	}

}
