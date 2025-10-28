package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));  // catured the located and saved into WebElement variable
		driver.switchTo().frame(frame1);				//passed frame as a webElement  //switch into frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();	//go back to MAIN page
		
		//Frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		//iframe inside frame3
		/*WebElement iframe=driver.findElement(By.xpath("//iframe[@height='350']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).sendKeys("Selenium");*/
		driver.switchTo().defaultContent();
		
		// Frame 4
		
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		
		//Frame 5
		
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		
		driver.findElement(By.xpath("//body//center//a")).click();
		//boolean status =driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		//System.out.println(status);
		
		
		
		
		

	}

}
