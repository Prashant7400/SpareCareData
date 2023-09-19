package Demo;

import org.testng.annotations.Test;

public class TestNg_Annotation {
	
	@Test
	public void Audi() {
		System.out.println("A8");
	}
	@Test()
	public void Mahindra() {
		System.out.println("Thar");
	}
	@Test()
	public void Jeep() {
		System.out.println("Wrangler");
	}
	@Test(dependsOnMethods= {"Jeep"})
	public void BMW() {
		System.out.println("X7");
	}

}
