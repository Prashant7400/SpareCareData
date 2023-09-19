package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Dealer_Management {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");

		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Dealer Management \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[2]/div/input[2]"))
				.click();

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\New Dealer Onboarding.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Dealer");

		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(2).getPhysicalNumberOfCells();

		System.out.println("Rowcount  :" + rowcount);
		System.out.println("Cellcount  :" + cellcount);

		for (int i = 2; i <= rowcount; i++) {

			Row rowdata = sheet.getRow(i);

			String dealername = rowdata.getCell(0).getStringCellValue();
			String brand = rowdata.getCell(1).getStringCellValue();
			String brandsegment = rowdata.getCell(2).getStringCellValue();
			// String parentcode = rowdata.getCell(3).getStringCellValue();
			String approvingstatus = rowdata.getCell(4).getStringCellValue();
			String reportingstatus = rowdata.getCell(5).getStringCellValue();
			String sharingstatus = rowdata.getCell(6).getStringCellValue();

			// Dealer Name from excel sheet

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtdealername\"]")).sendKeys(dealername);
			Thread.sleep(2000);

			// Brand from excel sheet

			WebElement brd = driver.findElement(By.id("ContentPlaceHolder1_ddlbrand"));
			brd.sendKeys(brand);
			Thread.sleep(2000);

			// brand segment from excel sheet

			WebElement segment = driver.findElement(By.id("ContentPlaceHolder1_ddlbrandsegment"));
			segment.sendKeys(brandsegment);

			// Parent Code from excel sheet

			// driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtparentcode\"]")).sendKeys(parentcode);

			

			// Approving Status from excel sheet

			WebElement appstatus = driver.findElement(By.xpath("(//label[text()=\"Active\"])[1]"));

			if (approvingstatus.equals(appstatus.getText())) {
				driver.findElement(By.xpath("(//label[text()=\"Active\"])[1]")).click();
			} else {
				driver.findElement(By.xpath("(//label[text()=\"Inactive\"])[1]")).click();
			}

			// Reporting Status from excel sheet

			WebElement repstatus = driver.findElement(
					By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[6]/div/div[1]/label/label"));

			if (reportingstatus.equals(repstatus.getText())) {
				driver.findElement(
						By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[6]/div/div[1]/label/label"))
						.click();

			} else {
				driver.findElement(
						By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[6]/div/div[2]/label")).click();

			}

			// Sharing Status from excel sheet

			WebElement shrstatus = driver.findElement(
					By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[7]/div/div[1]/label/label"));

			if (sharingstatus.equals(shrstatus.getText())) {

				driver.findElement(
						By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[7]/div/div[1]/label/label"))
						.click();
			} else {
				driver.findElement(
						By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[7]/div/div[2]/label")).click();

			}
			Thread.sleep(2000);

				// Submit

//			driver.findElement(By.id("ContentPlaceHolder1_btn_Submit")).click();
//			Thread.sleep(2000);

//			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[2]/div/input[2]")).click();
//

			}

		}

	}

