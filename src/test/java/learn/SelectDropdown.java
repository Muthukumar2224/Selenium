package learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    driver.navigate().to("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    
    WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
    Select Country = new Select(dropdown);
    
  //  Country.selectByVisibleText("India");
  //  Country.selectByValue("germany");
   // Country.selectByIndex(2);
     
       List<WebElement>options = Country.getOptions();
       
       System.out.println("The count of options available in dropdown "+options.size());
       
     /*  for(int i=0;i<options.size();i++)
       {
    	   System.out.println(options.get(i).getText());
       }
       */
       
       //Enhanced for loop
       for(WebElement op:options)
       {
    	   System.out.println(op.getText());
       }
       
       
	}

}
