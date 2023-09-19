package Demo;

public class ArrayMinValue {

	public static void main(String[] args) {

		int arr[] = {54,6,2,56,-3,5,45,-1};
		
		int i;
		
		int min = arr[0];
		
		for(i=0;i<=arr.length-1;i++) {
			
			if(arr[i]<min)
				
				min= arr[i];
		}
		System.out.println(min);
	}

}
