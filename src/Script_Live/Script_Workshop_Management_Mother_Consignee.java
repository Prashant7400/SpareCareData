package Script_Live;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_Workshop_Management_Mother_Consignee {
	
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Workshop Management \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[3]/div/input[2]")).click();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\New Dealer Onboarding.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Workshop");

		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(2).getLastCellNum();

		System.out.println("rowcount : " + rowcount);
		System.out.println("cellcount : " + cellcount);

		for (int i = 2; i <= rowcount; i++) {
			Row rowdata = sheet.getRow(i);
			

							
			String SelectBrand = rowdata.getCell(0).getStringCellValue();
			String SelectDealer = rowdata.getCell(1).getStringCellValue();
			String WorkshopLocation = rowdata.getCell(2).getStringCellValue();
			String LocationPrifix = rowdata.getCell(3).getStringCellValue();
			String StartDatewithSpare = rowdata.getCell(4).getStringCellValue();
//			String OEMCode = rowdata.getCell(5).getStringCellValue();
//	     	String ConsignType = rowdata.getCell(6).getStringCellValue();	
//	     	String EndDatewithSpareCare = rowdata.getCell(7).getStringCellValue();
			String AuditExecutive = rowdata.getCell(8).getStringCellValue();
			String OrderingConsultant = rowdata.getCell(9).getStringCellValue();
//			String OEMExecutive = rowdata.getCell(10).getStringCellValue();
			String Status = rowdata.getCell(11).getStringCellValue();
			String SharingStatus = rowdata.getCell(12).getStringCellValue();
			String OrderGenerationStatus = rowdata.getCell(13).getStringCellValue();
			String BDM = rowdata.getCell(14).getStringCellValue();
			String AutoApproval = rowdata.getCell(15).getStringCellValue();
			String DeshboardPPNI = rowdata.getCell(16).getStringCellValue();
			String LowStockAlert = rowdata.getCell(17).getStringCellValue();
			String LiveStocktoSale = rowdata.getCell(18).getStringCellValue();

			Actions act = new Actions(driver);
			
		
			// Select Brand

			driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[1]/div/div/button/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[1]/div/div/div/div/input")).sendKeys(SelectBrand);
			act.sendKeys(Keys.ENTER).build().perform();

			
			
			// Select Dealer

			driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[2]/div/div/button/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[2]/div/div/div/div/input")).sendKeys(SelectDealer);
			act.sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(2000);

			// Workshop Location

			driver.findElement(By.xpath("//*[@id=\"txtlocation\"]")).sendKeys(WorkshopLocation);
			Thread.sleep(1000);

			// Location Prefix

			driver.findElement(By.xpath("//*[@id=\"txtprifix\"]")).sendKeys(LocationPrifix);
			
//			driver.findElement(By.xpath("//*[@id=\"txtprifix\"]")).sendKeys("RO2023");

			// Start Date with Sparecare
            
			driver.findElement(By.xpath("//*[@id=\"txtstartdate\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"txtstartdate\"]")).sendKeys(StartDatewithSpare);
			
			
			// OEM Code

			
//			driver.findElement(By.xpath("//*[@id=\"txtoemcode\"]")).sendKeys(OEMCode);
			
			
			// Consignee Type Mother/Sister
			
			WebElement motherconsign = driver.findElement(By.xpath("//label[text()=\"Mother\"]"));
//			
//			if(ConsignType.equals(motherconsign.getText())) {
//				driver.findElement(By.xpath("//label[text()=\"Mother\"]")).click();
//			}
//			
//			WebElement sisterconsign = driver.findElement(By.xpath("//label[text()=\"Sister\"]"));
//			if(ConsignType.equals(sisterconsign.getText())) {
//				driver.findElement(By.xpath("//label[text()=\"Sister\"]")).click();
//			}
//			
			
		// End Date with Sparecare
            
//			driver.findElement(By.xpath("//*[@id=\"txtenddate\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"txtenddate\"]")).sendKeys(EndDatewithSpareCare);

			// Audit Executive
			

			WebElement auditexe = driver.findElement(By.xpath("//*[@id=\"ddlaudit\"]/option[5]"));
			if (AuditExecutive.equals(auditexe.getText())) {
				driver.findElement(By.xpath("//*[@id=\"ddlaudit\"]/option[5]")).click();
			}

			// Approval/Ordering Consultant

			WebElement ordercon = driver.findElement(By.xpath("//*[@id=\"ddlordering\"]/option[2]"));
			if (OrderingConsultant.equals(ordercon.getText())) {
				driver.findElement(By.xpath("//*[@id=\"ddlordering\"]/option[2]")).click();
			}
			Thread.sleep(2000);
			
			

//			// OEM executive
//			WebElement oemexe = driver.findElement(By.xpath("//*[@id=\"ddlOEM\"]/option[2]"));
//			if (OEMExecutive.equals(oemexe.getText())) {
//				driver.findElement(By.xpath("//*[@id=\"ddlOEM\"]/option[2]")).click();
//
//			}
//			
			

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
				driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[15]/div/div[1]/label/label"))
						.click();
			} else {
				driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[15]/div/div[2]/label/label")).click();
			}

			// BDM

			WebElement bdm = driver.findElement(By.id("ddlBDM"));
			bdm.sendKeys(BDM);
			Thread.sleep(2000);
		
	 		
			// Auto Approval
			
			if(AutoApproval.equals("N")) {
				driver.findElement(By.xpath("//*[@id=\"chkAutoApproval\"]")).click();
				Thread.sleep(2000);
			}

				
			// Deshboard PPNI
			
			if(DeshboardPPNI.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkPpni\"]")).click();
				Thread.sleep(2000);
			}
	
						

			// Low Stock Alert
			
			if(LowStockAlert.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkLowStockAlert\"]")).click();
				Thread.sleep(2000);

			}
			
			

			// Live Stock to Sale
			
			if(DeshboardPPNI.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkStocktoSale\"]")).click();
				Thread.sleep(2000);

			}
			
			 Thread.sleep(8000);

			
			// Submit
			 

//			 driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
			 
			 // 
			 
//			 driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[3]/div/input[2]")).click();

			 
 
				}

			} 
}
			
	


		
	


		
	
	
	
//		public String getCellValue(Cell celldata) {
//		switch (celldata.getCellType()){
//		case STRING : 
//			return String.valueOf(celldata.getStringCellValue());
//			
//		case NUMERIC :
//			return String.valueOf(celldata.getNumericCellValue());
//			
//		case BOOLEAN : 
//			return String.valueOf(celldata.getBooleanCellValue());
//		}
//		return null;
	
	


	


