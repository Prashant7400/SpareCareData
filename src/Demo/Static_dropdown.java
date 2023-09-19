package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main (String[]args) {
		System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement ele = driver.findElement(By.id("Skills"));
		
		Select drpdown = new Select(ele);
		drpdown.selectByIndex(5);
		System.out.println(drpdown.getFirstSelectedOption().getText());
		drpdown.selectByValue("Adobe Photoshop");
		System.out.println(drpdown.getFirstSelectedOption().getText());
		drpdown.selectByVisibleText("Javascript");
		System.out.println(drpdown.getFirstSelectedOption().getText());
		
	}
}
