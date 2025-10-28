package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		//Login steps
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Clicking on PIM
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		
		//Clicking on dropdown
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		
		//clicking single option
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		//Count number of options
		List<WebElement>options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("Number of options:"+ options.size());	//37
		
		//printing options
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
			
			String Text = op.getText();
			
			if(Text.equals("Content Specialist"))
			{
				op.click();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
