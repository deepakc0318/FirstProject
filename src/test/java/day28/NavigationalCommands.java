package day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/");			//accepts URL only in string format
		
		driver.navigate().to("https://demo.nopcommerce.com/");	//string format
		
		// URL FORMAT
		
		//URL myurl=new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
		

	}

}
