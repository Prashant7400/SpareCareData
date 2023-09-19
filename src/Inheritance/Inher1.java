package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Inher1 extends Inher {
	
	WebDriver driver ;
		
	@Test
	public void field() {
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Prashant");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Taware");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Malegaon");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Pras@123");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("324123");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.id("checkbox1")).click();
		
	}

}
