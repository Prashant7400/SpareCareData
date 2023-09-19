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

public class ChannelPartnerPurchase {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

//		String filetype = "pdf";

		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_xlsx_externally", true);
		prefs.put("download.default_directory",
				"C:\\Users\\Admin\\Desktop\\TATA CVBU & PCBU OUTPUT DATA\\ChannelPartnerPurchase");
		opt.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://crmdms.inservices.tatamotors.com/siebel/app/workshop/enu?SWECmd=Start");

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Admin\\Desktop\\TATA CVBU &  PCBU INPUT DATA\\ChannelPartnerPurchaseData.xlsx");

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
			String orderdate = celldata.getCell(2).getStringCellValue();

			driver.findElement(By.xpath("//input[@title=\"User ID\"]")).sendKeys(username);
			driver.findElement(By.xpath("//input[@title=\"Password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//a[@id=\"s_swepi_22\"]")).click();

			Thread.sleep(9000);

			// Click on site Map

			driver.findElement(By.xpath("//span[@class=\"siebui-icon-tb-sitemap ToolbarButtonOn\"]")).click();

			// Click on Purchase Order

			WebElement clk = driver
					.findElement(By.xpath("//span[@class=\"siebui-screen-name-1\"] //a[text()=\"Purchase Orders\"]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", clk);

			// Click on Channel Partner Purchase

			driver.findElement(By.xpath("//a[text()=\"Channel Partner Purchase\"]")).click();

			// click search button

			driver.findElement(By.xpath("//button[@title=\"Channel Partner Purchase:Query\"]")).click();

			// Click on OrderDate

			WebElement order = driver.findElement(By.xpath("//td[@aria-roledescription=\"Order Date\"]"));

			Actions act = new Actions(driver);
			act.click(order).build().perform();

			WebElement date = driver.findElement(By.xpath("//input[@name=\"Order_Date\"]"));
			date.sendKeys(orderdate);

			// Click Go

			driver.findElement(By.xpath("//button[@data-display=\"Go\"]")).click();

			Thread.sleep(2000);

			// click on setting

			driver.findElement(By.xpath("//button[@id=\"s_at_m_1\"]")).click();

			// click export

			WebElement exp = driver.findElement(By.xpath("//a[text()=\"Export...\"]"));

			exp.click();

			// click next

			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();

			WebElement mess = driver.findElement(By.xpath("//span[@id=\"_sweExportProgress_Label_4\"]"));
			
			System.out.print( mess.getText());
			
			if(mess.equals(mess)) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			wait.until(ExpectedConditions.visibilityOfAllElements(mess));

			Thread.sleep(2000);
			
			

			driver.findElement(By.xpath("//button[@title=\"Export:Close\"]//span[text()=\"Close\"]")).click();

			driver.findElement(By.xpath("//li[@aria-label=\"Settings\"]")).click();

			driver.findElement(By.xpath("//button[@title=\"Logout\"]")).click();

		}
		}
	}
}