package autopro;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class addToCart {
	
	
	@Test
	public void addtocart() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(10);
		   //close the hidden division popup
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
		   //click on mobile feature
		   
		   driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		   driver.findElement(By.xpath("//img[@class='_1aPR5_'  and @alt='Shop Now']")).click();
		   Thread.sleep(2000);
		   String parent = driver.getWindowHandle();
		  String actualprice = driver.findElement(By.xpath("//div[text()='realme C25_Y (Glacier Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹11,999']")).getText();
		   driver.findElement(By.xpath("//div[text()='realme C25_Y (Glacier Blue, 128 GB)']")).click();
          // Thread.sleep(4000);
		   //add to cart 
		   Set<String> winId = driver.getWindowHandles();
		    System.out.println(winId);
		   
	 for(String win:winId)
		  {
			  driver.switchTo().window(win);
		  }
		   
		  driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
   //driver.close();
		  
		   
		 driver.switchTo().window(parent);
		   Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Cart']")).click();
		  String price = driver.findElement(By.xpath("//a[text()='realme C25_Y (Glacier Blue, 128 GB)']/ancestor::div[@class='_3fSRat']/descendant::span[text()='11,999']")).getText();
		  
		  if(actualprice.equals(price))
	       {
			  System.out.println("price is matched");
		   }
		  
		  
		  
  }
	
}
