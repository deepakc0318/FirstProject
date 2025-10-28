package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		
		//Drag and Drop 1
		
		WebElement drg1=driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement drplocation=driver.findElement(By.xpath("//div[@id='droparea']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drg1, drplocation).perform();
		
		
		//Drag and Drop 2
		
		WebElement drplocation2=driver.findElement(By.xpath("//div[@id='droparea']"));
		WebElement drg2=driver.findElement(By.xpath("//img[@id='mongo']"));
		
		act.dragAndDrop(drg2, drplocation2).perform();
		
		
		
		//Drag and Drop 3
		WebElement drplocation3=driver.findElement(By.xpath("//div[@id='droparea']"));
		WebElement drg3=driver.findElement(By.xpath("//img[@id='node']"));
		
		act.dragAndDrop(drg3,drplocation3).perform();
		
		
		
		
		

	
		//img[@id='angular']
		//img[@id='mongo']
		//img[@id='node']
	

	}

}
