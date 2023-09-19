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

public class Data_Upload_Bulk_Stock_Upload {

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
		rb1.delay(1000);

		StringSelection ss1 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we1 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Advaith Motors :" + we1.getText());
		Thread.sleep(1000);

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

		// SELECT DEALER AMIN EQUIPMENTS PVT LTD

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
		rb3.delay(1000);

		StringSelection ss3 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\AMIN EQUIPMENTS PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
		rb3.keyPress(KeyEvent.VK_CONTROL);
		rb3.keyPress(KeyEvent.VK_V);
		rb3.keyRelease(KeyEvent.VK_CONTROL);
		rb3.keyRelease(KeyEvent.VK_V);
		rb3.keyPress(KeyEvent.VK_ENTER);
		rb3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we3 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("AMIN EQUIPMENTS PVT LTD :" + we3.getText());
		Thread.sleep(1000);

		// SELECT DEALER BANSAL AUTOMOTIVE PVT LTD

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
		rb4.delay(1000);

		StringSelection ss4 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\BANSAL AUTOMOTIVE PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);
		rb4.keyPress(KeyEvent.VK_CONTROL);
		rb4.keyPress(KeyEvent.VK_V);
		rb4.keyRelease(KeyEvent.VK_CONTROL);
		rb4.keyRelease(KeyEvent.VK_V);
		rb4.keyPress(KeyEvent.VK_ENTER);
		rb4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we4 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("BANSAL AUTOMOTIVE PVT LTD :" + we4.getText());
		Thread.sleep(1000);

		// SELECT DEALER Bhopal Motors

		driver.findElement(By.xpath("//option[text()=\"Bhopal Motors\"]")).click();

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

		Robot rb5 = new Robot();
		rb5.delay(1000);

		StringSelection ss5 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Bhopal Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);
		rb5.keyPress(KeyEvent.VK_CONTROL);
		rb5.keyPress(KeyEvent.VK_V);
		rb5.keyRelease(KeyEvent.VK_CONTROL);
		rb5.keyRelease(KeyEvent.VK_V);
		rb5.keyPress(KeyEvent.VK_ENTER);
		rb5.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we5 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Bhopal Motors :" + we5.getText());
		Thread.sleep(1000);

		// SELECT DEALER BOMBAY JCB EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"BOMBAY JCB EARTHMOVERS\"]")).click();

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

		Robot rb6 = new Robot();
		rb6.delay(1000);

		StringSelection ss6 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\BOMBAY JCB EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);
		rb6.keyPress(KeyEvent.VK_CONTROL);
		rb6.keyPress(KeyEvent.VK_V);
		rb6.keyRelease(KeyEvent.VK_CONTROL);
		rb6.keyRelease(KeyEvent.VK_V);
		rb6.keyPress(KeyEvent.VK_ENTER);
		rb6.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we6 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("BOMBAY JCB EARTHMOVERS :" + we6.getText());
		Thread.sleep(1000);

		// SELECT DEALER CACULO EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"CACULO EARTHMOVERS\"]")).click();

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

		Robot rb7 = new Robot();
		rb7.delay(1000);

		StringSelection ss7 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\CACULO EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss7, null);
		rb7.keyPress(KeyEvent.VK_CONTROL);
		rb7.keyPress(KeyEvent.VK_V);
		rb7.keyRelease(KeyEvent.VK_CONTROL);
		rb7.keyRelease(KeyEvent.VK_V);
		rb7.keyPress(KeyEvent.VK_ENTER);
		rb7.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we7 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("CACULO EARTHMOVERS :" + we7.getText());
		Thread.sleep(1000);

		// SELECT DEALER CONTINENTAL JCB

		driver.findElement(By.xpath("//option[text()=\"CONTINENTAL JCB\"]")).click();

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

		Robot rb8 = new Robot();
		rb8.delay(1000);

		StringSelection ss8 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\CONTINENTAL JCB.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss8, null);
		rb8.keyPress(KeyEvent.VK_CONTROL);
		rb8.keyPress(KeyEvent.VK_V);
		rb8.keyRelease(KeyEvent.VK_CONTROL);
		rb8.keyRelease(KeyEvent.VK_V);
		rb8.keyPress(KeyEvent.VK_ENTER);
		rb8.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we8 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("CONTINENTAL JCB :" + we8.getText());
		Thread.sleep(1000);

		// SELECT DEALER Dada Earthmovers

		driver.findElement(By.xpath("//option[text()=\"DADA EARTHMOVERS\"]")).click();

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

		Robot rb9 = new Robot();
		rb9.delay(1000);

		StringSelection ss9 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Dada Earthmovers.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss9, null);
		rb9.keyPress(KeyEvent.VK_CONTROL);
		rb9.keyPress(KeyEvent.VK_V);
		rb9.keyRelease(KeyEvent.VK_CONTROL);
		rb9.keyRelease(KeyEvent.VK_V);
		rb9.keyPress(KeyEvent.VK_ENTER);
		rb9.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we9 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Dada Earthmovers :" + we9.getText());
		Thread.sleep(1000);

		// SELECT DEALER DYNATECH

		driver.findElement(By.xpath("//option[text()=\"DYNATECH\"]")).click();

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

		Robot rb10 = new Robot();
		rb10.delay(1000);

		StringSelection ss10 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\DYNATECH.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss10, null);
		rb10.keyPress(KeyEvent.VK_CONTROL);
		rb10.keyPress(KeyEvent.VK_V);
		rb10.keyRelease(KeyEvent.VK_CONTROL);
		rb10.keyRelease(KeyEvent.VK_V);
		rb10.keyPress(KeyEvent.VK_ENTER);
		rb10.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we10 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("DYNATECH :" + we10.getText());
		Thread.sleep(1000);

		// SELECT DEALER FRONTIER COMERCIAL VEHICL

		driver.findElement(By.xpath("//option[text()=\"FRONTIER COMERCIAL VEHICL\"]")).click();

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

		Robot rb11 = new Robot();
		rb11.delay(1000);

		StringSelection ss11 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\FRONTIER COMERCIAL VEHICL.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss11, null);
		rb11.keyPress(KeyEvent.VK_CONTROL);
		rb11.keyPress(KeyEvent.VK_V);
		rb11.keyRelease(KeyEvent.VK_CONTROL);
		rb11.keyRelease(KeyEvent.VK_V);
		rb11.keyPress(KeyEvent.VK_ENTER);
		rb11.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we11 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("FRONTIER COMERCIAL VEHICL :" + we11.getText());
		Thread.sleep(1000);

		// SELECT DEALER G K AUTOWHEELS PVT LTD

		driver.findElement(By.xpath("//option[text()=\"G K AUTOWHEELS PVT LTD\"]")).click();

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

		Robot rb12 = new Robot();
		rb12.delay(1000);

		StringSelection ss12 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\G K AUTOWHEELS PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss12, null);
		rb12.keyPress(KeyEvent.VK_CONTROL);
		rb12.keyPress(KeyEvent.VK_V);
		rb12.keyRelease(KeyEvent.VK_CONTROL);
		rb12.keyRelease(KeyEvent.VK_V);
		rb12.keyPress(KeyEvent.VK_ENTER);
		rb12.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we12 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("G K AUTOWHEELS PVT LTD :" + we12.getText());
		Thread.sleep(1000);

		// SELECT DEALER G K AUTOWHEELS PVT LTD-Nagpur

		driver.findElement(By.xpath("//option[text()=\"G K AUTOWHEELS PVT LTD-Nagpur\"]")).click();

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

		Robot rb13 = new Robot();
		rb13.delay(1000);

		StringSelection ss13 = new StringSelection(
				"C:\\Users\\Admin\\Desktop\\jcbstk\\G K AUTOWHEELS PVT LTD-Nagpur.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss13, null);
		rb13.keyPress(KeyEvent.VK_CONTROL);
		rb13.keyPress(KeyEvent.VK_V);
		rb13.keyRelease(KeyEvent.VK_CONTROL);
		rb13.keyRelease(KeyEvent.VK_V);
		rb13.keyPress(KeyEvent.VK_ENTER);
		rb13.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we13 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("G K AUTOWHEELS PVT LTD-Nagpur :" + we13.getText());
		Thread.sleep(1000);

		// SELECT DEALER GADRE ENGINEERING SERVICE

		driver.findElement(By.xpath("//option[text()=\"GADRE ENGINEERING SERVICE\"]")).click();

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

		Robot rb14 = new Robot();
		rb14.delay(1000);

		StringSelection ss14 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\GADRE ENGINEERING SERVICE.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss14, null);
		rb14.keyPress(KeyEvent.VK_CONTROL);
		rb14.keyPress(KeyEvent.VK_V);
		rb14.keyRelease(KeyEvent.VK_CONTROL);
		rb14.keyRelease(KeyEvent.VK_V);
		rb14.keyPress(KeyEvent.VK_ENTER);
		rb14.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we14 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("GADRE ENGINEERING SERVICE :" + we14.getText());
		Thread.sleep(1000);

		// SELECT DEALER GAUTAM ENGINEERING COMPAN

		driver.findElement(By.xpath("//option[text()=\"GAUTAM ENGINEERING COMPAN\"]")).click();

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

		Robot rb15 = new Robot();
		rb15.delay(1000);

		StringSelection ss15 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\GAUTAM ENGINEERING COMPAN.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss15, null);
		rb15.keyPress(KeyEvent.VK_CONTROL);
		rb15.keyPress(KeyEvent.VK_V);
		rb15.keyRelease(KeyEvent.VK_CONTROL);
		rb15.keyRelease(KeyEvent.VK_V);
		rb15.keyPress(KeyEvent.VK_ENTER);
		rb15.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we15 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("GAUTAM ENGINEERING COMPAN :" + we15.getText());
		Thread.sleep(1000);

		// SELECT DEALER GOLD FIELDS

		driver.findElement(By.xpath("//option[text()=\"GOLD FIELDS\"]")).click();

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

		Robot rb16 = new Robot();
		rb16.delay(1000);

		StringSelection ss16 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\GOLD FIELDS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss16, null);
		rb16.keyPress(KeyEvent.VK_CONTROL);
		rb16.keyPress(KeyEvent.VK_V);
		rb16.keyRelease(KeyEvent.VK_CONTROL);
		rb16.keyRelease(KeyEvent.VK_V);
		rb16.keyPress(KeyEvent.VK_ENTER);
		rb16.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we16 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("GOLD FIELDS :" + we16.getText());
		Thread.sleep(1000);

		// SELECT DEALER JAYARAJ AUTOMOBILE AGENCY

		driver.findElement(By.xpath("//option[text()=\"JAYARAJ AUTOMOBILE AGENCY\"]")).click();

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

		Robot rb17 = new Robot();
		rb17.delay(1000);

		StringSelection ss17 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\JAYARAJ AUTOMOBILE AGENCY.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss17, null);
		rb17.keyPress(KeyEvent.VK_CONTROL);
		rb17.keyPress(KeyEvent.VK_V);
		rb17.keyRelease(KeyEvent.VK_CONTROL);
		rb17.keyRelease(KeyEvent.VK_V);
		rb17.keyPress(KeyEvent.VK_ENTER);
		rb17.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we17 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("JAYARAJ AUTOMOBILE AGENCY :" + we17.getText());
		Thread.sleep(1000);

		// SELECT DEALER Jitendra Equipment

		driver.findElement(By.xpath("//option[text()=\"Jitendra Equipment\"]")).click();

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

		Robot rb18 = new Robot();
		rb18.delay(1000);

		StringSelection ss18 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Jitendra Equipment.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss18, null);
		rb18.keyPress(KeyEvent.VK_CONTROL);
		rb18.keyPress(KeyEvent.VK_V);
		rb18.keyRelease(KeyEvent.VK_CONTROL);
		rb18.keyRelease(KeyEvent.VK_V);
		rb18.keyPress(KeyEvent.VK_ENTER);
		rb18.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we18 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Jitendra Equipment :" + we18.getText());
		Thread.sleep(1000);

		// SELECT DEALER Kadoor sales corporation

		driver.findElement(By.xpath("//option[text()=\"Kadoor sales corporation\"]")).click();

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

		Robot rb19 = new Robot();
		rb19.delay(1000);

		StringSelection ss19 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Kadoor sales corporation.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss19, null);
		rb19.keyPress(KeyEvent.VK_CONTROL);
		rb19.keyPress(KeyEvent.VK_V);
		rb19.keyRelease(KeyEvent.VK_CONTROL);
		rb19.keyRelease(KeyEvent.VK_V);
		rb19.keyPress(KeyEvent.VK_ENTER);
		rb19.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we19 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Kadoor sales corporation :" + we19.getText());
		Thread.sleep(1000);

		// SELECT DEALER KALINGA AUTOMOBILES PVT L

		driver.findElement(By.xpath("//option[text()=\"KALINGA AUTOMOBILES PVT L\"]")).click();

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

		Robot rb20 = new Robot();
		rb20.delay(1000);

		StringSelection ss20 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\KALINGA AUTOMOBILES PVT L.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss20, null);
		rb20.keyPress(KeyEvent.VK_CONTROL);
		rb20.keyPress(KeyEvent.VK_V);
		rb20.keyRelease(KeyEvent.VK_CONTROL);
		rb20.keyRelease(KeyEvent.VK_V);
		rb20.keyPress(KeyEvent.VK_ENTER);
		rb20.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we20 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("KALINGA AUTOMOBILES PVT L :" + we20.getText());
		Thread.sleep(1000);

		// SELECT DEALER KRISHNA AUTO RIDERS PVT LTD

		driver.findElement(By.xpath("//option[text()=\"KRISHNA AUTO RIDERS PVT LTD\"]")).click();

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

		Robot rb21 = new Robot();
		rb21.delay(1000);

		StringSelection ss21 = new StringSelection(
				"C:\\Users\\Admin\\Desktop\\jcbstk\\KRISHNA AUTO RIDERS PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss21, null);
		rb21.keyPress(KeyEvent.VK_CONTROL);
		rb21.keyPress(KeyEvent.VK_V);
		rb21.keyRelease(KeyEvent.VK_CONTROL);
		rb21.keyRelease(KeyEvent.VK_V);
		rb21.keyPress(KeyEvent.VK_ENTER);
		rb21.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we21 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("KRISHNA AUTO RIDERS PVT LTD :" + we21.getText());
		Thread.sleep(1000);

		// SELECT DEALER Krishna Automobiles

		driver.findElement(By.xpath("//option[text()=\"Krishna Automobiles\"]")).click();

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

		Robot rb22 = new Robot();
		rb22.delay(1000);

		StringSelection ss22 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Krishna Automobiles.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss22, null);
		rb22.keyPress(KeyEvent.VK_CONTROL);
		rb22.keyPress(KeyEvent.VK_V);
		rb22.keyRelease(KeyEvent.VK_CONTROL);
		rb22.keyRelease(KeyEvent.VK_V);
		rb22.keyPress(KeyEvent.VK_ENTER);
		rb22.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we22 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Krishna Automobiles :" + we22.getText());
		Thread.sleep(1000);

		// SELECT DEALER LEO EARTHMOVERS PVT LIMIT

		driver.findElement(By.xpath("//option[text()=\"LEO EARTHMOVERS PVT LIMIT\"]")).click();

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

		Robot rb23 = new Robot();
		rb23.delay(1000);

		StringSelection ss23 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\LEO EARTHMOVERS PVT LIMIT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss23, null);
		rb23.keyPress(KeyEvent.VK_CONTROL);
		rb23.keyPress(KeyEvent.VK_V);
		rb23.keyRelease(KeyEvent.VK_CONTROL);
		rb23.keyRelease(KeyEvent.VK_V);
		rb23.keyPress(KeyEvent.VK_ENTER);
		rb23.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we23 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("LEO EARTHMOVERS PVT LIMIT :" + we23.getText());
		Thread.sleep(1000);

		// SELECT DEALER Mayank Equipments

		driver.findElement(By.xpath("//option[text()=\"Mayank Equipments\"]")).click();

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

		Robot rb24 = new Robot();
		rb24.delay(1000);

		StringSelection ss24 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Mayank Equipments.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss24, null);
		rb24.keyPress(KeyEvent.VK_CONTROL);
		rb24.keyPress(KeyEvent.VK_V);
		rb24.keyRelease(KeyEvent.VK_CONTROL);
		rb24.keyRelease(KeyEvent.VK_V);
		rb24.keyPress(KeyEvent.VK_ENTER);
		rb24.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we24 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Mayank Equipments :" + we24.getText());
		Thread.sleep(1000);

		// SELECT DEALER MGB MOTOR & AUTO AGENCIES

		driver.findElement(By.xpath("//option[text()=\"MGB MOTOR & AUTO AGENCIES\"]")).click();

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

		Robot rb25 = new Robot();
		rb25.delay(1000);

		StringSelection ss25 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\MGB MOTOR & AUTO AGENCIES.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss25, null);
		rb25.keyPress(KeyEvent.VK_CONTROL);
		rb25.keyPress(KeyEvent.VK_V);
		rb25.keyRelease(KeyEvent.VK_CONTROL);
		rb25.keyRelease(KeyEvent.VK_V);
		rb25.keyPress(KeyEvent.VK_ENTER);
		rb25.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we25 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("MGB MOTOR & AUTO AGENCIES :" + we25.getText());
		Thread.sleep(1000);

		// SELECT DEALER Mohan Earthmovers

		driver.findElement(By.xpath("//option[text()=\"Mohan Earthmovers\"]")).click();

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

		Robot rb26 = new Robot();
		rb26.delay(1000);

		StringSelection ss26 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Mohan Earthmovers.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss26, null);
		rb26.keyPress(KeyEvent.VK_CONTROL);
		rb26.keyPress(KeyEvent.VK_V);
		rb26.keyRelease(KeyEvent.VK_CONTROL);
		rb26.keyRelease(KeyEvent.VK_V);
		rb26.keyPress(KeyEvent.VK_ENTER);
		rb26.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we26 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Mohan Earthmovers :" + we26.getText());
		Thread.sleep(1000);

		// SELECT DEALER NATRAJ MOBILES PVT LTD

		driver.findElement(By.xpath("//option[text()=\"NATRAJ MOBILES PVT LTD\"]")).click();

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

		Robot rb27 = new Robot();
		rb27.delay(1000);

		StringSelection ss27 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\NATRAJ MOBILES PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss27, null);
		rb27.keyPress(KeyEvent.VK_CONTROL);
		rb27.keyPress(KeyEvent.VK_V);
		rb27.keyRelease(KeyEvent.VK_CONTROL);
		rb27.keyRelease(KeyEvent.VK_V);
		rb27.keyPress(KeyEvent.VK_ENTER);
		rb27.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we27 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("NATRAJ MOBILES PVT LTD :" + we27.getText());
		Thread.sleep(1000);

		// SELECT DEALER OJA AUTOMOBLIES PVT. LTD

		driver.findElement(By.xpath("//option[text()=\"OJA AUTOMOBLIES PVT. LTD\"]")).click();

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

		Robot rb28 = new Robot();
		rb28.delay(1000);

		StringSelection ss28 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\OJA AUTOMOBLIES PVT. LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss28, null);
		rb28.keyPress(KeyEvent.VK_CONTROL);
		rb28.keyPress(KeyEvent.VK_V);
		rb28.keyRelease(KeyEvent.VK_CONTROL);
		rb28.keyRelease(KeyEvent.VK_V);
		rb28.keyPress(KeyEvent.VK_ENTER);
		rb28.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we28 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("OJA AUTOMOBLIES PVT. LTD :" + we28.getText());
		Thread.sleep(1000);

		// SELECT DEALER P R NAYAK ASSOCIATES PVT LTD

		driver.findElement(By.xpath("//option[text()=\"P R NAYAK ASSOCIATES PVT LTD\"]")).click();

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

		Robot rb29 = new Robot();
		rb29.delay(1000);

		StringSelection ss29 = new StringSelection(
				"C:\\Users\\Admin\\Desktop\\jcbstk\\P R NAYAK ASSOCIATES PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss29, null);
		rb29.keyPress(KeyEvent.VK_CONTROL);
		rb29.keyPress(KeyEvent.VK_V);
		rb29.keyRelease(KeyEvent.VK_CONTROL);
		rb29.keyRelease(KeyEvent.VK_V);
		rb29.keyPress(KeyEvent.VK_ENTER);
		rb29.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we29 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("P R NAYAK ASSOCIATES PVT LTD :" + we29.getText());
		Thread.sleep(1000);

		// SELECT DEALER PATLIPUTRA EQUIPMENTS PVT

		driver.findElement(By.xpath("//option[text()=\"PATLIPUTRA EQUIPMENTS PVT\"]")).click();

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

		Robot rb30 = new Robot();
		rb30.delay(1000);

		StringSelection ss30 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\PATLIPUTRA EQUIPMENTS PVT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss30, null);
		rb30.keyPress(KeyEvent.VK_CONTROL);
		rb30.keyPress(KeyEvent.VK_V);
		rb30.keyRelease(KeyEvent.VK_CONTROL);
		rb30.keyRelease(KeyEvent.VK_V);
		rb30.keyPress(KeyEvent.VK_ENTER);
		rb30.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we30 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("PATLIPUTRA EQUIPMENTS PVT :" + we30.getText());
		Thread.sleep(1000);

		// SELECT DEALER PODDER & PODDER EQUP & PR

		driver.findElement(By.xpath("//option[text()=\"PODDER & PODDER EQUP & PR\"]")).click();

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

		Robot rb31 = new Robot();
		rb31.delay(1000);

		StringSelection ss31 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\PODDER & PODDER EQUP & PR.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss31, null);
		rb31.keyPress(KeyEvent.VK_CONTROL);
		rb31.keyPress(KeyEvent.VK_V);
		rb31.keyRelease(KeyEvent.VK_CONTROL);
		rb31.keyRelease(KeyEvent.VK_V);
		rb31.keyPress(KeyEvent.VK_ENTER);
		rb31.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we31 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("PODDER & PODDER EQUP & PR :" + we31.getText());
		Thread.sleep(1000);

		// SELECT DEALER POPULAR MOTOR CORPORATION

		driver.findElement(By.xpath("//option[text()=\"POPULAR MOTOR CORPORATION\"]")).click();

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

		Robot rb32 = new Robot();
		rb32.delay(1000);

		StringSelection ss32 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\POPULAR MOTOR CORPORATION.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss32, null);
		rb32.keyPress(KeyEvent.VK_CONTROL);
		rb32.keyPress(KeyEvent.VK_V);
		rb32.keyRelease(KeyEvent.VK_CONTROL);
		rb32.keyRelease(KeyEvent.VK_V);
		rb32.keyPress(KeyEvent.VK_ENTER);
		rb32.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we32 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("POPULAR MOTOR CORPORATION :" + we32.getText());
		Thread.sleep(1000);

		// SELECT DEALER Prem JCB

		driver.findElement(By.xpath("//option[text()=\"Prem JCB\"]")).click();

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

		Robot rb33 = new Robot();
		rb33.delay(1000);

		StringSelection ss33 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Prem JCB.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss33, null);
		rb33.keyPress(KeyEvent.VK_CONTROL);
		rb33.keyPress(KeyEvent.VK_V);
		rb33.keyRelease(KeyEvent.VK_CONTROL);
		rb33.keyRelease(KeyEvent.VK_V);
		rb33.keyPress(KeyEvent.VK_ENTER);
		rb33.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we33 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Prem JCB :" + we33.getText());
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

		// SELECT DEALER RAJ SONS AUTO Pvt Ltd

		driver.findElement(By.xpath("//option[text()=\"RAJ SONS AUTO Pvt Ltd\"]")).click();

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

		Robot rb35 = new Robot();
		rb35.delay(1000);

		StringSelection ss35 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\RAJ SONS AUTO Pvt Ltd.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss35, null);
		rb35.keyPress(KeyEvent.VK_CONTROL);
		rb35.keyPress(KeyEvent.VK_V);
		rb35.keyRelease(KeyEvent.VK_CONTROL);
		rb35.keyRelease(KeyEvent.VK_V);
		rb35.keyPress(KeyEvent.VK_ENTER);
		rb35.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we35 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("RAJ SONS AUTO Pvt Ltd :" + we35.getText());
		Thread.sleep(1000);

		// SELECT DEALER Rajesh Motors

		driver.findElement(By.xpath("//option[text()=\"Rajesh Motors\"]")).click();

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

		Robot rb36 = new Robot();
		rb36.delay(1000);

		StringSelection ss36 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Rajesh Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss36, null);
		rb36.keyPress(KeyEvent.VK_CONTROL);
		rb36.keyPress(KeyEvent.VK_V);
		rb36.keyRelease(KeyEvent.VK_CONTROL);
		rb36.keyRelease(KeyEvent.VK_V);
		rb36.keyPress(KeyEvent.VK_ENTER);
		rb36.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we36 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Rajesh Motors :" + we36.getText());
		Thread.sleep(1000);

		// SELECT DEALER Ratna Prabha Motors

		driver.findElement(By.xpath("//option[text()=\"Ratna Prabha Motors\"]")).click();

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

		Robot rb37 = new Robot();
		rb37.delay(1000);

		StringSelection ss37 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Ratna Prabha Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss37, null);
		rb37.keyPress(KeyEvent.VK_CONTROL);
		rb37.keyPress(KeyEvent.VK_V);
		rb37.keyRelease(KeyEvent.VK_CONTROL);
		rb37.keyRelease(KeyEvent.VK_V);
		rb37.keyPress(KeyEvent.VK_ENTER);
		rb37.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we37 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Ratna Prabha Motors :" + we37.getText());
		Thread.sleep(1000);

		// SELECT DEALER RNS EARTH MOVERS PVT LTD

		driver.findElement(By.xpath("//option[text()=\"RNS EARTH MOVERS PVT LTD\"]")).click();

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

		Robot rb38 = new Robot();
		rb38.delay(1000);

		StringSelection ss38 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\RNS EARTH MOVERS PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss38, null);
		rb38.keyPress(KeyEvent.VK_CONTROL);
		rb38.keyPress(KeyEvent.VK_V);
		rb38.keyRelease(KeyEvent.VK_CONTROL);
		rb38.keyRelease(KeyEvent.VK_V);
		rb38.keyPress(KeyEvent.VK_ENTER);
		rb38.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we38 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("RNS EARTH MOVERS PVT LTD :" + we38.getText());
		Thread.sleep(1000);

		// SELECT DEALER SAINI EARTH MOVERS

		driver.findElement(By.xpath("//option[text()=\"SAINI EARTH MOVERS\"]")).click();

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

		Robot rb39 = new Robot();
		rb39.delay(1000);

		StringSelection ss39 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SAINI EARTH MOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss39, null);
		rb39.keyPress(KeyEvent.VK_CONTROL);
		rb39.keyPress(KeyEvent.VK_V);
		rb39.keyRelease(KeyEvent.VK_CONTROL);
		rb39.keyRelease(KeyEvent.VK_V);
		rb39.keyPress(KeyEvent.VK_ENTER);
		rb39.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we39 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SAINI EARTH MOVERS :" + we39.getText());
		Thread.sleep(1000);

		// SELECT DEALER SAMAL EQUIP

		driver.findElement(By.xpath("//option[text()=\"SAMAL EQUIP\"]")).click();

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

		Robot rb40 = new Robot();
		rb40.delay(1000);

		StringSelection ss40 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SAMAL EQUIP.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss40, null);
		rb40.keyPress(KeyEvent.VK_CONTROL);
		rb40.keyPress(KeyEvent.VK_V);
		rb40.keyRelease(KeyEvent.VK_CONTROL);
		rb40.keyRelease(KeyEvent.VK_V);
		rb40.keyPress(KeyEvent.VK_ENTER);
		rb40.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we40 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SAMAL EQUIP :" + we40.getText());
		Thread.sleep(1000);

		// SELECT DEALER SHAKTI EARTHMOVERS LLP

		driver.findElement(By.xpath("//option[text()=\"SHAKTI EARTHMOVERS LLP\"]")).click();

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

		Robot rb41 = new Robot();
		rb41.delay(1000);

		StringSelection ss41 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SHAKTI EARTHMOVERS LLP.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss41, null);
		rb41.keyPress(KeyEvent.VK_CONTROL);
		rb41.keyPress(KeyEvent.VK_V);
		rb41.keyRelease(KeyEvent.VK_CONTROL);
		rb41.keyRelease(KeyEvent.VK_V);
		rb41.keyPress(KeyEvent.VK_ENTER);
		rb41.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we41 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SHAKTI EARTHMOVERS LLP :" + we41.getText());
		Thread.sleep(1000);

		// SELECT DEALER SHANTI AUTOMOTIVES INDIA PVT LTD

		driver.findElement(By.xpath("//option[text()=\"SHANTI AUTOMOTIVES INDIA PVT LTD\"]")).click();

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

		Robot rb42 = new Robot();
		rb42.delay(1000);

		StringSelection ss42 = new StringSelection(
				"C:\\Users\\Admin\\Desktop\\jcbstk\\SHANTI AUTOMOTIVES INDIA PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss42, null);
		rb42.keyPress(KeyEvent.VK_CONTROL);
		rb42.keyPress(KeyEvent.VK_V);
		rb42.keyRelease(KeyEvent.VK_CONTROL);
		rb42.keyRelease(KeyEvent.VK_V);
		rb42.keyPress(KeyEvent.VK_ENTER);
		rb42.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we42 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SHANTI AUTOMOTIVES INDIA PVT LTD :" + we42.getText());
		Thread.sleep(1000);

		// SELECT DEALER Shantinath jcb

		driver.findElement(By.xpath("//option[text()=\"SHANTINATH MOTORS PVT LTD\"]")).click();

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

		Robot rb43 = new Robot();
		rb43.delay(1000);

		StringSelection ss43 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SHANTINATH MOTORS PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss43, null);
		rb43.keyPress(KeyEvent.VK_CONTROL);
		rb43.keyPress(KeyEvent.VK_V);
		rb43.keyRelease(KeyEvent.VK_CONTROL);
		rb43.keyRelease(KeyEvent.VK_V);
		rb43.keyPress(KeyEvent.VK_ENTER);
		rb43.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we43 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Shantinath jcb :" + we43.getText());
		Thread.sleep(1000);

		// SELECT DEALER SIDDHARTH AUTO ENGINEERS

		driver.findElement(By.xpath("//option[text()=\"SIDDHARTH AUTO ENGINEERS\"]")).click();

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

		Robot rb44 = new Robot();
		rb44.delay(1000);

		StringSelection ss44 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SIDDHARTH AUTO ENGINEERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss44, null);
		rb44.keyPress(KeyEvent.VK_CONTROL);
		rb44.keyPress(KeyEvent.VK_V);
		rb44.keyRelease(KeyEvent.VK_CONTROL);
		rb44.keyRelease(KeyEvent.VK_V);
		rb44.keyPress(KeyEvent.VK_ENTER);
		rb44.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
//
//// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we44 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SIDDHARTH AUTO ENGINEERS :" + we44.getText());
		Thread.sleep(1000);

		// SELECT DEALER Sri Sai Earthmovers

		driver.findElement(By.xpath("//option[text()=\"Sri Sai Earthmovers\"]")).click();

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

		Robot rb45 = new Robot();
		rb45.delay(1000);

		StringSelection ss45 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Sri Sai Earthmovers.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss45, null);
		rb45.keyPress(KeyEvent.VK_CONTROL);
		rb45.keyPress(KeyEvent.VK_V);
		rb45.keyRelease(KeyEvent.VK_CONTROL);
		rb45.keyRelease(KeyEvent.VK_V);
		rb45.keyPress(KeyEvent.VK_ENTER);
		rb45.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we45 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Sri Sai Earthmovers :" + we45.getText());
		Thread.sleep(1000);

		// SELECT DEALER SUMEDHA VEHICLES PVT LTD

		driver.findElement(By.xpath("//option[text()=\"SUMEDHA VEHICLES PVT LTD\"]")).click();

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

		Robot rb46 = new Robot();
		rb46.delay(1000);

		StringSelection ss46 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SUMEDHA VEHICLES PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss46, null);
		rb46.keyPress(KeyEvent.VK_CONTROL);
		rb46.keyPress(KeyEvent.VK_V);
		rb46.keyRelease(KeyEvent.VK_CONTROL);
		rb46.keyRelease(KeyEvent.VK_V);
		rb46.keyPress(KeyEvent.VK_ENTER);
		rb46.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we46 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SUMEDHA VEHICLES PVT LTD :" + we46.getText());
		Thread.sleep(1000);

		// SELECT DEALER SUMEET EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"SUMEET EARTHMOVERS\"]")).click();

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

		Robot rb47 = new Robot();
		rb47.delay(1000);

		StringSelection ss47 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SUMEET EARTHMOVERS,.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss47, null);
		rb47.keyPress(KeyEvent.VK_CONTROL);
		rb47.keyPress(KeyEvent.VK_V);
		rb47.keyRelease(KeyEvent.VK_CONTROL);
		rb47.keyRelease(KeyEvent.VK_V);
		rb47.keyPress(KeyEvent.VK_ENTER);
		rb47.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we47 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SUMEET EARTHMOVERS :" + we47.getText());
		Thread.sleep(1000);

		// SELECT DEALER SURYABALA EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"SURYABALA EARTHMOVERS\"]")).click();

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

		Robot rb48 = new Robot();
		rb48.delay(1000);

		StringSelection ss48 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SURYABALA EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss48, null);
		rb48.keyPress(KeyEvent.VK_CONTROL);
		rb48.keyPress(KeyEvent.VK_V);
		rb48.keyRelease(KeyEvent.VK_CONTROL);
		rb48.keyRelease(KeyEvent.VK_V);
		rb48.keyPress(KeyEvent.VK_ENTER);
		rb48.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we48 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SURYABALA EARTHMOVERS :" + we48.getText());
		Thread.sleep(1000);

		// SELECT DEALER SUYAAN INFRASTRUCTURE PVT

		driver.findElement(By.xpath("//option[text()=\"SUYAAN INFRASTRUCTURE PVT\"]")).click();

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

		Robot rb49 = new Robot();
		rb49.delay(1000);

		StringSelection ss49 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SUYAAN INFRASTRUCTURE PVT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss49, null);
		rb49.keyPress(KeyEvent.VK_CONTROL);
		rb49.keyPress(KeyEvent.VK_V);
		rb49.keyRelease(KeyEvent.VK_CONTROL);
		rb49.keyRelease(KeyEvent.VK_V);
		rb49.keyPress(KeyEvent.VK_ENTER);
		rb49.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we49 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("SUYAAN INFRASTRUCTURE PVT :" + we49.getText());
		Thread.sleep(1000);

		// SELECT DEALER TRADEWINGS EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"TRADEWINGS EARTHMOVERS\"]")).click();

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

		Robot rb50 = new Robot();
		rb50.delay(1000);

		StringSelection ss50 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\TRADEWINGS EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss50, null);
		rb50.keyPress(KeyEvent.VK_CONTROL);
		rb50.keyPress(KeyEvent.VK_V);
		rb50.keyRelease(KeyEvent.VK_CONTROL);
		rb50.keyRelease(KeyEvent.VK_V);
		rb50.keyPress(KeyEvent.VK_ENTER);
		rb50.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we50 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("TRADEWINGS EARTHMOVERS :" + we50.getText());
		Thread.sleep(1000);

		// SELECT DEALER TRR Automotive

		driver.findElement(By.xpath("//option[text()=\"TRR Automotive\"]")).click();

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

		Robot rb51 = new Robot();
		rb51.delay(1000);

		StringSelection ss51 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\TRR Automotive.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss51, null);
		rb51.keyPress(KeyEvent.VK_CONTROL);
		rb51.keyPress(KeyEvent.VK_V);
		rb51.keyRelease(KeyEvent.VK_CONTROL);
		rb51.keyRelease(KeyEvent.VK_V);
		rb51.keyPress(KeyEvent.VK_ENTER);
		rb51.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we51 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("TRR Automotive :" + we51.getText());
		Thread.sleep(1000);

		// SELECT DEALER Varun Motors

		driver.findElement(By.xpath("//option[text()=\"Varun Motors\"]")).click();

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

		Robot rb52 = new Robot();
		rb52.delay(1000);

		StringSelection ss52 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Varun Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss52, null);
		rb52.keyPress(KeyEvent.VK_CONTROL);
		rb52.keyPress(KeyEvent.VK_V);
		rb52.keyRelease(KeyEvent.VK_CONTROL);
		rb52.keyRelease(KeyEvent.VK_V);
		rb52.keyPress(KeyEvent.VK_ENTER);
		rb52.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we52 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Varun Motors :" + we52.getText());
		Thread.sleep(1000);

		// SELECT DEALER YANTRAMAN AUTOMAC PVT LT

		driver.findElement(By.xpath("//option[text()=\"YANTRAMAN  AUTOMAC PVT LT\"]")).click();

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

		Robot rb53 = new Robot();
		rb53.delay(1000);

		StringSelection ss53 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\YANTRAMAN  AUTOMAC PVT LT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss53, null);
		rb53.keyPress(KeyEvent.VK_CONTROL);
		rb53.keyPress(KeyEvent.VK_V);
		rb53.keyRelease(KeyEvent.VK_CONTROL);
		rb53.keyRelease(KeyEvent.VK_V);
		rb53.keyPress(KeyEvent.VK_ENTER);
		rb53.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we53 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("YANTRAMAN AUTOMAC PVT LT :" + we53.getText());
		Thread.sleep(10000);
		driver.close();

	}
}