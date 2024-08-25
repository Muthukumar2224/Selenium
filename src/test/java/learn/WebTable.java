package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    // Total rows
     int rows =  driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
     System.out.println(rows);
   //column  
     int col =  driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
     System.out.println(col);
     
     
    // extract specific row and column
 /*  String bookauthor = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
   
   System.out.println(bookauthor); */
   
  // extract all data from a Table
/*   
   for(int r=2;r<=rows;r++)
   {
	   for(int c=1;c<=col;c++)
	   {
		   String Tabledata= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		   System.out.print(Tabledata+"\t");
	   }
	   System.out.println();
   } */
   // extract books from the author name mukesh
 /*  for(int r=2;r<=rows;r++)
   {
	  String authorname =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	  if(authorname.equals("Mukesh"))
	  {
		  String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		  System.out.println(authorname+ " wrote " + bookname);
	  }
   } */
     
   // total price of books
     int total=0;
   for(int r=2;r<=rows;r++)
   {
	  String price =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
	  total = total+Integer.parseInt(price);
   }
   System.out.println("Total price "+total);
	}

}
