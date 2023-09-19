package Practice;

public class Array_Sum {

	public static void main(String[] args) {

		int arr[] = { 1,2,3,4 };

		int sum = 0;
		int i;

		for (i = 0; i <= arr.length - 1; i++) {

			sum = sum + arr[i];

		}

		System.out.println(sum);

	}

}
