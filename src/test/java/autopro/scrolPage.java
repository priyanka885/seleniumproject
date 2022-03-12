package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrolPage {
	 @Test
	 public void sp() throws Exception
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     
	     driver.get("http://demo.guru99.com/test/guru99home/");
	     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    String text1 = driver.findElement(By.xpath("//a[text()='About us']")).getText();
	    System.out.println(text1);
	     Thread.sleep(2000);
	     js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	    String text2 = driver.findElement(By.xpath("//a[contains(text(),' Quiz')]")).getText();
	     System.out.println(text2);
	     
	     driver.findElement(By.xpath("//h3[text()='Email Submission']")).sendKeys(Keys.PAGE_DOWN);
	 }

}
