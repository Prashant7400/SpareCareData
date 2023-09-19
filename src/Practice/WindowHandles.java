package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.supersitare.in/Account/RegisterNew");
		
		String parent =  driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();	
		
		Iterator<String> i= child.iterator();
		
		while(i.hasNext()) {
			String win = i.next();
			
			if(!parent.equals(win)) {
				driver.switchTo().window(win);
				
				System.out.println(driver.switchTo().window(win).getTitle());
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		

		
	}

}
