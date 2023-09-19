package Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Broken_Links1 {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.supersitare.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	
		for(WebElement lk : links) {
			String url = lk.getAttribute("href");
			
			if(url !=null && !url.isEmpty()) {
				
				try {
					URL ul = new URL(url);
					HttpURLConnection conn = (HttpURLConnection) ul.openConnection();
					
					conn.connect();
					
					int rescode = conn.getResponseCode();
					
					if(rescode == 200) {
						System.out.println("Links Working Fine " + url);
						
						
					}
					else {
						System.out.println("Broken link found " + url);
					}
				}
				catch(Exception e) {
					
					System.out.println("Exception " +e.getMessage());
				}
			}
		}
		
		
	}

}
