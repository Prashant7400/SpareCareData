package Script_Live;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Upload_Bulk_Stock_Upload1 {
	
	public static void main (String[]args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");

		driver.findElement(By.xpath("//*[@id=\"tbx_UserName\"]")).sendKeys("DatUpl");
		driver.findElement(By.xpath("//*[@id=\"tbx_Password\"]")).sendKeys("Uploader!@#321");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Data Upload\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Bulk Stock Upload\"]")).click();

		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Sale List.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		int rownum = sheet.getLastRowNum();
		int cellnum =sheet.getRow(1).getLastCellNum();
		
		System.out.println("rownum : "+rownum+ "   cell num : "+cellnum);
		
		for(int i =1;i<=rownum;i++) {
			XSSFRow data = sheet.getRow(i);
			
			
			String Brand = data.getCell(0).getStringCellValue();
			String Dealer = data.getCell(1).getStringCellValue();
			String Filename  = data.getCell(2).getStringCellValue();
		
		// SELECT BRAND
			
			
			if(Dealer.equals("A & A EARTHMOVERS PRIVATE")) {

		WebElement brd = driver.findElement(By.id("ContentPlaceHolder1_ddlbrand"));
		brd.sendKeys(Brand);
		Thread.sleep(2000);
		

		// SELECT DEALER 

		WebElement del = driver.findElement(By.id("ContentPlaceHolder1_ddldealer"));
		del.sendKeys(Dealer);
		Thread.sleep(2000);
		
		
		// SELECT STOCK DATE (CURRENT DATE)

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/ul")).click();
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

		StringSelection ss = new StringSelection(Filename);
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
		System.out.println(Dealer  + we.getText());

		Thread.sleep(1000);
		
		// CONSOLE OUTPUT PRINT INTO NOTEPAD

		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\StockUploadResult.txt");
		System.setOut(ps);
		System.out.println( we.getText());
		
			}
			else {
				
				WebElement brd = driver.findElement(By.id("ContentPlaceHolder1_ddlbrand"));
				brd.sendKeys(Brand);
				Thread.sleep(2000);
				

				// SELECT DEALER 

				WebElement del = driver.findElement(By.id("ContentPlaceHolder1_ddldealer"));
				del.sendKeys(Dealer);
				Thread.sleep(2000);
				
				
				// SELECT STOCK DATE (CURRENT DATE)

				driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
				driver.findElement(By.xpath("//td[@class=\"today active day\"]")).click();

				// SELECT FILE

				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
						.click();

				// Robot class method
				// 1. copy the path
				// 2. Ctrl + v
				// 3. enter

				Robot rb = new Robot();
				rb.delay(1000);

				StringSelection ss = new StringSelection(Filename);
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
				System.out.println(Dealer + " : "  + we.getText());
				Thread.sleep(1000);
				
				// CONSOLE OUTPUT PRINT INTO NOTEPAD

//				PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\StockUploadResult.txt");
//				System.setOut(ps);
//				System.out.println(Dealer);
//				
				
				WebElement del1 = driver.findElement(By.id("ContentPlaceHolder1_ddldealer"));
				del1.sendKeys(Dealer);
				Thread.sleep(2000);
				
				
			
			}
				
				
				
			}

		
	}
	}

