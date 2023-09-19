package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Dropdown {
	
	public static void main(String[]args) {
	System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	
	driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).click();
	
	System.out.println(	driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).getText());
//	int i =1;
//	while(i<5) {
//	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
//	i++;
//	}
	
	
//	for(int j =1;j<5;j++) {
//		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
//
//	}
	
	
	int k =1;
	do {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
		k++;
	}
	while(k<5);
	
	driver.findElement(By.xpath("//div[@style=\"width: 90px;\"]")).click();
//	System.out.println(	driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).getText());
	
	
	Assert.assertEquals(driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).getText(), "5 Adults");


	}
}