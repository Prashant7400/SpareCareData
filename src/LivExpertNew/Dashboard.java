package LivExpertNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Dashboard {
	
	@ Test
	public void setup() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

//		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe112\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.livexpert.in/");
		driver.findElement(By.id("Username")).sendKeys("evolve");
		driver.findElement(By.id("Password")).sendKeys("evolve@adm");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Technician\"]")).click();
		
	}

}
