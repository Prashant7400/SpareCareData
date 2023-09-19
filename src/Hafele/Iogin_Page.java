package Hafele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iogin_Page {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://hafele.evolvebrands.org/");
		
		driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"UserName\"]")).sendKeys("evolve");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("evolve@123");
		driver.findElement(By.id("btnSubmit")).click();
		
		driver.findElement(By.xpath("//option[text()=\"NORTH\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()=\"CHANDRAKANT  GUPTA\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()=\"SAKSHI PURANIK\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()=\"Andhra Pradesh\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()=\"Anantapur\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()=\"Hyderabad\"]")).click();
		
		
		
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Region  \"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Area Manager  \"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Sales Executive \"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"State  \"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"District  \"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"City  \"]")).getText());
		
		
		WebElement text =  driver.findElement(By.xpath("//span[text()=\"Total Onboarded Influencers \"]"));
		System.out.println(text.getText());
		
		WebElement text1 = driver.findElement(By.xpath("//span[text()=\"Total Approved Influencers  \"]"));
		System.out.println(text1.getText());
		
		WebElement text2 = driver.findElement(By.xpath("//span[text()=\"Total Active Influencers  \"]"));
		System.out.println(text2.getText());
		Thread.sleep(3000);
		
//		driver.close();
		
	}
}
