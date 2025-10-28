package day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//driver.switchTo().newWindow(WindowType.TAB); 		//OPENS NEW TAB
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);		//OPENS NEW WINDOW
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		
		
		
		
		
		
		
		
		
		

	}

}
