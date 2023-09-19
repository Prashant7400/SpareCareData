package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript {

	public static void main(String[] args) {
		
		// click action using javascriptexecutor 

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement clk = driver.findElement(By.cssSelector("input[value=\"Wholesaler\"]"));
		
		js.executeScript("arguments[0].click()",clk );
		
		
		
	}

}
