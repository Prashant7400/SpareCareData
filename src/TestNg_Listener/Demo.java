package TestNg_Listener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo implements ITestListener {
	WebDriver driver;

	@Override

	public void onTestStart(ITestResult result) {

		System.out.println(" on Test Start");

	}

	@Override

	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test success");

	}

	@Override

	public void onTestFailure(ITestResult result) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");

		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();

		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File Destination = new File("C:\\Users\\Admin\\Desktop\\All\\Listener\\screenshot2.png");

		try {
			FileHandler.copy(Source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get("https://www.toolsqa.com/testng/testng-listeners/");
		System.out.println("on test failure  " + result.getName());

	}

	@Override

	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");

	}

	@Override

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println(" on Test failed with percentage");

	}

	@Override

	public void onStart(ITestContext context) {
		System.out.println(" on start");

	}

	@Override

	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}
}
