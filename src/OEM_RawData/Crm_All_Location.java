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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crm_All_Location {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
//		String filetype = "pdf";
		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_xlsx_externally",true);
		prefs.put("download.default_directory","C:\\Users\\Admin\\Desktop\\TATA CVBU & PCBU OUTPUT DATA\\OEM ExportData");
		opt.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://insights.inservices.tatamotors.com/analytics/saw.dll?Dashboard");

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\TATA CVBU &  PCBU INPUT DATA\\OEM1.xlsx");

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
			String dealername = celldata.getCell(2).getStringCellValue();
//			String location = celldata.getCell(3).getStringCellValue();
			String from = celldata.getCell(4).getStringCellValue();
			String to = celldata.getCell(5).getStringCellValue();

			driver.findElement(By.id("idUser")).sendKeys(username);
			driver.findElement(By.id("idPassword")).sendKeys(password);
			driver.findElement(By.id("btn_login")).click();

			// click dashboard

			driver.findElement(By.xpath("//span[text()=\"Dashboards\"]")).click();

			// click CVBU spares

			driver.findElement(By.xpath("//a[text()=\"CVBU Spares\"]")).click();

			Thread.sleep(2000);

			// click transactional reports

			driver.findElement(By.xpath("//div[text()=\"Transactional Reports\"]")).click();

			// click Stock Transaction Register - With Adjustment

			WebElement clk = driver
					.findElement(By.xpath("(//a[text()=\"Stock Transaction Register - With Adjustment\"])[1]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", clk);

			Thread.sleep(2000);

			// click dealername

			WebElement delname = driver
					.findElement(By.xpath("(//input[@class=\"promptTextField textFieldHelper\"])[1]"));
			delname.sendKeys(dealername);
			

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			// click location

			driver.findElement(By.xpath("//input[@class=\"promptTextField textFieldHelper\"]")).click();

			WebElement loc = driver.findElement(By.xpath("//input[@class=\"promptTextField textFieldHelper\"]"));
			
//			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class=\"masterMenu DropDownValueList\"])[2]")));
			

//			loc.sendKeys(location);

			// Next button

			driver.findElement(By.id("next")).click();

			// From Date

			WebElement fromdate = driver.findElement(
					By.xpath("(//input[@class=\"promptEditBoxField promptEditBoxFieldWithButtonWidth\"])[1]"));
			fromdate.sendKeys(from);

			// To Date

			WebElement todate = driver.findElement(
					By.xpath("(//input[@class=\"promptEditBoxField promptEditBoxFieldWithButtonWidth\"])[2]"));
			todate.sendKeys(to);

			// click Ok button

			driver.findElement(By.xpath("//input[@class=\"masterToolbarTextButton button promptApplyButton\"]"))
					.click();

//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()=\"Export\"]")));

			// click export

			driver.findElement(By.xpath("//a[text()=\"Export\"]")).click();

			// click data

			driver.findElement(By.xpath("//td[text()=\"Data\"]")).click();

			// Click CSV

			driver.findElement(By.xpath("(//a[@name=\"SectionElements\"])[10]")).click();

			// click ok button

			driver.findElement(By.xpath("//a[@name=\"OK\"]")).click();
			
//			driver.switchTo().alert().accept();

			
			// logout 
			
			
			driver.findElement(By.xpath("//td[@class=\"HeaderPageStatus\"]")).click();
			
			driver.findElement(By.xpath("//span[text()=\"Sign Out\"]")).click();
			
			
			try {
			
			    Alert alt = driver.switchTo().alert();
			    alt.accept();
			} catch(NoAlertPresentException noe) {
			    // No alert found on page, proceed with test.
			}
			
			
			

	}

}
}