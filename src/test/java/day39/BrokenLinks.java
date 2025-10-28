package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/*
 1) Link    href="https://xyz.com"		should chekck if any link is present
 
 2) https://xyz.com --->  server-----> status code
 
 3) status code>=400   if status code is greater than or equal to 400 then it is broken link
   status < code       if status code is lesser than 400 then, not a broken linkiop
 */











public class BrokenLinks {

	public static void main(String[] args) throws IOException {
	
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all the links from website
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='page']//div[1]//ul[1]//li//a"));
		System.out.println("Total no of Links:" +links.size());
		
		for (WebElement linkElement:links)
		{
			String hrefattVal = linkElement.getAttribute("href");	//.getAttribute is used to check whether the attribute value is null
					
				if(hrefattVal==null || hrefattVal.isEmpty())	
				{
					System.out.println("href attribute value is null or empty. So not possible to check");
					continue;			// here we have used continue to skip if hrefattVal is empty. it empty it skips to next value
				}
				
				//hit url to the server
				
				URL linkURL=new URL(hrefattVal); // converted href value from string to URL Format
				HttpURLConnection conn =(HttpURLConnection) linkURL.openConnection(); //open connection to the server
				conn.connect();	// connect to server and sent request to the server
				
				if (conn.getResponseCode()>=400)
				{
					System.out.println(hrefattVal+  "=======>Broken Link");
				}
				else
				{
					System.out.println(hrefattVal+  "=======>Not a Broken Link");
				}
				
				
				
				
				
				
				
				
		}
		
		
		
		
		

	}

}
