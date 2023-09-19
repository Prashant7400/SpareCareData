package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select {

	public static void main(String[]args) throws InterruptedException {
		
		// Dropdown by Select Class
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.switchTo().newWindow(WindowType.TAB);
		
		WebElement item = driver.findElement(By.id("Skills"));
		Select sel = new Select(item);
		sel.selectByIndex(7);
		System.out.println(sel);
		
		Thread.sleep(2000);
		sel.selectByValue("Javascript");
		System.out.println(sel);

		Thread.sleep(2000);
		sel.selectByVisibleText("Java");
		System.out.println(sel);

		
		
		
	}
}
