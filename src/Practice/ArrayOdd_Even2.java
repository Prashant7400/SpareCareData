package Practice;

public class ArrayOdd_Even2 {

	public static void main(String[] args) {

		int n = 101;
		if(isEven(n))
			System.out.println("even");
		else
			System.out.println("odd");
	}
	
	public static boolean isEven(int n) {
		
		boolean isEven = true;
		
		for(int i =1;i<=n;i++) 
			isEven = !isEven;
			
			return isEven;
		
		
		
	}

}
