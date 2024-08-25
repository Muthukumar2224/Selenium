package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
    driver.manage().window().maximize();
//    
//    WebElement slider= driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
//    System.out.println(slider.getLocation());
    
    Actions act = new Actions(driver);
//    act.dragAndDropBy(slider, 100, 126).perform();
//    System.out.println(slider.getLocation());
    
    WebElement maxslider= driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
    System.out.println(maxslider.getLocation());
    act.dragAndDropBy(maxslider, -49, 126).perform();
    System.out.println(maxslider.getLocation());
	}

}
