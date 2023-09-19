package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize(); 
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		
		Actions act = new Actions(driver);
		
		WebElement clk =  driver.findElement(By.xpath("//label[text()=\"Private Limited\"]"));
		
		act.contextClick(clk).build().perform();
		
		
		

		
	}

}
