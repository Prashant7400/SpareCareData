package Script_Live;

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

public class Script_Dealer_User_Management {
	
	
public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Dealer User Management \"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[4]/div/input[2]")).click();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Dealer Onboarding mahanth motors (1).xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =  workbook.getSheet("DlrUsrMgmt");
		
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(2).getLastCellNum();
		
		System.out.println("Rowcount  :"+rowcount);
		System.out.println("Cellcount  :"+cellcount);
		
		for(int i=2;i<=rowcount;i++) {
			
			Row celldata = sheet.getRow(i);

			String SelectDealerStaffCategory = celldata.getCell(0).getStringCellValue();
			String SelectDealer = celldata.getCell(1).getStringCellValue();
			String SelectLocation = celldata.getCell(2).getStringCellValue();
			String Firstname = celldata.getCell(3).getStringCellValue();
			String Lastname = celldata.getCell(4).getStringCellValue();
			String DateofBirth  = celldata.getCell(5).getStringCellValue();
			String WorkingSince = celldata.getCell(6).getStringCellValue();
			String EMail = celldata.getCell(7).getStringCellValue();
			String Contactnumber = celldata.getCell(8).getStringCellValue();
			String Username = celldata.getCell(9).getStringCellValue();
			String Password = celldata.getCell(10).getStringCellValue();
			String ConfirmPassword = celldata.getCell(11).getStringCellValue();
			String AccessRights  = celldata.getCell(12).getStringCellValue();
			String SelectModules = celldata.getCell(13).getStringCellValue();
//			String ModulesSelected = celldata.getCell(6).getStringCellValue();
			String Status = celldata.getCell(17).getStringCellValue();
			
			
			
			// Select Dealer Staff Category
			
			driver.findElement(By.xpath("//option[text()=\"Spare Parts Manager\"]")).click();
			Thread.sleep(1000);
			
			// Select Dealer
			
			WebElement dealer = driver.findElement(By.id("ContentPlaceHolder1_cmb_dealer"));
			dealer.sendKeys(SelectDealer);
			Thread.sleep(1000);

			
			// Select Location 
			
			WebElement location = driver.findElement(By.id("ContentPlaceHolder1_cmb_location"));
			location.sendKeys(SelectLocation);
			Thread.sleep(1000);

			
			// First name
			
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbx_FirstName\"]")).sendKeys(Firstname);
			Thread.sleep(1000);

			
			// Last name
			
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbx_LastName\"]")).sendKeys(Lastname);
			Thread.sleep(1000);

			
			// Date of Birth
			
			driver.findElement(By.xpath("//*[@id=\"txtstartdate\"]")).sendKeys(DateofBirth);
			Thread.sleep(1000);

			
			// Working Since
			
			driver.findElement(By.xpath("//*[@id=\"txtworkingdate\"]")).sendKeys(WorkingSince);
			Thread.sleep(1000);

			
			// E-Mail
			
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbx_Email\"]")).sendKeys(EMail);
			Thread.sleep(1000);

			
			// Contact number
			
			driver.findElement(By.id("ContentPlaceHolder1_tbx_Mobile")).sendKeys(Contactnumber);
			Thread.sleep(1000);

			// Username
			
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbx_UserName\"]")).sendKeys(Username);
			Thread.sleep(1000);

			
			// Password
			
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbx_pwd\"]")).sendKeys(Password);
			Thread.sleep(1000);

			
			// ConfirmPassword
			
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tbx_cpwd\"]")).sendKeys(ConfirmPassword);
			Thread.sleep(1000);

			
			// Access Rights
			
			WebElement view = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_chkview\"]"));
			
			if(AccessRights.equals(view.getText())) {
				driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_chkview\"]")).click();
			}
			
			WebElement edit =  driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_chkedit\"]"));
			
			if(AccessRights.equals(edit.getText())) {
				driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_chkedit\"]")).click();
			}
			
			// Select Modules
			
			WebElement selmodules = driver.findElement(By.id("ContentPlaceHolder1_lstAttribute"));
			selmodules.sendKeys(SelectModules);
			
			
			// modules selected field
			
			
//			
//			// Button Left to Right
//			
//			driver.findElement(By.id("bt_LR")).click();
			
//			
//			// Modules Selected
//			
//			WebElement modselected = driver.findElement(By.id("ContentPlaceHolder1_lstSelectAtbute"));
//			modselected.sendKeys(ModulesSelected);
			
			
			
			// Status
//			
//			WebElement active = driver.findElement(By.xpath("//option[text()=\"Active\"]"));
//			
//			if(Status.equals(active.getText())) {
//				driver.findElement(By.xpath("//option[text()=\"Active\"]")).click();
//			}
//			
//			WebElement inactive = driver.findElement(By.xpath("//option[text()=\"Inactive\"]"));
//			
//			if(Status.equals(inactive.getText())) {
//				driver.findElement(By.xpath("//option[text()=\"Inactive\"]")).click();
//			}
//			
			// Submit 
			
//			driver.findElement(By.id("ContentPlaceHolder1_btn_Submit")).click();
			


			

}
}
}


