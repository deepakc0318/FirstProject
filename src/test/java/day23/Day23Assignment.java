package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23Assignment {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//locating elements using tag[attribute]
		//driver.findElement(By.cssSelector("img[alt$='MacBook']")).click();

		//locating elements using tag and id
		//driver.findElement(By.cssSelector("span#cart-total")).click();
		
		//locating elements using tag,class and attribute
		driver.findElement(By.cssSelector("input.form-control.input-lg[placeholder$='Search']")).sendKeys("mac");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
