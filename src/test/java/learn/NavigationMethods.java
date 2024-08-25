package learn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
//     driver.navigate().to("https://demo.nopcommerce.com/");
     URL myurl = new URL("https://demo.nopcommerce.com/");
     driver.navigate().to(myurl);
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
     driver.navigate().back();
     System.out.println(driver.getCurrentUrl());
     
     driver.navigate().forward();
     System.out.println(driver.getCurrentUrl());
     
     
	}

}
