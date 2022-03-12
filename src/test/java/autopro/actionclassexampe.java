package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionclassexampe {
	
	@Test
	public void action()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	   WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));	
	   
	  Actions act = new Actions(driver);
	  act.doubleClick(button).perform();
  	  String text = driver.switchTo().alert().getText();
	   System.out.println(text);
	   driver.switchTo().alert().accept();
	   
	  WebElement rclk = driver.findElement(By.xpath("//span[text()='right click me']"));
	  act.contextClick(rclk).perform();
	  driver.findElement(By.xpath("//span[text()='Quit']")).click();
	   
	  driver.switchTo().alert().accept();

	}

}
