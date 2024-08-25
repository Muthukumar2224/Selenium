package learn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
public class Handlebrowserwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     
     driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
     
     Set<String> windowids = driver.getWindowHandles();
     /*   List<String> windowsList = new ArrayList(windowids);
     
     String parentid =  windowsList.get(0);
     String childid = windowsList.get(1);
     
     driver.switchTo().window(parentid);
     System.out.println(driver.getTitle());
     
     driver.switchTo().window(childid);
     System.out.println(driver.getTitle()); */
     
     for(String winId:windowids)
     {
    	 String title = driver.switchTo().window(winId).getTitle();
    	 if(title.equals("OrangeHRM"))
    	 {
    		 System.out.println(driver.getCurrentUrl());
    	 }
     }
     
     

       
     
	}

}
