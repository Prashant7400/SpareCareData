package Practice;

import java.util.Arrays;

public class Array_Sum1 {

	// Using Stream class
	
	public static void main(String[] args) {

		int arr [] = {1,2,3,4};
		int add = Arrays.stream(arr).sum();
		System.out.println(add);
		
	}

}
