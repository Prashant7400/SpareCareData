package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.Assert;

public class Assertion_False {
	
	public static void main (String []args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		// AssertFalse(False)
		
	    Assert.assertFalse(driver.findElement(By.xpath("//div[text()=\"round trip\"]")).isSelected());

	    System.out.println(driver.findElement(By.xpath("//div[text()=\"round trip\"]")).isSelected());
	    
	    driver.findElement(By.xpath("//div[text()=\"Family & Friends\"]")).click();

	    
	    // AssertFalse(True)
	    
	    Assert.assertFalse(true);
	    
	    System.out.println(driver.findElement(By.xpath("//div[text()=\"round trip\"]")).isSelected());
	    
	    driver.findElement(By.xpath("//div[text()=\"Family & Friends\"]")).click();
	    
	
		
	}

}
