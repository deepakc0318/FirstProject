package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//RIGHT CLICK ACTION	(Actions)
		Actions act=new Actions(driver);
		
		//Storing actions into Action variable 		(Action)
		Action myaction=act.contextClick(button).build();		// .build() should be stored in Action Interface
		
		
		//performing action using Action
		myaction.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
