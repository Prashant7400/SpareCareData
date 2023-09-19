package Practice;

import java.util.Arrays;

public class Array_2ndLargeNum {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,8,7};
		
		System.out.println(secondlargrnum(arr,8));

		
		
	}

	public static int secondlargrnum(int arr[],int total) {
		

		Arrays.sort(arr);
		return arr[total-2];

		
		
		
	}
}
