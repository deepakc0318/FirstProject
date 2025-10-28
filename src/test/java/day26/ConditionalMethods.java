package day26;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//isDisplayed()
		
		//boolean displaystatus=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(displaystatus); // true
		
										//or we can store in an WebElement Variable and then use isDisplayed()
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(logo.isDisplayed());
		
		
		//isEnabled()
		//boolean status=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		//System.out.println(status);  //true
		
		//isSelected()
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection......");		//Before Selection......
		System.out.println(male_rd.isSelected());			//false
		System.out.println(female_rd.isSelected());			//false
		
		System.out.println("After Selection of male radio button");
		male_rd.click();
		System.out.println(male_rd.isSelected());			//true
		System.out.println(female_rd.isSelected());			//false
		
		System.out.println("After Selection of female radio button");
		female_rd.click();
		System.out.println(male_rd.isSelected());			//false
		System.out.println(female_rd.isSelected());			//true
		
		boolean newsletterstatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(newsletterstatus);				//true
		
		
		
		
		

	}

}
