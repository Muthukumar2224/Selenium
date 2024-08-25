package learn;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo-opencart.com/");
     driver.manage().window().maximize();
     
     //name
 /*    driver.findElement(By.name("search"))
                         .sendKeys("Mac"); */
     
     //id
     boolean logosdisplaystatus = driver.findElement(By.id("logo"))
                             .isDisplayed();
     System.out.println(logosdisplaystatus);
     
     //inktext and partialtext
 /*    driver.findElement(By.linkText("Tablets")).click();
     driver.findElement(By.partialLinkText("Table")).click(); */
     
     List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
     System.out.println(headerlinks.size());
     
     List<WebElement>img = driver.findElements(By.tagName("img"));
     System.out.println(img.size());
     
	}

}
