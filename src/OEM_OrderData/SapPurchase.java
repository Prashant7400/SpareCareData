package OEM_OrderData;

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

public class SapPurchase {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

//		String filetype = "pdf";

		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_xlsx_externally", true);
		prefs.put("download.default_directory",
				"C:\\Users\\Admin\\Desktop\\TATA CVBU & PCBU OUTPUT DATA\\SapPurchaseOrderData");
		opt.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://insights.inservices.tatamotors.com/analytics/saw.dll?Dashboard");

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\TATA CVBU &  PCBU INPUT DATA\\SapPurchaseOrderData.xlsx");

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

			driver.findElement(By.cssSelector("input[id=\"idUser\"]")).sendKeys(username);
			driver.findElement(By.cssSelector("input[id=\"idPassword\"]")).sendKeys(password);
			driver.findElement(By.cssSelector("button[id=\"btn_login\"]")).click();

			Thread.sleep(9000);

			// click on dashboard

			driver.findElement(By.xpath("//span[text()=\"Dashboards\"]")).click();

			// click on CVBU Distributor

			driver.findElement(By.xpath("//a[text()=\"CVBU Distributor\"]")).click();

			// click on transaction report

			driver.findElement(By.xpath("//div[text()=\"Transactional Reports\"]")).click();

			// click on sap purchase order report

			driver.findElement(By.xpath("//a[text()=\"SAP Purchase Back Order Report\"]")).click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()=\"Export\"]")));

			// click on export

			driver.findElement(By.xpath("//a[text()=\"Export\"]")).click();

			// click on data

			driver.findElement(By.xpath("//td[text()=\"Data\"]")).click();

			// click on csv

			driver.findElement(By.xpath("//td[text()=\"CSV\"]")).click();

			// wait for report export

			wait.until(ExpectedConditions
					.visibilityOfAllElementsLocatedBy(By.xpath("(//a[text()=\"OK\"])[position()=1]")));

			// click on ok

			driver.findElement(By.xpath("(//a[text()=\"OK\"])[position()=1]")).click();

			// click my profile

			driver.findElement(By.xpath("//td[@title=\"My Profile\"]")).click();

			// click on Sign Out

			driver.findElement(By.xpath("//span[text()=\"Sign Out\"]")).click();

		}
	}
}
