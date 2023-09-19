package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Demo_Dealer_Management_Add_Dealer {
	
	
	// FOR HARDCODE VALUE 
	
	public static void main(String []args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.sparecare.in/UAD_SC_WAC/Login.aspx");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("rana");
		driver.findElement(By.id("tbx_Password")).sendKeys("rana@0615");
		driver.findElement(By.id("btnsubmit")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Dealer Management \"]")).click();
		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
				
		// ENTER DEALER NAME
		
		driver.findElement(By.id("ContentPlaceHolder1_txtdealername")).sendKeys("Mahindra1");
		
		// CLICK BRAND
		
		driver.findElement(By.xpath("//option[text()=\"Mahindra\"]")).click();
		
		// SELECT BREAND SEGMENT
		
		driver.findElement(By.xpath("//option[text()=\"Four-Wheeler\"]")).click();

		// APPROVING STATUS
		driver.findElement(By.xpath("(//label[text()=\"Active\"])[1]")).click();
		
		// REPORTING STATUS
		
		driver.findElement(By.xpath("(//label[text()=\"Active\"])[2]")).click();
		
		// SHARING STATUS

		driver.findElement(By.xpath("(//label[text()=\"Inactive\"])[3]")).click();
		
		Thread.sleep(2000);
		
		// SUBMIT
		
		driver.findElement(By.id("ContentPlaceHolder1_btn_Submit")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
}


