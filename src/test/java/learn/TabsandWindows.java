package learn;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://demo.nopcommerce.com/");
      
     driver.switchTo().newWindow(WindowType.TAB);//opens new tab
     driver.switchTo().newWindow(WindowType.WINDOW);// opens in new window
     driver.get("https://www.opencart.com");
	}

}
