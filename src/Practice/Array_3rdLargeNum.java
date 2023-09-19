package Practice;

import java.util.Arrays;

public class Array_3rdLargeNum {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7};
		System.out.println(thirdLargeNum(arr,7));
		

	}
	
	public static int thirdLargeNum(int arr[], int total) {
		
		Arrays.sort(arr);
		return arr[total-3];
		
		
		
		
		
	}

}
