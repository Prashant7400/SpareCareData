package Script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown11 {
	
		
		public static void main(String[] args) throws IOException, InterruptedException, InvalidFormatException {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");

		String ExcelsheetPath = "C:\\Users\\Admin\\Desktop\\dropdown from excel.xlsx"; // To open file
		
		FileInputStream inpuitstram = new FileInputStream(ExcelsheetPath);
	   // This class has method to read and write excel.
		
		XSSFWorkbook workbook = new XSSFWorkbook(inpuitstram);
		
		XSSFSheet Sheet  = workbook.getSheetAt(0);
		
		//Using for loop
	    int row  =  Sheet.getLastRowNum();
//	    System.out.println(row);
	    int col =Sheet.getRow(0).getLastCellNum();
	    
	    
		for(int r=0;r<=row;r++) {
		XSSFRow row1=Sheet.getRow(r);
					
		 for(int c=0;c<col;c++) {
			 
			 XSSFCell Cell = row1.getCell(c);
			

					String years = row1.getCell(0).getStringCellValue();
					String months = row1.getCell(1).getStringCellValue();
					String days = row1.getCell(2).getStringCellValue();
			  
			 switch(Cell.getCellType()){
				 
			 case STRING : System.out.print(Cell.getStringCellValue()); break;
			 case NUMERIC : System.out.print(Cell.getNumericCellValue());break;
			 case BOOLEAN:  System.out.print(Cell.getBooleanCellValue());break;			 
			 }		 
			 
			 System.out.print(" | ");
		 }
		 
		 System.out.println();
		}	
	}
}


