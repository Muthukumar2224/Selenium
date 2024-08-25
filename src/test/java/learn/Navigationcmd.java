package SeleniumLetcode.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class Navigationcmd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/buttons");
		String url = driver.getCurrentUrl();
		System.out.println("Button page URL " + url);
		Thread.sleep(3000);
		driver.findElement(By.id("home")).click();
		String homeURL = driver.getCurrentUrl();
		System.out.println("Home page URL " + homeURL);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("retuns to button page " + driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/signin");

//				  Navigation nav = driver.navigate();
//				 nav.back(); 
//				  nav.forward();
//				  nav.refresh();
//				  nav.to("");
//				 

	}

}