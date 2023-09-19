package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSugg_Dropdown {
	public static void main(String[]args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe112\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("rus");
		Thread.sleep(3000);
		
		List<WebElement> options =  driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		
		for(WebElement  option: options) {
			if(option.getText().equalsIgnoreCase("Russian Federation")) {
				option.click();
				break;
			} 
		}

}
}