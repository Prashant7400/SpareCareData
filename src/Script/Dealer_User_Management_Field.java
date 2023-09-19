package Script;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dealer_User_Management_Field {
	
	
public static void main (String[] args) throws FileNotFoundException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.id("btnsubmit")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Dealer User Management \"]")).click();
		
		
		// ADD DEALER USER
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[4]/div/input[2]")).click();
		
		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Scope\\dealer user management  field.txt");
		System.setOut(ps);
		
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div[2]/div/div/div[4]/div/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddldealerstaff\"]/option[4]")).click();
		
		
		WebElement SelectDealerStaffCategory = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[1]/label"));
		System.out.println(SelectDealerStaffCategory.getText());
		
		WebElement SelectDealer = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[2]/label"));
		System.out.println(SelectDealer.getText());
		
		
		WebElement SelectLocation = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[3]/label"));
		System.out.println(SelectLocation.getText());
		
		
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[4]/label"));
		System.out.println(FirstName.getText());
		
		
		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[5]/label"));
		System.out.println(Lastname.getText());
		
		
		WebElement DOB = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[6]/label"));
		System.out.println(DOB.getText());
		
		
		WebElement Workingsince = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[7]/label"));
		System.out.println(Workingsince.getText());
		
		
		WebElement EMAIL = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[8]/label"));
		System.out.println(EMAIL.getText());
		
		WebElement Contactnumber = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[9]/label"));
		System.out.println(Contactnumber.getText());
		
		
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[10]/label"));
		System.out.println(Username.getText());
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[11]/label"));
		System.out.println(Password.getText());
		
		
		WebElement Confirmpassword = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Tr_CopFirmPwd\"]/label"));
		System.out.println(Confirmpassword.getText());
		
		
		WebElement Accessright = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[13]/label"));
		System.out.println(Accessright.getText());
		
		
		WebElement Otherdetails = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Label2\"]"));
		System.out.println(Otherdetails.getText());
		
		
		WebElement Modules = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[15]/label/strong"));
		System.out.println(Modules.getText());
		
		
		WebElement Selectmodules = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[16]/div[1]/strong"));
		System.out.println(Selectmodules.getText());
		
		
		WebElement Modulesselected = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[16]/div[1]/strong"));
		System.out.println(Modulesselected.getText());
		
		
		WebElement Status = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[5]/div/div/div/div/div/div/div[17]/label"));
		System.out.println(Status.getText());
		
		WebElement modules =driver.findElement(By.id("ContentPlaceHolder1_lstAttribute"));
		System.out.println(modules.getText());
		
		
		WebElement mod = driver.findElement(By.xpath("ContentPlaceHolder1_lstSelectAtbute"));
		System.out.println(mod.getText());


		
	
		
		
}
}
