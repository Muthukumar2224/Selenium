package learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	// Future Date
    static void SelectFutureDate(WebDriver driver,String month,String year,String date)
    {
    	 while(true)
         {
        	 String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	 String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	 if(currentmonth.equals(month) && currentyear.equals(year))
        	 {
        		break; 
        	 }
        	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //forward nav 
        //	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
         }
          List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
          
          for(WebElement date1 : dates)
          {
       	  if( date1.getText().equals(date))
       	  {
       		  date1.click();
       		  
       	  }
          }
    	 
    }
    // Past Date
    static void SelectPreviousDate(WebDriver driver,String month,String year,String date)
    {
    	 while(true)
         {
        	 String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	 String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	 if(currentmonth.equals(month) && currentyear.equals(year))
        	 {
        		break; 
        	 }
        //	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //forward nav 
        	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
         }
          List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
          
          for(WebElement date1 : dates)
          {
       	  if( date1.getText().equals(date))
       	  {
       		  date1.click();
       		  
       	  }
          }
    	 
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://jqueryui.com/datepicker/");
     driver.manage().window().maximize();
     
     driver.switchTo().frame(0);
     //using sendkeys
     driver.findElement(By.xpath("//input[@class='hasDatepicker']")).sendKeys("04/05/2024");
     //using datepicker
     String year = "2025";
     String month = "May";
     String date = "20";
     
     driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
     
     SelectFutureDate( driver, month, year, date);
    // SelectPreviousDate( driver, month, year, date);
     
       
	}
}
