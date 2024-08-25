package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   
 //  driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");
   
   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
   driver.manage().window().maximize();
   
   
	}

}
