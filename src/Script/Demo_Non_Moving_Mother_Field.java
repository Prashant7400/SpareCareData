package Script;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Non_Moving_Mother_Field {
	
	
	// FOR CONSIGNEE TYPE MOTHER
	
public static void main (String[] args) throws FileNotFoundException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.sparecare.in/UAD_SC_WAC/Login.aspx");
		driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"tbx_UserName\"]")).sendKeys("rana");
		driver.findElement(By.xpath("//input[@id=\"tbx_Password\"]")).sendKeys("rana@0615");
		driver.findElement(By.xpath("//input[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[15]/a/span")).click();
		driver.findElement(By.xpath("//span[text()=\"Dealer Location Setting\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"btn_Submit\"]")).click();
		
		
		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Scope\\non moving mother consignee  filed.txt");
		System.setOut(ps);
		
		
		WebElement selectbrand = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[1]/label"));
		System.out.println(selectbrand.getText());
		
		WebElement selectdealer = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[2]/label"));
		System.out.println(selectdealer.getText());
		
		WebElement selectlocation = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[3]/label"));
		System.out.println(selectlocation.getText());
		
		WebElement ConsigneeType = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[4]/label"));
		System.out.println(ConsigneeType.getText());
		
		WebElement InventorySale = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[5]/label"));
		System.out.println(InventorySale.getText());
		
		WebElement NonMovingSale = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[6]/label"));
		System.out.println(NonMovingSale.getText());
		
		WebElement  StockTransfer = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[7]/label"));
		System.out.println(StockTransfer.getText());
		
		WebElement SaleFactor = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[8]/label"));
		System.out.println(SaleFactor.getText());
		
		WebElement AgeFactor = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[9]/label"));
		System.out.println(AgeFactor.getText());
		
		WebElement StockAdjustment = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[11]/label"));
		System.out.println(StockAdjustment.getText());
		
		WebElement SelfOrdersvehicle = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[12]/label"));
		System.out.println(SelfOrdersvehicle.getText());
		
		WebElement SelfOrdersStock = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[13]/label"));
		System.out.println(SelfOrdersStock.getText());
		
		WebElement StockTransfer1  = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[14]/label"));
		System.out.println(StockTransfer1.getText());
		
		WebElement IDK = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[15]/label"));
		System.out.println(IDK.getText());
		
		
		WebElement Other = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[16]/label"));
		System.out.println(Other.getText());
		
		
		WebElement OpeningStockDate = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[17]/label"));
		System.out.println(OpeningStockDate.getText());
		
		WebElement OpeningStockUpload =  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[18]/label"));
		System.out.println(OpeningStockUpload.getText());
		

}
}