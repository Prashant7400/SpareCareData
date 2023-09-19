package Practice;

public class Demo3 {
	
	private  int  i = 1;

	public static void main(String[] args) {

		int i = 2;
		
		Demo3 de = new Demo3();
		de.someMethod();
	}

	public static void someMethod() {
		System.out.println(i);
	}
}
