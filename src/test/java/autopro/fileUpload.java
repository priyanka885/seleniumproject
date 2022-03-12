package autopro;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class fileUpload {

	@Test
	public void FU() throws AWTException, Exception
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
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		
		
		StringSelection filepath = new StringSelection("C:\\Users\\user\\Downloads\\Priyanka_CV.docx");
		Toolkit  tk=Toolkit.getDefaultToolkit();
		Clipboard cb = tk.getSystemClipboard();
		cb.setContents(filepath,null);
		
		 Robot	r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
