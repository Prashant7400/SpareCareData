package Practice;

public class ThisKeyword1 {
	
	// this keyword current class method

	public static void main(String[] args) {
		
		ThisKeyword1 tk = new ThisKeyword1();
		tk.Demo1();
		

	}

	public void Demo() {
		System.out.println("HELLO DEMO");
	}
	
	public void Demo1() {
		System.out.println("HELLO DEMO1");
		this.Demo();
	}
}

