package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//getTitle()  - returns title of the page,      so we need to store in an String Variable or directly print using Syso
		//System.out.println(driver.getTitle());
		
		// getCurrentUrl()  - returns URL of the page,       so we need to store in an String Variable or directly print using Syso
		//System.out.println(driver.getCurrentUrl());		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//getPageSource() - returns source code of the page,       so we need to store in an String Variable or directly print using Syso
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()	- returns ID of the single browser window,        so we need to store in an String Variable or directly print using Syso
		//String windowId=driver.getWindowHandle();
		//System.out.println(windowId);			//23C09FCE1EF647211CEFFC9641BCC107
		
		//getWindowHandles()	- returns ID's of the multiple browser window,    so we need to store in an Variable 
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println(windowIds);		//[58C045BF824A328A01E057F0FC815463, 34C24DBF13BAAA043DA07B358AD191E7]


	}

}
