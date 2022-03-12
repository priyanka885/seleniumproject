package autopro;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class childWindow {
	{
		System.setProperty("webdriver.chrome.driver", "./driverfile/chromedriver.exe");
	}
	
	@Test
	public void childWindowBrowser() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(10);
		   //close the hidden division popup
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
		   //click on mobile feature
		   
		   driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		   driver.findElement(By.xpath("//img[@class='_1aPR5_'  and @alt='Shop Now']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[text()='realme C25_Y (Glacier Blue, 64 GB)']")).click();
		 Set<String> winId = driver.getWindowHandles();
		   
		 for(String win:winId)
		  {
			  String title = driver.switchTo().window(win).getTitle();
			  System.out.println(title);
			  if(title.contains("realme C25_Y ( 64 GB Storage, 4 GB RAM )"))
			  {
				  driver.close();
			  }
			  
		 }
	}

}
