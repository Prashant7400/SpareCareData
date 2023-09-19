package Practice;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int arr [] = {3,8,-98,56,9,05,88};
		Arrays.sort(arr);
		for(int i = arr.length-1 ; i <= 0; i--) {
			System.out.println(arr[i]);
		}
		
	}

}
