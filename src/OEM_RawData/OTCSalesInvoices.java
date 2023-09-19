package OEM_RawData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTCSalesInvoices {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

//		String filetype = "pdf";

		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_xlsx_externally", true);
		prefs.put("download.default_directory","C:\\Users\\Admin\\Desktop\\TATA CVBU & PCBU OUTPUT DATA\\OTCSalesInvoice");
		opt.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://crmdms.inservices.tatamotors.com/workshop/start.swe?");

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\TATA CVBU &  PCBU INPUT DATA\\OTCSalesInvoiceData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("login");

		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(1).getLastCellNum();

		System.out.println("Rowcount  :" + rowcount);
		System.out.println("Cellcount  :" + cellcount);

		for (int i = 1; i <= rowcount; i++) {

			Row celldata = sheet.getRow(i);

			String username = celldata.getCell(0).getStringCellValue();
			String password = celldata.getCell(1).getStringCellValue();
			String invoicedate = celldata.getCell(2).getStringCellValue();

			driver.findElement(By.xpath("//input[@title=\"User ID\"]")).sendKeys(username);
			driver.findElement(By.xpath("//input[@title=\"Password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//a[@id=\"s_swepi_22\"]")).click();

			Thread.sleep(9000);

			// Click on site Map

			driver.findElement(By.xpath("//span[@class=\"siebui-icon-tb-sitemap ToolbarButtonOn\"]")).click();

			// Click on Invoice 

			WebElement clk = driver.findElement(By.xpath("(//a[text()=\"Invoice\"])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", clk);

			// Click on OTC Sales Invoice

			driver.findElement(By.xpath("//a[text()=\"OTC Sales Invoices\"]")).click();

			// click search button

			driver.findElement(By.xpath("//button[@title=\"OTC Sales Invoices:Query\"]")).click();
			
			// Click on InvoiceDate

			WebElement date = driver.findElement(By.xpath("//td[@aria-roledescription=\"Invoice_Date\"]"));

			Actions act = new Actions(driver);
			act.click(date).build().perform();

			WebElement orddate = driver.findElement(By.xpath("//input[@name=\"Invoice_Date\"]"));
			orddate.sendKeys(invoicedate);

			// Click Go

			driver.findElement(By.xpath("(//button[@aria-label=\"OTC Sales Invoices:Go\"])[1]")).click();
			
			Thread.sleep(8000);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));


			// click on setting 
			
			WebElement set =  driver.findElement(By.xpath("//button[@title=\"OTC Sales Invoices Menu\"]"));
			js.executeScript("arguments[0].click();", set);			

			// click export

			WebElement exp = driver.findElement(By.xpath("//a[text()=\"Export...\"]"));
			act.click(exp).build().perform();
			

			// click next

			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();

			WebElement mess = driver.findElement(By.xpath("//span[@id=\"_sweExportProgress_Label_4\"]"));
			
			System.out.print( mess.getText());
			
			if(mess.equals(mess)) {
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			wait.until(ExpectedConditions.visibilityOfAllElements(mess));

			Thread.sleep(2000);
			
			

			driver.findElement(By.xpath("//button[@title=\"Export:Close\"]//span[text()=\"Close\"]")).click();

			driver.findElement(By.xpath("//li[@aria-label=\"Settings\"]")).click();

			driver.findElement(By.xpath("//button[@title=\"Logout\"]")).click();

		}
		}
	
	}

}
