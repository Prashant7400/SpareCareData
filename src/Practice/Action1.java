package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("no-sandbox");
		opt.addArguments("disable-div-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.supersitare.in/Account/RegisterNew");
		
		WebElement send = driver.findElement(By.cssSelector("input[name=\"OfficeMobile\"]"));
		
		// Using Action class to sendelement element
		
		Actions act = new Actions(driver);
		
		act.sendKeys(send, "1234567890").build().perform();
		
		

	}

}
