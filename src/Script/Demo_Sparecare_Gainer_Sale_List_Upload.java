package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Sparecare_Gainer_Sale_List_Upload {

	
public static void main(String[]args) throws IOException, InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.sparecare.in/UAD_SC_WAC/Login.aspx");
		driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"tbx_UserName\"]")).sendKeys("rana");
		driver.findElement(By.xpath("//input[@id=\"tbx_Password\"]")).sendKeys("rana@0615");
		driver.findElement(By.xpath("//input[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Spare Care Gainer\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Miscellenous\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Sale List upload\"]")).click();
		
		// Click Export
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		
		
		
		//Delect upload non moving
		
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
		Thread.sleep(2000);

		// Upload Non Moving
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/input[1]")).click();
		
		
		// Select Brand
		
		driver.findElement(By.xpath("(//option[text()=\"Mahindra\"])[1]")).click();
		
		// Select Dealer
		
		driver.findElement(By.xpath("//option[text()=\"Mahindra Test\"]")).click();
		
		//Select Location
		
		driver.findElement(By.xpath("/ /option[text()=\"New Test\"]")).click();
		
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
		Thread.sleep(10000);
		
		
		// Submit
		
//		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		

		
}
}