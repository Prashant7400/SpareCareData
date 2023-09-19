package Practice;

public class String_Reverse {
	
	// By Using toCharArray()

	public static void main(String[] args) {

		String s ="Prashant Taware";
		
		char [] reverse =  s.toCharArray();
		
		for(int i = reverse.length-1; i >= 0 ; i-- ) {
			System.out.print(reverse[i]);
			
		}
		
	}

}
