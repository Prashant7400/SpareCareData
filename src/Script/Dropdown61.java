package Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown61 {

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

//		System.out.println(rowcount);
//		System.out.println(cellcount);

//		 driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();	

		for (int i = 1; i <= rowcount; i++) {
			Row celldata = sheet.getRow(i);

			String years = celldata.getCell(0).getStringCellValue();
			String months = celldata.getCell(1).getStringCellValue();
			String days = celldata.getCell(2).getStringCellValue();			
		
			

String[] exp = {"2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013"}; 
WebElement dropdown = driver.findElement(By.id("yearbox"));  
        Select select = new Select(dropdown);  

        List<WebElement> options = select.getOptions();  
        for(WebElement we:options)  
        {  
         for (int j=0; i<exp.length; i++){
             if (we.getText().equals(exp[i])){
             System.out.println("Matched");
             } 
           }
        }
		}
	}

}
			 
			 
			 
			 
			 
			 
//			 System.out.println(years);
//			 System.out.println();

//			 
//			 List<WebElement>  list = driver.findElements(By.xpath("//select[@id=\"yearbox\"]//option"));	
//			 for(WebElement ele : list) {
//				String opt = ele.getText();
//				actual.add(opt);

		
	

