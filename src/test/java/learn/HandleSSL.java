package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeOptions options = new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	
	
    WebDriver driver = new ChromeDriver();
    driver.get("https://expired.badssl.com/");
    System.out.println(driver.getTitle());
	}

}
