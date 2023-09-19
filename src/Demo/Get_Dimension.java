package Demo;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Dimension {
	
	// get Dimension to used get Heigth and Width 

public static void main(String[]args) throws FileNotFoundException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
	    WebDriver driver= new ChromeDriver(opt);
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    
	   WebElement text = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	   
	    Dimension d = text.getSize();
	    
	    System.out.println(d);	   

}
}
