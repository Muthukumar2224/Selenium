package learn;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://demo.nopcommerce.com/register");
     
     driver.manage().window().maximize();
     
   /* WebElement logo =  driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']"));
    System.out.println(logo.isDisplayed());
     
/*    boolean logo = driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']")).isDisplayed();
   System.out.println(logo);*/
     
    //isSelected();
   WebElement male_rbtn =  driver.findElement(By.xpath("//input[@type = 'radio' and @value='M']"));
   System.out.println(male_rbtn.isSelected());
	}

}
