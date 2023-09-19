package Script_Live;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Sale_List_Upload {

	
public static void main(String[]args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver1.exe");
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
		
		// Click Upload Non Moving
		
		driver.findElement(By.xpath("//input[@name=\"btn_Submit\"]")).click();
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Sale List.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rownum = sheet.getLastRowNum();
		int cellnum =sheet.getRow(1).getLastCellNum();
		
		System.out.println("rownum : "+rownum+ "cell num : "+cellnum);
		
		for(int i =1;i<=rownum;i++) {
			XSSFRow data = sheet.getRow(i);
			
			
			String Brand = data.getCell(0).getStringCellValue();
			String Dealer = data.getCell(1).getStringCellValue();
			String Location  = data.getCell(2).getStringCellValue();
			String Filepath  = data.getCell(3).getStringCellValue();
		
		
		// Select Brand
		
		WebElement brd = driver.findElement(By.id("ContentPlaceHolder1_ddlbrand"));
		brd.sendKeys(Brand);
		Thread.sleep(2000);
		
		// Select Dealer
		
		WebElement del = driver.findElement(By.id("ContentPlaceHolder1_ddldealer"));
		del.sendKeys(Dealer);
		Thread.sleep(2000);
		
		// Select Location
		
		WebElement loc = driver.findElement(By.id("ContentPlaceHolder1_ddllocation"));
		loc.sendKeys(Location);
		Thread.sleep(2000);
		
		// Upload Excel file
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div/label/span")).click();
		
		Robot rb = new Robot();
		rb.delay(1000);

		StringSelection ss = new StringSelection(Filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		
		
		// Submit Button
		
		driver.findElement(By.id("ContentPlaceHolder1_btn_Submit")).click();
		Thread.sleep(1000);
		
		// Click Upload Non Moving
		
		driver.findElement(By.xpath("//input[@name=\"btn_Submit\"]")).click();
		
	}
	}
}


