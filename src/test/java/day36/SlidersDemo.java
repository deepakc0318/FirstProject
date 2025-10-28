package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		
		//Minimum Slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default Location of the min_slider:" + min_slider.getLocation());		//		(59, 249)  where x=277 and y=190
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 190).perform();  
		
		System.out.println("Location of the min_slider after moving:"+ min_slider.getLocation());		//Location of the min_slider after moving:(277, 190)
		
		//Maximum Slider
		WebElement max_slider=driver.findElement(By.xpath("//span[@style=\"left: 100%;\"]"));
		System.out.println("Location of max_slider:"+max_slider.getLocation());		//Location of max_slider:(510, 245)
		
		act.dragAndDropBy(max_slider, -200, 245).perform();
		System.out.println("Location of the max_slider after moving:"+ max_slider.getLocation());		//Location of the min_slider after moving:(311, 252)
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
