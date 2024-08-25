package learn;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo-opencart.com/");
     
     String act_title = driver.getTitle();
     if(act_title.equals("Your Store"))
     {
    	 System.out.println("Test passed"); 
     }
     else
     {
    	 System.out.println("Test failed");
     }
     driver.close();
	}

}
