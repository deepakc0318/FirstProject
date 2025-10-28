package day21;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 Test Case
 -------
 1) Launch brower(chrome)
 2) Open URL https://demo.opencart.com
 3) Validate title should be "Your Store"
 4) Close browser
 */


public class FirstTestCase {

	public static void main(String[] args) {
		
		
		
		// 1) Launch brower(chrome)
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		

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
		driver.quit();
		
		
		
		
		
		}
		
	}


