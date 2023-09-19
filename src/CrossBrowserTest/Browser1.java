package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Browser1 {
	
	WebDriver driver;

	@Test
	public void edge() {
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.edge.driver","C:\\EdgeExe116\\msedgedriver.exe");
		driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.navigate().to("https://jklcsky.in/");
		
		
		
	}
	
}
