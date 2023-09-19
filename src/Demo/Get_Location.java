package Demo;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Location {
	
	// get Location are used find location of webelement in x,y
	
public static void main(String[]args) throws FileNotFoundException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
	    WebDriver driver= new ChromeDriver(opt);
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    
	   WebElement text = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	   
	   Point p = text.getLocation();
	   System.out.println("X : "+p.x+"  Y : "+p.y);
	   
	   
	   

}
}