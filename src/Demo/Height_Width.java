package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Height_Width {
	
	public static void main(String[]args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement text = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		
		// Dimension
		
		// 1st way to getheight and getwidth of text box using getRect
		
		System.out.println(text.getRect().getDimension().getHeight());
		System.out.println(text.getRect().getDimension().getWidth());
		System.out.println(   );
	
		
		// 2nd way to getheight and getwidth of text box using Dimension class
		
		Dimension d = text.getSize();
		System.out.println("Heigth : "+d.height+" Width : "+d.width);
		System.out.println(   );
		
		// Location
		
		// 1st way to get X & Y coordinate using getRect
		
		System.out.println(text.getRect().getPoint().getX());
		System.out.println(text.getRect().getPoint().getY());
		System.out.println(   );

		// 2nd way to get X & Y coordinate using Point class
		
		Point p = text.getLocation();
		System.out.println("X : "+p.x+" Y : "+p.y); 

		
	}

}
