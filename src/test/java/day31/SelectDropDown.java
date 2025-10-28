package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);		//Created Select Class for Select DropDown
		
		//select option from the drop down
		
		//drpCountry.selectByVisibleText("France");			//selectByVisibleText()  built in method of Select Class
		//drpCountry.selectByValue("japan")					//selectByValue()  built in method of Select Class
		//drpCountry.selectByIndex(2);						//selectByIndex()  built in method of Select Class
		
		//Capture the options form the Dropdown
		List<WebElement> options=drpCountry.getOptions();		//    .getOptions() -----> returns all the options from the dropdown
		System.out.println("No of options in a drop down:"+ options.size()); //10
		
		//printing the a single option 
		System.out.println(options.get(1).getText());
		
		//Printing the options
	/*	for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
