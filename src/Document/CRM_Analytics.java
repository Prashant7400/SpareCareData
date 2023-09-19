package Document;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class CRM_Analytics {
	
	public static void main(String []args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
	
	//System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://insights.inservices.tatamotors.com/analytics/saw.dll?Dashboard");
	driver.findElement(By.id("idUser")).sendKeys("LRAIKA1001330");
	driver.findElement(By.id("idPassword")).sendKeys("Crm@2018");
	driver.findElement(By.id("btn_login")).click();
	
	//click dashboard
	
	driver.findElement(By.xpath("//span[text()=\"Dashboards\"]")).click();
	
	// click CVBU spares
	
	driver.findElement(By.xpath("//a[text()=\"CVBU Spares\"]")).click();
	
	// click transactional reports
	
	driver.findElement(By.xpath("//div[text()=\"Transactional Reports\"]")).click();
	
	// click Stock Transaction Register - With Adjustment
	
	driver.findElement(By.xpath("(//a[text()=\"Stock Transaction Register - With Adjustment\"])[1]")).click();
	
	
	
	
	
	
	
	

}
}