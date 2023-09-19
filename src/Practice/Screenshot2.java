package Practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		
		// partial screenshot

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.supersitare.in/Account/RegisterNew");
		
		WebElement ele =  driver.findElement(By.xpath("//label[text()=\"Registration Type :-\"]"));
		
		File sou = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		 int x = ele.getLocation().getX();
		 int y = ele.getLocation().getY();
		 int width = ele.getSize().getWidth();
		 int height = ele.getSize().getHeight();
		 
		 BufferedImage img = ImageIO.read(sou);
		
		BufferedImage crop = img.getSubimage(x, y, width, height);
		
		File dest = new File("C:\\Screenshot\\cropedimg.jpg");
		
		ImageIO.write(crop, "jpg",dest);
	}

}
