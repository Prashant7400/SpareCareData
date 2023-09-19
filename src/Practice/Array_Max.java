package Practice;

public class Array_Max {

	public static void main(String[] args) {

		int arr[] = {231,35,-452,4,67,90};
		
		int i;
		
		int max =arr[0];
		
		for(i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) 
				max=arr[i];
			
		}
		System.out.println(max);

	}

}
