package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryExample {
	WebDriver driver;

	PageFactoryExample(WebDriver driver)
	  {
		 this.driver=driver; 
		 PageFactory.initElements(driver,this);
	  }
	@FindBy(xpath="//input[@name='username']")
	WebElement username_loc;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password_loc;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_loc;
	
	public void setusername(String user)
	  {
		username_loc.sendKeys(user);
	  }
	 public void setpwd(String pwd)
      {
	 password_loc.sendKeys(pwd);
      }
	 public void click()
      {
	  login_loc.click();
      }
	
	
	

	
	
	//locators
//	       By username_loc=By.xpath("//input[@name='username']");
//	       By password_loc =By.xpath("//input[@name='password']");
//	       By login_loc = By.xpath("//button[normalize-space()='Login']"); 	
//	  
//	  //action methods
//	  public void setusername(String user)
//	  {
//		  driver.findElement(username_loc).sendKeys(user);
//	  }
//	  public void setpwd(String pwd)
//	  {
//		  driver.findElement(password_loc).sendKeys(pwd);
//	  }
//	  public void click()
//	  {
//		  driver.findElement(login_loc).click();
//	  }
	  
	  
}
