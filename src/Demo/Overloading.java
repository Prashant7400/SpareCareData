package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Overloading {
public static void main(String[]args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-dev-shm-usage");
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();

		driver.get("https://www.headspin.io/");
		method1(10, 20);
		method1("Prashant", "Taware");
		

}
public static  int method1(int a,int b) {
	System.out.println("method1");
	int c = a+b;
	return c;
}

public static String method1(String p,String t) {
	System.out.println("method2");
	String d =p+t;
	return d;
}

}