package Practice;

public class Array_Min {

	public static void main(String[] args) {
		
		int arr[] = {234,-7,456,-79,3,562,};
		
		int i;
		
		int min = arr[0];
		
		for(i=0;i<arr.length-1;i++) {
			
			if(arr[i]<min)
				min=arr[i];
		}

		System.out.println(min);
	}

}
