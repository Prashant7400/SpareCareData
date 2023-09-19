package ChromeDevTool;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

public class EmulationMethod {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver(opt);
		
		DevTools dev = driver.getDevTools();
		
		dev.createSession();
		
		
		
		
		
		
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		
	}

}
