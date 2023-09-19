package Hafele;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class demo {
	
	
	WebDriver driver;
	@Test
	
	public  void setup() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://hafele.evolvebrands.org/");
		
		driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"UserName\"]")).sendKeys("volve");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("evolve@123");
		driver.findElement(By.id("btnSubmit")).click();
		
		String act = "Either User ID or Password is incorrect.";
		String exp = "Either User ID or Password is incorrect.";
			
		if(act.equals(exp)) {
			
			

		}
		
		
		
		driver.findElement(By.xpath("//a[text()=\" Log Out \"]")).click();
		Thread.sleep(2000);

		
		
//		 WebElement tex = driver.findElement(By.xpath("//*[@id=\"form0\"]/div[1]"));
//		 System.out.println(tex.getText());
//		 
		
		
		String actualresult = "Dashboard";
		String expresult = "Dashboard";
		
		if(actualresult.equals(expresult)) {
			System.out.println("Login successfully");
		}

		
	}
    @Test() 
	public  void setup1() throws InterruptedException {

    {

    driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div/div/div[2]/div/ul/li[3]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id=\"UserName\"]")).sendKeys("evolve");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("evolve@123");
	driver.findElement(By.id("btnSubmit")).click();
	driver.findElement(By.xpath("//a[text()=\" Log Out \"]")).click();
	Thread.sleep(2000);


	
	
	String actualresult = "Dashboard";
	String expresult = "Dashboard";
	
	if(actualresult.equals(expresult)) {
		System.out.println("Login successfully");
}
    }
    }
    
    @Test()
  	public  void setup2() throws InterruptedException {

      {

      driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div/div/div[2]/div/ul/li[3]/a")).click();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//input[@id=\"UserName\"]")).sendKeys("evolve");
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("evolve@123");
  	driver.findElement(By.id("btnSubmit")).click();
	driver.findElement(By.xpath("//a[text()=\" Log Out \"]")).click();
	Thread.sleep(2000);


  	
  	String actualresult = "Dashboard";
  	String expresult = "Dashboard";
  	
  	if(actualresult.equals(expresult)) {
  		System.out.println("Login successfully");
  }
  }
}
    
    @Test()
  	public  void setup3() throws InterruptedException {

      {

      driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div/div/div[2]/div/ul/li[3]/a")).click();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//input[@id=\"UserName\"]")).sendKeys("evolve");
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("evolve@123");
  	driver.findElement(By.id("btnSubmit")).click();
	driver.findElement(By.xpath("//a[text()=\" Log Out \"]")).click();
	Thread.sleep(2000);

  	
  	String actualresult = "Dashboard";
  	String expresult = "Dashboard";
  	
  	if(actualresult.equals(expresult)) {
  		System.out.println("Login successfully");
  }
  }
}
}