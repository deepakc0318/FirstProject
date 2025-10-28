package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//1)Normal alert with Ok button
	/*	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();						//syntax .accept() ---> ok button
		*/
		
		//Common Note:- if we do want to perform any actions on single WebElement, kindly do save into variable, through that variable we can
		//perform various actions, if we do not save into element we can only perform single action
		//for eg:- {driver.switchTo().alert().accept();} ---> this only performs accept() action instead
		// Alert myalert=driver.switchTo().alert() ---> now we can have captured in a variable(myalert), through this variable 
		// we can perform actions on it, for eg:- 1) myalert.click();  2) myalert.sendkeys();  3) myalert.accept();  4) myalert.dismiss();
		
		
		//2) Confirmation alert with "ok" and "cancel" button
		/*
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert myalert=driver.switchTo().alert();
		//myalert.accept()								// .accepts() ---> ok button
		myalert.dismiss();								// .dismiss() ---> ok button
		*/
		
		//3) prompt alert- Input box
		
		driver.findElement(By.xpath("(//button[@onclick='jsPrompt()'])[1]")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Selenium");
		myalert.accept();
		
		
	}

}
