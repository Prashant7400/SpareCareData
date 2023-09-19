package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Assertion_True {

	public static void main (String []args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		//AssertTrue(True)
		
		driver.findElement(By.xpath("//div[text()=\"Senior Citizen\"]")).click();
		Thread.sleep(1000);
		
		Assert.assertTrue( driver.findElement(By.xpath("//div[text()=\"Senior Citizen\"]")).isSelected());
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.xpath("//div[text()=\"Senior Citizen\"]")).isSelected());
		 

		
		//AssertTrue(False)
//		
//    	driver.findElement(By.xpath("//div[text()=\"round trip\"]")).click();
//		
//		Assert.assertTrue( driver.findElement(By.xpath("//div[text()=\"round trip\"]")).isSelected());
//		
//		System.out.println(driver.findElement(By.xpath("//div[text()=\"round trip\"]")));
		

		
		
		
}
}