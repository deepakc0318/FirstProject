package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();						//maximizes the browser window
		
		//1) tag and id syntax - tag#id or #id  (tagname is optional)
		//cssSelector syntax -  driver.findElement(By.cssSelector("input#small-searchterms") // (By.cssSelector())
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");  // syntax for tag and id () ex:-"input#small-searchterms"
							//or  #id  (tagname is optional) (By.cssSelector("#small-searchterms")
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		
		//2) tag class     syntax - tag.classname or .classname  (classname is optional)
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		// driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts"); // tagname is optional  (By.cssSelector(".search-box-text")
		
		//3) tag attribute    syntx- tag[attribute="value"]    or tag is optional    [attribute="value"]  
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");  // tagname is optional   (By.cssSelector("[placeholder='Search store']")
		
		//4) tag class attribute     sytax - tag.classname[attribute="value"]
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
	
		
		
		
		
		
		

	}

}
