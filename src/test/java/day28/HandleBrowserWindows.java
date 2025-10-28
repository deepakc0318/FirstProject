package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		
		//In order to switch from one window to another window, we use driver.switch().window(Window Id) - to capture window Id we must use .getWindowHandles
		// and Store in Variables to perform any action on specific window 
		Set<String> windowIds=driver.getWindowHandles();		//returns Set<String>
		
		
		//Approach1 (Approach is used only when we have 2 webWindows, if more than 2 web Windows we use Approach 2 i.e., looping statments
		/*
		List<String> windowList=new ArrayList(windowIds);
		String ParentId=windowList.get(0);
		String ChildId=windowList.get(1);
		
		//Switch to Child window
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());
		
		//Switch to Parent Window
		driver.switchTo().window(ParentId);
		System.out.println(driver.getTitle());
		*/
	
		//Approach 2
		
		// to perform any actions on group of elements we must use looping statements
		for(String winId:windowIds)
		{
			
			//if we want to perform any action on specific web window we need to capture "title of the page" through the title of the page we use "if condtion"
			// i.e., if "title caputured" equals "actual title" then it performs actions
			String title=driver.switchTo().window(winId).getTitle();    //storing only one string to a variable at a time/looping
			if(title.equals("Human Resources Management Software | HRMS | OrangeHRM"))
			{
				driver.findElement(By.xpath("//a[normalize-space()='Solutions']")).click();
				driver.navigate().back();
				driver.close();
			
			}
			
		
			
		}
		
	
		
		
		
		
		
	}

}
