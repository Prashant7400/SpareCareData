package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Sparecare_Gainer_Sale_List_Upload {
	
	
public static void main(String[]args) throws IOException, InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Spare Care Gainer\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Miscellenous\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Sale List upload\"]")).click();
		
		// Click Export
		
		driver.findElement(By.xpath("(//a[text()=\"Export\"])[1]")).click();
		
		// Click Delete Uploaded Non Movings
		
		//driver.findElement(By.xpath("btnSubmit")).click();
		Thread.sleep(1000);
		
		// Click Upload Non Moving 
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/input[1]")).click();
		Thread.sleep(1000);

		
		// Select Brand
		
		driver.findElement(By.xpath("(//option[text()=\"Mahindra\"])[1]")).click();
		Thread.sleep(1000);
		
		// Select Dealer
		
		driver.findElement(By.xpath("//option[text()=\"Mahindra Test\"]")).click();
		Thread.sleep(1000);

		//Select Location
		
		driver.findElement(By.xpath("/ /option[text()=\"New Test\"]")).click();
		Thread.sleep(1000);

		// Upload File
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div/label/span")).click();
		
		Robot rb = new Robot();
		rb.delay(1000);
		

		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Desktop\\TestSaleList.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		
		// Submit
		
//		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		driver.close();

		

}
}