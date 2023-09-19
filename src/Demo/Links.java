package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Links {
	
	public static void main(String[]args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();

		driver.get("https://www.headspin.io/");
		
		// All links on webpage
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// links in footer on webpage
		
		 WebElement footer = driver.findElement(By.xpath("//div[@class=\"section footer wf-section\"]"));
		
		// limiting webdriver scope
		 	
		System.out.println(footer.findElements(By.tagName("a")).size());  
		
		// links in footer on webpage each column
		
		WebElement footercol = footer.findElement(By.xpath("//div[@class=\"footer-box\"]/div[2]/div[2]"));
		
		System.out.println(footercol.findElements(By.tagName("A")).size());
		
		footercol.findElement(By.tagName("A"));
		
		
		
		
	}

}
