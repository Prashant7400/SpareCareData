package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Boodmo {
	
	public static  void main(String [] args) throws IOException, InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://boodmo.com/");
		
		
		
   FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\boodmo.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =  workbook.getSheet("data");
		
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Rowcount  :"+rowcount);
		System.out.println("Cellcount  :"+cellcount);
		
		for(int i=1;i<=rowcount;i++) {
			
			Row celldata = sheet.getRow(i);

			String partnumber = celldata.getCell(0).getStringCellValue();
			
			// part number
			driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(partnumber);
			
			// search
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			// click of search partnum
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[@class=\"product-item-list__title__name\"]")).click();
			
			
			
			
			
//			driver.switchTo().newWindow(WindowType.TAB);
			
			 Set<String> w = driver.getWindowHandles();
			 
		      Iterator<String> t = w.iterator();
		      String parentwin = t.next(); 
		      String Childwin = t.next();
			

			driver.switchTo().window(Childwin);
			
			Thread.sleep(4000);

			
			 WebElement element = driver.findElement(By.xpath("(//h3[@class=\"h2-section\"])[5]"));
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			
			WebElement items = driver.findElement(By.xpath("@class=\"compatibility-list__item__in\""));
			items.getText();
			System.out.println(items);
		
			
	}

}
}
