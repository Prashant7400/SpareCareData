package Demo;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		
		int [] arr = {3,7,1,9,43};
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
