package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		// xpath with single attribute
		// driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		// xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//Xpath with 'and' operator
		// driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirts"); // here both the attributes must be correct
		
		//Xpath with 'or' operator
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='xyz']")).sendKeys("T-shirts");  // here if any one attribute is wrong then it will locate the element
																											  // here @placeholder='xyz' is wrongly entered attribute even then it is able to locate the attribute
	
		// Xpath with text()
		//driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		//boolean displaystatus= driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displaystatus);																//true
		
		//String value= driver.findElement(By.xpath("//h3[text()='Featured']")).getText();					//.getText() gives the text of the Element 
		//System.out.println(value);			//Featured	
	
		// Xpath with contains()
		//driver.findElement(By.xpath("//*[contains(@placeholder,'Sear')]")).sendKeys("Tshirts");
		
		//Xpath with starts-with()
		//driver.findElement(By.xpath("//*[starts-with(@placeholder,'Sear')]")).sendKeys("Tshirts");
	
		//Xpath with Chained Xpath
		driver.findElement(By.xpath("//div[@class='col-sm-5']/div/input")).sendKeys("mac");
	
	
	
	
	
	
	
	
	}

}
