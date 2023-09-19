package Practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array_Min1 {

	public static void main(String[] args) {
		
		// Using Stream class
		
		int arr[] = {3,6,67,8,-1};
		
		 OptionalInt minimum = Arrays.stream(arr).min();
		 
		 System.out.println(minimum);

	}

}
