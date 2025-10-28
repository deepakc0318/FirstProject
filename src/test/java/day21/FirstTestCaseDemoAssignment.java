package day21;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCaseDemoAssignment {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		String act_title=driver.getTitle();
		System.out.println(act_title);					// nopCommerce demo store. Home page title
		
		
		if(act_title.equals("nopCommerce demo store"))	//test failed
		{
			System.out.println("Test Passed");
		}
		else 
		{
		System.out.println("Test Failed");	
		}
		
		driver.quit();

	}

}
