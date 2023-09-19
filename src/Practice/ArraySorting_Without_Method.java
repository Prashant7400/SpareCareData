package Practice;

public class ArraySorting_Without_Method {
	
	// without using sort method with ascending order

	public static void main(String[] args) {

		int arr[] = { 8, 88, 90, 0, -1, 54,-32,2,-8 };

		for (int i = 0; i <= arr.length-1; i++) {

			for (int j = i + 1; j <= arr.length-1; j++) {

				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}

			}
			System.out.println(arr[i]);
		}

	}
}
