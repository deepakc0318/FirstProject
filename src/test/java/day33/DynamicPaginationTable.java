package day33;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WEBSITE NOT WORKING
		driver.get("https://www.ecomdeveloper.com/demo/index.php?route=extension/simple_blog/author&simple_blog_author_id=1");

	}

}
