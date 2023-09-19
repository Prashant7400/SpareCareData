package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sibling_to_Sibling_Xpath {
	public static void main (String[]args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","C:\\Edge\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
		
//		System.out.println(driver.manage().window().getPosition());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		Thread.sleep(2000);
//		driver.close();
		
	}
}
