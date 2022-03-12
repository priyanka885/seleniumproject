package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragdrop {
	
	@Test
	public void dd()
	{
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	 Actions act=new Actions(driver);
	 WebElement dsgn = driver.findElement(By.xpath("//div[@id='shoppingCart4']"));
	 WebElement src = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']"));
	 act.dragAndDrop(src, dsgn).perform();
	 
	}

}
