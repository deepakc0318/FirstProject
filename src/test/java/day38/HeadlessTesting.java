package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		
		// setting for headless mode of execution
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(options);
		

		

		//2) Open URL https://demo.opencart.com
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();					// this will maximize the page
	
		//3)  Validate title should be "Your Store"
		
		String act_title=driver.getTitle();		//.getTitle() returns the title of the page
		System.out.println(act_title);
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
			else
			{
				System.out.println("Test Failed");
			}
		
		
		// 4) Close browser
		driver.close();
	
		

	}

}
