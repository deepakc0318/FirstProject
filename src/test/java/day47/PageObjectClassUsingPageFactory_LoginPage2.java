package day47;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClassUsingPageFactory_LoginPage2
{
	WebDriver driver;
	
	//Constructor
	PageObjectClassUsingPageFactory_LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Locators

	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txt_username;
	
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txt_password_loc;
	
	@FindBy(xpath="//input[@value='Login']") 
	WebElement btn_login_loc;
	
	//for locating more than 1 elements
	@FindBy(tagName="a") 
	List<WebElement> links;
	
	//Action methods
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password_loc.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login_loc.submit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
