package autopro;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploadAutoIt {
	
	@Test
	public void fileUpload() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Register']")).click();
		Set<String> winid = driver.getWindowHandles();
		for( String win:winid)
		{
			driver.switchTo().window(win);
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
		Runtime.getRuntime().exec("./fileuploadatuo.exe");
		
	}
	
	

}
