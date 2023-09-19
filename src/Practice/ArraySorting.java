package Practice;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int arr[] = {3,56,32,57,12,8,-65,-6,3,-30,-80};
		
		System.out.println("original array");
		for(int num : arr) {
			System.out.println(num);
		}
		Arrays.sort(arr);
		System.out.println("sort array");
		for(int num : arr) {
			System.out.println(num);
		}

	}

}
