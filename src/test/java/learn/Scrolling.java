package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.nopcommerce.com/");
	      driver.manage().window().maximize();
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	      //sroll down by pixelno
	//     js.executeScript("window.scrollBy(0,1500)","");
	  //   System.out.println(js.executeScript("return window.pageYoffset;"));
	     
	     //scroll till element is visible
//	    WebElement com=  driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
//	     js.executeScript("arguments[0].scrollIntoView();",com);
//	     System.out.println(js.executeScript("return window.pageYoffset;"));
	     
	     //scroll till end of the page
	     
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     System.out.println(js.executeScript("return window.pageYoffset;"));
	     
	     //scroll to initalpage
	   //  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
