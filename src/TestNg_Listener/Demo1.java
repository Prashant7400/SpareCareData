package TestNg_Listener;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;

	@Test
	public void Thar() {
		System.out.println(" Mahindra ");
	}

	@Test
	public void Jeep() {
		System.out.println(" Compass ");
		Assert.assertTrue(false);
	}


	@Test
	public void XC90() {

		System.out.println(" Volvo ");
	}

}
