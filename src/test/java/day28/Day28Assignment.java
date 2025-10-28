package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day28Assignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");//1) provide some string search for it
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> No_of_Links=driver.findElements(By.partialLinkText("Seleni"));
		System.out.println(No_of_Links.size());			//5	// count no of links
		
		// to perform any actions on group of elements we must use looping statements
		for(WebElement a: No_of_Links)		//click on each link using for loop
		{
			a.click();
		}
		
		
		Set<String> windowIds=driver.getWindowHandles();		//GET WINDOW IDS FOR EVERY BROWSER WINDOW
		
		for(String www:windowIds) 
		{
			//
			String abc=driver.switchTo().window(www).getTitle();
			System.out.println(abc);  //has returned the title of all the 5 web windows (line 25)
			
			// CLOSE SPECIFIC BROWSER WINDOW
			if(abc.equals("Selenium - Wikipedia") || abc.equals("Selenium in biology - Wikipedia") || abc.equals("Selenium disulfide - Wikipedia") || abc.equals("Selenium dioxide - Wikipedia"))
			{
				driver.close();
			}
		}
		
		
		
		
	}

}
