package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Java");
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']//li//div[@class=\"wM6W7d\"]"));
		//System.out.println(options.size());		//10
		/*
		for(WebElement op:options)
		{
			System.out.println(op.getText());
			String title=op.getText();
			
			if(title.equals("java interview questions"))
			{
				op.click();
			} 
			
			}	*/
		
		for(int i=0;i<options.size();i++)
		{
			String title=options.get(i).getText();
			
			if(title.equals("javascript"))
			{
				options.get(i).click();
			}
		}
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
