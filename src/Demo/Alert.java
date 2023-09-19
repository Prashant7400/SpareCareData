package Demo;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {

	
public static void main(String[]args) throws InterruptedException, AWTException {
		
//		System.setProperty("webdriver.edge.driver", "C:\\Edge\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driver.get("https://demo.automationtesting.in/Alerts.html");
//		
//		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().getText();

	int arr [] = new int[5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	
	for(int i = 0;i<arr.length;i++) {
		
	
	System.out.println(arr[i]);
	}

	int arr1[]= {1,3,5,6};
//	System.out.println(arr1.length);
	
	
	ArrayList al = new ArrayList();
	al.add(12);
	al.add("Prashant");
	al.add(74.74);
	al.add('T');
	al.add("Taware");
	al.remove(2);
	
	for(int i = 0;i<al.size();i++) {
		System.out.println(al);
	} 
	
	
	
	String s ="Prashant Popatrao Taware";
	String[] splitstr = s.split("Popatrao");
	System.out.println(splitstr[0]);
	System.out.println(splitstr[1]);
//	System.out.println(splitstr[2]);
	System.out.println(splitstr[1].trim());
	
	
	for(int i = 0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
	System.out.println("***********");
	
	// Reverse String
	
	for(int i=s.length()-1;i>=0;i-- ) {
		System.out.println(s.charAt(i));
	}

 
	
	
	
}
}
