package Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_Workshop_Management_Gainer {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");

		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Workshop Management  Gainer\"]")).click();

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Dealer Onboarding\\indiagrage all location (1).xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Gainer");

		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(2).getLastCellNum();

		System.out.println("Rowcount  :" + rowcount);
		System.out.println("Cellcount  :" + cellcount);

		for (int i = 2; i <= rowcount; i++) {

			Row celldata = sheet.getRow(i);
			
			String SelectBrand = celldata.getCell(0).getStringCellValue();
			String Dealer = celldata.getCell(1).getStringCellValue();
			String DealerAdrress = celldata.getCell(2).getStringCellValue();
			String Latitude = celldata.getCell(3).getStringCellValue();
			String Longitude = celldata.getCell(4).getStringCellValue();
			String isthisDelhiNCRRegion = celldata.getCell(5).getStringCellValue();
			String LSPConfigurationSetting = celldata.getCell(6).getStringCellValue();
			String DispatchRejectionButtonShow = celldata.getCell(7).getStringCellValue();
			String State = celldata.getCell(8).getStringCellValue();
			String City = celldata.getCell(9).getStringCellValue();
			String PinCode = celldata.getCell(10).getStringCellValue();
			String AccountHolderName = celldata.getCell(11).getStringCellValue();
			String BankName = celldata.getCell(12).getStringCellValue();
			String BranchName = celldata.getCell(13).getStringCellValue();
			String AccountNumber = celldata.getCell(14).getStringCellValue();
			String IFSCCode = celldata.getCell(15).getStringCellValue();
			String TANNumber = celldata.getCell(16).getStringCellValue();
			String PANNumber = celldata.getCell(17).getStringCellValue();
			String GSTNumber = celldata.getCell(18).getStringCellValue();
			String Name = celldata.getCell(19).getStringCellValue();
			String Designation = celldata.getCell(20).getStringCellValue();
			String Email = celldata.getCell(21).getStringCellValue();
			String ContactNo = celldata.getCell(22).getStringCellValue();
			String DOB = celldata.getCell(23).getStringCellValue();
			String Sequence = celldata.getCell(24).getStringCellValue();
			String ConsigneePerson = celldata.getCell(25).getStringCellValue();
			String ConsigneePersonForWarranty = celldata.getCell(26).getStringCellValue();
			String AlertLimit = celldata.getCell(27).getStringCellValue();
			String UpperLimit = celldata.getCell(28).getStringCellValue();
			String OrderBlocked = celldata.getCell(29).getStringCellValue();
			String PurDR = celldata.getCell(30).getStringCellValue();
			String SaleCR = celldata.getCell(31).getStringCellValue();
			String ClaimSetl = celldata.getCell(32).getStringCellValue();
			String MACCR = celldata.getCell(33).getStringCellValue();
			String MACDR = celldata.getCell(34).getStringCellValue();
			String WalletFB = celldata.getCell(35).getStringCellValue();
			String NotVisibleToSPM = celldata.getCell(36).getStringCellValue();
			String CompanyName = celldata.getCell(37).getStringCellValue();
			String Zone = celldata.getCell(38).getStringCellValue();
			String DefaultCompany = celldata.getCell(39).getStringCellValue();
			String NotVisibleToSPM1 = celldata.getCell(40).getStringCellValue();
			String VirtualAccountNo = celldata.getCell(41).getStringCellValue();
			String CompanyName1 = celldata.getCell(42).getStringCellValue();
			String Zone1 = celldata.getCell(43).getStringCellValue();
			String DefaultCompany1 = celldata.getCell(44).getStringCellValue();
			String ForWarranty = celldata.getCell(45).getStringCellValue();
			String ForOther = celldata.getCell(46).getStringCellValue();
			String ForDoc = celldata.getCell(47).getStringCellValue();




			// Select Brand

			driver.findElement(By.id("ddlBrand")).sendKeys(SelectBrand);
			Thread.sleep(1000);

			// Select Dealer

			driver.findElement(By.id("ddlDealer")).sendKeys(Dealer);
			Thread.sleep(1000);

			// Click Show Button

			driver.findElement(By.id("btnShow")).click();

			// Search

			driver.findElement(By.xpath("//*[@id=\"abc_filter\"]/label/input")).sendKeys(PinCode);
			Thread.sleep(2000);

			// Click edit

			driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[11]/a/img")).click();

			// GENERAL INFO

			// Dealer Address

			driver.findElement(By.id("txtmessage")).sendKeys(DealerAdrress);
			Thread.sleep(1000);

			// Latitude

			driver.findElement(By.id("txtLat")).sendKeys(Latitude);
			Thread.sleep(1000);

			// Longitude

			driver.findElement(By.id("txtLong")).sendKeys(Longitude);
			Thread.sleep(1000);

			// NCR Region

			WebElement region = driver.findElement(By.xpath("//*[@id=\"chkNcrRegion\"]"));

			if (isthisDelhiNCRRegion.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkNcrRegion\"]")).click();
				Thread.sleep(2000);
			}

			// LSP Cong Setting

			WebElement lsp = driver.findElement(By.xpath("//label[text()=\"SCS Default\"]"));

			if (LSPConfigurationSetting.equals(lsp.getText())) {
				driver.findElement(By.xpath("//label[text()=\"SCS Default\"]")).click();
				Thread.sleep(1000);

			}

			WebElement lsp1 = driver.findElement(By.xpath("//label[text()=\"Mixed\"]"));

			if (LSPConfigurationSetting.equals(lsp1.getText())) {
				driver.findElement(By.xpath("//label[text()=\"Mixed\"]")).click();
				Thread.sleep(1000);

			}

			// ADDRESS & PERSONAL BANK DETAILS

			// Click ADDRESS & PERSONAL BANK DETAILS

			driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();

			// State

			WebElement selstate = driver.findElement(By.id("ddlState"));
			selstate.sendKeys(State);
			Thread.sleep(4000);

			// City

			WebElement selcity = driver.findElement(By.id("ddlCity"));
			selcity.sendKeys(City);
			Thread.sleep(8000);

			// Pincode

			WebElement selpincode = driver.findElement(By.id("ddlPinCode"));
			selpincode.sendKeys(PinCode);
			Thread.sleep(3000);

			// Account Holder Name

			driver.findElement(By.xpath("//*[@id=\"txtAcctHolderName\"]")).sendKeys(AccountHolderName);
			Thread.sleep(1000);

			// Bank Name

			driver.findElement(By.xpath("//*[@id=\"txtBankName\"]")).sendKeys(BankName);
			Thread.sleep(1000);

			// Branch Name

			driver.findElement(By.xpath("//*[@id=\"txtBranchName\"]")).sendKeys(BranchName);
			Thread.sleep(1000);

			// AccountNumber

			driver.findElement(By.xpath("//*[@id=\"txtAccountNo\"]")).sendKeys(AccountNumber);
			Thread.sleep(1000);

			// IFSC Code

			driver.findElement(By.xpath("//*[@id=\"txtIFSCCode\"]")).sendKeys(IFSCCode);
			Thread.sleep(1000);

			// TAN Number

			driver.findElement(By.xpath("//*[@id=\"txtTANNo\"]")).sendKeys(TANNumber);
			Thread.sleep(1000);

			// PAN Number

			driver.findElement(By.xpath("//*[@id=\"txtPANNo\"]")).sendKeys(PANNumber);
			Thread.sleep(1000);

			// GST Number

			driver.findElement(By.xpath("//*[@id=\"txtGSTNo\"]")).sendKeys(GSTNumber);
			Thread.sleep(1000);

			// CONTACT MATRIX

			driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]/h4/a")).click();

			// Name

			driver.findElement(By.xpath("//*[@id=\"txtName\"]")).sendKeys(Name);
			Thread.sleep(1000);

			// Designation

			driver.findElement(By.xpath("//*[@id=\"txtDesignation\"]")).sendKeys(Designation);
			Thread.sleep(1000);

			// Email

			driver.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys(Email);
			Thread.sleep(1000);

			// Contact No

			driver.findElement(By.xpath("//*[@id=\"txtContactNo\"]")).sendKeys(ContactNo);
			Thread.sleep(1000);

			// DOB

			driver.findElement(By.xpath("//*[@id=\"txtDOB\"]")).sendKeys(DOB);
			Thread.sleep(1000);

			// Sequence

			driver.findElement(By.xpath("//*[@id=\"txtSequence\"]")).sendKeys(Sequence);
			Thread.sleep(1000);

			// Consignee Person

			if (ConsigneePerson.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkConsigneePerson\"]")).click();
				Thread.sleep(1000);
			}

			// Consignee Person For Warranty

			if (ConsigneePersonForWarranty.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkWConsigneePerson\"]")).click();
				Thread.sleep(1000);
			}

			// Alert Limit

			if (AlertLimit.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkAlertLimit\"]")).click();
				Thread.sleep(1000);
			}

			// Upper Limit

			if (UpperLimit.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkUpperLimit\"]")).click();
				Thread.sleep(1000);
			}

			// Order Blocked

			if (OrderBlocked.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkOrderBlocked\"]")).click();
				Thread.sleep(1000);
			}

			// Pur DR

			if (PurDR.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkPurDr\"]")).click();
				Thread.sleep(1000);
			}

			// Sale CR

			if (SaleCR.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkSaleCr\"]")).click();
				Thread.sleep(1000);
			}

			// Claim Setl

			if (ClaimSetl.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkClaimSetl\"]")).click();
				Thread.sleep(1000);
			}

			// MAC CR

			if (MACCR.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkMACCr\"]")).click();
				Thread.sleep(1000);
			}

			// MAC DR

			if (MACDR.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkMACDr\"]")).click();
				Thread.sleep(1000);
			}

			// Wallet FB

			if (WalletFB.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkWalletFb\"]")).click();
				Thread.sleep(1000);
			}

			// Not Visible To SPM

			if (NotVisibleToSPM.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"ChkNotVisible\"]")).click();
				Thread.sleep(1000);
			}

			// Add More Matrix

		driver.findElement(By.xpath("//*[@id=\"AddMoreMatrix\"]")).click();

			// REGION BY LOGISTICS COMPANY

			driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[5]/div[1]/h4/a")).click();

			// Company Name

			WebElement name = driver.findElement(By.id("ddlCompany"));
			name.sendKeys(CompanyName);
			Thread.sleep(2000);

			// Zone

			WebElement regionzone = driver.findElement(By.id("ddlZone"));
			regionzone.sendKeys(Zone);
			Thread.sleep(2000);

			// Zone for Delivery Surface

			// Default Company

			if (DefaultCompany.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkDefaultCompany\"]")).click();
				Thread.sleep(1000);
			}

			// Not Visible To SPM

			if (NotVisibleToSPM1.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkNotVisibleCompany\"]")).click();
				Thread.sleep(1000);
			}

			// Add More Region

			driver.findElement(By.xpath("//*[@id=\"AddMoreRegion\"]")).click();

			// VIRTUAL ACCOUNT

			driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[7]/div[1]/h4/a")).click();

			WebElement account = driver.findElement(By.id("ddlVirAccountNo"));
			account.sendKeys(VirtualAccountNo);
			Thread.sleep(2000);

			// LOGISTICS COMPANY FOR WAREHOUSE

			WebElement ele = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[8]/div[1]/h4/a"));

			Actions act = new Actions(driver);

			act.click(ele).build().perform();

			// Company Name

			// Delivery Surface

			WebElement logname = driver.findElement(By.id("ddlWHCompany"));
			logname.sendKeys(CompanyName1);
			Thread.sleep(2000);

			// Zone

			// Zone for Delivery Surface

			WebElement logzone = driver.findElement(By.id("ddlWHZone"));
			logzone.sendKeys(Zone1);

			// Default Company

			if (DefaultCompany1.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkWHDefaultCompany\"]")).click();
				Thread.sleep(1000);
			}

			// For Warranty

			if (ForWarranty.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkWHWarranty\"]")).click();
				Thread.sleep(1000);
			}

			// For Other

			if (ForOther.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkWHOther\"]")).click();
				Thread.sleep(1000);
			}

//				 For DOC

			if (ForDoc.equals("Y")) {
				driver.findElement(By.xpath("//*[@id=\"chkWHDoc\"]")).click();
				Thread.sleep(1000);
			}
//				
			// Add More Warehouse

			driver.findElement(By.xpath("//*[@id=\"AddMoreWHLSP\"]")).click();

			// Submit

				driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();

		}
	}
}