package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
WebDriver driver;

  Loginpage(WebDriver driver)//constructor
  {
	 this.driver=driver; 
  }
//locators
       By username_loc=By.xpath("//input[@name='username']");
       By password_loc =By.xpath("//input[@name='password']");
       By login_loc = By.xpath("//button[normalize-space()='Login']"); 	
  
  //action methods
  public void setusername(String user)
  {
	  driver.findElement(username_loc).sendKeys(user);
  }
  public void setpwd(String pwd)
  {
	  driver.findElement(password_loc).sendKeys(pwd);
  }
  public void click()
  {
	  driver.findElement(login_loc).click();
  }
  
  
  
  
  
}
