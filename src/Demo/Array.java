package Demo;

public class Array {

	public static void main(String[] args) {

		int[] arr3 = { 2, 5, 7, 8, 24, 70 };

		int i;

		int max = arr3[0];

		for (i = 0; i <= arr3.length-1; i++) {

			if (arr3[i] > max)

				max = arr3[i];

		}

		System.out.println(max);

	}
}