package Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Script_Non_Moving_Mother_Cosignee {
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Non-Moving\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Dealer Location Setting\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[4]/div/input[2]")).click();
		
		

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Dealer Onboarding\\BALLARY INFO.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("MotherNonMov");
		
		int rownum = sheet.getLastRowNum();
		int cellnum = sheet.getRow(2).getLastCellNum();
		
		System.out.println("rownum : "+rownum+ "cell num : "+cellnum);
		
		for(int i =2;i<=rownum;i++) {
			XSSFRow data = sheet.getRow(i);
			
			
			String SelectBrand = data.getCell(0).getStringCellValue();
			String SelectDealer = data.getCell(1).getStringCellValue();
			String SelectLocation  = data.getCell(2).getStringCellValue();
			String ConsigneeType = data.getCell(3).getStringCellValue();
            String InventorySale = data.getCell(4).getStringCellValue();
			String NonMovingSale  = data.getCell(5).getStringCellValue();
			String PurchaseStockTransfer = data.getCell(6).getStringCellValue();
//			String SaleFactor = data.getCell(7).getStringCellValue();
//			String AgeFactor = data.getCell(8).getStringCellValue();
//			String StockAdjustment = data.getCell(9).getStringCellValue();
//			String SelfOrdersVehicle = data.getCell(10).getStringCellValue();
//			String SelfOrdersStock = data.getCell(11).getStringCellValue();
//			String BTMStockTransfer  = data.getCell(12).getStringCellValue();
//			String IDK  = data.getCell(13).getStringCellValue();
//			String Other  = data.getCell(14).getStringCellValue();
		
			
			
			// Select Brand
			
			WebElement brand = driver.findElement(By.id("ddlbrand"));
			brand.sendKeys(SelectBrand);

			Thread.sleep(1000);
			
			
			// Select Dealer
			
			WebElement dealer = driver.findElement(By.id("ddldealer"));
			dealer.sendKeys(SelectDealer);
			Thread.sleep(2000);
			
			// Select Location
			
			WebElement location = driver.findElement(By.id("ddllocation"));
			location.sendKeys(SelectLocation);
			Thread.sleep(2000);

			
			
			// Consignee Type

			WebElement consignetype = driver.findElement(By.xpath("//label[text()=\"Mother\"]"));
			if(ConsigneeType.equals(consignetype.getText())) {
				driver.findElement(By.xpath("//label[text()=\"Mother\"]")).click();
				
			}
			
			WebElement consignetype1 = driver.findElement(By.xpath("//label[text()=\"Child\"]"));
			if(ConsigneeType.equals(consignetype1.getText())) {
				driver.findElement(By.xpath("//label[text()=\"Child\"]")).click();
				
			}
			
			WebElement consignetype2 = driver.findElement(By.xpath("//label[text()=\"Single\"]"));
			if(ConsigneeType.equals(consignetype2.getText())) {
				driver.findElement(By.xpath("//label[text()=\"Single\"]")).click();
				
			}
			
			// Inventory Sale
			
			WebElement invensale = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div[1]/label/label"));
			if(InventorySale.equals(invensale.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div[1]/label/label")).click();
			}
			
			WebElement invensale1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div[2]/label/label"));
			if(InventorySale.equals(invensale1.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div[2]/label/label")).click();
			}
			
			WebElement invensale2 =  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div[3]/label/label"));
			if(InventorySale.equals(invensale2.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/div/div[3]/label/label")).click();
			}
			
			// Non Moving Sale

			WebElement nmovsale = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[6]/div/div[1]/label/label"));
			if(NonMovingSale.equals(nmovsale.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[6]/div/div[1]/label/label")).click();
			}
			
			WebElement nmovsale1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[6]/div/div[2]/label/label"));
			if(NonMovingSale.equals(nmovsale1.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[6]/div/div[2]/label/label")).click();
			}
			
			WebElement nmovsale2 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[6]/div/div[3]/label/label"));
			if(NonMovingSale.equals(nmovsale2.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[6]/div/div[3]/label/label")).click();
			}
			
			// Purchase / Stock Transfer
			
			WebElement stocktranfer  = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[7]/div/div[1]/label/label"));
			if(PurchaseStockTransfer.equals(stocktranfer.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[7]/div/div[1]/label/label")).click();
			}
			
			WebElement stocktranfer1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[7]/div/div[2]/label/label"));
			if(PurchaseStockTransfer.equals(stocktranfer1.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[7]/div/div[2]/label/label")).click();
			}
			
			WebElement stocktranfer2 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[7]/div/div[3]/label/label"));
			if(PurchaseStockTransfer.equals(stocktranfer2.getText())) {
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[7]/div/div[3]/label/label")).click();
			}
			
			
			// Sale Factor
			
			
			driver.findElement(By.xpath("(//option[text()=\"12-Months\"])[1]")).click();
			
			
			// Age Factor
			
			driver.findElement(By.xpath("(//option[text()=\"6-Months\"])[2]")).click();
			
			
			// Stock Adjustment
			
			
			driver.findElement(By.xpath("//option[text()=\"1\"]")).click();
			
			
			// Self Orders (Vehicle)
			
			driver.findElement(By.xpath("(//option[text()=\"2\"])[2]")).click();
			
			
			// Self Orders (Stock) 
			
			driver.findElement(By.xpath("(//option[text()=\"3\"])[3]")).click();
			
			
			// BTM/Stock Transfer
			
			driver.findElement(By.xpath("(//option[text()=\"4\"])[4]")).click();
			
			// IDK
			
			driver.findElement(By.xpath("(//option[text()=\"5\"])[5]")).click();
			
			// Other
			
			driver.findElement(By.xpath("(//option[text()=\"6\"])[6]")).click();
			
			Thread.sleep(1000);
			
						
			//submit
			
			driver.findElement(By.xpath("//*[@id=\"btn_Submit\"]")).click();
			
				
			
		}
		
}
}