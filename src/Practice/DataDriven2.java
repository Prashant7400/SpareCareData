package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven2 {
	

	// using testng with object array
	
	@Test(dataProvider="Test")
	public void setup(String username, String password ) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://jklcsky.in/Home/Login");
		
		driver.findElement(By.cssSelector("input[id=\"UserName\"]")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input[id=\"txtPassword\"]")).sendKeys(password);
		
		driver.findElement(By.cssSelector("input[id=\"btnSubmit\"]")).click();
		
		
	}
	
	@DataProvider(name="Test")
	public Object[][] getdata() {
		
//		
//		HashMap<Object,Object> map = new HashMap<Object,Object>();
//		map.put("Username", "Username");
//		map.put("adsd", "as123");
//		return map{{map}};

		
		Object [][] data = new Object[2][2];
		
		data[0][0] = "dwe";
		data[0][1] = "ad123";
		
		data[1][0] = "jnd";
		data[1][1] = "df123";
		
		return data;
		
		
	}

}
