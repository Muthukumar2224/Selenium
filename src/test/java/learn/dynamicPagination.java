package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://demo-opencart.com/admin/index.php");
		    driver.manage().window().maximize();
		    
		    driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		    
		    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		    
		    if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		    {
		    driver.findElement(By.xpath("//button[@class='btn-close']")).click();	
		    }
		    
		    driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		    driver.findElement(By.xpath("//ul[@id='collapse-5']//li//a[contains(text(),'Customers')]")).click();
		    
		   String text =  driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		   
		   System.out.println(text);
		 int totalPages =  Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println(totalPages); 
	
		int noofrows = driver.findElements(By.xpath("//table[@class= 'table table-bordered table-hover']//tbody//tr")).size();
		
		for(int r=1;r<=noofrows;r++)
		{
			String CustomerName = driver.findElement(By.xpath("//table[@class= 'table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			String email = driver.findElement(By.xpath("//table[@class= 'table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
			System.out.println(CustomerName+"\t"+email);
		}
		
		// clicking each page from pagination
//		    
//		 for(int p=1;p<=3;p++)
//		 {
//			 if(p>1)
//			 {
//				 WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
//				 active_page.click();
//			 }
//			 
//		 }
	}

}
