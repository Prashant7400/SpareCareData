package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicPass {
	
	// get password by Dynamically 
	
	public static void main (String []ars) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		String name = "Prashant";
		
		DynamicPass ps = new DynamicPass();
		String pass = ps.getpass(driver);
		
//		getpass(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();

		
		
	}
	public String getpass(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Reset Login\"]")).click();
		String text = driver.findElement(By.xpath("//p[text()=\"Please use temporary password 'rahulshettyacademy' to Login.\"]")).getText();
		
		// Please use temporary password 'rahulshettyacademy' to Login.

		// 0th index = Please use temporary password 
		//1th index = rahulshettyacademy' to Login.
		
		String [] pass = text.split("'");
		pass[0].split("'");
		
		
		// 0th index = rahulshettyacademy 
		//1th index = to Login.
		
		String[] pass1 = pass[1].split("'");
		String password =pass1[0];
		return password;
		
	}

}
