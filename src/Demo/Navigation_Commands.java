package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation_Commands {
	
	public static void main(String [] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
//		driver.navigate().refresh();
//		driver.navigate().to("https://www.tutorialspoint.com/");
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
		
		 WebElement size = driver.findElement(By.id("Skills"));
		 System.out.println(size.getSize());
		 System.out.println(size.getAttribute("id"));
		 
		 Point p = size.getLocation();
		 System.out.println(size.getLocation());
		 System.out.println("X : "+p.x+ "Y : "+p.y);
		 
		 
		 
		 Dimension dim  =  size.getSize();
		 System.out.println(size.getSize());
		 System.out.println("Heigth : "+dim.height +"Width : "+dim.width);
		 
		 
		 
		 
		 
		
		
	}

}
