package Script;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class CRM {
	public static void main(String [] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://boodmo.com/");
		
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
		
		driver.get("https://crmdms.inservices.tatamotors.com/workshop");
		driver.findElement(By.id("s_swepi_1")).sendKeys("IM_1003540");
		driver.findElement(By.id("s_swepi_2")).sendKeys("Tata@2018");
		driver.findElement(By.id("s_swepi_22")).click();
		
		driver.findElement(By.xpath("//span[@class=\"siebui-icon-tb-sitemap ToolbarButtonOn\"]")).click();
		driver.findElement(By.linkText("MIS - Spares")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("MIS - Spares")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("s_1_1_16_0_Ctrl")).click();
		
	}

}
