package learn;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class AssignmentwindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		// 1) search for some phrase

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		 Thread.sleep(3000);
		// 2) Count how many links are there with this specific name ("selenium")
	    int count_links = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link:links)
		   {
			String a = link.getText();
			if(a.contains("Selenium"))
			{
				link.click();
				count_links++;
		   }
		}

		System.out.println("Total number of links with a (selenium) phrase : " + count_links);

		Set<String> windowIDs = driver.getWindowHandles();
		for (String winID : windowIDs) {
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title + "                 " + winID); // 4) Get windows ID's for every browser window

			if (title.equals("Selenium (software) - Wikipedia")) // 5) close specific window
			{
				driver.close();
			}

		}

	}

}
