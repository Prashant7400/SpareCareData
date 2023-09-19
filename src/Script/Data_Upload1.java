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

public class Data_Upload1 {
	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.sparecare.in/UAD_SC_WAC/Login.aspx");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();

		driver.findElement(By.xpath("//*[@id=\"tbx_UserName\"]")).sendKeys("rana");
		driver.findElement(By.xpath("//*[@id=\"tbx_Password\"]")).sendKeys("rana@0615");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[11]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[11]/ul/li[11]/a/span")).click();

		// SELECT BRAND

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlbrand\"]/option[11]")).click();
		
		
		
		
		
		
		
		

		// SELECT DEALER A & A EARTHMOVERS PRIVATE

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[2]")).click();

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
		System.out.println("A & A EARTHMOVER  :" +we.getText());
		
		// CONSOLE OUTPUT PRINT INTO NOTEPAD
		
		  PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\ConsoalResult.txt");
		  System.setOut(ps);
		  System.out.println("A & A EARTHMOVERS PRIVATE  :" +we.getText());
		
		
		// SELECT DEALER Advaith Motors

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[3]")).click();

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
		
		
		
		
		
		
		// SELECT DEALER Alliance jcb

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[4]")).click();

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
		
		
		
		// SELECT DEALER Amin Equipment 

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[5]")).click();

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
		
		
		
		// SELECT DEALER Bansal earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[6]")).click();

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
		
		
		
		// SELECT DEALER Bombay Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[7]")).click();

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

		StringSelection ss5 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\BOMBAY JCB EARTHMOVERS.xlsx");
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
		System.out.println("Bombay Earthmovers  :" +we5.getText());
		
		
		
		// SELECT DEALER Caculo JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[8]")).click();

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

		StringSelection ss6 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\CACULO EARTHMOVERS.xlsx");
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
		System.out.println("Caculo JCB  :" +we6.getText());
		
		
		
		// SELECT DEALER Continental Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[9]")).click();

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

		StringSelection ss7 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\CONTINENTAL JCB.xlsx");
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
		System.out.println("Continental Earthmovers  :" +we7.getText());
		
		
		
		// SELECT DEALER Dada Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[10]")).click();

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

		StringSelection ss8 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\DADA EARTHMOVERS.xlsx");
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
		System.out.println("Dada Earthmovers  :" +we8.getText());
		
		
		
		// SELECT DEALER DYNATECH

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[11]")).click();

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

		StringSelection ss9 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\DYNATECH.xlsx");
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
		System.out.println("DYNATECH  :" +we9.getText());
		
		
		
		
		// SELECT DEALER FRONTIER JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[12]")).click();

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

		StringSelection ss10 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\FRONTIER COMERCIAL VEHICL.xlsx");
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
		System.out.println("FRONTIER JCB  :" +we10.getText());
		
		
		
		// SELECT DEALER GADRE AUTOCON

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[13]")).click();

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

		StringSelection ss11 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\GADRE ENGINEERING SERVICE.xlsx");
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
		System.out.println("GADRE AUTOCON   :" +we11.getText());
		
		
		
		// SELECT DEALER Gautam Engineering

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[14]")).click();

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

		StringSelection ss12 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\GAUTAM ENGINEERING COMPAN.xlsx");
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
		System.out.println("Gautam Engineering   :" +we12.getText());
		
		
		
		// SELECT DEALER GK Motors

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[15]")).click();

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

		StringSelection ss13 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\G K AUTOWHEELS PVT LTD.xlsx");
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
		System.out.println("GK Motors   :" +we13.getText());
		
		
		
		// SELECT DEALER Goldfields JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[16]")).click();

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

		StringSelection ss14 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\GOLD FIELDS.xlsx");
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
		System.out.println("Goldfields JCB    :" +we14.getText());
		
		
		
		
		// SELECT DEALER JAYARAJ JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[17]")).click();

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

		StringSelection ss15 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\JAYARAJ AUTOMOBILE AGENCY.xlsx");
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
		System.out.println("JAYARAJ JCB    :" +we15.getText());
		
		
		
		
		// SELECT DEALER Jitendra Equipment

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[18]")).click();

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

		StringSelection ss16 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\JITENDRA EQUIPMENT.xlsx");
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
		System.out.println("Jitendra Equipment    :" +we16.getText());
		
		
		
		
		// SELECT DEALER Kadoor sales corporation

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[19]")).click();

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

		StringSelection ss17 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\KADOOR SALES CORPORATION.xlsx");
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
		System.out.println("Kadoor sales corporation    :" +we17.getText());
		
		
		
		
		// SELECT DEALER Kalinga Automobiles

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[20]")).click();

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

		StringSelection ss18 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\KALINGA AUTOMOBILES PVT L.xlsx");
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
		System.out.println("Kalinga Automobiles    :" +we18.getText());
		
		
		
		
		// SELECT DEALER Krishna Auto Riders

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[21]")).click();

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

		StringSelection ss19 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\KRISHNA AUTO RIDERS PVT LTD.xlsx");
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
		System.out.println("Krishna Auto Riders    :" +we19.getText());
		
		
		
		// SELECT DEALER Krishna Automobiles

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[22]")).click();

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

		StringSelection ss20 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\KRISHNA AUTOMOBILES.xlsx");
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
		System.out.println("Krishna Automobiles    :" +we20.getText());
		
		
		
		
		// SELECT DEALER Leo Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[23]")).click();

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

		StringSelection ss21 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\LEO EARTHMOVERS PVT LIMIT.xlsx");
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
		System.out.println("Leo Earthmovers    :" +we21.getText());
		
		
		
		
		// SELECT DEALER Mayank Equipments

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[24]")).click();

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

		StringSelection ss22 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\MAYANK EQUIPMENTS.xlsx");
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
		System.out.println("Mayank Equipments    :" +we22.getText());
		
		
		
		
		// SELECT DEALER MGB Motors

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[25]")).click();

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

		StringSelection ss23 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\MGB MOTOR & AUTO AGENCIES.xlsx");
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
		System.out.println("MGB Motors    :" +we23.getText());
		
		
		
		// SELECT DEALER Mohan Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[26]")).click();

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
		rb24.delay(2000);

		StringSelection ss24 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\MOHAN EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss24, null);
		rb24.keyPress(KeyEvent.VK_CONTROL);
		rb24.keyPress(KeyEvent.VK_V);
		rb24.keyRelease(KeyEvent.VK_CONTROL);
		rb24.keyRelease(KeyEvent.VK_V);
		rb24.keyPress(KeyEvent.VK_ENTER);
		rb24.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we24 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Mohan Earthmovers    :" +we24.getText());
		
		
		
		
		// SELECT DEALER Nataraj Automobiles

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[27]")).click();

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
		rb25.delay(2000);

		StringSelection ss25 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\NATRAJ MOBILES PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss25, null);
		rb25.keyPress(KeyEvent.VK_CONTROL);
		rb25.keyPress(KeyEvent.VK_V);
		rb25.keyRelease(KeyEvent.VK_CONTROL);
		rb25.keyRelease(KeyEvent.VK_V);
		rb25.keyPress(KeyEvent.VK_ENTER);
		rb25.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we25 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Nataraj Automobiles    :" +we25.getText());
		
		
		
		// SELECT DEALER OJA Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[28]")).click();

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
		rb26.delay(2000);

		StringSelection ss26 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\OJA AUTOMOBLIES PVT. LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss26, null);
		rb26.keyPress(KeyEvent.VK_CONTROL);
		rb26.keyPress(KeyEvent.VK_V);
		rb26.keyRelease(KeyEvent.VK_CONTROL);
		rb26.keyRelease(KeyEvent.VK_V);
		rb26.keyPress(KeyEvent.VK_ENTER);
		rb26.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we26 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("OJA Earthmovers    :" +we26.getText());
		
		
		
		// SELECT DEALER Patliputra JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[29]")).click();

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
		rb27.delay(2000);

		StringSelection ss27 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\PATLIPUTRA EQUIPMENTS PVT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss27, null);
		rb27.keyPress(KeyEvent.VK_CONTROL);
		rb27.keyPress(KeyEvent.VK_V);
		rb27.keyRelease(KeyEvent.VK_CONTROL);
		rb27.keyRelease(KeyEvent.VK_V);
		rb27.keyPress(KeyEvent.VK_ENTER);
		rb27.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we27 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Patliputra JCB    :" +we27.getText());
		
		
		
		// SELECT DEALER Podder equipment

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[30]")).click();

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
		rb28.delay(2000);

		StringSelection ss28 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\PODDER & PODDER EQUP & PR.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss28, null);
		rb28.keyPress(KeyEvent.VK_CONTROL);
		rb28.keyPress(KeyEvent.VK_V);
		rb28.keyRelease(KeyEvent.VK_CONTROL);
		rb28.keyRelease(KeyEvent.VK_V);
		rb28.keyPress(KeyEvent.VK_ENTER);
		rb28.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we28 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Podder equipment    :" +we28.getText());
		
		
		
		// SELECT DEALER Popular Motors

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[31]")).click();

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
		rb29.delay(2000);

		StringSelection ss29 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\POPULAR MOTOR CORPORATION.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss29, null);
		rb29.keyPress(KeyEvent.VK_CONTROL);
		rb29.keyPress(KeyEvent.VK_V);
		rb29.keyRelease(KeyEvent.VK_CONTROL);
		rb29.keyRelease(KeyEvent.VK_V);
		rb29.keyPress(KeyEvent.VK_ENTER);
		rb29.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we29 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Popular Motors    :" +we29.getText());
		
		
		
		
		// SELECT DEALER Prem Vehicles

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[32]")).click();

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
		rb30.delay(2000);

		StringSelection ss30 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Prem JCB.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss30, null);
		rb30.keyPress(KeyEvent.VK_CONTROL);
		rb30.keyPress(KeyEvent.VK_V);
		rb30.keyRelease(KeyEvent.VK_CONTROL);
		rb30.keyRelease(KeyEvent.VK_V);
		rb30.keyPress(KeyEvent.VK_ENTER);
		rb30.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we30 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Prem Vehicles    :" +we30.getText());
		
		
		
		
		// SELECT DEALER Premsons motor jcb

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[33]")).click();

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
		rb31.delay(2000);

		StringSelection ss31 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\PREMSONS MOTOR UDYOG PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss31, null);
		rb31.keyPress(KeyEvent.VK_CONTROL);
		rb31.keyPress(KeyEvent.VK_V);
		rb31.keyRelease(KeyEvent.VK_CONTROL);
		rb31.keyRelease(KeyEvent.VK_V);
		rb31.keyPress(KeyEvent.VK_ENTER);
		rb31.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we31 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Premsons motor jcb    :" +we31.getText());
		
		
		
		// SELECT DEALER PRN Associates

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[34]")).click();

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
		rb32.delay(2000);

		StringSelection ss32 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\P R NAYAK ASSOCIATES PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss32, null);
		rb32.keyPress(KeyEvent.VK_CONTROL);
		rb32.keyPress(KeyEvent.VK_V);
		rb32.keyRelease(KeyEvent.VK_CONTROL);
		rb32.keyRelease(KeyEvent.VK_V);
		rb32.keyPress(KeyEvent.VK_ENTER);
		rb32.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we32 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("PRN Associates    :" +we32.getText());
		
		
		
		
		// SELECT DEALER Rajesh Motors

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[35]")).click();

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
		rb33.delay(2000);

		StringSelection ss33 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Rajesh Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss33, null);
		rb33.keyPress(KeyEvent.VK_CONTROL);
		rb33.keyPress(KeyEvent.VK_V);
		rb33.keyRelease(KeyEvent.VK_CONTROL);
		rb33.keyRelease(KeyEvent.VK_V);
		rb33.keyPress(KeyEvent.VK_ENTER);
		rb33.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we33 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Rajesh Motors    :" +we33.getText());
		
		
		
		// SELECT DEALER Rajesh Motors CW

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[36]")).click();

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
		rb34.delay(2000);

		StringSelection ss34 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Rajesh Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss34, null);
		rb34.keyPress(KeyEvent.VK_CONTROL);
		rb34.keyPress(KeyEvent.VK_V);
		rb34.keyRelease(KeyEvent.VK_CONTROL);
		rb34.keyRelease(KeyEvent.VK_V);
		rb34.keyPress(KeyEvent.VK_ENTER);
		rb34.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we34 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Rajesh Motors CW   :" +we34.getText());
		
		
		
		// SELECT DEALER Rajsons JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[37]")).click();

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
		rb35.delay(2000);

		StringSelection ss35 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\RAJ SONS AUTO Pvt Ltd.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss35, null);
		rb35.keyPress(KeyEvent.VK_CONTROL);
		rb35.keyPress(KeyEvent.VK_V);
		rb35.keyRelease(KeyEvent.VK_CONTROL);
		rb35.keyRelease(KeyEvent.VK_V);
		rb35.keyPress(KeyEvent.VK_ENTER);
		rb35.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we35 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Rajsons JCB   :" +we35.getText());
		
		
		
		// SELECT DEALER Ratnaprabha JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[38]")).click();

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
		rb36.delay(2000);

		StringSelection ss36 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Ratna Prabha Motors.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss36, null);
		rb36.keyPress(KeyEvent.VK_CONTROL);
		rb36.keyPress(KeyEvent.VK_V);
		rb36.keyRelease(KeyEvent.VK_CONTROL);
		rb36.keyRelease(KeyEvent.VK_V);
		rb36.keyPress(KeyEvent.VK_ENTER);
		rb36.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we36 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Ratnaprabha JCB   :" +we36.getText());
		
		
		
		// SELECT DEALER RNS Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[39]")).click();

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
		rb37.delay(2000);

		StringSelection ss37 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\RNS EARTH MOVERS PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss37, null);
		rb37.keyPress(KeyEvent.VK_CONTROL);
		rb37.keyPress(KeyEvent.VK_V);
		rb37.keyRelease(KeyEvent.VK_CONTROL);
		rb37.keyRelease(KeyEvent.VK_V);
		rb37.keyPress(KeyEvent.VK_ENTER);
		rb37.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we37 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("RNS Earthmovers   :" +we37.getText());
		
		
		
		// SELECT DEALER Saini Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[40]")).click();

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
		rb38.delay(2000);

		StringSelection ss38 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SAINI EARTH MOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss38, null);
		rb38.keyPress(KeyEvent.VK_CONTROL);
		rb38.keyPress(KeyEvent.VK_V);
		rb38.keyRelease(KeyEvent.VK_CONTROL);
		rb38.keyRelease(KeyEvent.VK_V);
		rb38.keyPress(KeyEvent.VK_ENTER);
		rb38.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we38 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Saini Earthmovers   :" +we38.getText());
		
		
		
		// SELECT DEALER Samal Equipment

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[41]")).click();

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
		rb39.delay(2000);

		StringSelection ss39 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SAMAL EQUIP.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss39, null);
		rb39.keyPress(KeyEvent.VK_CONTROL);
		rb39.keyPress(KeyEvent.VK_V);
		rb39.keyRelease(KeyEvent.VK_CONTROL);
		rb39.keyRelease(KeyEvent.VK_V);
		rb39.keyPress(KeyEvent.VK_ENTER);
		rb39.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we39 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Samal Equipment   :" +we39.getText());
		
		
		
		
		// SELECT DEALER Shakti Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[42]")).click();

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
		rb40.delay(2000);

		StringSelection ss40 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SHAKTI EARTHMOVERS LLP.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss40, null);
		rb40.keyPress(KeyEvent.VK_CONTROL);
		rb40.keyPress(KeyEvent.VK_V);
		rb40.keyRelease(KeyEvent.VK_CONTROL);
		rb40.keyRelease(KeyEvent.VK_V);
		rb40.keyPress(KeyEvent.VK_ENTER);
		rb40.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we40 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Shakti Earthmovers   :" +we40.getText());
		
		
		
		
		// SELECT DEALER Shanti Automotives

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[43]")).click();

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
		rb41.delay(2000);

		StringSelection ss41 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SHANTI AUTOMOTIVES INDIA PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss41, null);
		rb41.keyPress(KeyEvent.VK_CONTROL);
		rb41.keyPress(KeyEvent.VK_V);
		rb41.keyRelease(KeyEvent.VK_CONTROL);
		rb41.keyRelease(KeyEvent.VK_V);
		rb41.keyPress(KeyEvent.VK_ENTER);
		rb41.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we41 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Shanti Automotives   :" +we41.getText());
	
		
		
		
		// SELECT DEALER Siddharth JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[44]")).click();

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
		rb42.delay(2000);

		StringSelection ss42 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SIDDHARTH AUTO ENGINEERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss42, null);
		rb42.keyPress(KeyEvent.VK_CONTROL);
		rb42.keyPress(KeyEvent.VK_V);
		rb42.keyRelease(KeyEvent.VK_CONTROL);
		rb42.keyRelease(KeyEvent.VK_V);
		rb42.keyPress(KeyEvent.VK_ENTER);
		rb42.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we42 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Siddharth JCB   :" +we42.getText());
		
		
		
		
		
		// SELECT DEALER Sri Sai Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[45]")).click();

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
		rb43.delay(2000);

		StringSelection ss43 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\Sri Sai Earthmovers.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss43, null);
		rb43.keyPress(KeyEvent.VK_CONTROL);
		rb43.keyPress(KeyEvent.VK_V);
		rb43.keyRelease(KeyEvent.VK_CONTROL);
		rb43.keyRelease(KeyEvent.VK_V);
		rb43.keyPress(KeyEvent.VK_ENTER);
		rb43.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we43 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Sri Sai Earthmovers   :" +we43.getText());
		
		
		
		
		// SELECT DEALER Sumedha Vehicles

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[46]")).click();

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
		rb44.delay(2000);

		StringSelection ss44 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SUMEDHA VEHICLES PVT LTD.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss44, null);
		rb44.keyPress(KeyEvent.VK_CONTROL);
		rb44.keyPress(KeyEvent.VK_V);
		rb44.keyRelease(KeyEvent.VK_CONTROL);
		rb44.keyRelease(KeyEvent.VK_V);
		rb44.keyPress(KeyEvent.VK_ENTER);
		rb44.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we44 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Sumedha Vehicles   :" +we44.getText());
		
		
		
		
		// SELECT DEALER Sumeet Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[47]")).click();

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
		rb45.delay(2000);

		StringSelection ss45 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SUMEET EARTHMOVERS,.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss45, null);
		rb45.keyPress(KeyEvent.VK_CONTROL);
		rb45.keyPress(KeyEvent.VK_V);
		rb45.keyRelease(KeyEvent.VK_CONTROL);
		rb45.keyRelease(KeyEvent.VK_V);
		rb45.keyPress(KeyEvent.VK_ENTER);
		rb45.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we45 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Sumeet Earthmovers   :" +we45.getText());
		
		
		
		// SELECT DEALER Suryabala JCB

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[48]")).click();

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
		rb46.delay(2000);

		StringSelection ss46 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SURYABALA EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss46, null);
		rb46.keyPress(KeyEvent.VK_CONTROL);
		rb46.keyPress(KeyEvent.VK_V);
		rb46.keyRelease(KeyEvent.VK_CONTROL);
		rb46.keyRelease(KeyEvent.VK_V);
		rb46.keyPress(KeyEvent.VK_ENTER);
		rb46.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we46 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Suryabala JCB   :" +we46.getText());
		
		
		
		// SELECT DEALER Suyaan Infrastructure

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[49]")).click();

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
		rb47.delay(2000);

		StringSelection ss47 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\SUYAAN INFRASTRUCTURE PVT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss47, null);
		rb47.keyPress(KeyEvent.VK_CONTROL);
		rb47.keyPress(KeyEvent.VK_V);
		rb47.keyRelease(KeyEvent.VK_CONTROL);
		rb47.keyRelease(KeyEvent.VK_V);
		rb47.keyPress(KeyEvent.VK_ENTER);
		rb47.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we47 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Suyaan Infrastructure   :" +we47.getText());
		
		
		
		// SELECT DEALER Tradewings jcb

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[50]")).click();

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
		rb48.delay(2000);

		StringSelection ss48 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\TRADEWINGS EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss48, null);
		rb48.keyPress(KeyEvent.VK_CONTROL);
		rb48.keyPress(KeyEvent.VK_V);
		rb48.keyRelease(KeyEvent.VK_CONTROL);
		rb48.keyRelease(KeyEvent.VK_V);
		rb48.keyPress(KeyEvent.VK_ENTER);
		rb48.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we48 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Tradewings jcb   :" +we48.getText());
		
		
		
		
		// SELECT DEALER  TRR Automotive

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[51]")).click();

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
		rb49.delay(2000);

		StringSelection ss49 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\TRR AUTOMOTIVE.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss49, null);
		rb49.keyPress(KeyEvent.VK_CONTROL);
		rb49.keyPress(KeyEvent.VK_V);
		rb49.keyRelease(KeyEvent.VK_CONTROL);
		rb49.keyRelease(KeyEvent.VK_V);
		rb49.keyPress(KeyEvent.VK_ENTER);
		rb49.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we49 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("TRR Automotive   :" +we49.getText());
		
		
		
		
		// SELECT DEALER  Varun Motors

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[52]")).click();

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
		rb50.delay(2000);

		StringSelection ss50 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\VARUN MOTORS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss50, null);
		rb50.keyPress(KeyEvent.VK_CONTROL);
		rb50.keyPress(KeyEvent.VK_V);
		rb50.keyRelease(KeyEvent.VK_CONTROL);
		rb50.keyRelease(KeyEvent.VK_V);
		rb50.keyPress(KeyEvent.VK_ENTER);
		rb50.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we50 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Varun Motors   :" +we50.getText());
		
		
		
		// SELECT DEALER  Yantraman Automac

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[53]")).click();

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
		rb51.delay(2000);

		StringSelection ss51 = new StringSelection("C:\\Users\\Admin\\Desktop\\jcbstk\\YANTRAMAN  AUTOMAC PVT LT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss51, null);
		rb51.keyPress(KeyEvent.VK_CONTROL);
		rb51.keyPress(KeyEvent.VK_V);
		rb51.keyRelease(KeyEvent.VK_CONTROL);
		rb51.keyRelease(KeyEvent.VK_V);
		rb51.keyPress(KeyEvent.VK_ENTER);
		rb51.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
		
		// SUBMIT

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);
		WebElement we51 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_Error1\"]/div"));
		System.out.println("Yantraman Automac  :" +we51.getText());
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
		
		