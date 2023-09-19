package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_vs_Navigate_to {

	public static void main (String[]args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","C:\\Edge\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
}
}