package TestNg;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners

public class Demo implements ITestListener{
	
	
	@Test
	public void Mahindra() {
		System.out.println("Thar");
	}
	
	@Test
	public void Jeep() {
		System.out.println("Compass");
	}

	
}
