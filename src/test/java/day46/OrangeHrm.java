package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHrm {
	
WebDriver driver;


	@BeforeClass
	void setup() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();		
	Thread.sleep(3000);
	}
	
	
	@Test(priority=1)
	void testLogo() throws InterruptedException
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo displayed..."+ status);
	}
	

	@Test(priority=2)
	void testURL()
	{
	Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive");
	}

	@Test(priority=3, dependsOnMethods= {"testURL"})
	void testTitle()
	{
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown()
	{
	driver.quit();
	}

	}
