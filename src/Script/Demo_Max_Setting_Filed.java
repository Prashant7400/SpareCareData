package Script;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Max_Setting_Filed {
	
public static void main (String[] args) throws FileNotFoundException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.sparecare.in/UAD_SC_WAC/Login.aspx");
		driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"tbx_UserName\"]")).sendKeys("rana");
		driver.findElement(By.xpath("//input[@id=\"tbx_Password\"]")).sendKeys("rana@0615");
		driver.findElement(By.xpath("//input[@id=\"btnsubmit\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[17]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[17]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[4]/div/input[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ddlbrand\"]/option[14]")).click();
		driver.findElement(By.xpath("//*[@id=\"ddldealer\"]/option[67]")).click();
		driver.findElement(By.xpath("//*[@id=\"ddllocation\"]/option[2]")).click();
		
		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Scope\\max setting field.txt");
		System.setOut(ps);
		
		
		
		WebElement SelectBrand = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div[2]/div/div/div[2]/label"));
		System.out.println(SelectBrand.getText());
		
		WebElement SelectDealer = driver.findElement(By.xpath("//*[@id=\"divDealer\"]/label"));
		System.out.println(SelectDealer.getText());
		
		WebElement SelectLocation = driver.findElement(By.xpath("//*[@id=\"divLocation\"]/label"));
		System.out.println(SelectLocation.getText());
		
//		WebElement CopyBrandData = driver.findElement(By.xpath("//*[@id=\"divCopyData\"]/label"));
//		System.out.println(CopyBrandData.getText());
		
		WebElement ChildSetting1 = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[1]/td/label"));
//		ChildSetting1.click();
		System.out.println(ChildSetting1.getText());
		
		WebElement HighRangeHighLevel = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[2]/td/label"));
		System.out.println(HighRangeHighLevel.getText());
		
		WebElement LowRangeLowLevel = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[3]/td/label"));
		System.out.println(LowRangeLowLevel.getText());
		
		WebElement HighRangeLowLevel = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[4]/td/label"));
		System.out.println(HighRangeLowLevel.getText());
		
		WebElement LowRangeHighLevel = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[5]/td/label"));
		System.out.println(LowRangeHighLevel.getText());
		
		WebElement 
		HighRangeHighLevel_5May2022 = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[6]/td/label"));
		System.out.println(
				HighRangeHighLevel_5May2022.getText());
		
		WebElement HighRangeLowLevel_5May2022 = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[7]/td/label"));
		System.out.println(HighRangeLowLevel_5May2022.getText());
		
		WebElement SmalMotherHRHL = driver.findElement(By.xpath("//*[@id=\"ChkCopyData\"]/tbody/tr[8]/td/label"));
		System.out.println(SmalMotherHRHL.getText());
		
	
		

}

}
