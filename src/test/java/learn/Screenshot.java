package learn;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.get("https://demo.nopcommerce.com/");
   driver.manage().window().maximize();
   
   //Full page Screenshot
   
//   TakesScreenshot ts = (TakesScreenshot)driver;
//   File srcfile = ts.getScreenshotAs(OutputType.FILE);
//	File target	 = new File(System.getProperty("user.dir")+"\\screenshots\\demo.png");
 // srcfile.renameTo(target);
	
	//capture specific section
	
	WebElement featuredproducts = driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
	File src = featuredproducts.getScreenshotAs(OutputType.FILE);
    File target = new File(System.getProperty("user.dir")+"\\screenshots\\Featuredproducts.png");
    //src.renameTo(target);
    FileHandler.copy(src, target);
	}

}
