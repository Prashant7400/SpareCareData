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

public class Script_Max_Setting {
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();
		
		// Click Max Setting
		
		driver.findElement(By.xpath("//span[text()=\"Max Setting\"]")).click();
		
		// Click Setting 
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[18]/ul/li[1]/a/span")).click();
		
		// Click Add Dealer Location Setting
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[4]/div/input[2]")).click();
		
        FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Dealer Onboarding\\BALLARY INFO.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =  workbook.getSheet("MaxSetting");
		
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(2).getLastCellNum();
		
		System.out.println("Rowcount  :"+rowcount);
		System.out.println("Cellcount  :"+cellcount);
		
		
      	for(int i=2;i<=rowcount;i++) {
			
			Row celldata = sheet.getRow(i);

			String SelectBrand  = celldata.getCell(0).getStringCellValue();
			String SelectDealer = celldata.getCell(1).getStringCellValue();
			String SelectLocation = celldata.getCell(2).getStringCellValue();
			String SettingName = celldata.getCell(3).getStringCellValue();
			
			
			// Select Brand
			
			WebElement brand = driver.findElement(By.id("ddlbrand"));
			brand.sendKeys(SelectBrand);
			Thread.sleep(2000);
					
			
			// Select Dealer 
			
			WebElement dealer = driver.findElement(By.id("ddldealer"));
			dealer.sendKeys(SelectDealer);
			Thread.sleep(2000);
			
			
			// Select Location
			
			WebElement location = driver.findElement(By.id("ddllocation"));
			location.sendKeys(SelectLocation);
			Thread.sleep(2000);

			
			// Click Copy Brand Data
			
			
			
			
			
			// Submit
			
			driver.findElement(By.id("btn_Submit")).click();
			
			
			
			

		    
		    
			

		

}
}
}
