package Script_Live;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_Workshop_Manage {
	

		public static void main(String[] args) throws IOException, InterruptedException {

			System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");

			driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
			driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
			driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

			driver.findElement(By.xpath("//span[text()=\"Workshop Management \"]")).click();
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[3]/div/input[2]"))
					.click();

			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\MAW_ContactMatrix.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("WorkshopChild");

			int rowcount = sheet.getLastRowNum();
			int cellcount = sheet.getRow(2).getLastCellNum();

			System.out.println("rowcount : " + rowcount);
			System.out.println("cellcount : " + cellcount);

			for (int i = 2; i <= rowcount; i++) {
				XSSFRow celldata = sheet.getRow(i);

				String SelectBrand = celldata.getCell(0).getStringCellValue();
				String SelectDealer = celldata.getCell(1).getStringCellValue();
				String WorkshopLocation = celldata.getCell(2).getStringCellValue();
				String LocationPrifix = celldata.getCell(3).getStringCellValue();
				String StartDatewithSpare = celldata.getCell(4).getStringCellValue();
				String AuditExecutive = celldata.getCell(5).getStringCellValue();
				String OrderingConsultant = celldata.getCell(6).getStringCellValue();
				String Status = celldata.getCell(7).getStringCellValue();
				String SharingStatus = celldata.getCell(8).getStringCellValue();
				String OrderGenerationStatus = celldata.getCell(9).getStringCellValue();
				String BDM = celldata.getCell(10).getStringCellValue();
				String AutoApproval = celldata.getCell(11).getStringCellValue();
				String DeshboardPPNI = celldata.getCell(12).getStringCellValue();
				String LowStockAlert = celldata.getCell(13).getStringCellValue();
				String LiveStocktoSale = celldata.getCell(14).getStringCellValue();

				Actions act = new Actions(driver);

				// Select Brand

				driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[1]/div/div/button/span[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[1]/div/div/div/div/input"))
						.sendKeys(SelectBrand);
				act.sendKeys(Keys.ENTER).build().perform();

				// Select Dealer

				driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[2]/div/div/button/span[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[2]/div/div/div/div/input"))
						.sendKeys(SelectDealer);
				act.sendKeys(Keys.ENTER).build().perform();

				Thread.sleep(2000);

				// Workshop Location

				driver.findElement(By.xpath("//*[@id=\"txtlocation\"]")).sendKeys(WorkshopLocation);

				// Location Prefix

				driver.findElement(By.xpath("//*[@id=\"txtprifix\"]")).sendKeys(LocationPrifix);

				// Start Date with Sparecare

				driver.findElement(By.xpath("//*[@id=\"txtstartdate\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"txtstartdate\"]")).sendKeys(StartDatewithSpare);

				// OEM Code

//				driver.findElement(By.xpath("//*[@id=\"txtoemcode\"]")).sendKeys(OEMCode);

				// Consignee Type Child

//				WebElement childconsign = driver.findElement(By.xpath("//label[text()=\"Child\"]"));
	//
//				if (ConsignType.equals(childconsign.getText())) {
//					driver.findElement(By.xpath("//label[text()=\"Child\"]")).click();
	//
//				}

			

				// End Date with Sparecare

//				driver.findElement(By.xpath("//*[@id=\"txtenddate\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"txtenddate\"]")).sendKeys(EndDatewithSpareCare);

				// Audit Executive

				driver.findElement(By.xpath("//select[@id=\"ddlaudit\"]//option[text()=\"Rahul Gandhi\"]")).click();
				
				
				
//				WebElement auditexe = driver.findElement(By.xpath("//*[@id=\"ddlaudit\"]/option[5]"));
//				if (AuditExecutive.equals(auditexe.getText())) {
//					driver.findElement(By.xpath("//*[@id=\"ddlaudit\"]/option[5]")).click();
//				}

				// Approval/Ordering Consultant

				driver.findElement(By.xpath("//select[@id=\"ddlordering\"]//option[text()=\"Ram Pratap Sparecare\"]")).click();

				
				
//				WebElement ordercon = driver.findElement(By.xpath("//*[@id=\"ddlordering\"]/option[2]"));
//				if (OrderingConsultant.equals(ordercon.getText())) {
//					driver.findElement(By.xpath("//*[@id=\"ddlordering\"]/option[2]")).click();
//				}
				Thread.sleep(2000);

				// OEM executive
				
//				WebElement oemexe = driver.findElement(By.xpath("//*[@id=\"ddlOEM\"]/option[2]"));
//				if (OEMExecutive.equals(oemexe.getText())) {
//					driver.findElement(By.xpath("//*[@id=\"ddlOEM\"]/option[2]")).click();
	//
//				}

				// Status

				WebElement stat = driver
						.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[13]/div/div[1]/label/label"));
				if (Status.equals(stat.getText())) {
					driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[13]/div/div[1]/label/label")).click();
				} else {
					driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[13]/div/div[2]/label/label")).click();

				}

				// Sharing Status

				WebElement sharsta = driver
						.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[14]/div/div[1]/label/label"));
				if (SharingStatus.equals(sharsta.getText())) {
					driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[14]/div/div[1]/label/label")).click();
				} else {
					driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[14]/div/div[2]/label/label")).click();
				}

				// Order Generation Status

				WebElement ordergensta = driver
						.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[15]/div/div[1]/label/label"));
				if (OrderGenerationStatus.equals(ordergensta.getText())) {
					driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[15]/div/div[1]/label/label")).click();
				} else {
					driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[15]/div/div[2]/label/label")).click();
				}

				// BDM

				driver.findElement(By.xpath("//select[@id=\"ddlBDM\"]//option[text()=\"Rahul Gandhi\"]")).click();
				
				
//				WebElement bdm = driver.findElement(By.xpath("//*[@id=\"ddlBDM\"]/option[3]"));
//				if (BDM.equals(bdm.getText())) {
//					driver.findElement(By.xpath("//*[@id=\"ddlBDM\"]/option[3]")).click();
//				}

				// Auto Approval

				if (AutoApproval.equals("N")) {
					driver.findElement(By.xpath("//*[@id=\"chkAutoApproval\"]")).click();
					Thread.sleep(2000);
				}

				// Deshboard PPNI

				if (DeshboardPPNI.equals("Y")) {
					driver.findElement(By.xpath("//*[@id=\"chkPpni\"]")).click();
					Thread.sleep(2000);
				}

				// Low Stock Alert

				if (LowStockAlert.equals("Y")) {
					driver.findElement(By.xpath("//*[@id=\"chkLowStockAlert\"]")).click();
					Thread.sleep(2000);

				}

				// Live Stock to Sale

				if (DeshboardPPNI.equals("Y")) {
					driver.findElement(By.xpath("//*[@id=\"chkStocktoSale\"]")).click();
					Thread.sleep(2000);

				}

				Thread.sleep(8000);

				// Submit

				 driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();

				//

				 driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[3]/div/input[2]")).click();

			}
		}
	}
	


