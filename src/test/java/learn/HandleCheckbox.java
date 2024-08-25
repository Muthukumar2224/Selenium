package learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://testautomationpractice.blogspot.com/");
      driver.manage().window().maximize();
      //Select all checkboxes
      List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class ='form-check-input' and @type = 'checkbox']"));
      
     /* for(int i=0 ; i<checkboxes.size();i++)
      {
    	  checkboxes.get(i).click();
      }*/
      
   /*  for(WebElement i :checkboxes ) 
     {
    	 i.click();
     }
	}*/
	//unselect checkbox if not selected
	for(int i=0;i<checkboxes.size();i++)
	{
		if(checkboxes.get(i).isSelected())
		{
			checkboxes.get(i).click();
		}
		
	}
}
}


