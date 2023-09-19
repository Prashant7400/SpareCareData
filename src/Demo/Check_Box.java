package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Check_Box {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		System.out.println(driver.findElement(By.cssSelector("input[id*=\"friendsandfamily\"]")).isSelected());
		
		
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=\"friendsandfamily\"]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=\"friendsandfamily\"]")).click();
		
//		System.out.println(driver.findElement(By.cssSelector("input[id*=\"friendsandfamily\"]")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=\"friendsandfamily\"]")).isSelected());

		
		
		// count of Check boxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());

}
}
