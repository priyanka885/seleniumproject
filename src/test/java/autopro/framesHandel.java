package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesHandel {
	@Test
	public void fh()
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("http://demo.guru99.com/test/guru99home/");
	      driver.switchTo().frame("a077aa5e");
	    String attribute = driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).getAttribute("src");
	    System.out.println(attribute);
	}

}
