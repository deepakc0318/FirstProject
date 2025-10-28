package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		 
		//1) full page screenshot
		
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);		//this will capture ss and will be saved in sourcefile
		File targetfile=new File("C:\\java_workspace\\seleniumwebdriver\\seleniumwebdriver\\screenshots\\fullpage.jpg");	// targetfile is the location where we want to save the ss
		
													//	or
		//File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png"); {System.getProperty("user.dir")} ==> dynamically returns current project location
		
		sourcefile.renameTo(targetfile);	// COPY sourcefile to targetfile
		*/
		
		// 2) capture the screenshot of specific section
	/*	WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourcefile= featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		sourcefile.renameTo(targetfile);	//copy sourcefile to target file
		*/
		
		// 3) capture the screenshot of specific WebElement
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile= logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");			//logo.png is the name we should giver that we want to save under screenshots folder
		sourcefile.renameTo(targetfile);	//copy sourcefile to target file

	}

}
