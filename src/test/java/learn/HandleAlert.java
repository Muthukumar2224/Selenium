package learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.manage().window().maximize();
     
     //Normal alert with ok button
 /*  driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
   Thread.sleep(3000);
   Alert myalert= driver.switchTo().alert();
   System.out.println(myalert.getText());
   myalert.accept();
   */
     
   //Confirmation Alert ok and cancel
  /* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
 //  driver.switchTo().alert().accept();
   driver.switchTo().alert().dismiss();*/
   
    // SendKeys with alert
   driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
   Alert myalert = driver.switchTo().alert();
     myalert.sendKeys("WELCOME");
     myalert.accept();
     
  
    
	}

}
