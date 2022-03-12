package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selecdropdown {
	
	@Test
	public void dropdown() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  //select day 
	  Select day = new Select(driver.findElement(By.id("day")));
	  day.selectByValue("22");
	  Thread.sleep(2000);
	//select month
	  Select mnth = new Select(driver.findElement(By.id("month")));
	  mnth.selectByVisibleText("Mar");
	  Thread.sleep(2000);
	  //select year 
	 Select year = new Select(driver.findElement(By.id("year")));
	  year.selectByVisibleText("2019");
	  
	  driver.findElement(By.xpath("//label[text()='Male']")).click();
	
	}
	

}
