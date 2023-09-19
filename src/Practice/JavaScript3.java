package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript3 {
	
	// scroll down page to the bottom page

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe" );
		ChromeDriver driver = new  ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		

	}

}
