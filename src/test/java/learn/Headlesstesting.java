package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--headless=new");
		
     WebDriver driver = new ChromeDriver(options);
     driver.get("https://demo-opencart.com/");
     String a = driver.getTitle();
     if(a.equals("Your Store"))
     {
    	 System.out.println("Test passed");
     }
     else
     {
    	 System.out.println("Test Failed");
     }
	}

}
