package Script_Live;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope_Usage_Stock_Update_Report {
	
	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");

		driver.findElement(By.xpath("//*[@id=\"tbx_UserName\"]")).sendKeys("DatUpl");
		driver.findElement(By.xpath("//*[@id=\"tbx_Password\"]")).sendKeys("Uploader!@#321");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"SCOPE Usage/Status Report\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Stock Updated Report (Dealer Location Wise)\"]")).click();

		// SELECT BRAND JCB

		driver.findElement(By.xpath("//option[text()=\"JCB\"]")).click();

		// SELECT DEALER A & A EARTHMOVERS PRIVATE

		driver.findElement(By.xpath("//option[text()=\"A & A EARTHMOVERS PRIVATE\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click();
		Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]"));
		
		// Print into Notepad

		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Scope Usage Date Validation.txt");
		System.setOut(ps);
		System.out.println("Name of Dealership  :" + ds.getText());

		// STOCK LAST UPDATED ON

		WebElement lu = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]"));

		System.out.println("Stock Last Updated On  :" + lu.getText());

		// UPLOAD DATE

		WebElement ud = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]"));

		System.out.println("Upload Date  :" + ud.getText());

		// SHOWING COUNT

		WebElement count = driver.findElement(By.xpath("//*[@id=\"abc_info\"]"));

		System.out.println("Showing Count  :" + count.getText());

		Thread.sleep(1000);
		System.out.println();
		
		
		
		// SELECT DEALER Advaith Motors 
		
		driver.findElement(By.xpath("//option[text()=\"Advaith Motors\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds1 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds1.getText());
		// STOCK LAST UPDATED ON

		WebElement lu1 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu1 .getText());
		// UPLOAD DATE

		WebElement ud1 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud1 .getText());
		// SHOWING COUNT

		WebElement count1 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count1.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Alliance jcb
		
		driver.findElement(By.xpath("//option[text()=\"ALLIANCE INDUSTRIAL MARKE\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds2 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds2.getText());
		// STOCK LAST UPDATED ON

		WebElement lu2 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu2 .getText());
		// UPLOAD DATE

		WebElement ud2 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud2 .getText());
		// SHOWING COUNT

		WebElement count2 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count2.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER AMIN EQUIPMENTS PVT LTD

		driver.findElement(By.xpath("//option[text()=\"AMIN EQUIPMENTS PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds3 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds3.getText());
		// STOCK LAST UPDATED ON

		WebElement lu3 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu3 .getText());
		// UPLOAD DATE

		WebElement ud3 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud3 .getText());
		// SHOWING COUNT

		WebElement count3 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count3.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER BANSAL AUTOMOTIVE PVT LTD

		driver.findElement(By.xpath("//option[text()=\"BANSAL AUTOMOTIVE PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds4 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds4.getText());
		// STOCK LAST UPDATED ON

		WebElement lu4 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu4 .getText());
		// UPLOAD DATE

		WebElement ud4 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud4 .getText());
		// SHOWING COUNT

		WebElement count4 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count4.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Bhopal Motors 
		
		driver.findElement(By.xpath("//option[text()=\"Bhopal Motors\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds5 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds5.getText());
		// STOCK LAST UPDATED ON

		WebElement lu5 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu5 .getText());
		// UPLOAD DATE

		WebElement ud5 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud5 .getText());
		// SHOWING COUNT

		WebElement count5 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count5.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER BOMBAY JCB EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"BOMBAY JCB EARTHMOVERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds6 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds6.getText());
		// STOCK LAST UPDATED ON

		WebElement lu6 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu6 .getText());
		// UPLOAD DATE

		WebElement ud6 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud6 .getText());
		// SHOWING COUNT

		WebElement count6 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count6.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER CACULO EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"CACULO EARTHMOVERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds7 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds7.getText());
		// STOCK LAST UPDATED ON

		WebElement lu7 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu7 .getText());
		// UPLOAD DATE

		WebElement ud7 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud7 .getText());
		// SHOWING COUNT

		WebElement count7 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count7.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER CONTINENTAL JCB

		driver.findElement(By.xpath("//option[text()=\"CONTINENTAL JCB\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds8 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds8.getText());
		// STOCK LAST UPDATED ON

		WebElement lu8 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu8 .getText());
		// UPLOAD DATE

		WebElement ud8 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud8 .getText());
		// SHOWING COUNT

		WebElement count8 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count8.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER DADA EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"DADA EARTHMOVERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds9 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds9.getText());
		// STOCK LAST UPDATED ON

		WebElement lu9 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu9 .getText());
		// UPLOAD DATE

		WebElement ud9 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud9 .getText());
		// SHOWING COUNT

		WebElement count9 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count9.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER DYNATECH

		driver.findElement(By.xpath("//option[text()=\"DYNATECH\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds10 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds10.getText());
		// STOCK LAST UPDATED ON

		WebElement lu10 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu10 .getText());
		// UPLOAD DATE

		WebElement ud10 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud10 .getText());
		// SHOWING COUNT

		WebElement count10 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count10.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER FRONTIER COMERCIAL VEHICL

		driver.findElement(By.xpath("//option[text()=\"FRONTIER COMERCIAL VEHICL\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds11 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds11.getText());
		// STOCK LAST UPDATED ON

		WebElement lu11 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu11 .getText());
		// UPLOAD DATE

		WebElement ud11 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud11 .getText());
		// SHOWING COUNT

		WebElement count11 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count11.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER G K AUTOWHEELS PVT LTD

		driver.findElement(By.xpath("//option[text()=\"G K AUTOWHEELS PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds12 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds12.getText());
		// STOCK LAST UPDATED ON

		WebElement lu12 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu12 .getText());
		// UPLOAD DATE

		WebElement ud12 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud12 .getText());
		// SHOWING COUNT

		WebElement count12 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count12.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER G K AUTOWHEELS PVT LTD-Nagpur

		driver.findElement(By.xpath("//option[text()=\"G K AUTOWHEELS PVT LTD-Nagpur\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds13 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds13.getText());
		// STOCK LAST UPDATED ON

		WebElement lu13 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu13 .getText());
		// UPLOAD DATE

		WebElement ud13 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud13 .getText());
		// SHOWING COUNT

		WebElement count13 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count13.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER GADRE ENGINEERING SERVICE

		driver.findElement(By.xpath("//option[text()=\"GADRE ENGINEERING SERVICE\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds14 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds14.getText());
		// STOCK LAST UPDATED ON

		WebElement lu14 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu14 .getText());
		// UPLOAD DATE

		WebElement ud14 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud14 .getText());
		// SHOWING COUNT

		WebElement count14 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count14.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER GAUTAM ENGINEERING COMPAN

		driver.findElement(By.xpath("//option[text()=\"GAUTAM ENGINEERING COMPAN\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds15 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds15.getText());
		// STOCK LAST UPDATED ON

		WebElement lu15 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu15 .getText());
		// UPLOAD DATE

		WebElement ud15 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud15 .getText());
		// SHOWING COUNT

		WebElement count15 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count15.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER GOLD FIELDS

		driver.findElement(By.xpath("//option[text()=\"GOLD FIELDS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds16 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds16.getText());
		// STOCK LAST UPDATED ON

		WebElement lu16 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu16 .getText());
		// UPLOAD DATE

		WebElement ud16 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud16 .getText());
		// SHOWING COUNT

		WebElement count16 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count16.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER JAYARAJ AUTOMOBILE AGENCY

		driver.findElement(By.xpath("//option[text()=\"JAYARAJ AUTOMOBILE AGENCY\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds17 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds17.getText());
		// STOCK LAST UPDATED ON

		WebElement lu17 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu17 .getText());
		// UPLOAD DATE

		WebElement ud17 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud17 .getText());
		// SHOWING COUNT

		WebElement count17 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count17.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Jitendra Equipment 
		
		driver.findElement(By.xpath("//option[text()=\"Jitendra Equipment\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds18 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds18.getText());
		// STOCK LAST UPDATED ON

		WebElement lu18 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu18 .getText());
		// UPLOAD DATE

		WebElement ud18 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud18 .getText());
		// SHOWING COUNT

		WebElement count18 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count18.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Kadoor sales corporation 
		
		driver.findElement(By.xpath("//option[text()=\"Kadoor sales corporation\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds19 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds19.getText());
		// STOCK LAST UPDATED ON

		WebElement lu19 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu19 .getText());
		// UPLOAD DATE

		WebElement ud19 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud19 .getText());
		// SHOWING COUNT

		WebElement count19 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count19.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER KALINGA AUTOMOBILES PVT L

		driver.findElement(By.xpath("//option[text()=\"KALINGA AUTOMOBILES PVT L\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds20 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds20.getText());
		// STOCK LAST UPDATED ON

		WebElement lu20 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu20 .getText());
		// UPLOAD DATE

		WebElement ud20 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud20 .getText());
		// SHOWING COUNT

		WebElement count20 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count20.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER KRISHNA AUTO RIDERS PVT LTD

		driver.findElement(By.xpath("//option[text()=\"KRISHNA AUTO RIDERS PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds21 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds21.getText());
		// STOCK LAST UPDATED ON

		WebElement lu21 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu21 .getText());
		// UPLOAD DATE

		WebElement ud21 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud21 .getText());
		// SHOWING COUNT

		WebElement count21 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count21.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Krishna Automobiles
		
		driver.findElement(By.xpath("//option[text()=\"Krishna Automobiles\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds22 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds22.getText());
		// STOCK LAST UPDATED ON

		WebElement lu22 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu22 .getText());
		// UPLOAD DATE

		WebElement ud22 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud22 .getText());
		// SHOWING COUNT

		WebElement count22 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count22.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER LEO EARTHMOVERS PVT LIMIT

		driver.findElement(By.xpath("//option[text()=\"LEO EARTHMOVERS PVT LIMIT\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds23 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds23.getText());
		// STOCK LAST UPDATED ON

		WebElement lu23 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu23 .getText());
		// UPLOAD DATE

		WebElement ud23 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud23 .getText());
		// SHOWING COUNT

		WebElement count23 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count23.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Mayank Equipments 
		
		driver.findElement(By.xpath("//option[text()=\"Mayank Equipments\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds24 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds24.getText());
		// STOCK LAST UPDATED ON

		WebElement lu24 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu24 .getText());
		// UPLOAD DATE

		WebElement ud24 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud24 .getText());
		// SHOWING COUNT

		WebElement count24 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count24.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER MGB MOTOR & AUTO AGENCIES

		driver.findElement(By.xpath("//option[text()=\"MGB MOTOR & AUTO AGENCIES\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds25 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds25.getText());
		// STOCK LAST UPDATED ON

		WebElement lu25 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu25 .getText());
		// UPLOAD DATE

		WebElement ud25 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud25 .getText());
		// SHOWING COUNT

		WebElement count25 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count25.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Mohan Earthmovers
		
		driver.findElement(By.xpath("//option[text()=\"Mohan Earthmovers\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds26 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds26.getText());
		// STOCK LAST UPDATED ON

		WebElement lu26 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu26 .getText());
		// UPLOAD DATE

		WebElement ud26 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud26 .getText());
		// SHOWING COUNT

		WebElement count26 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count26.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER NATRAJ MOBILES PVT LTD

		driver.findElement(By.xpath("//option[text()=\"NATRAJ MOBILES PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds27 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds27.getText());
		// STOCK LAST UPDATED ON

		WebElement lu27 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu27 .getText());
		// UPLOAD DATE

		WebElement ud27 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud27 .getText());
		// SHOWING COUNT

		WebElement count27 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count27.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER OJA AUTOMOBLIES PVT. LTD

		driver.findElement(By.xpath("//option[text()=\"OJA AUTOMOBLIES PVT. LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds28 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds28.getText());
		// STOCK LAST UPDATED ON

		WebElement lu28 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu28 .getText());
		// UPLOAD DATE

		WebElement ud28 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud28 .getText());
		// SHOWING COUNT

		WebElement count28 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count28.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER P R NAYAK ASSOCIATES PVT LTD

		driver.findElement(By.xpath("//option[text()=\"P R NAYAK ASSOCIATES PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds29 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds29.getText());
		// STOCK LAST UPDATED ON

		WebElement lu29 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu29 .getText());
		// UPLOAD DATE

		WebElement ud29 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud29 .getText());
		// SHOWING COUNT

		WebElement count29 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count29.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER PATLIPUTRA EQUIPMENTS PVT

		driver.findElement(By.xpath("//option[text()=\"PATLIPUTRA EQUIPMENTS PVT\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds30 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds30.getText());
		// STOCK LAST UPDATED ON

		WebElement lu30 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu30 .getText());
		// UPLOAD DATE

		WebElement ud30 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud30 .getText());
		// SHOWING COUNT

		WebElement count30 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count30.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER PODDER & PODDER EQUP & PR

		driver.findElement(By.xpath("//option[text()=\"PODDER & PODDER EQUP & PR\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds31 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds31.getText());
		// STOCK LAST UPDATED ON

		WebElement lu31 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu31 .getText());
		// UPLOAD DATE

		WebElement ud31 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud31 .getText());
		// SHOWING COUNT

		WebElement count31 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count31.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER POPULAR MOTOR CORPORATION

		driver.findElement(By.xpath("//option[text()=\"POPULAR MOTOR CORPORATION\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds32 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds32.getText());
		// STOCK LAST UPDATED ON

		WebElement lu32 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu32 .getText());
		// UPLOAD DATE

		WebElement ud32 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud32 .getText());
		// SHOWING COUNT

		WebElement count32 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count32.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Prem JCB

		driver.findElement(By.xpath("//option[text()=\"Prem JCB\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds33 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds33.getText());
		// STOCK LAST UPDATED ON

		WebElement lu33 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu33 .getText());
		// UPLOAD DATE

		WebElement ud33 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud33 .getText());
		// SHOWING COUNT

		WebElement count33 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count33.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER PREMSONS MOTOR UDYOG PVT LTD

		driver.findElement(By.xpath("//option[text()=\"PREMSONS MOTOR UDYOG PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds34 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds34.getText());
		// STOCK LAST UPDATED ON

		WebElement lu34 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu34 .getText());
		// UPLOAD DATE

		WebElement ud34 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud34 .getText());
		// SHOWING COUNT

		WebElement count34 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count34.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER RAJ SONS AUTO Pvt Ltd

		driver.findElement(By.xpath("//option[text()=\"RAJ SONS AUTO Pvt Ltd\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds35 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds35.getText());
		// STOCK LAST UPDATED ON

		WebElement lu35 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu35 .getText());
		// UPLOAD DATE

		WebElement ud35 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud35 .getText());
		// SHOWING COUNT

		WebElement count35 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count35.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Rajesh Motors 
		
		driver.findElement(By.xpath("//option[text()=\"Rajesh Motors\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds36 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds36.getText());
		// STOCK LAST UPDATED ON

		WebElement lu36 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu36 .getText());
		// UPLOAD DATE

		WebElement ud36 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud36 .getText());
		// SHOWING COUNT

		WebElement count36 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count36.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Ratna Prabha Motors 
		
		driver.findElement(By.xpath("//option[text()=\"Ratna Prabha Motors\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds37 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds37.getText());
		// STOCK LAST UPDATED ON

		WebElement lu37 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu37 .getText());
		// UPLOAD DATE

		WebElement ud37 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud37 .getText());
		// SHOWING COUNT

		WebElement count37 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count37.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER RNS EARTH MOVERS PVT LTD

		driver.findElement(By.xpath("//option[text()=\"RNS EARTH MOVERS PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds38 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds38.getText());
		// STOCK LAST UPDATED ON

		WebElement lu38 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu38 .getText());
		// UPLOAD DATE

		WebElement ud38 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud38 .getText());
		// SHOWING COUNT

		WebElement count38 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count38.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SAINI EARTH MOVERS

		driver.findElement(By.xpath("//option[text()=\"SAINI EARTH MOVERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds39 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds39.getText());
		// STOCK LAST UPDATED ON

		WebElement lu39 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu39 .getText());
		// UPLOAD DATE

		WebElement ud39 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud39 .getText());
		// SHOWING COUNT

		WebElement count39 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count39.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SAMAL EQUIP

		driver.findElement(By.xpath("//option[text()=\"SAMAL EQUIP\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds40 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds40.getText());
		// STOCK LAST UPDATED ON

		WebElement lu40 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu40 .getText());
		// UPLOAD DATE

		WebElement ud40 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud40 .getText());
		// SHOWING COUNT

		WebElement count40 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count40.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SHAKTI EARTHMOVERS LLP

		driver.findElement(By.xpath("//option[text()=\"SHAKTI EARTHMOVERS LLP\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds41 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds41.getText());
		// STOCK LAST UPDATED ON

		WebElement lu41 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu41 .getText());
		// UPLOAD DATE

		WebElement ud41 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud41 .getText());
		// SHOWING COUNT

		WebElement count41 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count41.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SHANTI AUTOMOTIVES INDIA PVT LTD

		driver.findElement(By.xpath("//option[text()=\"SHANTI AUTOMOTIVES INDIA PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds42 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds42.getText());
		// STOCK LAST UPDATED ON

		WebElement lu42 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu42 .getText());
		// UPLOAD DATE

		WebElement ud42 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud42 .getText());
		// SHOWING COUNT

		WebElement count42 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count42.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Shantinath jcb
		
		driver.findElement(By.xpath("//option[text()=\"SHANTINATH MOTORS PVT LTD\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds43 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds43.getText());
		// STOCK LAST UPDATED ON

		WebElement lu43 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu43 .getText());
		// UPLOAD DATE

		WebElement ud43 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud43 .getText());
		// SHOWING COUNT

		WebElement count43 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count43.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SIDDHARTH AUTO ENGINEERS

		driver.findElement(By.xpath("//option[text()=\"SIDDHARTH AUTO ENGINEERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds44 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds44.getText());
		// STOCK LAST UPDATED ON

		WebElement lu44 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu44 .getText());
		// UPLOAD DATE

		WebElement ud44 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud44 .getText());
		// SHOWING COUNT

		WebElement count44 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count44.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Sri Sai Earthmovers 
		
		driver.findElement(By.xpath("//option[text()=\"Sri Sai Earthmovers\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds45 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds45.getText());
		// STOCK LAST UPDATED ON

		WebElement lu45 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu45 .getText());
		// UPLOAD DATE

		WebElement ud45 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud45 .getText());
		// SHOWING COUNT

		WebElement count45 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count45.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SUMEDHA VEHICLES PVT LTD

		driver.findElement(By.xpath("//option[text()=\"SUMEDHA VEHICLES PVT LTD\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds46 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds46.getText());
		// STOCK LAST UPDATED ON

		WebElement lu46 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu46 .getText());
		// UPLOAD DATE

		WebElement ud46 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud46 .getText());
		// SHOWING COUNT

		WebElement count46 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count46.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SUMEET EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"SUMEET EARTHMOVERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds47 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds47.getText());
		// STOCK LAST UPDATED ON

		WebElement lu47 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu47 .getText());
		// UPLOAD DATE

		WebElement ud47 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud47 .getText());
		// SHOWING COUNT

		WebElement count47 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count47.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SURYABALA EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"SURYABALA EARTHMOVERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds48 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds48.getText());
		// STOCK LAST UPDATED ON

		WebElement lu48 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu48 .getText());
		// UPLOAD DATE

		WebElement ud48 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud48 .getText());
		// SHOWING COUNT

		WebElement count48 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count48.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER SUYAAN INFRASTRUCTURE PVT

		driver.findElement(By.xpath("//option[text()=\"SUYAAN INFRASTRUCTURE PVT\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds49 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds49.getText());
		// STOCK LAST UPDATED ON

		WebElement lu49 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu49 .getText());
		// UPLOAD DATE

		WebElement ud49 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud49 .getText());
		// SHOWING COUNT

		WebElement count49 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count49.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER TRADEWINGS EARTHMOVERS

		driver.findElement(By.xpath("//option[text()=\"TRADEWINGS EARTHMOVERS\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds50 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds50.getText());
		// STOCK LAST UPDATED ON

		WebElement lu50 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu50 .getText());
		// UPLOAD DATE

		WebElement ud50 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud50 .getText());
		// SHOWING COUNT

		WebElement count50 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count50.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER TRR Automotive
		
		driver.findElement(By.xpath("//option[text()=\"TRR Automotive\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds51 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds51.getText());
		// STOCK LAST UPDATED ON

		WebElement lu51 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu51 .getText());
		// UPLOAD DATE

		WebElement ud51 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud51 .getText());
		// SHOWING COUNT

		WebElement count51 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count51.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER Varun Motors
		
		driver.findElement(By.xpath("//option[text()=\"Varun Motors\"]")).click();
		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds52 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds52.getText());
		// STOCK LAST UPDATED ON

		WebElement lu52 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu52 .getText());
		// UPLOAD DATE

		WebElement ud52 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud52 .getText());
		// SHOWING COUNT

		WebElement count52 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count52.getText());
		Thread.sleep(1000); System.out.println();
		 
		// SELECT DEALER YANTRAMAN AUTOMAC PVT LT

		driver.findElement(By.xpath("//option[text()=\"YANTRAMAN  AUTOMAC PVT LT\"]")).click();

		// CLICK SEARCH BUTTON

		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click(); Thread.sleep(1000);

		// NAME OF DEALERSHIP

		WebElement ds53 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")); System.out.println("Name of Dealership :" +ds53.getText());
		// STOCK LAST UPDATED ON

		WebElement lu53 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[4]")); System.out.println("Stock Last Updated On :" +lu53 .getText());
		// UPLOAD DATE

		WebElement ud53 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]")); System.out.println("Upload Date :" +ud53 .getText());
		// SHOWING COUNT

		WebElement count53 = driver.findElement(By.xpath("//*[@id=\"abc_info\"]")); System.out.println("Showing Count :" +count53.getText());
		Thread.sleep(1000); System.out.println();


	

	}
}


