package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {

//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
//		opt.addArguments("no-sandbox");
//		opt.addArguments("disable-div-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.supersitare.in/Account/RegisterNew");
		
		WebElement clk = driver.findElement(By.cssSelector("input[value=\"Wholesaler\"]"));
		
		// Usnig Action class to click element
		
		Actions act = new Actions(driver);
		
		act.click(clk).build().perform();
		

}
	
}
