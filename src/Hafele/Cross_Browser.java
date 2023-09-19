package Hafele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser {
	
	WebDriver driver;
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		if(browser.equals("Edge")){
			System.setProperty("webdriver.edge.driver","C:\\Edge\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("http://hafele.evolvebrands.org/");
			driver.findElement(By.xpath("//a[text()=\" LOG IN \"]")).click();
			driver.findElement(By.name("UserName")).sendKeys("evolve");
			driver.findElement(By.name("Password")).sendKeys("evolve@123");
			driver.findElement(By.id("btnSubmit")).click();
		}
	
		if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Extension 111\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://hafele.evolvebrands.org/");
			driver.findElement(By.xpath("//a[text()=\" LOG IN \"]")).click();
			driver.findElement(By.name("UserName")).sendKeys("evolve");
			driver.findElement(By.name("Password")).sendKeys("evolve@123");
			driver.findElement(By.id("btnSubmit")).click();
	}
	
//	@Test
//	public void testParameterWithXML() throws InterruptedException{
//		driver.get("http://hafele.evolvebrands.org/");
//		driver.findElement(By.xpath("//a[text()=\" LOG IN \"]")).click();
//		driver.findElement(By.name("UserName")).sendKeys("evolve");
//		driver.findElement(By.name("Password")).sendKeys("evolve@123");
//		driver.findElement(By.id("btnSubmit")).click();
		
		
}
		
	

}
