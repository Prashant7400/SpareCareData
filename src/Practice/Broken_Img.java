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

public class Broken_Img {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeExe114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.supersitare.in/");
		

		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		
		System.out.println(imgs.size());

		for (WebElement pic : imgs) {

			String pho = pic.getAttribute("src");

			if (pho != null && !pho.isEmpty()) {
				try {
					URL ul = new URL(pho);

					HttpURLConnection conn = (HttpURLConnection) ul.openConnection();

					int rescode = conn.getResponseCode();
					conn.connect();

					if (rescode >= 200 && rescode < 400) {
						System.out.println("No broken img " + pho);
					} else {
						System.out.println("Broken img found " + pho);
					}

				} catch (Exception e) {
					System.out.println("Exception message " + e.getMessage());
				}
			}
		}

	}

}
