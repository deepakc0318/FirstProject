package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1)find total number of rows in a table
		int rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total number of rows:"+ rows); //7
		
		// 2)find total number of coloumns in a table
		
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println("Total number of columns"+col);
		
		// 3) Read data from specific row and column // with row no and column no (ex: 5th row and 1st column)
		
		String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText(); ////table[@name='BookTable']//tr[5]//td[1]"  // dynamically written xpath with row number and column number 
		System.out.println(bookName);
		
		//	4) read data from all the rows and columns
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1; c<=col;c++)
		{
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();		// if we want to pass variable into xpath we need to put that variable like this "+r+"(+ symbol and (" ")  before and after the vairable) this is java syntax
			System.out.print(value+ "\t");  // if we want to have one tabular space than we use like this ("\t") i.e, backslasch(\t) in double quotation. for e.g.,("\t")
		}
			System.out.println();
			}
		
		
		//5) Print book names whose author is Mukesh
		
		for(int r=2;r<rows;r++)
		{
		String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		
		if(authorname.equals("Mukesh"))
		{
			String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(bookname + " \t "+authorname);
		}
		
		}
		
		
		//6) Find total price of all the books
		
		int total=0;
		
		for(int r=2;r<rows;r++)
		{
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		System.out.println(price);   //price is in string format
		
		total=total+Integer.parseInt(price);
		
		}
		System.out.println(total);
		
		
		
		
		
		
		
		
		

	}

}
