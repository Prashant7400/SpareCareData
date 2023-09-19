package Demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetDate1 {

	public static void main(String []args) throws FileNotFoundException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement text = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		text.sendKeys("Prashant");
		
		SimpleDateFormat formatdate = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		Date avadate = new Date();
		
		String curdate = formatdate.format(avadate);
		
		PrintStream p = new PrintStream("C:\\Users\\Admin\\Desktop\\dateformat.txt");
		p.println(curdate);
		
		
		
		
		
	}
}
