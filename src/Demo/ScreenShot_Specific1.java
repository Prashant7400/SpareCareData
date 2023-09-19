package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Specific1 {
	
	// screenshot of specific field only not overall page

public static void main(String[]args) throws IOException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
	    WebDriver driver= new ChromeDriver(opt);
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    
	    WebElement text = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	    
	    text.sendKeys("Taware");
	    
	   File source =  text.getScreenshotAs(OutputType.FILE);
	   
	   File Destination = new File("C:\\Scripts\\screenshotspecific.jpg");
	   
	   FileHandler.copy(source, Destination);

}
}