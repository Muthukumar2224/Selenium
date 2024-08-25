package SeleniumLetcode.letcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
public class Handlingbuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Get the X & Y co-ordinates
//		driver.findElementById("position").getLocation();
		WebElement ele = driver.findElement(By.id("position"));
		Point point  = ele.getLocation();
        int x = point.getX();
        int y = point.getY();
        
        
     // Find the color of the button
     		WebElement btnColor = driver.findElement(By.id("color"));
     		String color = btnColor.getCssValue("background-color");
     		System.out.println(color);
     		

    		// Find the height & width of the button
    		Rectangle rect = driver.findElement(By.id("property")).getRect();
    		System.out.println(rect.getWidth());
    		System.out.println(rect.getHeight());
    		System.out.println(rect.getPoint());
    		Dimension dime = rect.getDimension();
    		System.out.println(dime);
    		System.out.println(dime.getWidth());
    		System.out.println(dime.getHeight());
    		
	}

}