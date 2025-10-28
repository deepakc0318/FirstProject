package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//SWITCH TO FRAME
		driver.switchTo().frame("iframeResult");
		
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		
		
		box1.clear();		//CLEARS BOX1
		box1.sendKeys("Welcome");
		
		//DOUBLE CLICK ACTION ON THE BUTTON
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		
		
		
		//Validation that the value enter in box1 is matching with box2
		
		String box2text=box2.getText();			//returns box2 text
		
		System.out.println("Box2 text is"+ box2text);		// box2 text is null
		
		//getText() is null so test is failed  // instead use .getAttribute() which returns the value entered in the field
		if(box2text.equals("Welcome"))
		{
			System.out.println("Text Copied...");
		}
		else
		{
		System.out.println("Text not Copied...");			//box2 text is null so output  is Text not Copied...
		}					
		
	
			// Validating using .getAttribute()
		String box2text1=box2.getAttribute("value");			//returns box2 "value" of value attribute
		
		System.out.println("Box2 text is"+ box2text1);		// box2 text is Welcome
		
		//getAttribute() value is Welcome so test passes //  using .getAttribute() which returns the value entered in the field

		if(box2text1.equals("Welcome"))
		{
			System.out.println("Text Copied...");
		}
		else
		{
		System.out.println("Text not Copied...");			//box2 text is Welcome so output  is Text  Copied...
		}					
		

				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
