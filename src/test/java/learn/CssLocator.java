package learn;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
		     driver.get("https://demo.nopcommerce.com/");
		     driver.manage().window().maximize();
		     
		     //tag#id
		    // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		  //   driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		     
		     //tag.class
		    // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		    // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts"); 
		     
		     // tag[attribute='value']
		  //   driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		//     driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");
		     
		     //tag class attribute
		     driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");

	}

}
