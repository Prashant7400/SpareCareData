package Script;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	
	public static void main(String[] args) throws IOException, InterruptedException, InvalidFormatException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\dropdown from excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");

		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();

		System.out.println(rowcount);
		System.out.println(cellcount);

		for (int i = 1; i <= rowcount; i++) {
			Row celldata = sheet.getRow(i);

			String years = celldata.getCell(0).getStringCellValue();
			String months = celldata.getCell(1).getStringCellValue();
			String days = celldata.getCell(2).getStringCellValue();
			
			
		WebElement we = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		
		Select sel = new Select(we);
		
		String option  = sel.getFirstSelectedOption().getText();
		
		List<WebElement> alloption  = sel.getOptions();
//		 driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();	
		 

		for(WebElement opt : alloption ) {
//		 driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();	

			if(years.equals(opt.getText())) {
				
      			 driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[2]")).click();	
				 
			}
			System.out.println(opt.getText());

		}
		
		}
	}
}
		
		
		
		
		
		
		
		


