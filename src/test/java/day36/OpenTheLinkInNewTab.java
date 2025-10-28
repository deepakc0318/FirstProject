package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reglink=driver.findElement(By.xpath("//a[@class='ico-register']"));
	
		Actions act=new Actions(driver);
		
		//CONTROL + RegLink
		act.keyDown(Keys.CONTROL).click(reglink).perform();
		
		
		//Switching to Registration page
		Set<String> windowid=driver.getWindowHandles();
		
		List<String> windowids=new ArrayList<String>(windowid);
		
		
		driver.switchTo().window(windowids.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Tshirts");
		
		//Switching to Registration page
		driver.switchTo().window(windowids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");
		
		

	}

}
