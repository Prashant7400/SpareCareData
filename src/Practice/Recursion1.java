package Practice;

public class Recursion1 {

	public static void main(String[] args) {
		
		Recursion1.add(10, 20);

	}
	
	public static void add(int i, int j) {
		
		int c = i + j ;
		System.out.println(c);
		add(i,j);
		
		
		
		
	}

}
