package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectClassWithoutPageFactory_LoginPage
{
	WebDriver driver;
	
	//Constructor
	PageObjectClassWithoutPageFactory_LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	//Locators
	By txt_username_loc=By.xpath("//input[@id='input-email']");
	By txt_password_loc=By.xpath("//input[@id='input-password']");
	By btn_login_loc=By.xpath("//input[@value='Login']");
	
	
	//Action methods
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
