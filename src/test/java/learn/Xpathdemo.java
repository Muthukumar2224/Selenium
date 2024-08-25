package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Xpathdemo {

	public static void main(String[] args) {
		System.out.println("gfd");
			
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.get("https://demo-opencart.com/");
	    //Xpath with single attribute 
	//     driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("T-Shirts");
	
	     //Xpath with multiple attribute
	//     driver.findElement(By.xpath("//*[@name='search'][@placeholder='Search']")).sendKeys("T-Shirts");
	   //*[@name='search'and @placeholder='Search']
	     
	     //Xpath with Contains
	     driver.findElement(By.xpath("//*[contains(@placeholder,'Sea')]")).sendKeys("T-Shirts");
	     
	     // chained Xpath
	 //.findElement(By.xpath("//div[@id='logo']/a/img"));
	}

}
	