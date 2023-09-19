package Demo;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe112\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Prashant");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()=\" Submit \"]")).click();
//		driver.findElement(By.linkText("WebTable")).click();
		driver.findElement(By.partialLinkText("WebTabl")).click();

	}
}
