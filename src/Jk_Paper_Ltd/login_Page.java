package Jk_Paper_Ltd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class login_Page { 

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		

//		System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://supersitare.in/Account/RegisterNew");
		
		
		driver.findElement(By.cssSelector("input#OfficeMobile")).sendKeys("7775867400");

//		driver.findElement(By.id("OfficeMobile")).sendKeys("7775867400");
		Thread.sleep(1000);
		driver.findElement(By.id("OfficePhone")).sendKeys("7775867400");
		Thread.sleep(1000);
		driver.findElement(By.id("ContactPerson")).sendKeys("Prashant");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id=\"RoSelf\"]  //option[text()=\"No\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("TotalCopierSales")).sendKeys("7");
		driver.findElement(By.id("TotalJKPaperSales")).sendKeys("5");
		Thread.sleep(3000);

		driver.findElement(By.id("Aadhar_Number")).sendKeys("344320564274");

		WebElement webElement = driver.findElement(By.id("getotp"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

//		WebElement frtcopy = driver.findElement(By.id("Aadhar_Front_Image_Path"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", frtcopy);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		WebElement front = driver.findElement(By.id("Aadhar_Front_Image_Path"));

		Actions act = new Actions(driver);	

		act.click(front).build().perform();

//		driver.findElement(By.xpath("//*[@id=\"Aadhar_Front_Image_Path\"]")).click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + vl
		// 3. enter

		Robot rb = new Robot();
		rb.delay(1000);

		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot (1).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		WebElement back = driver.findElement(By.id("Aadhar_Back_Image_Path"));

		Actions act1 = new Actions(driver);

		act1.click(back).build().perform();	

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

		Robot rb1 = new Robot();
		rb1.delay(1000);

		StringSelection ss1 = new StringSelection("C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot (2).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);		
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

//		driver.findElement(By.cssSelector(input#form-control gstdis))
//		
//		driver.findElement(By.id("FirmName")).sendKeys("Prashant");
//
//		driver.findElement(By.id("VAT")).sendKeys("21AGTPD6171E1ZL");
//		
//		driver.findElement(By.id("VerifyGST")).click();
//		
//		driver.switchTo().alert().accept();
		
		WebElement gst = driver.findElement(By.id("GST_Image_Path"));
		
		Actions ac = new Actions(driver);
		ac.click(gst).build().perform();
		
		Robot rb2 = new Robot();
		rb2.delay(1000);
		 
		StringSelection ss2 = new StringSelection("C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot (3).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		rb2.keyPress(KeyEvent.VK_CONTROL);
		rb2.keyPress(KeyEvent.VK_V);
		rb2.keyRelease(KeyEvent.VK_CONTROL);
		rb2.keyRelease(KeyEvent.VK_V);
		rb2.keyPress(KeyEvent.VK_ENTER);
		rb2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		WebElement pan = driver.findElement(By.id("Pan_Image_Path"));
		Actions ac1 = new Actions(driver);
		ac1.click(pan).build().perform();	 
		
		Robot rb3 = new Robot();
		rb3.delay(1000);
		
		StringSelection ss3 = new StringSelection("C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot (4).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3,null);
		rb3.keyPress(KeyEvent.VK_CONTROL);
		rb3.keyPress(KeyEvent.VK_V); 
		rb3.keyRelease(KeyEvent.VK_CONTROL);
		rb3.keyRelease(KeyEvent.VK_V);
		rb3.keyPress(KeyEvent.VK_ENTER);
		rb3.keyRelease(KeyEvent.VK_ENTER);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,300)","");
	
		 
		
		driver.findElement(By.id("OfficeAddress1")).sendKeys("276");
		
		Thread.sleep(2000);	
		
		driver.findElement(By.id("OfficeAddress2")).sendKeys("huda market");
		
		driver.findElement(By.id("OfficeAddress3")).sendKeys("sector 31");
		
		driver.findElement(By.xpath("//select[@id=\"OfficeStateId\"] //option[text()=\"Maharashtra\"]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"OfficeCity\"] //option[text()=\"Pune\"]")).click();
		
		driver.findElement(By.id("OfficePincode")).sendKeys("413116");
		
		driver.findElement(By.xpath("//select[@id=\"WholeSalerId\"]//option[text()=\" BHAGWATI TRADING COMPANY  - MAHARASHTRA - PUNE\"]")).click();
		
		driver.findElement(By.id("DOB")).click();
		
		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
		
		driver.findElement(By.id("EduProfile")).click();
		
		driver.findElement(By.id("OfficeEmail")).sendKeys("prash@7571@gmail.com");
		
		driver.findElement(By.id("//select[@id=\"MaritalStatus\"]//option[text()=\"No\"]")).click();

		
		
		
		
		
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor js1 = (JavascriptExecutor)driver;				
//		js1.executeScript("window.scrollBy(0,300)","");
		

//		
//		driver.findElement(By.id("OfficeStateId")).click();
//		
////		driver.findElement(By.id("(//option[text()=\"Maharashtra\"])[1]")).click();
//		 
//		WebElement sts = driver.findElement(By.id("(//option[text()=\"Maharashtra\"])[1]"));
//		Actions ac2 = new Actions(driver);
//		ac2.click(sts).build().perform();
//		
//		
//		driver.findElement(By.id("(//option[text()=\"Pune\"])[1]")).click();
//		
//		driver.findElement(By.id("OfficePincode")).sendKeys("413116");
//		
//		driver.findElement(By.id("(//option[text()=\"YASH PAPER CORPORATION - MAHARASHTRA - PUNE\"])")).click();
//		
//		driver.findElement(By.id("WSVAT")).sendKeys("21324234235342");
//		
//		driver.findElement(By.id("DOB")).sendKeys("12/07/1995");
//		
////		driver.findElement(By.id(""))
		
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.id(""))
		
//		driver.switchTo().alert().accept();
//		
//		WebElement gst = driver.findElement(By.id("GST_Image_Path"));
//
//		Actions act2 = new Actions(driver);
//
//		act2.click(back).build().perform();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
////		driver.findElement(By.id("Aadhar_Front_Image_Path")).click();
//		}
//		catch(InvalidArgumentException e) {
////
////			
//
//		WebElement ele = driver.findElement(By.id("Aadhar_Front_Image_Path"));
//
//		Actions act = new Actions(driver);
//
//		act.click(ele).build().perform();
//		
//		driver.findElement(By.xpath("//*[@id=\"Aadhar_Front_Image_Path\"]")).click();
////			
////			
////			
//	}

//		Actions act = new Actions(driver);
//		WebElement move = driver.findElement(By.id("Aadhar_Front_Image_Path"));
//		act.moveToElement(move).build().perform();
//		move.click();

//		driver.findElement(By.id("Aadhar_Front_Image_Path")).click();

////		Alert alert = (Alert) driver.switchTo().alert();  
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

//		driver.findElement(By.id("Aadhar_Front_Image_Path")).click();

//		driver.findElement(By.id("getotp")).click();

//		WebElement uplod = driver.findElement(By.xpath("//*[@id=\"Aadhar_Front_Image_Path\"]"));
//		uplod.click();

//		driver.findElement(By.id("Aadhar_Number")).sendKeys("342915227247");
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		
//		
//		WebElement webElement = driver.findElement(By.id("getotp"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
//		
//		

//		driver.findElement(By.id("getotp")).click();

//		Actions act = new Actions(driver);
//		WebElement clk = driver.findElement(By.id("getotp"));
//		act.moveToElement(clk).build().perform();
//		act.click();
//		

//		Thread.sleep(2000);

//		driver.findElement(By.xpath("//input[@name=\"Aadhar_Front_Image_Path\"]")).click();

//		
//		Actions act = new Actions(driver);
//		WebElement move = driver.findElement(By.id("Aadhar_Front_Image_Path"));
//		act.moveToElement(move).build().perform();
//		
//		driver.findElement(By.id("Aadhar_Front_Image_Path")).click();

		// Robot class method
		// 1. copy the path
		// 2. Ctrl + v
		// 3. enter

//				Robot rb = new Robot();
//				rb.delay(1000);
//
//				StringSelection ss = new StringSelection("C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot (6).png");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//				rb.keyPress(KeyEvent.VK_CONTROL);
//				rb.keyPress(KeyEvent.VK_V);
//				rb.keyRelease(KeyEvent.VK_CONTROL);
//				rb.keyRelease(KeyEvent.VK_V);
//				rb.keyPress(KeyEvent.VK_ENTER);
//				rb.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(1000);

//		driver.findElement(By.id("Agree")).isSelected();
//		Thread.sleep(1000);
//		driver.findElement(By.id("btnSubmit")).click();
//		Thread.sleep(1000);

	}

}
