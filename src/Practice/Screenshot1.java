package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		
		WebElement ele = driver.findElement(By.xpath("//input[@name=\"OfficeMobile\"]"));
		
		//  1st way to takescreenshot
		
		File source = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
				
		File destination = new File("C:\\Screenshot\\mobfield.jpg");
		
		FileHandler.copy(source, destination);
		
		// 2nd way to takesscreenshot
		
//        File source = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(source, new File("C:\\Screenshot\\mobfield1.jpg"));
//		
		
		
		
		
	}

}
