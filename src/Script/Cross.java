package Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cross {
	
	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Spare Care Gainer\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Miscellenous\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Sale List upload\"]")).click();
		
		// Click Upload Non Moving
		
		driver.findElement(By.xpath("//input[@name=\"btn_Submit\"]")).click();
		
		driver.findElement(By.xpath("//option[text()=\"JCB\"]")).click();
		
		driver.findElement(By.xpath("//option[text()=\"MGB MOTOR & AUTO AGENCIES\"]")).click();
		
		WebElement loa = driver.findElement(By.id("ContentPlaceHolder1_ddllocation"));
		System.out.print(loa.getText());
	}

}
