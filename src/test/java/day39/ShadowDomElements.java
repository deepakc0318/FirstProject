package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDomElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		
		//This Element is inside single shadow DOM.
		//(THE BELOW THREE LINES CODE WE HAVE COPIED FROM SELECTORS HUB IN DESCRIPTION BOX, BECAUSE IT IS SHOWDOW DOM) , FOR SHADOWDOMS WE NEED TO COPY CODE FROM SELECTORHUB
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
		
		
		
		
		
		
	}

}
