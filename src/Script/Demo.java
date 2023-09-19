package Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void mani (String [] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Registration.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("rowcount  :"+rowcount+ "cellcount  :"+cellcount);
		
		for(int i = 0;i<rowcount;i++) {
			
			Row celldata = sheet.getRow(i);
			
			String fname = celldata.getCell(0).getStringCellValue();
			String  Lname = celldata.getCell(1).getStringCellValue();
			String address = celldata.getCell(2).getStringCellValue();
			String email = celldata.getCell(3).getStringCellValue();
			String phonenum = celldata.getCell(4).getStringCellValue();
			
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(fname);
			
			
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(Lname);

			
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(address);

			
			driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(email);
			
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(phonenum);


		}
		
		
		
		
		
	
	}

}
