package Practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array_Max1 {
	
	// Using Streams class

	public static void main(String[] args) {
		
		int arr [] = {1,2,300,4,7};
		 OptionalInt maximum =  Arrays.stream(arr).max();
		 System.out.println(maximum);
		
		

	}

}
