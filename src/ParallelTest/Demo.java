package ParallelTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;

	@Test
	public void data() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		System.out.println(driver.getTitle());


	}

	@Test
	public void data1() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://jklsky.com/");
		System.out.println(driver.getTitle());

	}

}
