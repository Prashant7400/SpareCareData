package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radio_Button {
	
	public static void main (String[]args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		// Static way to select radio buttons
		
//		driver.findElement(By.xpath("//div[text()=\"round trip\"]")).click();
		
		// Dyanamic way to select radio buttons
		
		 int a = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]")).size();
		 
		 System.out.println(a);
		 
		 for(int i =0;i<=a;i++) {
			 driver.findElements(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]")).get(0).click();
		 }
		 
		 	
		
	}

}
