package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22Assignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		//Total number of images
		List<WebElement> imagescount =driver.findElements(By.tagName("img"));
		System.out.println("Total images:"+ imagescount.size());			//5
		
		//Total number of Links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links:" + links.size());	//15
		
		//click on any product link using linktext/partialLinkText
		driver.findElement(By.linkText("Cart")).click();
		
		
		
		
	
		
		
		
		
		

	}

}
