package Script;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Workshop_Management_Field {
	
public static void main (String[] args) throws FileNotFoundException {
		
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
		
		driver.findElement(By.xpath("//span[text()=\"Workshop Management \"]")).click();
		
		 WebElement Addworkshop = driver.findElement(By.xpath("//input[@name=\"btn_Submit\"]"));
		 Addworkshop.click();
		 
		 PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Scope\\workshop management field.txt");
		 System.setOut(ps);

		 
		 
		 WebElement  SelectBrand = driver.findElement(By.xpath("(//label[@class=\"col-sm-2 control-label required\"])[1]"));
		 System.out.println(SelectBrand.getText());
		 
		 WebElement  SelectDealer = driver.findElement(By.xpath("(//label[@class=\"col-sm-2 control-label required\"])[2]"));
		 System.out.println(SelectDealer.getText());
		 
		 WebElement  WorkshopLocation = driver.findElement(By.xpath("(//label[@class=\"col-sm-2 control-label required\"])[3]"));
		 System.out.println(WorkshopLocation.getText());
		 
		 WebElement  LocationPrifix = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[4]"));
		 System.out.println(LocationPrifix.getText());
		 
		 WebElement  StartDatewithSpareCareSolutions = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[5]"));
		 System.out.println(StartDatewithSpareCareSolutions.getText());
		 
		 WebElement  OEMCode = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[6]"));
		 System.out.println(OEMCode.getText());
		 
				 
		 WebElement  ConsigneeType  = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[7]"));
		 System.out.println(ConsigneeType .getText());
		 
		 WebElement  EndDatewithSpareCareSolutions = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[9]"));
		 System.out.println(EndDatewithSpareCareSolutions.getText());
		 
		 WebElement  AuditExecutive  = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[10]"));
		 System.out.println(AuditExecutive .getText());
		 
		 WebElement  OrderingConsultant = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[11]"));
		 System.out.println(OrderingConsultant.getText());
		 
		 WebElement  OEMExecutive = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[12]"));
		 System.out.println(OEMExecutive.getText());
		 
		 WebElement  Status = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[13]"));
		 System.out.println(Status.getText());
		 
		 WebElement  SharingStatus = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[14]"));
		 System.out.println(SharingStatus.getText());
		 
		 WebElement  OrderGenerationStatus = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[15]"));
		 System.out.println(OrderGenerationStatus.getText());
		 
		 WebElement  BDM = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[16]"));
		 System.out.println(BDM.getText());
		 
		 WebElement  AutoApproval = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[17]"));
		 System.out.println(AutoApproval.getText());
		 
		 WebElement  DeshboardPPNI = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[18]"));
		 System.out.println(DeshboardPPNI.getText());
		 
		 WebElement  LowStockAlert  = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[19]"));
		 System.out.println(LowStockAlert .getText());
		 
		 WebElement  LiveStocktoSale  = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[20]"));
		 System.out.println(LiveStocktoSale .getText());
		 
		 //driver.findElement(By.xpath("//input[@id=\"btnSubmit\"]")).click();
		 
//			PrintWriter outputfile = new PrintWriter("C:\\Users\\Admin\\Desktop\\workshop management field.txt");
//			//replace your System.out.print("your output");
//			    outputfile.println(SelectBrand.getText());
//			    outputfile.println(SelectDealer.getText());
//			    outputfile.println(WorkshopLocation.getText());
//			    outputfile.println(LocationPrifix.getText());
//			    outputfile.println(StartDatewithSpareCareSolutions.getText());
//			    outputfile.println(OEMCode.getText());
//			    outputfile.println(AuditExecutive.getText());
//			    outputfile.println(OrderingConsultant.getText());
//			    outputfile.println(OEMExecutive.getText());
//			    outputfile.println(Status.getText());
//			    outputfile.println(SharingStatus.getText());
//			    outputfile.println(OrderGenerationStatus.getText());
//			    outputfile.println(BDM.getText());
//			    outputfile.println(AutoApproval.getText());
//			    outputfile.println(DeshboardPPNI.getText());
//			    outputfile.println(LowStockAlert.getText());
//			    outputfile.println(LiveStocktoSale.getText());


//			    outputfile.close();
		 
	}
	
	
	
}
