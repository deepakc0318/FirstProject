package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	
		WebElement desktiops=driver.findElement(By.xpath("//body/div[@class='container']/nav[@id='menu']/div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[@class='nav navbar-nav']/li[1]/a[1]"));
		WebElement mac=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Actions act=new Actions(driver);
		
		//MOUSE HOVER ACTION
		//	act.moveToElement(desktiops).moveToElement(mac).build().perform();
			act.moveToElement(desktiops).moveToElement(mac).click().perform();		//DIRECTLY ENTERING .perform() without using .build();
		
		
		
		
		
		
		
		

	}

}
