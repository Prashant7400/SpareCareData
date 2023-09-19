package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSwitch {

	public static void main(String[] args) {

		// switch to new tab

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
		driver.quit();
		
		
	}

}
