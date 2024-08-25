package learn;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int noofbrokenlink=0;
		for(WebElement link : links)
		{
			String hrefvalue = link.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("href attribute value is null or empty.So not possible to check");
				continue;
			}
			//hit url to server
			try
			{
				URL linkURL = new URL(hrefvalue);// href String type converted to URL format
				HttpURLConnection conn =(HttpURLConnection)linkURL.openConnection();//open connection to server
				conn.connect();//connect to server and sent request to server
				if(conn.getResponseCode()>=400)
				{
					System.out.println("Broken Link");
					noofbrokenlink++;
				}
				else
				{
					System.out.println("Not a Broken Link");
				}
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.print(noofbrokenlink);
		
	}

}
