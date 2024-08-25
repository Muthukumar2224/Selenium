package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
    
    //single file upload
   // driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\2125244\\Downloads\\File upload.txt");
    
    String file1 = "C:\\Users\\2125244\\Downloads\\File upload.txt";
    String file2= "C:\\Users\\2125244\\Downloads\\File upload1.txt";
    driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+'\n'+file2);
    
    int nooffilesuploaded  = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
    
    if(nooffilesuploaded==2)
    {    
    	System.out.println("Files uploaded successfully");
    }
    else
    {
    	System.out.println("Not uploaded");
    }
    //Validate file names
    if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("File upload.txt") 
    		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("File upload1.txt"))
    {
    	System.out.println("Matching");
    }
    else
    {
    	System.out.println("FileName not Matching");
    }
	}

}
