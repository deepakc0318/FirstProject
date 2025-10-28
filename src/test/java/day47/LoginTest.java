package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest 
{
	WebDriver driver;
	String exp="My Account";
	
	
	@BeforeClass
	void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String password) throws InterruptedException
	{
	PageObjectClassUsingPageFactory_LoginPage2 lp=new PageObjectClassUsingPageFactory_LoginPage2(driver);
	
	lp.setUserName(email);
	lp.setPassword(password);
	lp.clickLogin();
	
	if(driver.getTitle().equals("My Account"))
	{	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(driver.getTitle(), "My Account");
	Thread.sleep(1000);
	driver.navigate().back();
	}
	else
	{
	Assert.fail();;
	}
	
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp")			//indices is optional, indices means only specific row number will be executed
	Object[][] loginData()
	{
		Object data[][]= {
							{"deepakc0318@gmail.com", "Deepakc0318@"},
							{"xyz@gmail.com","test012"},
							{"john@gmail.com", "test@123"},
							{"pavanol123@gmai.com","test@123"},
							{"jphncanedy@gmail.com","test"}
							
						};
		return data;
	}
	
	
	
	
}
