package Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown7 {

	public static void main(String[] args) throws IOException, InterruptedException, InvalidFormatException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\dropdown from excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");

//		int rowcount = sheet.getLastRowNum();
//		int cellcount = sheet.getRow(0).getLastCellNum();

//		System.out.println(rowcount);
//		System.out.println(cellcount);

//		for (int i = 1; i <= rowcount; i++) {
//			Row celldata = sheet.getRow(i);
//	 driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();	

			String years = sheet.getRow(0).getCell(0).getStringCellValue();
//			String months = celldata.getCell(1).getStringCellValue();
//			String days = celldata.getCell(2).getStringCellValue();	
			
		    List<WebElement> dropdownElements = driver.findElements(By.xpath("//select[@id=\"yearbox\"]//option"));
            for(WebElement element : dropdownElements) {
            	String opt =  element.getText();
//       		 driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();	

            	if(years.equals(element.getText())) {
          		 driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();	

            		element.click();
            	}
            	System.out.println(opt);
            }
			
			
			
		}
	
}
