package day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac"); 			// .sendKeys() types in seach box
		
		// id
		//boolean LogoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed(); // .isDisplayed() returns boolean value checks whether the logo is displayed or not
		//System.out.println(LogoDisplayStatus);
		
		//linktext & partialLinkText
		//driver.findElement(By.linkText("Tablets")).click(); 	// .click() performs clicking on a web element
																//	"Tablets" is a Link Text available in Tablets element
																//	for linkText attribute we need to enter only LinkText and not the Link
																//	Links can be identified through (<a)   <a = tagname
		//driver.findElement(By.partialLinkText("Tab")).click();	// partialLinkText we dont need to enter the complete value, we can enter partial value 
																// eg. Tab and not actual LinkText ie,Tablets
		
		//classname
		List<WebElement>  headerLinks=driver.findElements(By.className("list-inline"));	//	"list-inline" is locating multiple elements so we have stored in List<WebElement>
		System.out.println(headerLinks.size());   // 1
		
		//tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());  // 77
		
		List<WebElement> images =driver.findElements(By.tagName("img"));
		System.out.println(images.size());   		//29
		
		
	}

}
