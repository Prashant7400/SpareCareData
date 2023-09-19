package Practice;

public class Recursion {
	
	// print 1 to 10 without for loop

	public static void main(String[] args) {

		Recursion.print(1);
	}
	
	public static void print(int i) {
		 
		if(i <= 10) {
			System.out.println(i);
			print(i+1);
			
			
		}
}
	
}
