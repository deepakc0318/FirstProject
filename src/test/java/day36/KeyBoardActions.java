package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
		
		Actions act =new Actions(driver);
		//CTRL+A		- SELECTS THE TEXT
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		
		
				
		//CTRL+C		- COPY THE TEXT INTO CLIPBOARD
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		
		
		
		//TAB			- SHIFT TO SECOND BOX
		//act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
							//	or
		act.sendKeys(Keys.TAB).perform();
		
		
		
		
		//CTRL+V		- PASTE THE TEXT
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
		
		
		
		
		
		
		

	}

}
