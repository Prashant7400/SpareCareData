package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Upload {
	public static void main(String[] args) throws AWTException, InterruptedException {

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

		// Select Brand
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlbrand\"]/option[11]")).click();

		// Select Dealer A&A Earthmovers
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[2]")).click();

		// Select Stock Date

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();

		// upload file

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb = new Robot();
		rb.delay(2000);

		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\A & A EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// Submit

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();

		Thread.sleep(2000);

		// New Dealer

		// Select Dealer Advaith Motors

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[3]")).click();

		// Select Stock Date

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb1 = new Robot();
		rb1.delay(2000);

		StringSelection ss1 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\ADVAITH MOTORS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);

		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);

		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// Submit
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);

		// New Dealer
		// Select Dealer Amin Equipment

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[5]")).click();

		// Select Stock Date

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb2 = new Robot();
		rb.delay(2000);

		StringSelection ss2 = new StringSelection(
				"\"C:\\Users\\Admin\\Desktop\\DataUploadJCB\\AMIN EQUIPMENTS PVT LTD.xlsx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

		rb2.keyPress(KeyEvent.VK_CONTROL);
		rb2.keyPress(KeyEvent.VK_V);

		rb2.keyRelease(KeyEvent.VK_CONTROL);
		rb2.keyRelease(KeyEvent.VK_V);

		rb2.keyPress(KeyEvent.VK_ENTER);
		rb2.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// Submit

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();

		Thread.sleep(2000);

		// Select Dealer Dada Earthmovers

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[10]")).click();

		// Select Stock Date

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb3 = new Robot();
		rb3.delay(2000);

		StringSelection ss3 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\DADA EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);

		rb3.keyPress(KeyEvent.VK_CONTROL);
		rb3.keyPress(KeyEvent.VK_V);

		rb3.keyRelease(KeyEvent.VK_CONTROL);
		rb3.keyRelease(KeyEvent.VK_V);

		rb3.keyPress(KeyEvent.VK_ENTER);
		rb3.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// Submit

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();

		Thread.sleep(2000);

		// Select Dealer DYNATECH

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[11]")).click();

		// Select Stock Date

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb4 = new Robot();
		rb4.delay(2000);

		StringSelection ss4 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\DYNATECH.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);

		rb4.keyPress(KeyEvent.VK_CONTROL);
		rb4.keyPress(KeyEvent.VK_V);

		rb4.keyRelease(KeyEvent.VK_CONTROL);
		rb4.keyRelease(KeyEvent.VK_V);

		rb4.keyPress(KeyEvent.VK_ENTER);
		rb4.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// Submit

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();

		Thread.sleep(2000);

		// Select Dealer Jitendra Equipment

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[18]")).click();

		// Select Stock Date

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb5 = new Robot();
		rb5.delay(2000);

		StringSelection ss5 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\JITENDRA EQUIPMENT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);

		rb5.keyPress(KeyEvent.VK_CONTROL);
		rb5.keyPress(KeyEvent.VK_V);

		rb5.keyRelease(KeyEvent.VK_CONTROL);
		rb5.keyRelease(KeyEvent.VK_V);

		rb5.keyPress(KeyEvent.VK_ENTER);
		rb5.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// Submit

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();

		Thread.sleep(2000);

		// Select Dealer KADOOR SALES CORPORATION

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[19]")).click();

		// Select Stock Date

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file

		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb6 = new Robot();
		rb6.delay(2000);

		StringSelection ss6 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\KADOOR SALES CORPORATION.xlsx"
				);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);

		rb6.keyPress(KeyEvent.VK_CONTROL);
		rb6.keyPress(KeyEvent.VK_V);

		rb6.keyRelease(KeyEvent.VK_CONTROL);
		rb6.keyRelease(KeyEvent.VK_V);

		rb6.keyPress(KeyEvent.VK_ENTER);
		rb6.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// Submit

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();

		Thread.sleep(2000);

		// Select Dealer KRISHNA AUTOMOBILES

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[22]")).click();

		// Select Stock Date
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb7 = new Robot();
		rb7.delay(2000);

		StringSelection ss7 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\KRISHNA AUTOMOBILES.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss7, null);
		rb7.keyPress(KeyEvent.VK_CONTROL);
		rb7.keyPress(KeyEvent.VK_V);
		rb7.keyRelease(KeyEvent.VK_CONTROL);
		rb7.keyRelease(KeyEvent.VK_V);
		rb7.keyPress(KeyEvent.VK_ENTER);
		rb7.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Submit
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);

		// Select Dealer MAYANK EQUIPMENTS

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[24]")).click();

		// Select Stock Date
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb8 = new Robot();
		rb8.delay(2000);

		StringSelection ss8 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\MAYANK EQUIPMENTS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss8, null);
		rb8.keyPress(KeyEvent.VK_CONTROL);
		rb8.keyPress(KeyEvent.VK_V);
		rb8.keyRelease(KeyEvent.VK_CONTROL);
		rb8.keyRelease(KeyEvent.VK_V);
		rb8.keyPress(KeyEvent.VK_ENTER);
		rb8.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Submit
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);

		// Select Dealer MOHAN EARTHMOVERS

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealer\"]/option[26]")).click();

		// Select Stock Date
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtStockDate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[2]/td[4]")).click();

		// upload file
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/div/div/label/span"))
				.click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb9 = new Robot();
		rb9.delay(2000);

		StringSelection ss9 = new StringSelection("C:\\Users\\Admin\\Desktop\\DataUploadJCB\\MOHAN EARTHMOVERS.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss9, null);
		rb9.keyPress(KeyEvent.VK_CONTROL);
		rb9.keyPress(KeyEvent.VK_V);
		rb9.keyRelease(KeyEvent.VK_CONTROL);
		rb9.keyRelease(KeyEvent.VK_V);
		rb9.keyPress(KeyEvent.VK_ENTER);
		rb9.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Submit
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btn_Submit\"]")).click();
		Thread.sleep(2000);

	}

}
