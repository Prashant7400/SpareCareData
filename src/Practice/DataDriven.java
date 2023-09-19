package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataDriven {

	public static void main(String[] args) throws IOException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

//		System.setProperty("webdriver.chrome.driver","C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();

		ArrayList al = new ArrayList();

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\practicedatadriven.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(file);

		int sh = wb.getNumberOfSheets();
		System.out.println(sh);

		XSSFSheet sheet = wb.getSheet("login");

		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);

		int cellcount = sheet.getRow(sh).getPhysicalNumberOfCells();
		System.out.println(cellcount);

		
		Object[][] data = new Object[rowcount-1][cellcount];
		
		
		al.add(data);
		
		System.out.println(al);
		

	}
}
