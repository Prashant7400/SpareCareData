package Script;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dealer_Management_Field {
	
	
public static void main (String[] args) throws FileNotFoundException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.id("btnsubmit")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Dealer Management \"]")).click();
		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();

		
		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Scope\\dealer management field.txt");
		System.setOut(ps);
		
		WebElement Dealername = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[1]"));
		System.out.println(Dealername.getText());
		
		WebElement brand = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[2]"));
		System.out.println(brand.getText());
		
		WebElement BrandSegment = driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[3]"));
		System.out.println(BrandSegment.getText());
		
		WebElement ParentCode =  driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[4]"));
		System.out.println(ParentCode.getText());
		
		WebElement ApprovingStatus =  driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[5]"));
		System.out.println(ApprovingStatus.getText());
		
		WebElement ReportingStatus =  driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[6]"));
		System.out.println(ReportingStatus.getText());
		
		WebElement SharingStatus =  driver.findElement(By.xpath("(//label[@for=\"inputPassword3\"])[7]"));
		System.out.println(SharingStatus.getText());
		
		WebElement submit = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		System.out.println(submit.getText());
		
		Thread.sleep(1000);
		driver.close();

}
}