package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollByaxis {
	
	@Test
	public void sba()
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     
	     driver.get("http://demo.guru99.com/test/guru99home/");
	     js.executeScript("window.scrollTo(0,1000)");
	     
	     
	     
	     
	}
}
