package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class lanuchBrowser {
	{
		System.setProperty("webdriver.chrome.driver", "./driverfile/chromedriver.exe");
	}
	
	@Test
	public void lanuchThebroser() throws Exception
	{
		//lanuch the browser
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	  
	   //lanch the flipakart application using url
	   driver.get("https://www.flipkart.com");
	   Thread.sleep(10);
	  
	   //close the hidden division popup
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	 
	   //click on mobile feature
	   
	   driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	   driver.findElement(By.xpath("//img[@class='_1aPR5_'  and @alt='Shop Now']")).click();
	   
	  
	 
	 
	  
	}

}
