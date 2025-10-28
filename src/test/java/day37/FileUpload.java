package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\pushp\\Downloads\\T-KARUPPAIAH.pdf");
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\pushp\\Downloads\\T-KARUPPAIAH EKATHA ACKNOWLEDGEMENT.pdf");
		
		
		// Multiple files upload
		// if we want to upload multiple files then  separate them with "\n" in single .sendkeys()
		//   "\n"  - takes to next line
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\pushp\\Downloads\\ECC-27092025-5938670.pdf" +"\n"+ "C:\\Users\\pushp\\Downloads\\ECC-26092025-5927869.pdf" );

		
		//validation 1 - Number of files
	int noOfFilesUplaoded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	
	if(noOfFilesUplaoded==4)				//All files are uploaded
	{
		System.out.println("All files are uploaded");
	}
	else
	{
		System.out.println("Files Not uploaded");
	}
	
		// Validation 2 - validate file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("T-KARUPPAIAH.pdf"))			//Files Matching
		{
			System.out.println("Files Matching");
		}
		else
		{
			System.out.println("Files not matching");
		}
		
		

	}

}
