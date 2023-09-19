package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_Dropdown {
	
	public static void main (String[]args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
//		System.setProperty("webdriver.edge.driver","C:\\Edge\\msedgedriver.exe" );
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div")).click();
//		driver.findElement(By.xpath("//div[text()=\"Delhi\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()=\"Pune\"]")).click();

		//Parent Child Relationship Xpath
		
		driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-18u37iz\"]//div[text()=\"Bengaluru\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-18u37iz\"]//div[text()=\"Pune\"]")).click();
		
		
		
}
}