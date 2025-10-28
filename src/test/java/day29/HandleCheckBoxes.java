package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2) select multiple checkbox - we use looping
		
		// we need to find common attributes for all 7 the checkboxes
		
		// (By.xpath("//input[@class='form-check-input'][@type='checkbox']") here we have used two common attributes to find 7 checkboxes
		// these two attributes indicated common attributes for 7 checkboxes
		// if we use only one attribute we get many web Elements matching to that attribute
		// even after using two common attributes, if we are not able to locate 7 WebElements then we must use three common attributes
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		
		//Approach 1 - using normal for loop
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// Approach 2 - using enhanced for loop
		/*
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		
		//   *************IQ***********************									//interview question
		//3) select last 3 checkboxes
		for(int i=5;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		//4)select first 3 checkboxes
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//5) unselect checkboxes if they are selected
		
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();		// to unselect firstly we need to select checkboxes, so we have selected first three checkboxes
		}
		
				//unselecting the selected checkboxes
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
