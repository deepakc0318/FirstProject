package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingpPages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// 1) scroll down page by pixel number
		
		//js.executeScript("window.scrollBy(0,3000)", "");		// 3000 is pixel number, firstly we need to capture and enter here
		//System.out.println(js.executeScript("return window.pageYoffset;"));		// returns pixel number
		
		
		// 2) scroll the page till the element is visible
		//this is used when we get Elementnotvisible Exception, first we scroll the page then the element is visible, then we can perform the actions on that element
	
		WebElement ele=driver.findElement(By.xpath("//button[@id='vote-poll-1']"));	
	
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		// 3) scroll page till end of the page
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		// 4) scrolling up to initial position
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		
		
		
		
		
		
		

	}

}
