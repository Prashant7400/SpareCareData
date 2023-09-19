package Practice;

import java.util.Arrays;

public class Array_Dup1 {
	
	// array duplicate value using Arrays.sort

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,4};
		
		Arrays.sort(arr);
		
		for(int i =0;i<=arr.length-1;i++) {
			
			if(arr[i]==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}

}
