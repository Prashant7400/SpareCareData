package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Upload2 {
	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		

		driver.findElement(By.xpath("//*[@id=\"tbx_UserName\"]")).sendKeys("DatUpl");
		driver.findElement(By.xpath("//*[@id=\"tbx_Password\"]")).sendKeys("Uploader!@#321");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Data Upload\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Bulk Stock Upload\"]")).click();

	
		// select brand

		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlbrand\"]/option[11]")).click();

		  // select dealer

		  driver.findElement(By.xpath("//option[text()=\"A & A EARTHMOVERS PRIVATE\"]")).click();

		  // select date

		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		  driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();

		  // select file

		  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
		    .click();

		  // Robot class method
		  // 1. copy the path
		  // 2. Ctrl + v
		  // 3. enter

		  Robot rb = new Robot();
		  rb.delay(2000);

		  StringSelection ss = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\A & A EARTHMOVERS PRIVATE.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);

		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);

		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);

		  Thread.sleep(2000);
		  
		  // submit

		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("A & A EARTHMOVERS PRIVATE  :" +we.getText());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
		  
		  
		  PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\ConsoalResult.txt");
		  System.setOut(ps);
		  System.out.println("A & A EARTHMOVERS PRIVATE  :" +we.getText());
		  
		  
		  
			// SELECT DEALER Advaith Motors

			driver.findElement(By.xpath("//option[text()=\"Advaith Motors\"]")).click();

			// SELECT STOCK DATE

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
			driver.findElement(By.xpath("//td[@class=\"today active day\"]")).click();

			// SELECT FILE

			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
					.click();

			// Robot class method
			// 1. copy the path
			// 2. Ctrl + v
			// 3. enter

			Robot rb1 = new Robot();
			rb1.delay(2000);

			StringSelection ss1 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
			rb1.keyPress(KeyEvent.VK_CONTROL);
			rb1.keyPress(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_CONTROL);
			rb1.keyRelease(KeyEvent.VK_V);
			rb1.keyPress(KeyEvent.VK_ENTER);
			rb1.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(2000);
			
			// SUBMIT

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
			Thread.sleep(2000);
			WebElement we1 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
			System.out.println("Advaith Motors  :" +we1.getText());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			
			
			// SELECT DEALER Alliance jcb

			driver.findElement(By.xpath("//option[text()=\"ALLIANCE INDUSTRIAL MARKE\"]")).click();

			// SELECT STOCK DATE

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
			driver.findElement(By.xpath("//td[@class=\"today active day\"]")).click();

			// SELECT FILE

			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
					.click();

			// Robot class method
			// 1. copy the path
			// 2. Ctrl + v
			// 3. enter

			Robot rb2 = new Robot();
			rb2.delay(2000);

			StringSelection ss2 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\ALLIANCE INDUSTRIAL MARKE.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
			rb2.keyPress(KeyEvent.VK_CONTROL);
			rb2.keyPress(KeyEvent.VK_V);
			rb2.keyRelease(KeyEvent.VK_CONTROL);
			rb2.keyRelease(KeyEvent.VK_V);
			rb2.keyPress(KeyEvent.VK_ENTER);
			rb2.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(2000);
			
			// SUBMIT

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
			Thread.sleep(2000);
			WebElement we2 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
			System.out.println("Alliance jcb  :" +we2.getText());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			
			// SELECT DEALER Amin Equipment 

			driver.findElement(By.xpath("//option[text()=\"AMIN EQUIPMENTS PVT LTD\"]")).click();

			// SELECT STOCK DATE

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
			driver.findElement(By.xpath("//td[@class=\"today active day\"]")).click();

			// SELECT FILE

			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
					.click();

			// Robot class method
			// 1. copy the path
			// 2. Ctrl + v
			// 3. enter

			Robot rb3 = new Robot();
			rb3.delay(2000);

			StringSelection ss3 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\AMIN EQUIPMENTS PVT LTD.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
			rb3.keyPress(KeyEvent.VK_CONTROL);
			rb3.keyPress(KeyEvent.VK_V);
			rb3.keyRelease(KeyEvent.VK_CONTROL);
			rb3.keyRelease(KeyEvent.VK_V);
			rb3.keyPress(KeyEvent.VK_ENTER);
			rb3.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(2000);
			
			// SUBMIT

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
			Thread.sleep(2000);
			WebElement we3 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
			System.out.println("Amin Equipment  :" +we3.getText());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			
			
			
			// SELECT DEALER Bansal earthmovers

			driver.findElement(By.xpath("//option[text()=\"BANSAL AUTOMOTIVE PVT LTD\"]")).click();

			// SELECT STOCK DATE

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
			driver.findElement(By.xpath("//td[@class=\"today active day\"]")).click();

			// SELECT FILE

			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
					.click();

			// Robot class method
			// 1. copy the path
			// 2. Ctrl + v
			// 3. enter

			Robot rb4 = new Robot();
			rb4.delay(2000);

			StringSelection ss4 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\BANSAL AUTOMOTIVE PVT LTD.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);
			rb4.keyPress(KeyEvent.VK_CONTROL);
			rb4.keyPress(KeyEvent.VK_V);
			rb4.keyRelease(KeyEvent.VK_CONTROL);
			rb4.keyRelease(KeyEvent.VK_V);
			rb4.keyPress(KeyEvent.VK_ENTER);
			rb4.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(2000);
			
			// SUBMIT

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
			Thread.sleep(2000);
			WebElement we4 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
			System.out.println("Bansal earthmovers  :" +we4.getText());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			

		
		

		

}
}
