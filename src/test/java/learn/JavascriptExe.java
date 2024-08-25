package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://testautomationpractice.blogspot.com/");
      WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
      
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].setAttribute('value','John')",name);
      
      WebElement rdbtn = driver.findElement(By.xpath("//input[@id='male']"));
      js.executeScript("arguments[0].click()",rdbtn);
	}

}
