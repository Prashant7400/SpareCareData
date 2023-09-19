package Script;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown8 {

	public static void main(String[] args) throws IOException, InterruptedException, InvalidFormatException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		List<String> cellValue = new ArrayList<String>();
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\dropdown from excel.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        DataFormatter formatter = new DataFormatter();
        for (Iterator<Row> iterator = sheet.rowIterator(); iterator.hasNext();) {
            XSSFRow row = (XSSFRow) iterator.next();
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                XSSFCell cell = row.getCell(i);
                cellValue.add(formatter.formatCellValue(cell));
                
                
            }
		
}
}
}
