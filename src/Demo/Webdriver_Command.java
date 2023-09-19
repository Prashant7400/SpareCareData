package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_Command {
	
	public static void main (String[]args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		// Get 
	
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// getTitle
		
		System.out.println(driver.getTitle());
		
		//  getCurrentURL
		
		System.out.println(driver.getCurrentUrl());
		
		// getPageSource
		
		System.out.println(driver.getPageSource());
		
		Thread.sleep(4000);
		
		// close
		
//		driver.close();
		
		// quit
		
		driver.quit();
		
		

}
}