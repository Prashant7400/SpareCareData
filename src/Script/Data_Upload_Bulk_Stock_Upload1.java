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
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Data_Upload_Bulk_Stock_Upload1 {

	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {

		
//	     TestListenerAdapter tla = new TestListenerAdapter();
//	        TestNG testng = new TestNG();
//	        testng.setTestClasses(new Class[] { ExampleTest.class,ExampleTest2.class });
//	        testng.addListener(tla);
//	        testng.run();
		
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

		// SELECT BRAND JCB

		driver.findElement(By.xpath("//option[text()=\"JCB\"]")).click();

		// SELECT DEALER A & A EARTHMOVERS PRIVATE

		driver.findElement(By.xpath("//option[text()=\"A & A EARTHMOVERS PRIVATE\"]")).click();

		// SELECT STOCK DATE (CURRENT DATE)

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();

		// SELECT FILE

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb = new Robot();
		rb.delay(1000);

		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\A & A EARTHMOVERS PRIVATE.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("A & A EARTHMOVERS PRIVATE  :" + we.getText());
		Thread.sleep(1000);
		// CONSOLE OUTPUT PRINT INTO NOTEPAD

		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\ConsoalResult.txt");
		System.setOut(ps);
		System.out.println("A & A EARTHMOVERS PRIVATE  :" + we.getText());
		
		
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
				rb2.delay(1000);

				StringSelection ss2 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\ALLIANCE INDUSTRIAL MARKE.xlsx");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
				rb2.keyPress(KeyEvent.VK_CONTROL);
				rb2.keyPress(KeyEvent.VK_V);
				rb2.keyRelease(KeyEvent.VK_CONTROL);
				rb2.keyRelease(KeyEvent.VK_V);
				rb2.keyPress(KeyEvent.VK_ENTER);
				rb2.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);

		// SUBMIT

				driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				WebElement we2 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
				System.out.println("Alliance jcb :" + we2.getText());
				Thread.sleep(1000);

		
		
		
		
		
		
		
		
		
		// SELECT DEALER PREMSONS MOTOR UDYOG PVT LTD

		driver.findElement(By.xpath("//option[text()=\"PREMSONS MOTOR UDYOG PVT LTD\"]")).click();

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

		Robot rb34 = new Robot();
		rb34.delay(1000);

		StringSelection ss34 = new StringSelection(
				"C:\\Users\\Admin\\Desktop\\jcbstk\\PREMSONS MOTOR UDYOG PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss34, null);
		rb34.keyPress(KeyEvent.VK_CONTROL);
		rb34.keyPress(KeyEvent.VK_V);
		rb34.keyRelease(KeyEvent.VK_CONTROL);
		rb34.keyRelease(KeyEvent.VK_V);
		rb34.keyPress(KeyEvent.VK_ENTER);
		rb34.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we34 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("PREMSONS MOTOR UDYOG PVT LTD :" + we34.getText());
		Thread.sleep(1000);
	
		

		
		
		
		
}
}