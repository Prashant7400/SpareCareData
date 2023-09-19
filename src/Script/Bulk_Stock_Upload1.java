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

public class Bulk_Stock_Upload1 {
	
	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		

		driver.findElement(By.xpath("//*[@id=\"tbx_UserName\"]")).sendKeys("DatUpl");
		driver.findElement(By.xpath("//*[@id=\"tbx_Password\"]")).sendKeys("Uploader!@#321");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li/ul/li[12]/a/span")).click();

		// SELECT BRAND

		driver.findElement(By.xpath("//option[text()=\"JCB\"]")).click();
		

		  // SELECT DEALER

		  driver.findElement(By.xpath("//option[text()=\"A & A EARTHMOVERS PRIVATE\"]")).click();

		  // SELECT STOCK DATE

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
		  
		  // SUBMIT

		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("A & A EARTHMOVERS PRIVATE  :" +we.getText());
		  Thread.sleep(20000);
		  
		  
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
		  Thread.sleep(20000);
		  
		  
		  
		// SELECT DEALER Alliance jcb

		  driver.findElement(By.xpath("//option[text()=\"Alliance jcb\"]")).click();

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

		  StringSelection ss2 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
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
		  System.out.println("Advaith Motors  :" +we2.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb3.delay(2000);
		 
		  StringSelection ss3 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
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
		  System.out.println("Advaith Motors :" +we3.getText());
		  Thread.sleep(20000);
		  
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
		  rb4.delay(2000);
		 
		  StringSelection ss4 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
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
		  System.out.println("Advaith Motors :" +we4.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb5.delay(2000);
		 
		  StringSelection ss5 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);
		  rb5.keyPress(KeyEvent.VK_CONTROL);
		  rb5.keyPress(KeyEvent.VK_V);
		  rb5.keyRelease(KeyEvent.VK_CONTROL);
		  rb5.keyRelease(KeyEvent.VK_V);
		  rb5.keyPress(KeyEvent.VK_ENTER);
		  rb5.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we5 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we5.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb6.delay(2000);
		 
		  StringSelection ss6 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);
		  rb6.keyPress(KeyEvent.VK_CONTROL);
		  rb6.keyPress(KeyEvent.VK_V);
		  rb6.keyRelease(KeyEvent.VK_CONTROL);
		  rb6.keyRelease(KeyEvent.VK_V);
		  rb6.keyPress(KeyEvent.VK_ENTER);
		  rb6.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we6 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we6.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb7.delay(2000);
		 
		  StringSelection ss7 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss7, null);
		  rb7.keyPress(KeyEvent.VK_CONTROL);
		  rb7.keyPress(KeyEvent.VK_V);
		  rb7.keyRelease(KeyEvent.VK_CONTROL);
		  rb7.keyRelease(KeyEvent.VK_V);
		  rb7.keyPress(KeyEvent.VK_ENTER);
		  rb7.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we7 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we7.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb8.delay(2000);
		 
		  StringSelection ss8 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss8, null);
		  rb8.keyPress(KeyEvent.VK_CONTROL);
		  rb8.keyPress(KeyEvent.VK_V);
		  rb8.keyRelease(KeyEvent.VK_CONTROL);
		  rb8.keyRelease(KeyEvent.VK_V);
		  rb8.keyPress(KeyEvent.VK_ENTER);
		  rb8.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we8 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we8.getText());
		  Thread.sleep(20000);
		  
		  
		// SELECT DEALER Dada Earthmovers
		  
		  driver.findElement(By.xpath("//option[text()=\"Dada Earthmovers\"]")).click();
		 
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
		  rb9.delay(2000);
		 
		  StringSelection ss9 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss9, null);
		  rb9.keyPress(KeyEvent.VK_CONTROL);
		  rb9.keyPress(KeyEvent.VK_V);
		  rb9.keyRelease(KeyEvent.VK_CONTROL);
		  rb9.keyRelease(KeyEvent.VK_V);
		  rb9.keyPress(KeyEvent.VK_ENTER);
		  rb9.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we9 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we9.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb10.delay(2000);
		 
		  StringSelection ss10 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss10, null);
		  rb10.keyPress(KeyEvent.VK_CONTROL);
		  rb10.keyPress(KeyEvent.VK_V);
		  rb10.keyRelease(KeyEvent.VK_CONTROL);
		  rb10.keyRelease(KeyEvent.VK_V);
		  rb10.keyPress(KeyEvent.VK_ENTER);
		  rb10.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we10 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we10.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb11.delay(2000);
		 
		  StringSelection ss11 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss11, null);
		  rb11.keyPress(KeyEvent.VK_CONTROL);
		  rb11.keyPress(KeyEvent.VK_V);
		  rb11.keyRelease(KeyEvent.VK_CONTROL);
		  rb11.keyRelease(KeyEvent.VK_V);
		  rb11.keyPress(KeyEvent.VK_ENTER);
		  rb11.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we11 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we11.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb12.delay(2000);
		 
		  StringSelection ss12 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss12, null);
		  rb12.keyPress(KeyEvent.VK_CONTROL);
		  rb12.keyPress(KeyEvent.VK_V);
		  rb12.keyRelease(KeyEvent.VK_CONTROL);
		  rb12.keyRelease(KeyEvent.VK_V);
		  rb12.keyPress(KeyEvent.VK_ENTER);
		  rb12.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we12 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we12.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb13.delay(2000);
		 
		  StringSelection ss13 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss13, null);
		  rb13.keyPress(KeyEvent.VK_CONTROL);
		  rb13.keyPress(KeyEvent.VK_V);
		  rb13.keyRelease(KeyEvent.VK_CONTROL);
		  rb13.keyRelease(KeyEvent.VK_V);
		  rb13.keyPress(KeyEvent.VK_ENTER);
		  rb13.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we13 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we13.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb14.delay(2000);
		 
		  StringSelection ss14 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss14, null);
		  rb14.keyPress(KeyEvent.VK_CONTROL);
		  rb14.keyPress(KeyEvent.VK_V);
		  rb14.keyRelease(KeyEvent.VK_CONTROL);
		  rb14.keyRelease(KeyEvent.VK_V);
		  rb14.keyPress(KeyEvent.VK_ENTER);
		  rb14.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we14 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we14.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb15.delay(2000);
		 
		  StringSelection ss15 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss15, null);
		  rb15.keyPress(KeyEvent.VK_CONTROL);
		  rb15.keyPress(KeyEvent.VK_V);
		  rb15.keyRelease(KeyEvent.VK_CONTROL);
		  rb15.keyRelease(KeyEvent.VK_V);
		  rb15.keyPress(KeyEvent.VK_ENTER);
		  rb15.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we15 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we15.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb16.delay(2000);
		 
		  StringSelection ss16 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss16, null);
		  rb16.keyPress(KeyEvent.VK_CONTROL);
		  rb16.keyPress(KeyEvent.VK_V);
		  rb16.keyRelease(KeyEvent.VK_CONTROL);
		  rb16.keyRelease(KeyEvent.VK_V);
		  rb16.keyPress(KeyEvent.VK_ENTER);
		  rb16.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we16 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we16.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb17.delay(2000);
		 
		  StringSelection ss17 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss17, null);
		  rb17.keyPress(KeyEvent.VK_CONTROL);
		  rb17.keyPress(KeyEvent.VK_V);
		  rb17.keyRelease(KeyEvent.VK_CONTROL);
		  rb17.keyRelease(KeyEvent.VK_V);
		  rb17.keyPress(KeyEvent.VK_ENTER);
		  rb17.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we17 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we17.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb18.delay(2000);
		 
		  StringSelection ss18 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss18, null);
		  rb18.keyPress(KeyEvent.VK_CONTROL);
		  rb18.keyPress(KeyEvent.VK_V);
		  rb18.keyRelease(KeyEvent.VK_CONTROL);
		  rb18.keyRelease(KeyEvent.VK_V);
		  rb18.keyPress(KeyEvent.VK_ENTER);
		  rb18.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we18 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we18.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb19.delay(2000);
		 
		  StringSelection ss19 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss19, null);
		  rb19.keyPress(KeyEvent.VK_CONTROL);
		  rb19.keyPress(KeyEvent.VK_V);
		  rb19.keyRelease(KeyEvent.VK_CONTROL);
		  rb19.keyRelease(KeyEvent.VK_V);
		  rb19.keyPress(KeyEvent.VK_ENTER);
		  rb19.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we19 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we19.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb20.delay(2000);
		 
		  StringSelection ss20 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss20, null);
		  rb20.keyPress(KeyEvent.VK_CONTROL);
		  rb20.keyPress(KeyEvent.VK_V);
		  rb20.keyRelease(KeyEvent.VK_CONTROL);
		  rb20.keyRelease(KeyEvent.VK_V);
		  rb20.keyPress(KeyEvent.VK_ENTER);
		  rb20.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we20 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we20.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb21.delay(2000);
		 
		  StringSelection ss21 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss21, null);
		  rb21.keyPress(KeyEvent.VK_CONTROL);
		  rb21.keyPress(KeyEvent.VK_V);
		  rb21.keyRelease(KeyEvent.VK_CONTROL);
		  rb21.keyRelease(KeyEvent.VK_V);
		  rb21.keyPress(KeyEvent.VK_ENTER);
		  rb21.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we21 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we21.getText());
		  Thread.sleep(20000);
		  
		  
		  
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
		  rb22.delay(2000);
		 
		  StringSelection ss22 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss22, null);
		  rb22.keyPress(KeyEvent.VK_CONTROL);
		  rb22.keyPress(KeyEvent.VK_V);
		  rb22.keyRelease(KeyEvent.VK_CONTROL);
		  rb22.keyRelease(KeyEvent.VK_V);
		  rb22.keyPress(KeyEvent.VK_ENTER);
		  rb22.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we22 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we22.getText());
		  Thread.sleep(20000);
		  
		  
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
		  rb23.delay(2000);
		 
		  StringSelection ss23 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Advaith Motors.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss23, null);
		  rb23.keyPress(KeyEvent.VK_CONTROL);
		  rb23.keyPress(KeyEvent.VK_V);
		  rb23.keyRelease(KeyEvent.VK_CONTROL);
		  rb23.keyRelease(KeyEvent.VK_V);
		  rb23.keyPress(KeyEvent.VK_ENTER);
		  rb23.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  // SUBMIT
		 
		  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		  Thread.sleep(2000);
		  WebElement we23 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		  System.out.println("Advaith Motors :" +we23.getText());
		  Thread.sleep(20000);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		

}
}
