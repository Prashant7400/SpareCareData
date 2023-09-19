package Practice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import zmq.ZError.IOException;

public class Broken_Links {

	public static void main(String[] args) throws java.io.IOException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe116\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement LK : links) {
		String url = LK.getAttribute("href");
		if(url !=null&& !url.isEmpty()) {
			try {
				
				URL ul = new URL(url);
				
				HttpURLConnection conn = (HttpURLConnection) ul.openConnection();
//				conn.setRequestMethod("HEAD");
				conn.connect();
				
				int rescode =  conn.getResponseCode();
				
				if(rescode>=200 && rescode <400) {
					
					System.out.println("link working fine " + url);
				}
				else {
					System.out.println("Broken Link Found " + url);
				}
				
			} catch(MalformedURLException e) {
				System.out.println("Exception while checking link" + e.getMessage());
			}
		}
		}
	}
}



