package autopro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class scroollaction {
	
	@Test
	
	public void sact() throws Exception
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://demo.guru99.com/test/guru99home/");
      Actions act=new Actions(driver);
      act.sendKeys(Keys.PAGE_DOWN).perform();
      Thread.sleep(1000);
      act.sendKeys(Keys.PAGE_UP).perform();
      Thread.sleep(1000);
      act.sendKeys(Keys.CONTROL,Keys.END).perform();
	}
}
