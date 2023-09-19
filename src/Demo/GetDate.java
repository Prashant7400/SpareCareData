package Demo;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetDate {
	
	public static void main(String[]args) throws FileNotFoundException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
	    WebDriver driver= new ChromeDriver(opt);
	    driver.manage().window().maximize();
//	    driver.get("https://www.javatpoint.com/software-testing-tutorial");
	    driver.navigate().to("https://demo.automationtesting.in/Register.html");
	    
	    SimpleDateFormat datefor = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	    
	    Date date = new Date();
	    
	   String curdate = datefor.format(date);
	   
	   PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Date.txt");
	   ps.println(curdate);
	   
	   
	   
	   
	   
	    
//	   


	 
	 
	    
	}

}
