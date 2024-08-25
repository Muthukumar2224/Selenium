package learn;
import java.util.HashMap;
import java.util.List;
import java.time.Duration;
import java.time.Month;
import java.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepickerdemo {
    static Month ConvertMonth(String month) {
    
	HashMap<String,Month> monthmap = new HashMap<String,Month>();
	
	 monthmap.put("January",Month.JANUARY);
	 monthmap.put("February",Month.FEBRUARY);
	 monthmap.put("March",Month.MARCH);
	 monthmap.put("April",Month.APRIL);
	 monthmap.put("May",Month.MAY);
	 monthmap.put("June",Month.JUNE);
	 monthmap.put("July",Month.JULY);
	 monthmap.put("August",Month.AUGUST);
	 monthmap.put("September",Month.SEPTEMBER);
	 monthmap.put("October",Month.OCTOBER);
	 monthmap.put("November",Month.NOVEMBER);
	 monthmap.put("December",Month.DECEMBER);
	 
	 Month vmonth = monthmap.get(month);
	 
	 if(vmonth==null)
	 {
		 System.out.println("Invalid month");
	 }
	 return vmonth;
	
    }

    static void SelectDate(WebDriver driver,String requiredyear,String requiredmonth,String requireddate)
    {
    	  //select year from dropdown    
	     WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	     Select year = new Select(dropdown);
	     year.selectByVisibleText(requiredyear);
	     
	     //Select Month
	     
	  while(true)
	  {
	     String displayMonth = driver.findElement(By.xpath("ui-datepicker-month")).getText();
	    	
	     Month expectedMonth = ConvertMonth(requiredmonth);
	     Month currentMonth= ConvertMonth(displayMonth);
	     
	    int  result = expectedMonth.compareTo(currentMonth);
	    if(result>0)
	    {
	    	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	    }
	    else if(result<0)
	    {
	    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	    }
	    else
	    {
	      break;
	    }
	 }
	  //date
	List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a"));
	for(WebElement dt:alldates)
	{
		if(dt.getText().equals(requireddate))
		{
			dt.click();
			break;
		}
	}

    }
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://testautomationpractice.blogspot.com/");
	     driver.manage().window().maximize();
	     
	     String requiredyear="2021";
	     String requiredmonth = "June";
	     String requireddate="15";	
	     
	     driver.switchTo().frame("frame-one796456169");
	     
	     driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
   	
	     SelectDate( driver, requiredyear, requiredmonth, requireddate);
  }
}
