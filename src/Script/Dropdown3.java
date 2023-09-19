package Script;

import static org.testng.Assert.assertEquals;

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

public class Dropdown3 {
	
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
			
//			 driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();	

			Select sel = new Select(driver.findElement(By.id("yearbox")));
			
			List<WebElement> we  = sel.getOptions();
			
			 ArrayList<String> expect = new ArrayList<String>();
			 ArrayList<String> actual = new ArrayList<String>();

			 
//			 String data = sheet.getRow(i).getCell(0).getStringCellValue();
			 expect.add(years);
			 
//			 System.out.println(years);
//			 System.out.println();

			 List<WebElement>  list = driver.findElements(By.xpath("//select[@id=\"yearbox\"]//option"));	
			 for(WebElement ele : list) {
				String opt = ele.getText();
				actual.add(opt);
				
				
//				System.out.println(opt);
				
					
				
				// compare
				
				if(expect.size()==actual.size()) {
					
					for(int j =0; j < expect.size();j++) {
						
						if(expect.get(j).equals(actual.get(j))) {
							break;
						}
					}
				}
				
					 
					
				}
				
			 }			

}
	}

