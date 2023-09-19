package Inheritance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Inher {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
	    driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	}
	
	@Test
	
	public void url() {
		
		driver.get("https://demo.automationtesting.in/Register.html");

	}
	

	
}
